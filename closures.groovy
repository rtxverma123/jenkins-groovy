c = {
    println("Closures are simple")
}

c.call()


d = { n->
      println(n%2==0 ? "even":"odd")

}

d.call(17)


4. times{
    n-> 
    println n
}