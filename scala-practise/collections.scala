// Lists
val evens = List(2, 4, 6, 8)

evens.sorted

evens.tail
evens.head

0::evens
//List(0, 2, 4, 6, 8)
x.drop(2) //4, 6, 8
x.takeRight(1) //8
x slice (1, 3) // inclu index 1, not 3

//Arrays
val arr = Array(3, 4, 5)
arr(0) = 4

//Sets
val s = Set(5, 2, 1, 3,1)
val se = collection.mutable.Set(3, 2,1)
se += 5


//Map

val m = Map(("a", 2), ("c", 4))
m.get("a")
m.keys
m.values
//mutable
val mu = collection.mutable.Map(("a", 1))
mu += ("b"->2)