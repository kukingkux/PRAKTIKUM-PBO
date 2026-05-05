package Modul9.Static;

class Share{ 
    private int privateInt;
    private static int staticInt;
    public Share(int pr, int si){ 
    privateInt = pr;
    staticInt = si;
} 

public String toString(){ 
    return privateInt + "" + staticInt; 
    } 
}

class StaticVariable{ 
    public static void main(String args[]){
        Share s1 = new Share(4,4);
        System.out.println(s1.toString());
        Share s2 = new Share(8,2);
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        Share s3 = new Share(6,22);
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
    } 
}

