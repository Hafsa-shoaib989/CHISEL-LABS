// package practice

// import chisel3._
// import org.scalatest.FreeSpec
// import chiseltest._

// class LAB3EXERCISE1Test extends FreeSpec with ChiselScalatestTester{
//    "LAB3EXERCISE1Test test" in{
//        test(new Decoder_2to4()){c =>
//          c.io.in.poke(1.U)
//          c.clock.step(10) 
//          c.io.out.expect(2.U)
//    }
// }      
// }