package practice

import chisel3._
import org.scalatest.FreeSpec
import chiseltest._

class TASK1Test extends FreeSpec with ChiselScalatestTester{
   "TASK1 test" in{
       test(new Casting()){c =>
          c.io.c.expect(1.B)
          
       }
   }
}      