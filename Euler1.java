import org.graalvm.compiler.debug.CSVUtil.Escape;

/*
public class Euler1{
    public static void main(String args[]){

        long x=600851475143L;
    
        for(long i=2;i<x ;i++){
            while(x % i==0){
                x=x/i;
    
            }   
    
        }
        System.out.println(x);
    }
    
}
*/
/*
import java.util.ArrayList;
public class Euler1{
    public static int N = 10001;

    private static boolean isOddPrime(long x) {

        for (int i = 3 ; i*i <= x ; i+=2 ) {
            if ( x % i == 0 ) {
                rurn false;
            }               
        }
        rurn true;
    }

    public static void main(String[] args) throws Exception {
        int x;
        int i = 2;      
        for ( x = 3 ; ; x+=2 ) {
            if (isOddPrime(x)) {              
                if ( i == N )
                    break;
                i++;
            }
        }
        System.out.println(x);

    }
}
*/
/*
import java.util.ArrayList;
public class Euler1{
    public static void main(String[]args){
        for(int a=2;a<1000;a++){
            for(int b=2;b<1000;b++){
                for(int c=2;c<1000;c++){
                    if (((a*a)+(b*b)==(c*c))&&(a+b+c==1000)){
                        System.out.println("A is"+a);
                        System.out.println("B is"+b);
                        System.out.println("C is"+c);
                        
                    
                    }
                    
                }
            }
        }
    }
}
*/
/*
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
public class Euler1{
    public static int sum=0;
   public static void main (String[] args){	
        for (int z=0; z<=2000000; z++){
            if (isPrime(z)){
                sum=sum+z;
            }
        }
        System.out.println(sum-1); 
       
 
       
   }
   public static boolean isPrime(i) {
    for(int i=2;i++) {
        %i==0)
            rurn false;
    }
    rurn true;
    }
}
*/
/*
import java.util.Arrays;
public class Euler1{
    public static int a=1;
    public static void main(String[]args){
        int number = 1000000;
        int seqL = 0;
        int sNum = 0;
        long seq=0;
 
        int[] arr = new int[number + 1];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }
        arr[1] = 1;
 
        for (int i = 2; i <= number; i++) {
            seq = i;
            int k = 0;
            while (seq != 1 && seq >= i) {
                k++;
                if ((seq % 2) == 0) {
                    seq = seq / 2;
                }       
                else {
                    seq = seq * 3 + 1;
                }
            }
    
            arr[i] = k + arr[(int) seq];
 
    
            if (arr[i] > seqL) {
                seqL = arr[i];
                sNum = i;
            }
        }
        System.out.println(sNum);
   
    }
}
*/
/*
public class Euler1{
    public static void main(String[]args){

        double y=2;
        for(int i=0;i<500;i++){
            y=Math.pow(y,2);

        }   
        long u=(long) y;
        System.out.println(u);
    
        
    }
}
*/
/*
public class Euler1{
    public static void main(String[]args){
        String triangle=(
        "75 00 00 00 00 00 00 00 00 00 00 00 00 00 00" +
        " 95 64 00 00 00 00 00 00 00 00 00 00 00 00 00" +
        " 17 47 82 00 00 00 00 00 00 00 00 00 00 00 00" +
        " 18 35 87 10 00 00 00 00 00 00 00 00 00 00 00" +
        " 20 04 82 47 65 00 00 00 00 00 00 00 00 00 00" +
        " 19 01 23 75 03 34 00 00 00 00 00 00 00 00 00" +
        " 88 02 77 73 07 63 67 00 00 00 00 00 00 00 00" +
        " 99 65 04 28 06 16 70 92 00 00 00 00 00 00 00" +
        " 41 41 26 56 83 40 80 70 33 00 00 00 00 00 00" +
        " 41 48 72 33 47 32 37 16 94 29 00 00 00 00 00" +
        " 53 71 44 65 25 43 91 52 97 51 14 00 00 00 00" +
        " 70 11 33 28 77 73 17 78 39 68 17 57 00 00 00" +
        " 91 71 52 38 17 14 91 43 58 50 27 29 48 00 00" +
        " 63 66 04 68 89 53 67 30 73 16 69 87 40 31 00" +
        " 04 62 98 27 23 09 70 98 73 93 38 53 60 04 23");
        String[] z= triangle.split(" ");
        int f=0;
        Integer[][] x= new Integer[][]{{75,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}};
        
        for(int a=0; a<15;a++){
            for(int j=0; j<=15;j++){
                if ((z[j]!="00")){
                    try{
                        String p= z[j];
                        if (p.contains("0")){
                            char lol= z[j].charAt(1);
                            x[a][j]=Integer.parseInt(Character.toString(lol));
                        }
                        else{
                            x[a][j]= Integer.parseInt(z[j]);

                        }
                            
                    }
                    catch(NumberFormatException e){
                        x[a][j]=0;
                    }
                    catch(NullPointerException l){
                        x[a][j]=0;
                    }



                }
                else
                    f++;

            }


        }
        for(int k=13; k>=0;k--){
            for(int l=0;l<=k;l++){
                if ((x[k+1][l]) > (x[k+1][l+1])){
                    x[k][l]+=x[k+1][l];
                }
                else 
                    x[k][l]+=x[k+1][l+1];



            }


        }
        System.out.println(x[0][0]);
    }
}
*/
/*
public class Euler1{
    public static void main(String[]args){
        Integer[][] x= new Integer[][]
        {{75,00,00,00,00,00,00,00,00,00,00,00,00,00,00},
        {95,64,00,00,00,00,00,00,00,00,00,00,00,00,00},
        {17,47,82,00,00,00,00,00,00,00,00,00,00,00,00},
        {18,35,87,10,00,00,00,00,00,00,00,00,00,00,00},
        {20,4,82,47,65,00,00,00,00,00,00,00,00,00,00},
        {19,1,23,75,3,34,00,00,00,00,00,00,00,00,00},
        {88,2,77,73,7,63,67,00,00,00,00,00,00,00,00},
        {99,65,04,28,6,16,70,92,00,00,00,00,00,00,00},
        {41,41,26,56,83,40,80,70,33,00,00,00,00,00,00},
        {41,48,72,33,47,32,37,16,94,29,00,00,00,00,00},
        {53,71,44,65,25,43,91,52,97,51,14,00,00,00,00},
        {70,11,33,28,77,73,17,78,39,68,17,57,00,00,00},
        {91,71,52,38,17,14,91,43,58,50,27,29,48,00,00},
        {63,66,04,68,89,53,67,30,73,16,69,87,40,31,00},
        {04,62,98,27,23,9,70,98,73,93,38,53,60,04,23}};
        int f=0;
        for(int k=13; k>=0;k--){
            for(int l=0;l<=k;l++){
                if ((x[k+1][l]) > (x[k+1][l+1])){
                    x[k][l]+=x[k+1][l];
                }
                else 
                    x[k][l]+=x[k+1][l+1];



            }


        }
        System.out.println(x[0][0]);
    }
}
*/
/*
import java.math.BigInteger; 
public class Euler1{
    public static void main(String[] args) {
        System.out.println(Sum(100));
    }
    private static long Sum(int n){
        BigInteger z = BigInteger.ONE;
        for (int i = 2; i <= n; i++){
            z = z.multiply(BigInteger.valueOf(i));
        }
        long total = 0;
        while (z.comparo(BigInteger.ZERO) > 0) {
            total += z.mod(BigInteger.TEN).longValue();
            z = z.divide(BigInteger.TEN);
        }
        rurn total;
    }

}
*/
/*
import java.util.HashSet;
public class Euler1{
    public static int sum=0;
    public static HashSet<Integer> set;
    public static void main(String[]args){
        System.out.println(sumDivisors(10000));
        System.out.println(finalthing());
        }

        


        

    private static int sumDivisors(int n){
        int limit = n;
        int sum = 0;
        for(int i=1;i<limit;i++){
            if(n%i==0){
                if(i!=1)
                    sum += (i + n/i);
                else 
                    sum += i;
                limit = n/i;
            }
        }       
        rurn sum;
    }
    
    private static boolean isAmicable(int n, HashSet<Integer> set){
        int sum = sumDivisors(n);   
        if(sumDivisors(sum)==n && n!=sum){
            set.add(sum);
            rurn true;
        }
        rurn false;
    }

    private static long finalthing(){
        long sum = 0;
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=1;i<10000;i++){
            if(!set.contains(i)){
                if(isAmicable(i,set)){
                    set.add(i);
                }
            }
        }
        for(Integer i: set) sum+=i;
        rurn sum;
    }
}
*/
/*
import java.util.List;
public class Euler1{
    public static int[] nums= new int[]{0,1,2,3,4,5,6,7,8,9};
    public static void main(String[]args){
        
        int count= 1;
        int permNum= 1000000;
        while(count<permNum){
             int N=nums.length;
             int i= N-2;
             while(nums[i-1]>=nums[i]){
                 i=i-1;
            
             }
             int j=N-1;
             if (nums[j]!=0){
                while(nums[j-1]>=nums[j]){
                    j=j-1;
                }

             }
             
             swap(i-1,j-1);
             i++;
             j--;

         }
         count++;
         String numPerm= "";
         for (int k=0; k< nums.length;k++){
             numPerm=numPerm+nums[k];
         }
     }
    private static void swap(int i, int j){
        int k=nums[i];
        nums[i]=nums[j];
        nums[j]=k;
        
    }
}
*/
/*
public class Sale extends Transaction{
    public static double main(Boolean isCash){
        int salePercent;
        String description= getDescription();
        int quantity= getNumItems();
        double cost= getItemCost();
        int totalCost=getTotal();
        if (isCash==true){
            salePercent=10;
            totalCost=totalCost-(0.1*totalCost)

        }
        else
            totalCost=totalCost;
            


    }

    
}
*/
/*
public void computeVotePercent(){
    int totalVotes=0;
    for(Candidate:myCL/ist[]){
        totalVotes=totalVotes+Candidate.getNumVotes();
        
        
    }
    for(int i=0;i<myCList.length;i++){
        Candidate.setVotePercent((double) getNumVotes()/totalVotes);
    }

}
public Arraylist<Candidate> getViableList(){
    int z;
    ArrayList<Candidate> possibleCandidates= new Arraylist<Candidate>;
    for(Candidate:myCList[]){
        z=Candidate.getVotePercentage();
        if (z>=10){
            possibleCandidates.add(Candidate);
        }
    }
    for(Candidate:possibleCandidates){
        rurn Candidate;
    }   
}
*/
/*
import java.util.ArrayList;
public class Euler1{
    public static void main(String[]args){
        System.out.println(q24());
        

    }
    public static int q24(){
        int index = 3;
        BigInteger fn_2 = new BigInteger("1");
        BigInteger fn_1 = new BigInteger("1");
        BigInteger fn   = fn_1.add(fn_2);
        while(fn.toString().length()<1000){
            fn_2 = fn_1;
            fn_1 = fn;
            fn = fn_2.add(fn_1);
            index++;
        }       
        rurn index;
    }
}
*/
/*
public class Euler1{
    public static int sLength=0;
    public static int d=1000;
    public static void main(String[]args){
        for(d=1000;d>1;d--) {
            if (sLength>=d) {
                break;
            }
            

            int[] gRemainders= new int[d];
            int val=1;
            int pos=0;
            while ((gRemainders[val]==0)&& (val!=0)){
                gRemainders[val]=pos;
                val=val*10;
                val=val%d;
                pos++;
            }
            if(pos-gRemainders[val]>sLength){
                sLength=pos-gRemainders[val];
            }
        }
        System.out.println(d);
    }

}
*/

/*
public class Euler1{
    public static void main(String[]args){
        int num=1;
        int sum=0;
        int layer=1;
        int gap;
        for(int a=1;a<=500;a++){
            for(int i=1;i<=4;i++){
                gap=layer*2;
                num=num+gap;
                sum=sum+num;
                
                

            }
            layer++;
        }
        System.out.println(sum);

    }
}
*/
/*
public class Euler1{
    public static void main(String[]args){ 
        int[] factorial= new int[10];
        int r=0;
        for(int i=0; i<10;i++){
            factorial[i]= facalc(i);
        }
        for(int a=3;a<=5555555;a++){
            int sum=0;
            int num=a;
            while(num>0){
                int j= num%10;
                num=num/10; 
                sum=sum+factorial[j];
            }
            if (sum==a){
                r=r+a;

            }

        }
        System.out.println(r);

    }
    private static int facalc(int x){
        if (x == 0){
            rurn 1;
        }
        int y = x;
        for (int i = 1; i < x; i++){
            y =y*i;
        }
        rurn y;
    }
}

*/
/*
import java.util.ArrayList;
public class Euler1{
    public static String puzzle="HARPS";
    public static ArrayList <Character> holder= new ArrayList<Character>();
    public static void main(String[]args){
        System.out.println(getHint("HOUR"));

    }
    public static String getHint(String lol){
        //Guess==lol
        ArrayList <Character> chararray= new ArrayList<Character>();
        //chararray==array of chars in lol
        ArrayList <Character> puzzlearray= new ArrayList<Character>();
        //puzzlearray==array of chars in puzzlz
        for(int b=0;b<lol.length();b++){
            chararray.add(lol.charAt(b));
        }
        for(int l=0;l<puzzle.length();l++){
            puzzlearray.add(puzzle.charAt(l));
        }
        for(int a=0;a<puzzlearray.size();a++){
            holder.add('/');
        }
        for(int i=0;i<puzzlearray.size();i++){
            if (puzzlearray.get(i)==chararray.get(i)){
                holder.set(i,puzzlearray.get(i));
                


            }
            else if(puzzle.contains(chararray.get(i)+"")){
                holder.set(i,'+');
            }
            else if(!(puzzle.contains(chararray.get(i)+""))){
                holder.set(i,'*');  
                    
            }
        }
        String charsStr = holder.toString() 
                            .substring(1, 3 * holder.size() - 1) 
                            .replaceAll(", ", "");
        rurn(charsStr);
    }
}
*/
/*
public class Euler1{
    public static void main(String[]args){
        int [] array= {634,521,786,899,509,235,750,806,142,645};
        System.out.println(increasing(array));
        

    }
    public static boolean increasing(int[]arr){
        boolean x=true;
        for(int i=0;i<arr.length;i++){
            if (i==0){

            }
            else{
                if (arr[i-1]<=arr[i]){
                    x=true;
                }
                else
                    rurn false;
            }
        }
        rurn x;


    }
}
*/
/*
public class Euler1{
    public static void main(String[]args){
        double[] rsi= {55.6,63.2,68.1,70.1,72.4,73.9,71.5,68.3,67.1,66.2};
        int[] reach= overpriced(rsi);
        for(int x:reach){
            System.out.println(x);
        }

    }
    public static int[] overpriced(double[]rsiValues){
        int array[]= new int[rsiValues.length];
        for(int i=0;i<rsiValues.length;i++){
            if(rsiValues[i]>70){
                array[i]=1;
            }
            else
                array[i]=0;

        }
        rurn array;
    }
}
*/
/*
public class Euler1{
    public static void main(String[]args){
        int[] newarr= onlyEvens(6, 10);
        for(int i=0;i<6;i++){
            System.out.println(newarr[i]);
        }

    }
    public static int[] onlyEvens(int arraySize, int range){
        int[] array= new int[arraySize];
        int z=0;
        while(z<arraySize){
            int p= ((int)(Math.random()*range)-1);
            if (p%2!=0){
                p=p-1;
                array[z]=p; 
            }
            else
                array[z]=p;
            z++;

        }
        rurn array;
    }
}
*/
/*
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Euler1 {
    /*
public static void main(String[] args) throws IOException, FileNotFoundException {
    FileReader reader = new FileReader("matrix.txt");
    BufferedReader reader2 = new BufferedReader(reader);
    String[][] tgrid = new String[80][80];
    for(int i = 0; i < 80; i++) {
        String x = reader2.readLine();
        String[] y = x.split(",");
        for(int j = 0; j < 80; j++) {
            tgrid[i][j] = y[j];
        }
    }
    for(int k = 0; k < 80; k++) {
        for(int l = 0; l <80; l++) {
            System.out.print(tgrid[k][l]);
            System.out.print("  ");
        }
        System.out.println("");
    }
    reader2.close();
    Integer[][] grid= new Integer[80][80];
    int k;
    for(int i=0;i<80;i++){
        for(int l=0;l<80;l++){
            try{
                k= Integer.parseInt(tgrid[i][l]);
                grid[i][l]= k;
            }
            catch(NumberFormatException poop){
                grid[i][l]= 0;
            }
        }
    }
    //GET the CRAP
    int gSize=80;
    for (int i = grid.length - 1; i >= 0; i--) {
			for (int j = grid[i].length - 1; j >= 0; j--) {
				int t;
				if (i + 1 < grid.length && j + 1 < grid[i].length)
					t = Math.min(grid[i + 1][j], grid[i][j + 1]);
				else if (i + 1 < grid.length)
					t = grid[i + 1][j];
				else if (j + 1 < grid[i].length)
					t = grid[i][j + 1];
				else
					t = 0;
				grid[i][j] += t;
			}
		}
		System.out.println(String.format("%d",grid[0][0]));
	}
}
*/
/*
public class Euler1{
    public static void main(String[]args){
        int result = 0;
        int target = 10000000;
        int cachesize = (int)Math.Ceiling(Math.Log10(target));
        int[] number = new int[cachesize];
        int i = cachesize-1;
 
        while (true) {
            if (i == 0 && number[i] == 9){
                //Reached max
                break;
            }
            if (i == cachesize - 1 && number[i] < 9) {
                //Increase the last number
                number[i]++;
                result += CheckNum(number);
            } else if (number[i] == 9) {
                //we reach max, so move back
                i--;
            } else{
                //Increase a digit
                number[i]++;
                //Move to the end
                for (int j = i+1; j < cachesize; j++) {
                    number[j] = number[i];
                }
                i = cachesize - 1;
                result += CheckNum(number);
            }
        }
    }
    public int CheckNum(int[] number){
        //make the array into a number
        int factor = 1;
        int candidate = 0;
        for (int i = number.Length - 1; i >= 0; i--) {
            candidate += factor * number[i];
            factor *= 10;
        }
 
        //Calc sequence
        while (candidate != 89 && candidate != 1) {
            candidate = nextNumber(candidate);
        }
 
        if (candidate == 89) {
            //calc the number of each digit
            int[] numDigits = new int[10];
            for (int i = 0; i < number.Length; i++) {
                numDigits[number[i]]++;
            }
 
            //calc the multinomial coef
            int result = Factor(number.Length);
            for (int i = 0; i < numDigits.Length; i++) {
                result /= Factor(numDigits[i]);
            }
            return result;
        }
 
        return 0;
    }
        
}
*/
/*
import java.util.ArrayList;
public class Euler1{
    public static void main(String[]args){
       Character[][] answer= SentenceOrganizer("taas");
       System.out.println(answer[0][1]);

    }
    public static Character[][] SentenceOrganizer(String p){
        Character[] alpha= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int redix=10;
        Character[][] returner= new Character[26][2];
        ArrayList<Character> x= new ArrayList<Character>();
        
        for(int i=0;i<p.length();i++){
            x.add(p.charAt(i));


        }
        for(int i=0;i<p.length();i++){
            if ((p.charAt(i)==' ') || p.charAt(i)=='.'){
                x.remove(i);
            }
        }
        for(int k=0;k<26;k++){
            returner[k][1]='0';
        }
        for(int m=0;m<26;m++){
            returner[m][0]= alpha[m];
        }
        for(int o=0;o<x.size();o++){
            for(int a=0;a<26;a++){
                if (x.get(o)==alpha[a]){
                    int l= (int) returner[a][1];
                    l++;
                    returner[a][1]= (char) l;                   
                    break;
                }
            }

        }
        return returner;

        
    }
}  
*/
/*
public class Euler1{
    public static void main(String[]args){
        


    }
    public double getScore(Arraylist<String> key){
        double correct=0;
        double wrong=0;
        for(int i=0;i<key.size();i++){
            if (answers.get(i)==key.get(i)){
                correct++;

            }
            else if(answers.get(i)=="?"){

            }
            else if(answers.get(i)!=key.get(i)){
                wrong++;
            }
        }
        return((correct*1)-(wrong*0.25));
    }
    */
/*
import java.util.ArrayList;
public class Euler1{
 /** rateTable has 24 entries representing the charging costs for hours 0 through 23. */
 /*
    public static int[] rateTable= new int[]{50,60,160,60,80,100,100,120,150,150,150,200,40,240,220,220,200,200,180,180,140,100,80,60};
    public static void main(String[]args){
        System.out.println(getChargeStartTime(2));     
    }
/** Determines the total cost to charge the battery starting at the beginning of startHour.
* @param startHour the hour at which the charge period begins
 * Precondition: 0 ≤ startHour ≤ 23
 * @param chargeTime the number of hours the battery needs to be charged
 * Precondition: chargeTime > 0
 * @return the total cost to charge the battery
 */
/*
    private static int getChargingCost(int startHour, int chargeTime){
        int totalCost=0;
        for(int i=startHour;i<chargeTime;i++){
            totalCost+=rateTable[i];

        }
        return totalCost;


    }
 /** Determines start time to charge the battery at the lowest cost for the given charge time.
 * @param chargeTime the number of hours the battery needs to be charged
 * Precondition: chargeTime > 0
 * @return an optimal start time, with 0 ≤ returned value ≤ 23
 * 
 */
/*
    public static int getChargeStartTime(int chargeTime){
        ArrayList<Integer> sums= new ArrayList<Integer>();
        int[] x= new int[chargeTime];
        int z=0;
        for(int i=0;i<=rateTable.length-chargeTime;i++){
            for(int n=0;n<chargeTime;n++){
                x[n]=0;
            }
            for(int a=0;a<chargeTime;a++){
                x[a]=rateTable[i];

            }
            int s=0;
            for(int p=0;p<x.length;p++){
                s=s+x[p];

            }
            sums.add(s);
        }
        for(int m=0;m<sums.size()-1;m++){
            if(sums.get(m)>sums.get(m+1)){
                sums.remove(m);
            }
            else{
                sums.remove(m+1);
            }

        }
        for(int o=0;o<rateTable.length;o++){
            if(rateTable[o]==x[0]){
                z=o;
                
            }

        }
        return z;
    }

        
        
} 

public class Euler1{
    public static void main(String[]args){

    }
    public int limitAmplitude(int l )   
}

*/
/*
public class ScoreInfo{
    private int score;
    private int numStudents;
    public ScoreInfo(int aScore, boolean isSenior){
        score= aScore;
        numStudents=1;
        senior= isSenior;
        
    }
    public boolean record(int score){
        ScoreInfo x= new ScoreInfo(score);
        if (scoreList.contains(score)){
            x.increment();
            return false;   
        }
        else{
            for(int i=0;i<scoreList.size()-1;i++){
                if (scoreList.get(i)<scoreList.get(i+1)){

                }
                else{
                    scoreList.add(i, x);
                }
            }
            return true;


        }    
 
    }
    public void recordScores(int[] stuScores){
        for(int i=0; i<stuScores.length;i++){
            record(stuScores[i]);
        }
    }
    You would add the param isSenior as a boolean in ScoreInfo, then in the getSeniorpercentage, you would loop through every object of scoreinfo type and check if it is a senior, and if it is you would add 1 to the counter, once the loop has terminated, 
}
*/
/*
public class Euler1{
    private String[] scrambledWords;
    public static void main(String[]args){
        System.out.println(recombine("apple","pear"));
    }

    /*
    public void WordScrambler(String[] wordArr){
        scrambledWords= mixedWords(wordArr);
    }
    /*
    private static String recombine(String word1, String word2){
        String newWord;
        String fHalf;
        String lHalf;
        if((word1.length()%2)!=0){
            fHalf= word1.substring((0,word1.length()/2));


        }
        else{
            fHalf=word1.substring(0,word1.length()/2);
        }
        if((word2.length()%2)!=0){
            lHalf= word2.substring((word2.length()/2), word2.length());
        }
        else{
            lHalf=word2.substring((word2.length()/2),word2.length());
        }
        newWord= fHalf+lHalf;
        return newWord; 
    }
    
//You would first invoke recombine on the passed 2 words, and then get the length of the new words and the original words. Then, you would just run an if check to see if the length of the new word is greater than the length of the first word, then the second word, and if it is, return true
}
*/
/*
import java.util.ArrayList;
public class Euler1{
    private static ArrayList<Integer> digitList;
    public static void main(String[]args){
        System.out.println(Digits(1356).isStrictlyIncreasing());

        

    }
    public Digits(int num){
        ArrayList<Integer> digitList= new ArrayList<Integer>();
        String x= Integer.toString(num);
        for(int i=0;i< x.length();i++){
            int z= x.charAt(i);
            digitList.add(z);

        }


    }
    public boolean isStrictlyIncreasing(){
        boolean p=true;
        for(int a=0;a<digitList.size()-1;a++){
            if (digitList.get(a)>digitList.get(a+1)){
                p= false;


            }
            else{
                p=true;
            }
        }
        return p;
    }

}
*/
/*
import java.util.ArrayList;
public class Euler1{
   
    public static void main(String[]args){
        ArrayList<String> wordList= new ArrayList<String>();
        wordList.add("TAN");
        wordList.add("ABRACADABRA");
        wordList.add("WHOA");
        wordList.add("APPLE");
        wordList.add("EGGS");   
        scrambleOrRemove(wordList);
        for(int i=0;i<wordList.size();i++){
            System.out.println(wordList.get(i));
        }     
    }
    public static String scrambleWord(String word){
        String x="";
        for(int j=0;j<word.length()-1;j++){
            if(word.charAt(j)=='A'){
                if(word.charAt(j+1)!='A'){
                    x+=word.charAt(j+1);
                    x+=word.charAt(j);
                    j++;


                }
                
                
            }
            else{
                x+=word.charAt(j);
            }
        }
        return x;
        
    }
    public static void scrambleOrRemove(ArrayList<String> wordList){
        String u="";
        for(int l=0;l<wordList.size();l++){
            u= scrambleWord(wordList.get(l));
            if ((u.contentEquals(wordList.get(l)))){
                wordList.set(l,"tbr");
                System.out.println(wordList.get(l));
            }
            else{
                wordList.set(l,u);
            } 

        }
        for(int k=0;k<wordList.size();k++){
            if (wordList.get(k).contentEquals("tbr")){
                wordList.remove(k);
                k--;
            }
        }
    }    
}
*/
/*
public class Euler1{
    public static void main(String[]args){
        int i = 99;
        int bouncies = 0;

        while((100*bouncies) < (99*i)) { 
            i++; 
            if(isBouncy(i)){
                bouncies++;
            } 
        }
        System.out.println(i);

    }
    public static boolean isBouncy(int x){
        boolean incr= false;
        boolean decr= false;
        int l= x%10;
        x=x/10;
        while(x>0){
            int n= x%10;
            x=x/10;
            if(n<l){
                incr=true;
            }
            else if(n>l){
                decr=true;
            }
            l=n;
            if(decr && incr){
                return true;
            }

            
        }
        return (decr && incr);
    }
}
*/
/*
public class TimeInterval{
    public boolean conflictsWith(Appointment other){
        Timeinterval interval=other.getTime();
        if (this.getTime().overlapsWith(interval)){
            return true;
        }
        else{
            return false;
        }
    }
    public void clearConflicts(Appointment appt){
        for(int i=0;i<apptList.size();i++){
            if(apptList.get(i).conflictsWith(appt)){
                apptList.remove(i);

            }
        }
    }
    public boolean addApt(Appointment appt, boolean emergency){
        if(emergency){
            clearConflicts(appt);
            apptList.add(appt);

        }
        else{
            boolean x=true;
            for(int i=0;i<apptList.size();i++){
                if(appt.conflictsWith(apptList.get(i))){
                    x=false;
                }
                
            }
            return x;
            if (x==true){
                apptList.add(appt);

            }
           
            

        }

    }

}
*/
/*
public class Customer{
    public int compareCustomer(Customer other){
        int y;
        int x=(this.getName().compareTo(other.getName()))
        if(x==0){
            if(this.getID()==other.getID()){
                x=0;
                return x;
                
            }
            else if(this.getID()>other.getID()){
                x=1;
                return x;
            }
            else{
                x=-1;
                return x;
            }
            
        }
        else{
            return x;
        
        }

    }
    public static void prefixMerge(Customer[] List1, Customer[] List2, Customer[] result){
        int i=0; 
        int j=0; 
        int k=0;
        while(i<List1.length && j<List2.length){
            if (List1[i]==List2[j]){

            }
            else{
                if(List1[i]>List2[j]){
                    result[k++]= List1[i++];
                }
                else{
                    result[k++]=List2[j++];
                }
            }
        }
        while(i<List1.length){
            result[k++]= List1[i++];
        }
        while(j<List2.length){
            result[j++]= List2[j++];
        }

    } 

}
*/
/*
public class DownloadInfo{
    public DownloadInfo getDownloadInfo(String title){
        DownloadInfo x= null;
        for(int i=0; i<downloadList.size();i++){
            if((downloadList.get(i).getTitle())== title){
                DownloadInfo x= downloadList.get(i);
            }
        }
        return x;

    }
    public void updateDownloads(List<String> titles){
        for(int i=0; i<titles.size();i++){
            for(int j=0;j<downloadList.size();j++){
                if(titles.get(i)==downloadList.get(j).getTitle()){
                    DownloadInfo x= downloadList.get(j);
                    x.incrementTimesDownloaded();
                }
            }
        }
        for(int i=0; i<titles.size();i++){
            for(int j=0;j<downloadList.size();j++){
                if(downloadList.get(j).getTitle()!=titles.get(i)){
                    DownloadInfo x= new DownloadInfo(titles.get(i));
                    downloadList.add(x);


                }
            }
        }

    }
        
}
*/
/*
public class TokenPass{
    private int[] board;
    private int currentPlayer;
    public TokenPass(int playerCount){
        int[] board= new int[playerCount];
        for(int i=0; i<playerCount;i++){
            board[i]= (int) Math.random()*(10)+1;

        }
        currentPlayer = (int) Math.random() * (playerCount);


    }
    public void distributeCurrentPlayerTokens(){
        int x= board[currentPlayer];
        board[currentPlayer]=0;
        for(int i=currentPlayer+1;i<board.length;i++){
            board[i]=board[i]+1;
            x--;
            if(i==board.length){
                i=0;
            }
            if(x==0){
                break;
            }
            

        }
    }



}
*/
