// package practice

// import chisel3._
// import org.scalatest.FreeSpec
// import chiseltest._

// class LAB5TASK3Test extends FreeSpec with ChiselScalatestTester{
//    "LAB5TASK3Test test" in{
//        test(new eMux (UInt (4.W))){c =>
//          c.io.in1.poke(2.U)
//          c.io.in2.poke(1.B)
//          c.io.sel.poke(1.B)
//          c.clock.step(1) 
//          c.io.out.expect(1.U)
// }
// }      
// }