
def sum(xs: List[Int]): Int = {

  def suma(xs:List[Int], cont:Int): Int ={

    xs match {
      case head::tail => suma(tail, cont+head)
      case Nil=> cont
    }
  }
  suma(xs,0)
}
println(sum(List(1,2,3,4,5,6,7,8,9)))

def max(xs: List[Int]): Int = {

  def maxAux(xs:List[Int], cont:Int): Int ={
    xs match {
      case head::tail => if (head>cont) maxAux(tail, head) else maxAux(tail, cont)
      case Nil=> cont
    }
}
  maxAux(xs,0)
}


println(max(List(1,2,16,4,5,6,7,8,9)))
