/*class define*/
class Demo {

    int a = 10;
    String b = "baibhav";

    void Show() {

        System.err.println(a + " " + b);
    }/*object define*/

}

class Test {

    public static void main(String[] args) {
        Demo r = new Demo();
        r.Show();
    }

}
