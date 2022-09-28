// package practice

// import chisel3._
// import org.scalatest.FreeSpec
// import chiseltest._

// class LAB7EXERCISE5Test extends FreeSpec with ChiselScalatestTester{
//    "LAB7EXERCISE5Test test" in{
//        test(new Round_arb ( )){c =>
//           c.io.in1.bits.poke(1.U)
//           c.io.in1.valid.poke(1.B)
//           c.io.in2.bits.poke(4.U)
//           c.io.in2.valid.poke(1.B)
//           c.io.in3.bits.poke(3.U)
//           c.io.in3.valid.poke(1.B)
//           c.clock.step(1) 
//           c.io.out.bits.expect(4.U)
//           c.io.out.valid.expect(1.B)
//           c.io.out.ready.expect(0.B)
//    }
// }      
// }