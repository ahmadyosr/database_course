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
public class TraineesForm extends GenericList {

    public TraineesForm() {
        super("Course Form", "TRAINERS");
    }

    public void populateRows(JPanel panel) {

        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        
        String[] fieldsNames = new String[]{"name", "phone number", "email", "education level"};
        JTextField[] textFields = new JTextField[fieldsNames.length];
        
        for(int i = 0; i < fieldsNames.length; i++) {
            JTextField field = new JTextField("", 20);
            JLabel label = new JLabel(fieldsNames[i]);
            textFields[i] = field;
            JPanel tempPanel = new JPanel();
            tempPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
            tempPanel.add(label);
            tempPanel.add(field);
            panel.add(tempPanel);
        }

    }
    public void addSecondaryButton(JPanel buttonPanel, String addDest){
        super.addSecondaryButton(buttonPanel, addDest);
        //bind action handler to button here ; 
        
    }
}
