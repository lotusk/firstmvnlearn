/**
 * Created with IntelliJ IDEA.
 * User: Lucifer
 * Date: 13-8-3
 * Time: 下午11:40
 *
 */
object Test {
  def main(args: Array[String]) {
    val list = (1 to 10000000).toList


    for(i <- 0 to 7){
      TimeUtils.time{
        partest
      }
    }


    def partest= list.par.map(_ *3)
    def commontest=list.map(_ *3)


//    TimeUtils.time{
//      list.map(_ *3)
//    }
//
//    TimeUtils.time{
//      list.par.map(_ *3)
//    }
//
//    TimeUtils.time{
//      list.map(_ *3)
//    }
//    TimeUtils.time{
//      list.par.map(_ *3)
//    }
//
//    TimeUtils.time{
//      list.map(_ *3)
//    }
//    TimeUtils.time{
//      list.par.map(_ *3)
//    }
//
//    TimeUtils.time{
//      list.map(_ *3)
//    }
//
//    TimeUtils.time{
//      list.par.map(_ *3)
//    }
//
//    TimeUtils.time{
//      list.map(_ *3)
//    }
//
//
//    TimeUtils.time{
//      list.par.map(_ *3)
//    }
//
//    TimeUtils.time{
//      list.map(_ *3)
//    }
//
//
//    TimeUtils.time{
//      list.par.map(_ *3)
//    }
//
//    TimeUtils.time{
//      list.map(_ *3)
//    }


  }
}
