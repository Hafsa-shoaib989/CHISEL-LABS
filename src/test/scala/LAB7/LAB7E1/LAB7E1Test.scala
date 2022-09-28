// package practice

// import chisel3._
// import org.scalatest.FreeSpec
// import chiseltest._

// class LAB7E1Test extends FreeSpec with ChiselScalatestTester{
//    "LAB7E1Test test" in{
//        test(new Priority_arb ( )){c =>
//           c.io.in1.bits.poke(2.U)
//           c.io.in1.valid.poke(1.B)
//           c.io.in2.bits.poke(1.U)
//           c.io.in2.valid.poke(1.B)
//           c.clock.step(5) 
//           c.io.out.bits.expect(2.U)
//           c.io.out.valid.expect(1.B)
//           c.io.out.ready.expect(0.B)
//    }
// }      
// }