// package practice

// import chisel3._
// import org.scalatest.FreeSpec
// import chiseltest._

// class EXERCISE3Test extends FreeSpec with ChiselScalatestTester{
//    "EXERCISE3 test" in{
//        test(new AdderWithOffset()){c =>
//          c.io.x.poke(2.S)
//          c.io.y.poke(1.U)
//          c.clock.step(3) 
//          c.io.z.expect(11.U)
//        }
//    }
// }      