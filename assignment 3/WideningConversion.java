class WideningConversion {
    public static void main(String[] args) {
        int a = 10;

        double b = a;
        float c = a;
        // boolean d = a;
        String e = String.valueOf(a);
        String f = "true";
        boolean d = Boolean.parseBoolean(f);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
    
}
