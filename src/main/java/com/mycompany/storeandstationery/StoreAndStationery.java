/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.storeandstationery;

import com.formdev.flatlaf.intellijthemes.FlatArcDarkIJTheme;
import com.mycompany.storeandstationery.view.Loging;
import javax.swing.UIManager;

/**
 *
 * @author codesant
 */
public class StoreAndStationery {

    public static void main(String[] args) {
        
        FlatArcDarkIJTheme.setup();
        
        UIManager.put("Button.arc", 20);
        UIManager.put("Component.arc", 20);
        UIManager.put("ProgressBar.arc", 20);
        UIManager.put("TextComponent.arc", 10);
        
        Loging log = new Loging();
        log.setVisible(true);
        log.setLocationRelativeTo(null);

    }
}
