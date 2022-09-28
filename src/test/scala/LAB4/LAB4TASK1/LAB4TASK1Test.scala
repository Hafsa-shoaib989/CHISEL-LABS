// package practice

// import chisel3._
// import org.scalatest.FreeSpec
// import chiseltest._
// import chisel3.util._
// import chiseltest.experimental.TestOptionBuilder._
// import chiseltest.internal.VerilatorBackendAnnotation
// import scala.util.Random
// import ALUOP._

// class LAB4TASK1Test extends FreeSpec with ChiselScalatestTester{
//    "LAB4TASK1Test test" in{
//        test(new BranchControl ()){c =>

// val array_op = Array (ALU_BEQ , ALU_BNE ,  ALU_BGE , ALU_BLT)

// for ( i <- 0 until 100) {
//     val src_a = Random . nextLong () & 0xFFFFFFFFL
//     val src_b = Random . nextLong () & 0xFFFFFFFFL
//     val opr = Random . nextInt (4)
//     val func3 = array_op(opr)
//     val branch1 = Random . nextBoolean()
// println(func3)

// val result = func3 match {
//     case ALU_BEQ => src_a === src_b
//     case ALU_BNE => src_a != src_b
//     case ALU_BGE => src_a >= src_b
//     case ALU_BLT => src_a < src_b
// }
//          c.io.fnct3.poke(func3)
//          c.io.branch.poke(branch1.B)
//          c.io.arg_x.poke(src_a.U)
//          c.io.arg_y.poke(src_b .U)
//          c.clock.step(10)  

// println(result)

// if (branch1 === 1.B){
//     c.io.br_taken.expect ( result.B )
// } else if (branch1 === 0.B) {
//     c.io.br_taken.expect (0.B)}
// }      
// }
// }
// }