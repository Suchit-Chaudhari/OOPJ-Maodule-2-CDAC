class Arithmetic {
    public static void main(String[] args) {
        //Narrowing arithmetic operation
        int a = 10;
        float b = 6.99f;
        double c = 33.99;

        int result = a + ( int ) b + ( int ) c;
        System.out.println(result);

        //Widening arithmetic operations

        int e = 10;
        float f = 13.67f;
        double g = 898.688;
        
        double result2 = e + f + g;
        System.out.println(result2);  
    }
    
}
