// package practice

// import chisel3._
// import org.scalatest.FreeSpec
// import chiseltest._

// class LAB8E1Test extends FreeSpec with ChiselScalatestTester{
//    "LAB8E1Test test" in{
//        test(new MaskedReadWriteSmem  ( ) ){c =>
//           c.io.enable.poke(1.B)
//           c.io.write.poke(1.B)
//           c.io.addr.poke(4.U)
//           c.io.mask(0).poke(1.B)
//           c.io.mask(1).poke(0.B)
//           c.io.mask(2).poke(1.B)
//           c.io.mask(3).poke(0.B)
//           c.io.dataIn(0).poke(2.U)
//           c.io.dataIn(1).poke(4.U)
//           c.io.dataIn(2).poke(3.U)
//           c.io.dataIn(3).poke(1.U)
//           c.clock.step(1) 
//           c.io.dataOut(0).expect(2.U)
//           c.io.dataOut(1).expect(0.U)
//           c.io.dataOut(2).expect(3.U)
//           c.io.dataOut(3).expect(0.U)
//        }
//     }
// }    



