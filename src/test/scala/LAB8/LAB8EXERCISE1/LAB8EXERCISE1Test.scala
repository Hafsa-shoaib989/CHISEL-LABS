// package practice

// import chisel3._
// import org.scalatest.FreeSpec
// import chiseltest._

// class LAB8EXERCISE1Test extends FreeSpec with ChiselScalatestTester{
//    "LAB8EXERCISE1Test test" in{
//        test(new Asynch_Mem ( ) ){c =>
//           c.io.data_in(0).poke(2.U)
//           c.io.data_in(1).poke(1.U)
//           c.io.data_in(2).poke(4.U)
//           c.io.data_in(3).poke(3.U)
//           c.io.data_selector.poke(3.U)
//           c.io.addr.poke(4.U)
//           c.io.wr_en.poke(1.B)
//           c.clock.step(1) 
//           c.io.wr_en.poke(0.B)
//           c.io.addr.poke(4.U)
//           c.io.data_out.expect(3.U)
// }      
// }
// }