/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise_repetition_002;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.AbstractListModel;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Pascal
 */
public class WetterModell extends AbstractListModel {

    private ArrayList<WetterWert> list = new ArrayList<>();
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm - dd.MM.yyyy");

    @Override
    public int getSize() {
        return list.size();
    }

    @Override
    public Object getElementAt(int i) {
        WetterWert ww = list.get(i);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM - hh:mm:ss");
        return String.format("%s - %3d° - %3d%%", ww.getZeitpunkt().format(dtf), ww.getTemperatur(), ww.getLuftfeuchtigkeit());
    }

    public void add(WetterWert ww) {
        list.add(ww);
        super.fireIntervalAdded(0, list.size(), list.size() - 1);
    }

    public void speichern(File file) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(file);
        for (WetterWert ww : list) {
            pw.print(ww.getZeitpunkt().format(dtf));
            pw.print("#");
            pw.print(ww.getTemperatur());
            pw.print("#");
            pw.print(ww.getLuftfeuchtigkeit());
            pw.println("#");
        }
        pw.close();
    }

    public void laden(File file) throws FileNotFoundException {
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNext()) {
                String row = sc.nextLine();
                String[] tokens = row.split("#");

                LocalDateTime zeitpunkt = LocalDateTime.parse(tokens[0], dtf);
                list.add(new WetterWert(zeitpunkt, Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2])));
                super.fireContentsChanged(this, 0, list.size() - 1);
            }
            sc.close();
        }
    }
}
