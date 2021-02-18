public class Main {
    public static void main(String[] args) {
        ArrayListStack arrayList = new ArrayListStack();


        System.out.println(arrayList.size());

        System.out.println(arrayList.isEmpty());

        arrayList.push("String");
        System.out.println(arrayList.size());
        arrayList.push("String2");
        arrayList.push("String3");

        System.out.println(arrayList.top());
        arrayList.pop();
        System.out.println(arrayList.top());
    }
}
