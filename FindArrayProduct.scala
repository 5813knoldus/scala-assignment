class FindArrayProduct(val array:Array[Int]) {
  def arrayElements :Unit ={
    var product  = 1
    for(index <- 0 to (array.length-1)){
      product = product*array(index)
    }
    println("prodcut of the array elements : "+product)
  }
}
object FindArrayProduct{
  def main(args:Array[String]): Unit = {
    var array = Array(1,2,3,4,5)
    val findArrayProduct = new FindArrayProduct(array)
    findArrayProduct.arrayElements
  }
}
