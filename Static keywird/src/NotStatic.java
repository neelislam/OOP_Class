public class NotStatic {
    int count = 0;

    NotStatic(){
        count++;
        System.out.println(count);
    }
}
