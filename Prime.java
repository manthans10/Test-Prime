class Main{
    public static void main(String args[]){
        for(int i = 0 ; i<=100; i++){
            if(isPrime(i) == true){
                System.out.println(i);
            }
        }
    
}

 public static boolean isPrime(int i){
     boolean flag = false;
     if(i < 2){
        flag = false;
     }
     else
     {
         for(int j = 2; j <= i/2 ; j++){
             if(i%j == 0){
                 flag = false; 
             }
             else{
             flag = true;
             }
         }
     }
     
     return flag;
 }
}
 
