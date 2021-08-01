l = [1,2,3]

l.add(4)
l << 5
l << "Array"


l = l+ [8,9,11]

l.pop()

l1 = [13,11,21,91,76,43,3,5]
l1.sort()


println l
println(l1)

l1.remove(1)
println(l1)


l1.each {
    println it
}

l1.reverseEach {
    println it
}

l1.eachPermutation {
    //println it
}


// add()
// Append the new value to the end of this List.

// 2    contains()
// Returns true if this List contains the specified value.

// 3    get()
// Returns the element at the specified position in this List.

// 4    isEmpty()
// Returns true if this List contains no elements

// 5    minus()
// Creates a new List composed of the elements of the original without those specified in the collection.

// 6    plus()
// Creates a new List composed of the elements of the original together with those specified in the collection.

// 7    pop()
// Removes the last item from this List

// 8    remove()
// Removes the element at the specified position in this List.

// 9    reverse()
// Create a new List that is the reverse the elements of the original List

// 10    size()
// Obtains the number of elements in this List.

// 11    sort()


// ************************************************************************SETS****************************************************************

setss = ['python','golang','groovy'] as Set
println(setss)
println(setss.class)


// ************************************************************************MAPS****************************************************************

mapss = ['Programming languages': 'Golang', 'Devops tools': 'Kubernetes', 'Scripting languages': 'Python']


println (mapss.keySet())
println (mapss.values())
println (mapss.size())
println (mapss.put('Devops tools' , ' Docker'))
println(mapss.get('Scripting languages'))
println mapss




mapss.each {
    k,v -> 
    println(k)
    println(v)
}