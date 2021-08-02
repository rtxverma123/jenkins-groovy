def a = 10
println(a)
println(a.class) //Integer


def s = 'Hi Tamish is learnign groovy'
println(s)


name = "Chetna "
s = "I want to love ${name}"
println(s)


s1 = ''' 
All the power is in groovy
u can do anything with groovy
Jenkins also work
'''
println(s1)

emails = /[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$/
print "test.ibm.com"==~ emails