// package practice

// import chisel3._
// import org.scalatest.FreeSpec
// import chiseltest._

// class LAB3EXERCISE4Test extends FreeSpec with ChiselScalatestTester{
//    "LAB3EXERCISE4Test test" in{
//        test(new Valid_Interf()){c =>
//           c.io.in.bits.poke(4.U)
//           c.io.in.valid.poke(1.B)
//           c.clock.step(10) 
//           c.io.out.bits.expect(4.U)
//           c.io.out.valid.expect(1.B)
// }
// }      
// }