def isPrime(a:Int):Boolean ={
    for(i <- Range(2, a)){
        if(a%i == 0)
         return false
    }
    return true
}
for (i <- 2 to 30){
    if (isPrime(i))
    print(s"$i \t")
}