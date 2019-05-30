class Example {
  public static void main(String argv[]) {
    if (argv.length <1) {  // changed !=2 to <1
      usage();
    } else {
      int n = 0;
      try {
        n = Integer.parseInt(argv[0]);
      } catch (NumberFormatException e) {
        usage();
      }
      for (int i = 0; i < n; i++) {
        System.out.println(i +  ": " + argv[1]);
      }
    }
  }

  private static void usage() {
    System.err.println("usage: java Example count string");
    System.exit(1);
  }
}
