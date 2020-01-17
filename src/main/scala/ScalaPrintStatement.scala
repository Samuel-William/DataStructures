object ScalaPrintStatement {

  def main(args: Array[String]): Unit ={
    /*In scala Array of String can be defined as Array[String] in Java it will be defined as String[].
    where [] means it is a array of type String*/
    /*While defining variables it should be defined as variablename: TypeOfVariable */
    print("HelloWorld")
    /*Unlike this If you declare like this val b: Int, you will get error val "Block cannot contain Declarations
    a: Int because in scala variables should be initialized
     */
    val a: Int=10
    println("The value of a is :"+a)
  }


}
