package com.neophyte

/**
 * Created with IntelliJ IDEA.
 * User: Lucifer
 * Date: 13-8-4
 * Time: 下午12:32
 *
 */
object MyPromise {
  import concurrent.Promise
  case class TaxCut(reduction: Int)
  // either give the type as a type parameter to the factory method:
  val taxcut = Promise[TaxCut]()
  // or give the compiler a hint by specifying the type of your val:
  val taxcut2: Promise[TaxCut] = Promise()
}
