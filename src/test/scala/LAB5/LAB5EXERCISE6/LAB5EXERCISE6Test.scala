// package practice

// import chisel3._
// import org.scalatest.FreeSpec
// import chiseltest._

// class LAB5EXERCISE6Test extends FreeSpec with ChiselScalatestTester{
//    "LAB5EXERCISE6Test test" in{
//        test(new DataMem (new Parameters ( 4 , 4 ))){c =>
//           c.io.data_in.poke(2.U)
//           c.io.addr.poke(4.U)
//           c.io.wr_en.poke(1.B)
//           c.clock.step(1) 
//           c.io.wr_en.poke(0.B)
//           c.io.addr.poke(4.U)
// }      
// }
// }