package com.neophyte

import scala.concurrent.Future
import scala.concurrent.future
import java.util.concurrent.TimeUnit
import scala.concurrent.ExecutionContext.Implicits.global

case class TaxCut(reduction: Int)

case class LameExcuse(val msg:String) extends RuntimeException {
  override def getMessage: String = msg
}

/**
 * Created with IntelliJ IDEA.
 * User: Lucifer
 * Date: 13-8-4
 * Time: 下午12:32
 *
 */
object MyPromise {
  import scala.util.{Success, Failure}

  def main(args: Array[String]) {
    val taxCutF: Future[TaxCut] = Government.redeemCampaignPledge01()
    println("Now that they're elected, let's see if they remember their promises...")
    taxCutF.onComplete {
      case Success(TaxCut(reduction)) =>
        println(s"A miracle! They really cut our taxes by $reduction percentage points!")
      case Failure(ex) =>
        println(s"They broke their promises! Again! Because of a ${ex.getMessage}")
    }

    TimeUnit.SECONDS.sleep(100)

  }
}


object Government {

  import concurrent.Promise

  // either give the type as a type parameter to the factory method:
  val taxcut = Promise[TaxCut]()
  // or give the compiler a hint by specifying the type of your val:
  val taxcut2: Promise[TaxCut] = Promise()
  def redeemCampaignPledge(): Future[TaxCut] = {
    val p = Promise[TaxCut]()
    future {
      println("Starting the new legislative period.")
      Thread.sleep(2000)
      p.success(TaxCut(20))
      println("We reduced the taxes! You must reelect us!!!!1111")
    }
    p.future
  }

  def redeemCampaignPledge01(): Future[TaxCut] = {
    val p = Promise[TaxCut]()
    future {
      println("Starting the new legislative period.")
      Thread.sleep(2000)
      p.failure(LameExcuse("global economy crisis"))
      println("We didn't fulfill our promises, but surely they'll understand.")
    }
    p.future
  }
}
