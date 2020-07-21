package com.hit.demo3;

import java.util.Scanner;

public class Wordfind {
    public static void main(String [] args){
        String [] s = word(4);
        char [][] list = find(4);
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                for (int k = -4; k < 4; k++){
                    for (int l = 0; l < 4; l++){
                        if (wordfind(i, j, k, s[l], list))
                            System.out.println(i + ", " + j + ", " + k);
                    }
                }
            }
        }
    }

    public static String[] word(int a){
        String [] word = new String[a];
        System.out.println("Please enter the word list you want to query: ");

        for(int i = 0; i < a; i++){
            Scanner input = new Scanner(System.in);
            word[i] = input.nextLine();
        }

        return word;
    }

    public static char[][] find(int a){
        char [][] list = new char[a][a];
        System.out.println("Please emter the Alphabet: ");

        for (int i = 0; i < a; i++){
            for (int j = 0; j < a; j++){
                Scanner input = new Scanner(System.in);
                list[i][j] = input.nextLine().charAt(0);
            }
        }

        return list;
    }

    public static boolean wordfind(int a, int b, int c, String s, char [][] list){
        char [] ch = s.toCharArray();
        int d = b, e = a, f = a, g = a, h = b;
        int [] flag = new int[]{1, 1, 1, 1};
        if (((c == 4 || c == -4) && (a + b) != 4) || ((c == 3 || c == -3) && a != b) || c == 0)
            return false;

        if (c == 1 || c == -1){
            for (int i = 0; i < s.length(); i++, d += c)
                if (d == -1 || d == 4 || list[a][d] != ch[i]){
                    flag[0] = 0;
                    return false;
                }
        }

        else if (c == 2 || c == -2){
            for (int j = 0; j < s.length(); j++, e += (c / 2))
                if (e == -1 || e == 4 || list[e][b] != ch[j]){
                    flag[1] = 0;
                    return false;
                }
        }

        else if ((c == 3 || c == -3) && a == b){
            for (int k = 0; k < s.length(); k++, f += (c / 3))
                if (f == -1 || f == 4 || list[f][f] == ch[k]){
                    flag[2] = 0;
                    return false;
                }
        }

        else if ((c == 4 || c == -4) && (a + b) == 4){
            for (int l = 0; l < s.length(); l++, g += (c / 4), h -= (c / 4))
                if (f == -1 || f == 4 || g == -1 || g == 4 || list[g][h] != ch[l]){
                    flag[3] = 0;
                    return false;
                }
        }

        return true;
    }
}
