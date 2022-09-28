// package practice

// import chisel3._
// import org.scalatest.FreeSpec
// import chiseltest._

// class LAB6EXERCISE5Test extends FreeSpec with ChiselScalatestTester{
//    "LAB6EXERCISE5Test test" in{
//        test(new RegFile ()){c =>
//          c.io.raddr1.poke(2.U)
//          c.io.raddr2.poke(2.U)
//          c.io.waddr.poke(2.U)
//          c.io.wdata.poke(4.U)
//          c.io.wen.poke(1.B)
//          c.clock.step(1) 
//          c.io.rdata1.expect(4.U)
//          c.io.rdata2.expect(4.U)
//    }
// }      
// }
