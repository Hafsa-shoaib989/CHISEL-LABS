// package practice

// import chisel3._
// import org.scalatest.FreeSpec
// import chiseltest._

// class LAB5EXERCISE3Test extends FreeSpec with ChiselScalatestTester{
//    "LAB5EXERCISE3Test test" in{
//        test(new switch_2cross2 (UInt (4.W))){c =>
//          c.io.in1.poke(2.U)
//          c.io.in2.poke(3.U)
//          c.io.sel.poke(0.B)
//          c.clock.step(10) 
//          c.io.out1.expect(2.U)
//          c.io.out2.expect(3.U)
// }
// }      
// }