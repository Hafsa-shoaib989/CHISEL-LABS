// package practice

// import chisel3._
// import org.scalatest.FreeSpec
// import chiseltest._

// class LAB8E2Test extends FreeSpec with ChiselScalatestTester{
//    "LAB8E2Test test" in{
//        test(new Forwarding ( ) ){c =>
//           c.io.rdAddr.poke(4.U)
//           c.io.wrAddr.poke(4.U)
//           c.io.wrData(0).poke(3.U)
//           c.io.wrData(1).poke(2.U)
//           c.io.wr_en.poke(1.B)
//           c.io.enable.poke(1.B)
//           c.io.mask(0).poke(1.B)
//           c.io.mask(1).poke(0.B)
//           c.clock.step(1) 
//           c.io.wr_en.poke(0.B)
//           c.io.out(0).expect(3.U)
//           c.io.out(1).expect(2.U)

//        }
//     }
// }    
