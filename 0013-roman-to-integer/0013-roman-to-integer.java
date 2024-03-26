import java.util.Scanner;
class Solution{
    public static int romanToInt(String s) {
        int sum=0;
        int c=0;
        String s2=s+" ";
        while(c<s.length()){
            switch(s.charAt(c)){
                case 'I':{
                    if(s2.charAt(c+1)=='V'){
                        sum=sum+4;
                        c = c+2;
                        break;
                    }
                    else if(s2.charAt(c+1)=='X'){
                        sum=sum+9;
                        c = c+2 ;
                        break;
                    }
                    else{
                        sum=sum+1;
                        c++;
                        break;
                    }
                }
                case 'V':{
                    sum=sum+5;
                    c++;
                    break;
                }
                case 'X':{
                    if(s2.charAt(c+1)=='L'){
                        sum=sum+40;
                        c = c+2;
                        break;
                    }
                    else if(s2.charAt(c+1)=='C'){
                        sum=sum+90;
                        c = c+2 ;
                        break;
                    }
                    else{
                        sum=sum+10;
                        c++;
                        break;
                    }
                }
                case 'L':{
                    sum=sum+50;
                    c++;
                    break;
                }
                case 'C':{
                    if(s2.charAt(c+1)=='D'){
                        sum=sum+400;
                        c = c+2;
                        break;
                    }
                    else if(s2.charAt(c+1)=='M'){
                        sum=sum+900;
                        c = c+2 ;
                        break;
                    }
                    else{
                        sum=sum+100;
                        c++;
                        break;
                    }
                    
                }
                case 'D':{
                    sum=sum+500;
                    c++;
                    break;
                }
                case 'M':{
                    sum=sum+1000;
                    c++;
                    break;
                }
            }
        }
        return sum;   
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Input:");
        String s=sc.next();
        s=s.toUpperCase();
        int sum=romanToInt(s);
        System.out.println(sum);
    }
}