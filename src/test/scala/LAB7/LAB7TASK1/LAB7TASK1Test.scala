// package practice

// import chisel3._
// import org.scalatest.FreeSpec
// import chiseltest._

// class LAB7TASK1Test extends FreeSpec with ChiselScalatestTester{
//    "LAB7TASK1Test test" in{
//        test(new FSM ( )){c =>
//          c.io.f1.poke(1.B)
//          c.io.f2.poke(0.B)
//          c.io.r1.poke(0.B)
//          c.io.r2.poke(0.B)
//          c.clock.step(1) 
//          c.io.f1.poke(0.B)
//          c.io.f2.poke(1.B)
//          c.io.r1.poke(0.B)
//          c.io.r2.poke(0.B)
//          c.clock.step(10)
//    }
// }      
// }

