// package practice

// import chisel3._
// import org.scalatest.FreeSpec
// import chiseltest._

// class LAB8TASK1Test extends FreeSpec with ChiselScalatestTester{
//    "LAB8TASK1Test test" in{
//        test(new memory_assignment ( ) ){c =>
//           c.io.requestor(0).bits.poke(2.U)
//           c.io.requestor(1).bits.poke(4.U)
//           c.io.requestor(2).bits.poke(1.U)
//           c.io.requestor(3).bits.poke(3.U)
//           c.io.requestor(0).valid.poke(1.B)
//           c.io.requestor(1).valid.poke(0.B)
//           c.io.requestor(2).valid.poke(0.B)
//           c.io.requestor(3).valid.poke(0.B)         
//           c.io.Writeaddr.poke(4.U)
//           c.io.Readaddr.poke(4.U)
//           c.clock.step(5) 
//           c.io.memory_out(0).expect(2.U)
//           c.io.memory_out(1).expect(0.U)
//           c.io.memory_out(2).expect(0.U)
//           c.io.memory_out(3).expect(0.U)
//         }
//     }
// }    
