// package practice

// import chisel3._
// import org.scalatest.FreeSpec
// import chiseltest._

// class LAB5TASK2Test extends FreeSpec with ChiselScalatestTester{
//    "LAB5TASK2Test test" in{
//        test(new Router ( UInt(4.W) ) ){c =>
//           c.io.in.addr.poke(4.U ) 
//           c.io.in.data.poke(2.U ) 
//           c.clock.step(1) 
//           c.io.out.addr.expect(4.U) 
//           c.io.out.data.expect(2.U) 
//        }
//    }
// }
