// (skip this task)
// package practice

// import chisel3._
// import chisel3.util._
// import ALUOP._
// import chisel3.stage.ChiselStage

// object ALUOP {
//     val I_type = "b00000000010100000000001010010011".U
//     val S_type = "b00000000010100000000001010100011".U
//     val SB_type = "b00000000010100000000001011100011".U
//     val U_type = "b00000000010100000000001010110111".U
//     val UJ_type = "b00000000010100000000001011101111".U
//     // val I_type = 5243795.U
//     // val S_type = 5243811.U
//     // val SB_type = 5243875.U
//     // val U_type = 5243831.U
//     // val UJ_type = 5243887.U
// }   
// class LM_IO_Interface_ImmdValGen extends Bundle {
//     val instr = Input ( UInt (32.W ) )
//     val immd_se = Output ( UInt (32.W ) )
// }
// class ImmdValGen extends Module {
//     val io = IO (new LM_IO_Interface_ImmdValGen )

// val opcode = io.instr(6,0)

// io.immd_se := 0.U
// switch(opcode){
//     is(I_type) {
//         io.immd_se := Cat(Fill(20, io.instr(31)), io.instr(31,20))}//i-type
//     is(S_type) {
//         io.immd_se := Cat(Fill(20, io.instr(31)), io.instr(31,25), io.instr(11,7))} //s type
//     is(SB_type) {
//         io.immd_se := Cat(Fill(19, io.instr(31)), io.instr(31), io.instr(7), io.instr(30,25), io.instr(11,8), 0.U)} // sb type
//     is(U_type) {
//         io.immd_se := Cat(Fill(12, io.instr(31)), io.instr(31,12))} // u type
//     is(UJ_type) {
//         io.immd_se := Cat(Fill(11, io.instr(31)), io.instr(31), io.instr(19,12), io.instr(20), io.instr(30,21), 0.U)} //uj type
// }
// }

