package org.example;

import java.io.*;
import java.util.StringTokenizer;

public class HEIGHTRATION {
  public static void main(String... args) {
    FastReader sc = new FastReader();
    PrintWriter pw = new PrintWriter(System.out);

    int a = sc.nextInt();
    int b = sc.nextInt();

    pw.println(Math.max(a, b));
    pw.close();

  }

  static class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
      br = new BufferedReader(new InputStreamReader(System.in));
    }

    String next() {
      while (st == null || !st.hasMoreElements()) {
        try {
          st = new StringTokenizer(br.readLine());
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      return st.nextToken();
    }

    int nextInt() {
      return Integer.parseInt(next());
    }

    Long nextLong() {
      return Long.parseLong(next());
    }

    double nextDouble() {
      return Double.parseDouble(next());
    }

    String nextLine() {
      String str = "";
      try {
        str = br.readLine();
      } catch (IOException e) {
        e.printStackTrace();
      }
      return str;
    }
  }
}
