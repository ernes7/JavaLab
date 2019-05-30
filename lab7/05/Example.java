import java.io.*;
import java.util.*;

class Example {
  public static void main(String argv[]) throws IOException {
    double[] ds     = readDoubleArray(argv[0]);
    int b           = Integer.parseInt(argv[1]);
    double min      = Double.parseDouble(argv[2]);
    double max      = Double.parseDouble(argv[3]);
    System.out.println("x < " + min + " : " + minF(min, ds));
    bars(min,max,ds,b);
    System.out.println("x >= " + max + " : " + maxF(max, ds));
  }

// min
  private static int minF(double min, double[] ds) {
    int x = 0;
    for (double d : ds)
    {
        if(d < min) { x++; } 
    }
    return x;
  }

// max
  private static int maxF(double max, double[] ds) {
    int x = 0;
    for (double d : ds)
    {
        if(d >= max) { x++; } 
    }
    return x;
  }

// bars
  private static void bars(double min, double max, double[] ds, int b) {
    int count = 0;
    double range = (max - min) / b; // range of bars
    double start = min;
    double end = max;
    while(start != end)
    {
        for( double d : ds )
        {
            if(d >= start && d <= (start+range)) { count++; }
        }
        System.out.println(start + " <= x < " + (start+range) +  " : " + count);
        start = start+range;
        count = 0;
    }
  }

  private static double[] readDoubleArray(String filename) throws IOException {
    FileReader f = new FileReader(filename);
    Scanner sc = new Scanner(f);
    int n = sc.nextInt();
    double[] ds = new double[n];
    for (int i = 0; i < n; i++) {
      ds[i] = sc.nextDouble();
    }
    f.close();
    return ds;
  }
}
