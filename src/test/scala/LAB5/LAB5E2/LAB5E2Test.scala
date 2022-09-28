// package practice

// import chisel3._
// import org.scalatest.FreeSpec
// import chiseltest._

// class LAB5E2Test extends FreeSpec with ChiselScalatestTester{
//    "LAB5E2Test test" in{
//        test(new MuxA (UInt (4.W))){c =>
//          c.io.in1.poke(2.U)
//          c.io.in2.poke(3.U)
//          c.io.sel.poke(1.B)
//          c.clock.step(10) 
//          c.io.out.expect(3.U)
// }
// }      
// }