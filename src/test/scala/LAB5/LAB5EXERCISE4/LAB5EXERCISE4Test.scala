// package practice

// import chisel3._
// import org.scalatest.FreeSpec
// import chiseltest._

// class LAB5EXERCISE4Test extends FreeSpec with ChiselScalatestTester{
//    "LAB5EXERCISE4Test test" in{
//        test(new Adder ( 4.U ){c =>
//          c.io.in1.poke(2.U)
//          c.io.in2.poke(4.U)
//          c.clock.step(10) 
//          c.io.out.expect(6.U)
// }
// }      
// }