/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lists;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Lists.GenericList;

/**
 *
 * @author 20160596
 */
public class TrainingProgramsForm extends GenericList {
    String selectedCourse; 
    String[] courses = new String[] {"String1", "String2", "String3", "String4"};
    public TrainingProgramsForm() {
        super("Course Form", "TRAINERS");
    }

    public void populateRows(JPanel panel) {

        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        // add String fields 
        String[] fieldsNames = new String[]{"name", "Day", "Time", "Start Date", "Finish Date"};
        JTextField[] textFields = new JTextField[fieldsNames.length];

        for (int i = 0; i < fieldsNames.length; i++) {
            JTextField field = new JTextField("", 20);
            JLabel label = new JLabel(fieldsNames[i]);
            textFields[i] = field;
            JPanel tempPanel = new JPanel();
            tempPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
            tempPanel.add(label);
            tempPanel.add(field);
            panel.add(tempPanel);
        }

        // add selection fields 
        JButton addCoursesButton = new JButton("add Courses to Training Program.");
        addCoursesButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e ){
                JList list = new JList(courses);
                list.setSelectionMode(
                    ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
                int result = JOptionPane.showConfirmDialog(null, new JScrollPane(list));
                JOptionPane.showMessageDialog(null, "Fsdfsd", "fsdfsdd");
           }
        });
        panel.add(addCoursesButton);
//        
//        coursesList
//        JList list = new JList(lines.toArray());
//        list.setSelectionMode(
//                ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
//        int[] select = {19, 20, 22};
//        list.setSelectedIndices(select);
//        JOptionPane.showMessageDialog(null, new JScrollPane(list));
        
    }

    public void addSecondaryButton(JPanel buttonPanel, String addDest) {
        super.addSecondaryButton(buttonPanel, addDest);
        //bind action handler to button here ; 

    }
}
