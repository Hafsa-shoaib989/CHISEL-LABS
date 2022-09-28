// package practice

// import chisel3._
// import org.scalatest.FreeSpec
// import chiseltest._

// class LAB3EXERCISE3Test extends FreeSpec with ChiselScalatestTester{
//    "LAB3EXERCISE3Test test" in{
//        test(new Decoder2to4()){c =>
//          c.io.in.poke(1.U)
//          c.clock.step(10) 
//          c.io.out.expect(2.U)
//    }
// }      
// }