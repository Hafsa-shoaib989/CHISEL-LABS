// package practice

// import chisel3._
// import org.scalatest.FreeSpec
// import chiseltest._

// class LAB2EXERCISE4Test extends FreeSpec with ChiselScalatestTester{
//    "LAB2EXERCISE4Test test" in{
//        test(new Mux_8to1()){c =>
//          c.io.in.poke(8.U)
//          c.io.s0.poke(0.B)
//          c.io.s1.poke(1.B)
//          c.io.s2.poke(1.B)
//          c.clock.step(10) 
//          c.io.out.expect(0.B)
//        }
//    }
// }      
