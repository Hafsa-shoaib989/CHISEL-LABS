// package practice

// import chisel3._
// import org.scalatest.FreeSpec
// import chiseltest._

// class LAB2EXERCISE7Test extends FreeSpec with ChiselScalatestTester{
//    "LAB2EXERCISE7Test test" in{
//        test(new mux_onehot_4to1()){c =>
//          c.io.in0.poke(3.U)
//          c.io.in1.poke(4.U)
//          c.io.in2.poke(5.U)
//          c.io.in3.poke(8.U)
//          c.io.sel.poke(2.U)
//          c.clock.step(10) 
//          c.io.out.expect(4.U)
//        }
//    }
// }      
