package com.lotus.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URLEncoder;
import java.nio.charset.Charset;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.URI;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;

import com.lotus.scala.MyTestScala;

public class CnRegister extends Base{
	private HttpClient client = new HttpClient();
	
	public void sendRegistMail(String email, String password) throws IOException{
		client.getParams().setParameter("http.protocol.cookie-policy",
				org.apache.commons.httpclient.cookie.CookiePolicy.BROWSER_COMPATIBILITY);
		String page = getPageByUrl("http://3g.sina.com.cn/prog/wapsite/sso/register_submit.php?type=m&backURL=http%3A%2F%2Fweibo.cn%2F%3Fs2w%3Dlogin&backTitle=%D0%C2%C0%CB%CE%A2%B2%A9&vt=3&revalid=2&ns=1", null);
		//String rand = getFirstBetween(page, "register.php?type=m&amp;rand=", "&amp");
		String capId = getFirstBetween(page, "name=\"capId\" value=\"", "\"");
		String imgUrl = getFirstBetween(page, "<img src=\"", "\"");
		System.out.println("code imageUrl:");
		System.out.println(imgUrl);
		System.out.println();
		System.out.println("enter code:");
		String vcode = getInputString();
		vcode = URLEncoder.encode(vcode);
		System.out.println("encode: " + vcode);
		PostMethod postMethod = new PostMethod();
//		postMethod.setRequestHeader(
//				"User-Agent",
//				"	Mozilla/5.0 (Macintosh; Intel Mac OS X 10.8; rv:17.0) Gecko/20100101 Firefox/17.0");
		postMethod.setRequestHeader("Accept", "	text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
		//postMethod.setRequestHeader("Accept-Encoding", "gzip, deflate");
		//postMethod.setRequestHeader("Accept-Language", "zh-cn,zh;q=0.8,en-us;q=0.5,en;q=0.3");
		//postMethod.setRequestHeader("Connection", "keep-alive");
		postMethod.setRequestHeader("Host", "3g.sina.com.cn");
		//postMethod.setRequestHeader("Cookie", "U_TRS1=00000024.e2443ed2.50b8cb68.d43d5e24; SINAGLOBAL=00000024.4e5d57a4.50b8cca5.32b2c4f3; UOR=login.sina.com.cn,www.sina.com.cn,; user_survey=1; FSINAGLOBAL=00000024.4e5d57a4.50b8cca5.32b2c4f3; ULV=1354292699183:1:1:1:00000024.4e5657a4.50b8cca5.a8d9f157:; Apache=0000000f.246c5c73.50d31758.5bc11d40; U_TRS2=0000000f.4be1b30.50d31759.80d5ff3a");	
		//postMethod.setRequestHeader("Referer", "http://3g.sina.com.cn/prog/wapsite/sso/register_submit.php?type=m&rand=1700317732&backURL=http%3A%2F%2Fweibo.cn%2F%3Fs2w%3Dlogin&backTitle=%D0%C2%C0%CB%CE%A2%B2%A9&vt=4&revalid=2&ns=1");
		
		postMethod.setURI(new URI("http://3g.sina.com.cn/prog/wapsite/sso/register.php", true));
		postMethod.addParameter("backTitle", "新浪微博");
		//postMethod.addParameter("backURL", "http://weibo.cn/?s2w=login");
		postMethod.addParameter("submit", "提交");
		postMethod.addParameter("type", "m");
		//postMethod.addParameter("rand", rand);
		postMethod.addParameter("capId", capId);	
		postMethod.addParameter("code", vcode);
		postMethod.addParameter("email", email);
		postMethod.addParameter("pwd", password);


		int status = client.executeMethod(postMethod);
		byte[] resByte = postMethod.getResponseBody();
		String html = new String(resByte, "UTF-8");
		
		if(html.contains("注册成功！")){
			System.out.println("注册成功！");
		}
		else if(html.contains("验证码错误")){
			System.out.println("验证码错误");
		}
		else{
			System.out.println("status: " + status + ", " + html);
		}
	}
	
	public String getPageByUrl(String url, Charset charset) {
		GetMethod getMethod = new GetMethod(url);
		try {
			client.executeMethod(getMethod);
			byte[] resByte = getMethod.getResponseBody();
			String html = new String(resByte, "gb2312");
			return html;
		} catch (Exception e) {
			System.out.println("Get Page Timeout");
			return null;
		}
	}
	
	public static String getInputString() throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		return br.readLine();
	}
	
	public static String getFirstBetween(String content, String before, String after){
		try{
			int i = content.indexOf(before);
			if(i<0) return null;
			content = content.substring(i+before.length());
			i = content.indexOf(after);
			if(i<0) return null;
			return content.substring(0,i);
		} catch (Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	public static String getTest(){
		System.out.println("ssssssssssssssssssssssss");
		return "hhh";
	}
	/**
	 * @param args
	 * @throws IOException
     * he
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		CnRegister r = new CnRegister();
//		r.sendRegistMail("makn12221a291526@qq.com", "summba");
//        test a=new test();
		MyTestScala t=new MyTestScala();
		t.test();
	}
}


class test{
    private String abc;

    public void setAbc(String abc) {
        this.abc = abc;

    }
}

class Base{
	
}