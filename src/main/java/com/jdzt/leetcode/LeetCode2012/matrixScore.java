package com.jdzt.leetcode.LeetCode2012;

import java.util.Arrays;

/**
 * 861. 翻转矩阵后的得分
 * https://leetcode-cn.com/problems/score-after-flipping-matrix/
 *
 * @author jdzt.lln
 * @Description:
 * @date 2020/12/7 21:23
 * @Version
 */
public class matrixScore {

    //思路：把二维数组分为行和列，执行不同的操作
    //保证 每一行的第一位数字为 1
    //保证 每一列的的0的个数比1多，就翻转，否则保持不变
    public int matrixScore(int[][] A) {
        int res = 0;
        // 处理行
        for (int i = 0 ; i < A.length ; i++) {
            hangcao(A , i);
        }
        //  处理列
        for (int i = 0 ; i < A.length ; i++) {
            liecao(A , i);
        }
        //  计算答案
        for (int i = 0 ; i < A.length ; i++) {
            int temp = 0;
            for (int j = 0 ; j < A[0].length ; j++) {
                temp = temp * 2;
                temp = temp + A[i][j];
            }
            res = res + temp;
        }
        return res;
    }

    void hangcao(int[][] A , int hangindex) {
        if (A[hangindex][0] == 0) {
            for (int i = 0 ; i < A[0].length ; i++) {
                if (A[hangindex][i]==1){
                    A[hangindex][i]=0;
                }
                else {
                    A[hangindex][i]=1;
                }
            }
        }
    }

    void liecao(int[][] A , int lieindex) {
        int count=0;
        int lielen=A.length;
        for (int i=0;i<A.length;i++){
            if (A[i][lieindex]==0){
                count++;
            }
        }
        if (count>lielen-count){
            for (int i=0;i<A.length;i++){
                if (A[i][lieindex]==1){
                    A[i][lieindex]=0;
                }
                else {
                    A[i][lieindex]=1;
                }
            }
        }
    }

}
