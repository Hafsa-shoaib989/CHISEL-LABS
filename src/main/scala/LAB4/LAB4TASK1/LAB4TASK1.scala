// package practice

// import chisel3._
// import chisel3.util._
// import ALUOP._
// import chisel3.stage.ChiselStage

// object ALUOP {
//     val ALU_BEQ = 0.U(3.W)
//     val ALU_BNE = 1.U(3.W)
//     val ALU_BGE = 2.U(3.W)
//     val ALU_BLT  = 3.U(3.W)
// }
// class LM_IO_Interface_BranchControl extends Bundle {
//     val fnct3 = Input ( UInt (3.W ) )
//     val branch = Input ( Bool () )
//     val arg_x = Input ( UInt (32.W ) )
//     val arg_y = Input ( UInt (32.W ) )
//     val br_taken = Output ( Bool () )
// }
// class BranchControl extends Module{
//     val io = IO (new LM_IO_Interface_BranchControl)

// io.br_taken := 0.B
// when(io.branch === 1.B){
//     switch ( io.fnct3 ) {
//         is ( ALU_BEQ ) {
//             io.br_taken := io.arg_x === io.arg_y}
//         is ( ALU_BNE ) {
//             io.br_taken := io.arg_x =/= io.arg_y}
//         is ( ALU_BGE ) {
//             io.br_taken := io.arg_x >= io.arg_y}
//         is ( ALU_BLT ) {
//             io.br_taken := io.arg_x < io.arg_y}}
// }.otherwise{
//     io.br_taken := 0.B
// }
// }