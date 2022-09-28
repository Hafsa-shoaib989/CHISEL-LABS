// package practice

// import chisel3._
// import org.scalatest.FreeSpec
// import chiseltest._

// class LAB5EXERCISE7Test extends FreeSpec with ChiselScalatestTester{
//    "LAB5EXERCISE7Test test" in{
//        test(new Operator(2 , UInt(4.W)) (_+_)) {c =>
//           c.io.in(0).poke(1.U)
//           c.io.in(1).poke(2.U)
//           c.clock.step(1) 
//           c.io.out.expect(3.U)
// }      
// }
// }