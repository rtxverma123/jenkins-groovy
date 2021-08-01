lists = [4,7,1,9,3,5]

while (lists){
    lists.remove(0)
}

list = [4,7,1,9,3,5]
for (i in list){
    println i
}

for (i in 1..10){
    println("The range numbers: "+i)
}




for (s in 'a'..'z'){
    if (s=='b'){
        println(s)
        continue
    }else if (s == 'd'){
        println(s)
        break
        
    }
}