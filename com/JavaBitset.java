package com;

import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiConsumer;

public class JavaBitset {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();
            int op = sc.nextInt();
            BitSet[] bitset = new BitSet[] { new BitSet(size), new BitSet(size) };
            Map<String, BiConsumer<Integer, Integer>> ops = new HashMap<>();
            ops.put("AND", (index1, index2) -> bitset[index1 - 1].and(bitset[index2 - 1]));
            ops.put("OR", (index1, index2) -> bitset[index1 - 1].or(bitset[index2 - 1]));
            ops.put("XOR", (index1, index2) -> bitset[index1 - 1].xor(bitset[index2 - 1]));
            ops.put("SET", (index1, index2) -> bitset[index1 - 1].set(index2));
            ops.put("FLIP", (index1, index2) -> bitset[index1 - 1].flip(index2));

            for (int i = 0; i < op; i++) {
                ops.get(sc.next()).accept(sc.nextInt(), sc.nextInt());
                System.out.println(bitset[0].cardinality() + " " + bitset[1].cardinality());
            }

        }
    }
}
