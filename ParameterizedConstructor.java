public class ParameterizedConstructor {
    int x, y;

    public ParameterizedConstructor(int a, int b) {
        x = a;
        y = b;
    }

    void Show() {
        System.out.println(x + " " + y);
    }
}

class B {
    public static void main(String[] args) {
        ParameterizedConstructor ref = new ParameterizedConstructor(100, 200);
        ref.Show();
    }
}
