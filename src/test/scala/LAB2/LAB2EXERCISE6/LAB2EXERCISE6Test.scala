// package practice

// import chisel3._
// import org.scalatest.FreeSpec
// import chiseltest._

// class LAB2EXERCISE6Test extends FreeSpec with ChiselScalatestTester{
//    "LAB2EXERCISE6Test test" in{
//        test(new MuxLookup()){c =>
//          c.io.in0.poke(1.B)
//          c.io.in1.poke(0.B)
//          c.io.in2.poke(0.B)
//          c.io.in3.poke(0.B)
//          c.io.in4.poke(1.B)
//          c.io.in5.poke(1.B)
//          c.io.in6.poke(0.B)
//          c.io.in7.poke(1.B)
//          c.io.sel.poke(4.U)
//          c.clock.step(10) 
//          c.io.out.expect(1.B)
//        }
//    }
// }      
