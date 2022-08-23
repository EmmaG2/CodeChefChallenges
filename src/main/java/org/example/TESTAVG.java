package org.example;

import java.io.*;
import java.util.StringTokenizer;

class TESTAVG {
  public static void main(String[] args) {
    FastReader sc = new FastReader();
    PrintWriter pw = new PrintWriter(System.out);

    int t = sc.nextInt();

    while (t --> 0) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();

      int z = (a + b) / 2;
      int x = (b + c) / 2;
      int y = (c + a) / 2;

      if (z < 35 || x < 35 || y < 35) pw.println("FAIL");
      else pw.println("PASS");
    }

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
