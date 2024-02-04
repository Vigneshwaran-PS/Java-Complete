package Constuctor;


class Students{
    String name;
    int rollNo;
    int marks[];

    Students(String n , int r , int[] m){
        name = n;
        rollNo = r;
        marks = m;
    }

    int totMarks(){
        int sum = 0;
        for(int i=0;i<marks.length;i++){
            sum = sum + marks[i];
        }
        return sum;
    }

    void display(){
        System.out.println("Name : "+name);
        System.out.println("Roll No : "+rollNo);
        System.out.println("Total mark : "+totMarks());
    }
}
public class Example3 {
    public static void main(String[] args) {
        Students s = new Students("Mei", 32, new int[]{78, 66, 95});
        s.display();
    }
}
