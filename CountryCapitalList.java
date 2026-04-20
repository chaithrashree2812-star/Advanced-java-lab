package Swings;

import javax.swing.*;
import javax.swing.event.*;
import java.util.HashMap;
import java.util.Map;

public class CountryCapitalList extends JFrame {

    private JList<String> countryList;

    public CountryCapitalList() {

        // Country list
        String[] countries = {
            "USA", "India", "Vietnam", "Canada", "Denmark",
            "France", "Great Britain", "Japan", "Africa",
            "Greenland", "Singapore"
        };

        // Capital mapping
        Map<String, String> capitalMap = new HashMap<>();
        capitalMap.put("USA", "Washington D.C.");
        capitalMap.put("India", "New Delhi");
        capitalMap.put("Vietnam", "Hanoi");
        capitalMap.put("Canada", "Ottawa");
        capitalMap.put("Denmark", "Copenhagen");
        capitalMap.put("France", "Paris");
        capitalMap.put("Great Britain", "London");
        capitalMap.put("Japan", "Tokyo");
        capitalMap.put("Africa", "Addis Ababa");
        capitalMap.put("Greenland", "Nuuk");
        capitalMap.put("Singapore", "Singapore");

        // Create JList
        countryList = new JList<>(countries);

        // Selection listener
        countryList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    String selected = countryList.getSelectedValue();
                    if (selected != null) {
                        System.out.println("Capital of " + selected + " is: " + capitalMap.get(selected));
                    }
                }
            }
        });

        // Add to frame
        add(new JScrollPane(countryList));

        setTitle("Country Capitals");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CountryCapitalList());
    }
}