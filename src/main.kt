fun main() {
  var hellen=Clothes("hellen",19)
   println(hellen.name)
  println(hellen.age)
    println(name)
    println(age)
}
class Clothes(var name:String,var age:Int){

   }
 var name="cocacola"
var age=(15)
fun teacher(x: String,y:Int):String{
    return "Hi,my name is $x I am $y years old"
}
open class vehicle(var make:String,var model:String,var color:String,var capacity:Int) {
    fun carry(people: Int) {
        var x = people - capacity
        if (people >= capacity) {
            println("carrying $ passengers")
        } else {
            println("over caacity by$x people")

        }
    }

    fun identity() {
        println("I am $color $make $model")
    }

    open fun calculateParkingFees(hours: Int): Int {
        return hours * 20
    }
class Bus(make: String,model: String,color: String,capacity: Int) {
    fun maxTripFare(fare: Double): Double {
        return fare
    }

//   override fun calculateParkingFees(hours: Int): Int {
//     return hours * capacity

    }


       }


