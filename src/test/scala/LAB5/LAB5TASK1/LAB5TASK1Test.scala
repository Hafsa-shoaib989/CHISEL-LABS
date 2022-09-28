// package practice

// import chisel3._
// import org.scalatest.FreeSpec
// import chiseltest._

// class LAB5TASK1Test extends FreeSpec with ChiselScalatestTester{
//    "LAB5TASK1Test test" in{
//        test(new Adder ( 4 )){c =>
//          c.io.in0.poke(2.U)
//          c.io.in1.poke(4.U)
//          c.clock.step(10) 
//          c.io.sum.expect(6.U)
// }
// }      
// }