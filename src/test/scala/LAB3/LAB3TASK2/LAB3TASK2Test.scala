// package practice

// import chisel3._
// import org.scalatest.FreeSpec
// import chiseltest._

// class LAB3TASK2Test extends FreeSpec with ChiselScalatestTester{
//    "LAB3TASK2Test test" in{
//        test(new ImmdValGen()){c =>
//          c.io.instr.poke("b00000000010100000000001010010011".U)
//          c.clock.step(10) 
//          c.io.immd_se.expect(5.U)
//    }
// }      
// }
