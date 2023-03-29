package week5

// https://www.baeldung.com/kotlin/kotlin-vs-scala

open class Vehicle
class Car: Vehicle()   // Car <: Vehicle
class Bike: Vehicle()  // Bike <: Vehicle

class Garage<T>        // invariant
val myCarGarage: Garage<Car> = Garage<Car>()
val myBikeGarage: Garage<Bike> = Garage<Bike>()
// val myCarGarage2: Garage<Vehicle> = Garage<Car>()  // illegal

class Garage1<out T>          // covariant
val myCarGarage1: Garage1<Vehicle> = Garage1<Car>()
val myBikeGarage1: Garage1<Vehicle> = Garage1<Bike>()
val myCar: Garage1<Car> = Garage1<Car>()

class Garage2<in T>          // contra-variant
val myCarGarage2: Garage2<Car> = Garage2<Vehicle>()
val myBikeGarage2: Garage2<Bike> = Garage2<Vehicle>()
val myCar2: Garage2<Car> = Garage2<Car>()
// val myBikeGarage22: Garage2<Vehicle> = Garage2<Bike>()  // illegal

// use-site variance
// class Garage3<in T> {
//   fun park(t: T): T {return t}
// }
// T는 contra-variant로 정의되었지만
// producer 인 동시에(return), consumer로 사용되므로 error
// invariant 인 경우는 OK


fun transfer(from: Garage<out Vehicle>, to: Garage<Vehicle>) { }


fun main() {
  transfer(Garage<Car>(), Garage<Vehicle>()) // This is legal due to type projection
  println("OK")
}

/* Covariant
    Car <: Vehicle   ==> Garage[Car]  <: Garage[Vehicle] 
    Bike <: Vehicle  ==> Garage[Bike] <: Garage[Vehicle]
*/

/* Contravariant
    Car <: Vehicle   ==> Garage[Car]  :> Garage[Vehicle] 
    Bike <: Vehicle  ==> Garage[Bike] :> Garage[Vehicle]
*/

