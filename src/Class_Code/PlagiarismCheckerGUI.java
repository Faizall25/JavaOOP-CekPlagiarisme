import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlagiarismCheckerGUI extends JFrame {
    private JTextField sentence1TextField;
    private JTextField sentence2TextField;
    private JButton checkPlagiarismButton;

    public PlagiarismCheckerGUI() {
        initializeGUI();
        setupEventListeners();
    }

    private void initializeGUI() {
        setTitle("Plagiarism Checker");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLayout(new FlowLayout());

        JLabel sentence1Label = new JLabel("Sentence 1:");
        sentence1TextField = new JTextField(20);

        JLabel sentence2Label = new JLabel("Sentence 2:");
        sentence2TextField = new JTextField(20);

        checkPlagiarismButton = new JButton("Check Plagiarism");

        add(sentence1Label);
        add(sentence1TextField);
        add(sentence2Label);
        add(sentence2TextField);
        add(checkPlagiarismButton);

        setVisible(true);
    }

    private void setupEventListeners() {
        checkPlagiarismButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sentence1 = sentence1TextField.getText();
                String sentence2 = sentence2TextField.getText();

                PlagiarismCheckerGUI checker = new PlagiarismCheckerGUI();

                if (checker.isPlagiarized(sentence1, sentence2)) {
                    JOptionPane.showMessageDialog(PlagiarismCheckerGUI.this,
                            "The sentences contain plagiarism.",
                            "Plagiarism Detected",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(PlagiarismCheckerGUI.this,
                            "The sentences do not contain plagiarism.",
                            "No Plagiarism Detected",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PlagiarismCheckerGUI();
            }
        });
    }

    private boolean isPlagiarized(String sentence1, String sentence2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
