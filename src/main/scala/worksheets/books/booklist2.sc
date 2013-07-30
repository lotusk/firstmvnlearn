/**
 * Created with IntelliJ IDEA.
 * User: lucifer
 * Date: 13-7-30
 * Time: 上午9:49
 * To change this template use File | Settings | File Templates.
 */


(List("abc", "de"), List(3, 2)).zipped

(List("abc", "de"), List(3, 2)).zipped forall(_.length == _)
