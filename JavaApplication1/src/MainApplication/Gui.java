/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainApplication;
import Lists.*;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author 20160596
 */
public class Gui extends JFrame {
    JPanel menuPanel;
    JPanel mainPanel; 
    /**
     * @param args the command line arguments
     */
    public Gui() {
        super("Training Center Management");

        //Create the panel that contains the "cards".
        mainPanel = new JPanel(new CardLayout());
        
        mainPanel.add(getMenu(), "MENU");

        mainPanel.add(new CoursesList(), "COURSES");
        mainPanel.add(new CoursesForm(), "COURSES_FORM");
        
        mainPanel.add(new TrainersList(), "TRAINERS");
        mainPanel.add(new TrainersForm(), "TRAINERS_FORM");
        
        mainPanel.add(new TraineesList(), "TRAINEES");
        mainPanel.add(new TraineesForm(), "TRAINEES_FORM");
        
        mainPanel.add(new TrainingProgramList(), "TRAININGPROGRAMMS");
        mainPanel.add(new TrainingProgramsForm(), "TRAININGPROGRAMS_FORM");
        this.setContentPane(mainPanel);
        this.pack();
        
    }

    public JPanel getMenu(){
        menuPanel = new JPanel();
        menuPanel.setLayout(new BoxLayout(menuPanel, BoxLayout.PAGE_AXIS));
       
        String[][] buttonTextArray = new String[][]{
            {"Courses List","COURSES"},
            {"Trainer List","TRAINERS"},
            {"Tranees List","TRAINEES"},
            {"Training Programs List","TRAININGPROGRAMMS"}
        };
        
        for (String[] buttonText : buttonTextArray) {
            JButton button = new JButton(buttonText[0]);
            JPanel buttonPanel = new JPanel();
            buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 14, 50));
            buttonPanel.add(button);
            
            ProjectUtility.bindNavigationActionListener(button, menuPanel, buttonText[1]);
            
            menuPanel.add(buttonPanel);
        }
        
        return menuPanel;

    }

    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Gui ob = new Gui();
        ob.setSize(500, 500);
        ob.setVisible(true);
        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

    }

}
