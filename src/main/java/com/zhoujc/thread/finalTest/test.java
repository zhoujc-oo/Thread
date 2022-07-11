package com.zhoujc.thread.finalTest;

/**
 * @Author zhoujc
 * @Date 2022/2/26
 */
public class test {

//当程序执行到这一行的时候会出错，
// 因为b1、b2可以自动转换成int类型的变量，
// 运算时java虚拟机对它进行了转换，结果导致把一个int赋值给byte-----出错
//   byte b1 = 1;
//   byte b2 = 2;

//    如果对b1 b2加上final就不会出错

    final byte b1 = 1;
    final byte b2 = 2;
    byte b3 = b1 + b2;

}
