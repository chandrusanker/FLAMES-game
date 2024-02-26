/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.flames;

/**
 *
 * @author Asus
 */
public class operationOfFlames {

    public String flames(String a, String b) {

        int n = CountofUnique(a, b);
        char c = findchar(n, "FLAMES");

       return flamesStatement(c);
    }
    
    public static String flamesStatement(char c){
    switch(c){
        case 'F': return "Friend";
        case 'L': return "love";
        case 'A': return "Affection";
        case 'M': return "Marriage";
        case 'E': return "Enemy";
        case 'S': return "Sister";
    
    }
    
    return "poda****";
    }

    public static char findchar(int n, String s) {
        char f[] = s.toCharArray();
        int count = 1;
        int t = 0;
        int i = 0;
        while (true) {
            if (i > f.length - 1) {
                i = 0;
            }
            if (t == n - 1 && f[i] != '0') {

                t = 0;
                f[i] = '0';
                count++;
                continue;
            }

            if (count == 6) {
                break;
            }
            if (f[i] != '0') {
                t++;
            }
            i++;
        }

        for (int j = 0; i < f.length; j++) {
            if (f[j] != '0') {
                return f[j];
            }
        }
        return 'F';
    }

    public int CountofUnique(String a, String b) {

        char[] m = a.toCharArray();
        char[] f = b.toCharArray();
        int count = 0;
        int total = m.length + f.length;
        for (int i = 0; i < m.length; i++) {
            if (m[i] != ' ') {
                for (int j = 0; j < f.length; j++) {
                    if (f[j] == ' ') {
                        f[j] = '0';
                        count++;
                    }
                    if (m[i] == f[j]) {
                        f[j] = '0';
                        total -= 2;
                        break;
                    }

                }
            } else {
                count++;
            }
        }

        return total - count;

    }

}
