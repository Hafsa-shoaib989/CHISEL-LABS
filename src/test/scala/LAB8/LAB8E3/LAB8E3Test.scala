// package practice

// import chisel3._
// import org.scalatest.FreeSpec
// import chiseltest._

// class LAB8E3Test extends FreeSpec with ChiselScalatestTester{
//    "LAB8E3Test test" in{
//        test(new Instruction ( ) ){c =>
//           c.io.instWr.poke(2.U)
//           c.io.addr.poke(4.U)
//           c.io.write.poke(1.B)
//           c.clock.step(10) 
//           c.io.write.poke(0.B)
//           c.io.instRead.expect(2.U)
//        }
//     }
// }    
