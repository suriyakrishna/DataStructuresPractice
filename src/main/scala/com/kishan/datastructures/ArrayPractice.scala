package com.kishan.datastructures

object ArrayPractice {
  def main(args: Array[String]): Unit = {

    //Declaring Array
    var a: Array[Int] = new Array[Int](10)

    //Insert into Array
    a(0) = 5
    a(1) = 6
    a(2) = 1
    a(3) = 9
    a(4) = 4
    a(6) = 3
    a(7) = 8


    //Access element in an Array
    println(s"Value of element a[1] = ${a(1)}")

    //Replace element in Array
    println(s"Value before updating of element a[7]: ${a(7)}")
    a(7)=11
    println(s"Value after updating of element a[7]: ${a(7)}")

    //Method to find position of element in array
    def elementPosition(arr: Array[Int], element: Int): Int = {
      val lengthOfArray = arr.length
      var position = -1
      for(i<-0 until(lengthOfArray)){
        if(a(i) == element){
          position = i
        }
      }
      position
    }

    //Usage of method elementPosition - find position of element 9 in 'a' array
    println(s"Position of 9 in 'a' array: ${elementPosition(a, 9)}")
    println(s"Position of 99 in 'a' array: ${elementPosition(a, 99)}") //This will return -1 since the element is not defined in the 'a' array




  }
}
