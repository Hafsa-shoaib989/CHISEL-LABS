// package practice

// import chisel3._
// import org.scalatest.FreeSpec
// import chiseltest._

// class LAB2EXERCISE2Test extends FreeSpec with ChiselScalatestTester{
//    "LAB2EXERCISE2Test test" in{
//        test(new Mux_2to1()){c =>
//          c.io.in_A.poke(2.U)
//          c.io.in_B.poke(3.U)
//          c.io.select.poke(0.B)
//          c.clock.step(10) 
//          c.io.out.expect(3.U)
//        }
//    }
// }      