// package practice

// import chisel3._
// import org.scalatest.FreeSpec
// import chiseltest._

// class LAB2EXERCISE1Test extends FreeSpec with ChiselScalatestTester{
//    "LAB2EXERCISE1Test test" in{
//        test(new Mux_2to1()){c =>
//          c.io.in_A.poke(1.B)
//          c.io.in_B.poke(0.B)
//          c.io.select.poke(0.B)
//          c.clock.step(10) 
//          c.io.out.expect(0.B)
//        }
//    }
// }      