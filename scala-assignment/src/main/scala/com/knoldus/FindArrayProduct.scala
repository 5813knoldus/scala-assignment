package com.knoldus

class FindArrayProduct(val array : Array[Int]) {
  // Method for calculating the product of elements in array
  def arrayElements : Unit ={
    var productOfArrayElements  = 1
    for(index <- 0 to (array.length-1)){
      productOfArrayElements = productOfArrayElements * array(index)
    }
    println("Prodcut of the array elements : "+ productOfArrayElements)
  }
}
object FindArrayProduct{
  def main(args:Array[String]): Unit = {
    var array = Array(1,2,3,4,5)
    val findArrayProduct = new FindArrayProduct(array)
    findArrayProduct.arrayElements
  }
}
