import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        rgr a = new rgr();
        a.setVisible(true);
    }
}

class rgr extends JFrame {
    private model m = new model();
    private view v = new view(m);
    private controller c = new controller(m, v);
    public rgr()
    {
        super("РГР");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        add(c);
    }
}