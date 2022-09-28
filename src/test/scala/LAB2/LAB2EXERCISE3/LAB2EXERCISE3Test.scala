// package practice

// import chisel3._
// import org.scalatest.FreeSpec
// import chiseltest._

// class LAB2EXERCISE3Test extends FreeSpec with ChiselScalatestTester{
//    "LAB2EXERCISE3Test test" in{
//        test(new Mux_Tree()){c =>
//          c.io.in.poke(3.U)
//          c.io.s1.poke(0.B)
//          c.io.s2.poke(1.B)
//          c.io.s3.poke(0.B)
//          c.clock.step(10) 
//          c.io.out.expect(0.B)
//        }
//    }
// }      
