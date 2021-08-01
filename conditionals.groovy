// def age = 17

// if ( age >=21 ){
//     println "U can have beer"
// } else{
//     println "U can not have beer"
// }



def ages = 17

if (ages >=35) {
    println "Run for president"
} else if (ages >= 21) {
    println("have beer")

} else {
    println("Padle bhosdk")
}


def age = 23

if (age >= 35 && age>=21){
    println("Have beer and run for president")
} else {
    println("Finish studies")
}



// def elvisOutput = msg ?: 'default message...' //If this side ?: that side (if this side is true use it else use that side)

// println(elvisOutput)



// *********************************************Switch Statement*************************************************************
def num = 1.74

switch (num) {
    case 1: 
      println "1"
      break
    case 2:
      println "2"
      break
    case 1..3:
      println "in range 1..3"
      break
    case Integer :
      println "Number is a integer"
      break
    case Float:
      println "Number is a float"
      break
    default:
      println "default...."
    
}