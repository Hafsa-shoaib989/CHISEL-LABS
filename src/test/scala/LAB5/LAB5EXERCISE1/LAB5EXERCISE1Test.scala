// package practice

// import chisel3._
// import org.scalatest.FreeSpec
// import chiseltest._

// class LAB5EXERCISE1Test extends FreeSpec with ChiselScalatestTester{
//    "LAB5EXERCISE1Test test" in{
//        test(new ALU ( 4 )){c =>
//          c.io.alu_oper.poke(2.U)
//          c.io.arg_x.poke(2.U)
//          c.io.arg_y.poke(4.U)
//          c.clock.step(10) 
//          c.io.alu_out.expect(6.U)
//    }
// }      
// }