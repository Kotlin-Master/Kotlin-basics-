fun main(){

val myNum = 5             // Int
val myDoubleNum = 5.99    // Double
val myLetter = 'D'        // Char
val myBoolean = true      // Boolean
val myText = "Hello"      // String

  val myNum: Int = 5                // Int
val myDoubleNum: Double = 5.99    // Double
val myLetter: Char = 'D'          // Char
val myBoolean: Boolean = true     // Boolean
val myText: String = "Hello"      // String

  val myNum: Byte = 100
println(myNum)

val myNum: Short = 5000
println(myNum)

val myNum: Int = 100000
println(myNum)


val myNum: Long = 15000000000L
println(myNum)

val myNum1 = 2147483647  // Int
val myNum2 = 2147483648  // Long

  val myNum: Float = 5.75F
println(myNum)

val myNum: Double = 19.99
println(myNum)

val myNum1: Float = 35E3F
val myNum2: Double = 12E4
println(myNum1)
println(myNum2)

val isKotlinFun: Boolean = true
val isFishTasty: Boolean = false
println(isKotlinFun)   // Outputs true
println(isFishTasty)   // Outputs false 

val myGrade: Char = 'B'
println(myGrade)

val myText: String = "Hello World"
println(myText)

val x: Int = 5
val y: Long = x
println(y) // Error: Type mismatch 

val x: Int = 5
val y: Long = x.toLong()
println(y)



}
