package fpinscala.datastructures

sealed trait List[A+]
case object Nil extends List[Nothihg]
case class Cons[A+](head: A, tail: List[A])

