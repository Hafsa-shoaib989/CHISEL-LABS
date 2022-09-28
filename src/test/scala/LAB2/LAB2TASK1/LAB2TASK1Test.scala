// package practice

// import chisel3._
// import org.scalatest.FreeSpec
// import chiseltest._

// class LAB2TASK1Test extends FreeSpec with ChiselScalatestTester{
//    "LAB2TASK1Test test" in{
//        test(new Mux_5to1()){c =>
//          c.io.s0.poke(1.B)
//          c.io.s1.poke(0.B)
//          c.io.s2.poke(0.B)
//          c.clock.step(10) 
//          c.io.out.expect(8.U)
//    }
// }      
// }