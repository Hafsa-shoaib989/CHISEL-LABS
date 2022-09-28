// (skip this task)
// package practice

// import chisel3._
// import org.scalatest.FreeSpec
// import chiseltest._
// import chisel3.util._
// import chiseltest.experimental.TestOptionBuilder._
// import chiseltest.internal.VerilatorBackendAnnotation
// import scala.util.Random
// import ALUOP._

// class LAB4TASK2Test extends FreeSpec with ChiselScalatestTester{
//    "LAB4TASK2Test test" in{
//        test(new ImmdValGen ()){c =>

// val array_op = Array (I_type , S_type , SB_type , U_type , UJ_type)

// // for ( i <- 0 until 1) {
//     // val opr = Random . nextInt (5)
//     val opr = 19
//     val src_a = array_op(opr) 

//     println(opr, src_a)

// val result = src_a match {
//     case I_type => src_a(31,20)
//     case S_type => src_a(31,25); src_a(11,7)
//     case SB_type => src_a(31); src_a(7); src_a(30,25); src_a(11,8); 0.U
//     case U_type =>  src_a(31,12)
//     case UJ_type => src_a(31); src_a(19,12); src_a(20); src_a(30,21); 0.U
// }
// val result1 : BigInt = if ( result < 0)
//                              ( BigInt (0xFFFFFFFFL ) + result +1) & 0xFFFFFFFFL
//                        else result & 0xFFFFFFFFL

//          c.io.instr.poke(src_a)
//          c.clock.step(10)
//          c.io.immd_se.expect ( result)
// }      
// }
// }
// // }