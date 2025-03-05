class Final {
    public static void main(String args[]) {
        int x = 100;
        final int y = 2000;
        int i=1; 
        while(i<2){
            System.out.println(x);
            System.out.println(y);
            x=x+100;
            System.out.println(x);
            i++;
        }
        
    }
    
}

// Output
// 100
// 2000
// 200
