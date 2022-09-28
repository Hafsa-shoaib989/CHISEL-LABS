// package practice

// import chisel3._
// import org.scalatest.FreeSpec
// import chiseltest._

// class LAB6EXERCISE1Test extends FreeSpec with ChiselScalatestTester{
//    "LAB6EXERCISE1Test test" in{
//        test(new shift_register ( 2 )){c =>
//          c.io.in.poke(1.B)
//          c.clock.step(4) 
//          c.io.out.expect(15.U)
//    }
// }      
// }