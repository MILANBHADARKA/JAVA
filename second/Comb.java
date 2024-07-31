class Comb{
    
    public static void main(String[] args) {
        
        int j = 1;
        int k = 1;
        int i = 1;
        int l = 1;
        int count1 = 0;
        int count2 = 0;


        for(i=1;i<=5;i++){
            
            if(i==5){
                j++;
                i=1;
            }
            if(j==5){
                k++;
                i=1;
                j=1;
            }
            if(k==5){
                l++;
                i=1;
                j=1;
                k=1;
            }
            if(l==5){
                break;
            }
            
            if( j > i && l < k){
                System.out.println(i + "" + j + "" + k + "" + l);
                count2++;
            }
            count1++;

        }

        System.out.println(count1 + "    " + count2);
        

    }
}

