fun main(){

var greeting = "Hello"
var name: String
name = "John"
println(name)

var txt = "Hello World"
println(txt[0]) // first element (H)
println(txt[2]) // third element (l)


var txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
println("The length of the txt string is: " + txt.length)


var txt = "Hello World"
println(txt.toUpperCase())   // Outputs "HELLO WORLD"
println(txt.toLowerCase())   // Outputs "hello world"
var txt1 = "Hello World"
var txt2 = "Hello World"
println(txt1.compareTo(txt2))  // Outputs 0 (they are equal)

var txt = "Please locate where 'locate' occurs!"
println(txt.indexOf("locate"))  // Outputs 7
var txt1 = "It's alright"
var txt2 = "That's great"

var firstName = "John"
var lastName = "Doe"
println(firstName + " " + lastName)
var firstName = "John "
var lastName = "Doe"
println(firstName.plus(lastName))


var firstName = "John"
var lastName = "Doe"
println("My name is $firstName $lastName")
}
