package flags

import scala.language.experimental.macros

package object p {
  private lazy val x = 1
  protected implicit var y: Int = 2
  def z(pp: Int) = 3
  def m[TT] = macro ???
  abstract class C[+T, -U, V](x: T, y: U, z: V) {
    def this() = this(???, ???, ???)
    def w: Int
  }
  type T = Int
  type U <: Int
  type V >: Int
  case object X
  final class Y
  sealed trait Z
  class AA(x: Int, val y: Int, var z: Int)
  class S[@specialized T]
}
