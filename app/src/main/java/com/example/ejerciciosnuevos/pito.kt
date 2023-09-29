package com.example.ejerciciosnuevos

fun main(){

println(esPar(2))






}
fun esPar(n:Int): Boolean {
    var res:Boolean
    if(n%2==0){
        res=true;
    }else{
        res=false
    }
    return res
}