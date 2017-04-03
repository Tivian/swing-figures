import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class FirstJFrame extends JFrame {
    private FirstJFrame() {
        JPanel contentPane;
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds((screenSize.width / 2) - (screenSize.width / 3), (screenSize.height / 2) - (screenSize.height / 3), (int) (screenSize.width / 1.5), (int) (screenSize.height / 1.5));
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

        FigureComponent panel = new FigureComponent();
        contentPane.add(panel, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(FirstJFrame::new);
    }
}
