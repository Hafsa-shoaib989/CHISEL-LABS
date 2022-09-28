// package practice

// import chisel3._
// import org.scalatest.FreeSpec
// import chiseltest._

// class LAB8EXERCISE4Test extends FreeSpec with ChiselScalatestTester{
//    "LAB8EXERCISE4Test test" in{
//        test(new Forwarding ( ) ){c =>
//           c.io.rdAddr.poke(4.U)
//           c.io.wrAddr.poke(4.U)
//           c.io.wrData.poke(3.U)
//           c.io.wr_en.poke(1.B)
//           c.clock.step(1) 
//           c.io.wr_en.poke(0.B)
//           c.io.out.expect(3.U)

//        }
//     }
// }    
