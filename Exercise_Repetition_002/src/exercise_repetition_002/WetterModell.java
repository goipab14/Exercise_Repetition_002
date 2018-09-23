/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise_repetition_002;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.AbstractListModel;

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

}
