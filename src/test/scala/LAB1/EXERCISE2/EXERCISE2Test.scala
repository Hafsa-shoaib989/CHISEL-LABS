// package practice

// import chisel3._
// import org.scalatest.FreeSpec
// import chiseltest._

// class EXERCISE2Test extends FreeSpec with ChiselScalatestTester{
//    "EXERCISE2 test" in{
//        test(new counter(3.U)){c =>
//          c.clock.step(3) 
//          c.io.result.expect(1.B)
//        }
//    }
// }      