package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String[] doorsAndKeys = new String[t];
        String[] answers = new String[t];
        int k = 0;

        for (int i = 0; i < t; i++){
            doorsAndKeys[i] = br.readLine();
        }
        List<Character> keys;
        for (int l = 0; l < t; l++){
            keys = new ArrayList<>();
            for (int i = 0; i < 6; i++){
                if (doorsAndKeys[l].charAt(i) == 'r' || doorsAndKeys[l].charAt(i) == 'g' || doorsAndKeys[l].charAt(i) == 'b') {
                    keys.add(doorsAndKeys[0].charAt(i));
                }
                else {
                    char door = Character.toLowerCase(doorsAndKeys[l].charAt(i));
                    if (keys.contains(door)){
                        System.out.println(keys);
                        keys.remove(keys.indexOf(door));

                        k++;

                    }
                    else break;
                }
            }
            System.out.println(k);
            answers[l] =  k == 3 ? "YES" : "NO";
            k = 0;
            keys.clear();
        }
        System.out.println(Arrays.toString(answers));
//        System.out.println(k == 3 ? "YES" : "NO");

    }
}
