// package practice

// import chisel3._
// import org.scalatest.FreeSpec
// import chiseltest._

// class LAB6TASK3Test extends FreeSpec with ChiselScalatestTester{
//    "LAB6TASK3Test test" in{
//        test(new shift_reg_with_parallel_load ( 3 )){c =>
//          c.io.in.poke(1.B)
//          c.io.load_in(0).poke(0.B)
//          c.io.load_in(1).poke(1.B)
//          c.io.load_in(2).poke(0.B)
//          c.io.load.poke(1.B)
//          c.clock.step(1) 
//          c.io.out(0).expect(0.B)
//          c.io.out(1).expect(1.B)
//          c.io.out(2).expect(0.B)
//    }
// }      
// }
