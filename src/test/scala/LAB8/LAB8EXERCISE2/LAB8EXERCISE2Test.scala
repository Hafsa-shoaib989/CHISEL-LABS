// package practice

// import chisel3._
// import org.scalatest.FreeSpec
// import chiseltest._

// class LAB8EXERCISE2Test extends FreeSpec with ChiselScalatestTester{
//    "LAB8EXERCISE2Test test" in{
//        test(new Parameterized_Mem ( 10 , 4 ) ){c =>
//           c.io.dataIn.poke(2.U)
//           c.io.addr.poke(4.U)
//           c.io.rd_enable.poke(1.B)
//           c.io.wr_enable.poke(1.B)
//           c.clock.step(1) 
//           c.io.wr_enable.poke(0.B)
//           c.io.addr.poke(4.U)
//           c.io.dataOut.expect(2.U)

//        }
//     }
// }    
