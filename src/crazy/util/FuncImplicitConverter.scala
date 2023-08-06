package crazy.util

import arc.func.Cons

import scala.language.implicitConversions

object FuncImplicitConverter {
  implicit def lamdba2Runnable(l: () => Unit): Runnable = new Runnable {
    override def run(): Unit = l.apply()
  }

  implicit def lamdba2Cons[T](l: T => Unit): Cons[T] = new Cons[T] {
    override def get(t: T): Unit = l.apply(t)
  }

  def config[T](o: T)(l: T => Unit): Unit = {
    l(o)
  }
}

