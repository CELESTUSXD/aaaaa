class ArrayDemo {
    public static void main(String[] args){
        
        //declares an array of integers
        ////int[] anArray;       
        // allocates memory for 10 integers
        ////anArray = new int[10];
        
        //alternative way to declare and create an array
        int[] anArray = {
            100, 200, 300, 400, 500, 
            600, 700, 800, 900, 100
        };
        
        //initialize the first element
        anArray[0] = 100;
        // and so on
        anArray[1] = 200;
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;
        
        System.out.println("Element at index 0: " 
                          + anArray[0]);
        System.out.println("Element at index 1: " 
                          + anArray[1]);
        System.out.println("Element at index 2: " 
                          + anArray[2]);
        System.out.println("Element at index 3: " 
                          + anArray[3]);
        System.out.println("Element at index 4: " 
                          + anArray[4]);
        System.out.println("Element at index 5: " 
                          + anArray[5]);
        System.out.println("Element at index 6: " 
                          + anArray[6]);
        System.out.println("Element at index 7: " 
                          + anArray[7]);
        System.out.println("Element at index 8: " 
                          + anArray[8]);
        System.out.println("Element at index 9: " 
                          + anArray[9]);
        System.out.println(anArray.length);
    }
}
