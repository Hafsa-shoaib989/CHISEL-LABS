// package practice

// import chisel3._
// import org.scalatest.FreeSpec
// import chiseltest._

// class LAB3EXERCISE2Test extends FreeSpec with ChiselScalatestTester{
//    "LAB3EXERCISE2Test test" in{
//        test(new Encoder4to2()){c =>
//          c.io.in.poke(2.U)
//          c.clock.step(10) 
//          c.io.out.expect(1.U)
//    }
// }      
// }