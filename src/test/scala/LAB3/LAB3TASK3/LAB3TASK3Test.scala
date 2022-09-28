// package practice

// import chisel3._
// import org.scalatest.FreeSpec
// import chiseltest._

// class LAB3TASK3Test extends FreeSpec with ChiselScalatestTester{
//    "LAB3TASK3Test test" in{
//        test(new decoder_with_valid()){c =>
//          c.io.in.poke(1.U)
//          c.clock.step(10) 
//          c.io.out.bits.expect(2.U)  
//          c.io.out.valid.expect(1.B)
//    }
// }      
// }