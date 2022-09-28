// package practice

// import chisel3._
// import org.scalatest.FreeSpec
// import chiseltest._

// class LAB3E2Test extends FreeSpec with ChiselScalatestTester{
//    "LAB3E2Test test" in{
//        test(new ALU()){c =>
//          c.io.in_A.poke(2.U)
//          c.io.in_B.poke(1.U)
//           c.io.alu_Op.poke(0.U)
//          c.clock.step(10) 
//          c.io.out.expect(3.U)
//    }
// }      
// }