object ArraySum {
  def main(args: Array[String]): Unit = {
    var arrayElements = Array(1, 2, 3, 4, 5)
    var sum = 0

    for(index <- 0 to (arrayElements.length-1)) {
      sum = sum + arrayElements(index)
    }
    print(sum)
  }
}
