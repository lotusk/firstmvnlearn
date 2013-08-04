
val lastNames = List("Smith","Jones","Frankenstein","Bach","Jackson","Rodin").par




lastNames.map(_.toUpperCase)







val parArray = (1 to 1000000).toArray.par













parArray.fold(0)(_ + _)

lastNames.filter(_.head >= 'J')

val list = (1 to 1000).toList.par














list.reduce(_-_)
list.reduce(_-_)
list.reduce(_-_)
list.reduce(_+_)
list.reduce(_+_)
list.reduce(_+_)

