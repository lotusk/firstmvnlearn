import org.apache.solr.client.solrj.impl.HttpSolrServer
import org.apache.solr.common.SolrInputDocument
import scala.collection.immutable.HashMap

/**
 * Created with IntelliJ IDEA.
 * User: Lucifer
 * Date: 13-8-13
 * Time: 下午11:16
 *
 */
object solr {
  def main(args: Array[String]) {
    println("-------------")

    val url="http://42.121.52.3:8080/solr"
    val server=new HttpSolrServer(url)
    val doc1 = new SolrInputDocument()

    doc1.addField("id", "2");


    doc1.addField("wangkai","think")

    server.add(doc1);

    server.commit();

    def test={
      import java.io._
      import scala.util._
      import scala.io._

      for(files <- Try(List(new File("abc"), new File("cde"))))
        for(file <- files if (!file.isDirectory);
            lines <- Try(Source.fromFile(file)))
          for(line <- lines) yield line
    }



  }
}
