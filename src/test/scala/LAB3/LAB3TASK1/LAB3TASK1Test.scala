// package practice

// import chisel3._
// import org.scalatest.FreeSpec
// import chiseltest._

// class LAB3TASK1Test extends FreeSpec with ChiselScalatestTester{
//    "LAB3TASK1Test test" in{
//        test(new BranchControl()){c =>
//          c.io.fnct3.poke(1.U)
//          c.io.branch.poke(1.B)
//          c.io.arg_x.poke(1.U)
//          c.io.arg_y.poke(0.U)
//          c.clock.step(10) 
//          c.io.br_taken.expect(1.B)
//    }
// }      
// }