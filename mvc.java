import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
class model {
    private int x, y, rx, ry;
    public model()
    {
        x = 100;
        y = 100;
        rx = 100;
        ry = 100;
    }

    public int get_x()
    {
        return x;
    }
    public void set_x(int x)
    {
        this.x = x;
    }

    public int get_y()
    {
        return y;
    }
    public void set_y(int y)
    {
        this.y = y;
    }

    public int get_rx()
    {
        return rx;
    }
    public void set_rx(int rx)
    {
        this.rx = rx;
    }

    public int get_ry()
    {
        return ry;
    }
    public void set_ry(int ry)
    {
        this.ry = ry;
    }
}

class view extends JComponent {
    private model m;
    public view(model m)
    {
        this.m = m;
    }
    public void paintComponent(Graphics g)
    {
        g.drawOval(m.get_x(), m.get_y(), m.get_rx(), m.get_ry());
    }
}

class controller extends JPanel {
    private model m;
    private view v;
    JTextField text_x = new JTextField(), text_y = new JTextField(),
        text_rx = new JTextField(), text_ry = new JTextField();
    private void addtext(String str, JTextField text, DocumentListener d)
    {
        JLabel label = new JLabel(str);
        text.setMaximumSize(new Dimension(100, 20));
        text.getDocument().addDocumentListener(d);
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        text.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(label);
        add(text);
    }
    public controller(model m, view v)
    {
        this.m = m;
        this.v = v;
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        text_x.setText(String.valueOf(m.get_x()));
        text_y.setText(String.valueOf(m.get_y()));
        text_rx.setText(String.valueOf(m.get_rx()));
        text_ry.setText(String.valueOf(m.get_ry()));

        addtext("x", text_x, new dl_x());
        addtext("y", text_y, new dl_y());
        addtext("rx", text_rx, new dl_rx());
        addtext("ry", text_ry, new dl_ry());
        add(v);
    }

    class dl_x implements DocumentListener
    {
        private void set_x(int x)
        {
            m.set_x(x);
            v.repaint();
        }
        @Override
        public void insertUpdate(DocumentEvent e)
        {
            if (!text_x.getText().isEmpty())
                set_x(Integer.parseInt(text_x.getText()));
        }
        @Override
        public void removeUpdate(DocumentEvent e)
        {
            if (!text_x.getText().isEmpty())
                set_x(Integer.parseInt(text_x.getText()));
        }
        @Override
        public void changedUpdate(DocumentEvent e)
        {
            if (!text_x.getText().isEmpty())
                set_x(Integer.parseInt(text_x.getText()));
        }
    }

    class dl_y implements DocumentListener
    {
        private void set_y(int y)
        {
            m.set_y(y);
            v.repaint();
        }
        @Override
        public void insertUpdate(DocumentEvent e)
        {
            if (!text_y.getText().isEmpty())
                set_y(Integer.parseInt(text_y.getText()));
        }
        @Override
        public void removeUpdate(DocumentEvent e)
        {
            if (!text_y.getText().isEmpty())
                set_y(Integer.parseInt(text_y.getText()));
        }
        @Override
        public void changedUpdate(DocumentEvent e)
        {
            if (!text_y.getText().isEmpty())
                set_y(Integer.parseInt(text_y.getText()));
        }
    }

    class dl_rx implements DocumentListener
    {
        private void set_rx(int rx)
        {
            m.set_rx(rx);
            v.repaint();
        }
        @Override
        public void insertUpdate(DocumentEvent e)
        {
            if (!text_rx.getText().isEmpty())
                set_rx(Integer.parseInt(text_rx.getText()));
        }
        @Override
        public void removeUpdate(DocumentEvent e)
        {
            if (!text_rx.getText().isEmpty())
                set_rx(Integer.parseInt(text_rx.getText()));
        }
        @Override
        public void changedUpdate(DocumentEvent e)
        {
            if (!text_rx.getText().isEmpty())
                set_rx(Integer.parseInt(text_rx.getText()));
        }
    }

    class dl_ry implements DocumentListener
    {
        private void set_ry(int ry)
        {
            m.set_ry(ry);
            v.repaint();
        }
        @Override
        public void insertUpdate(DocumentEvent e)
        {
            if (!text_ry.getText().isEmpty())
                set_ry(Integer.parseInt(text_ry.getText()));
        }
        @Override
        public void removeUpdate(DocumentEvent e)
        {
            if (!text_ry.getText().isEmpty())
                set_ry(Integer.parseInt(text_ry.getText()));
        }
        @Override
        public void changedUpdate(DocumentEvent e)
        {
            if (!text_ry.getText().isEmpty())
                set_ry(Integer.parseInt(text_ry.getText()));
        }
    }
}