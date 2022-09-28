// package practice

// import chisel3._
// import org.scalatest.FreeSpec
// import chiseltest._

// class LAB6EXERCISE6Test extends FreeSpec with ChiselScalatestTester{
//    "LAB6EXERCISE6Test test" in{
//        test(new Pipe ()){c =>
//           c.io.in.bits.poke(2.U)
//           c.io.in.valid.poke(1.B)
//           c.clock.step(5) 
//           c.io.out.bits.expect(2.U)
//           c.io.out.valid.expect(1.B)
// }
// }      
// }