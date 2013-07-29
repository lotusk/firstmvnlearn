package mytrait

object stackable {
	println("Welcome to the Scala worksheet") //> Welcome to the Scala worksheet

	val queue = new BasicIntQueue             //> queue  : mytrait.BasicIntQueue = mytrait.BasicIntQueue@4a6cbf
	queue.put(10)
	queue.put(20)
	queue.get                                 //> res0: Int = 10
	queue.get                                 //> res1: Int = 20

	val myqueue = new MyQueue                 //> myqueue  : mytrait.MyQueue = mytrait.MyQueue@1a99561
	myqueue put 10
	myqueue.get                               //> res2: Int = 20

	val queue2 = new BasicIntQueue with Doubling
                                                  //> queue2  : mytrait.BasicIntQueue with mytrait.Doubling = mytrait.stackable$$a
                                                  //| nonfun$main$1$$anon$3@8e32e7
	queue2 put 10
	queue2 get                                //> res3: Int = 20

	val queue3 = new BasicIntQueue with Incrementing
                                                  //> queue3  : mytrait.BasicIntQueue with mytrait.Incrementing = mytrait.stackabl
                                                  //| e$$anonfun$main$1$$anon$4@b76fa
	queue3 put 10
	queue3 get                                //> res4: Int = 11

	val queue4 = new BasicIntQueue with Filtering
                                                  //> queue4  : mytrait.BasicIntQueue with mytrait.Filtering = mytrait.stackable$$
                                                  //| anonfun$main$1$$anon$5@513cf0
	queue4 put 10
	queue4 get                                //> res5: Int = 10

	val queueSpectial = (new BasicIntQueue with Incrementing with Filtering)
                                                  //> queueSpectial  : mytrait.BasicIntQueue with mytrait.Incrementing with mytrai
                                                  //| t.Filtering = mytrait.stackable$$anonfun$main$1$$anon$1@177b3cd
	queueSpectial.put(-1); queueSpectial.put(0); queueSpectial.put(1)
	queueSpectial.get                         //> res6: Int = 1
	queueSpectial.get                         //> res7: Int = 2

	val queueSpectial2 = (new BasicIntQueue with Filtering with Incrementing)
                                                  //> queueSpectial2  : mytrait.BasicIntQueue with mytrait.Filtering with mytrait.
                                                  //| Incrementing = mytrait.stackable$$anonfun$main$1$$anon$2@1bd7848
	
	queueSpectial2.put(-1); queueSpectial2.put(0); queueSpectial2.put(1)
	queueSpectial2.get                        //> res8: Int = 0
	queueSpectial2.get                        //> res9: Int = 1
	queueSpectial2.get                        //> res10: Int = 2
                                                 
}