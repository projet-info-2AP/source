package ihm;

import javax.swing.DefaultRowSorter;
import javax.swing.JPanel;
import metier.*;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.List;

public class PanneauControle extends JPanel{
    //checkboxe affichage lignes de champs 


LigneDeChampButton = new JCheckBox(" Ligne de Champ ");
   LigneDeChampButton.setMnemonic(KeyEvent.VK_C); 
    LigneDeChampButton.setSelected(true);


// checkboxe affichage flèches de lignes de champ

FlecheLigneDeChampButton = new JCheckBox(" Flèches de ligne de Champ ");
   FlecheLigneDeChampButton.setMnemonic(KeyEvent.VK_C); 
    FlecheLigneDeChampButton.setSelected(true);


//checkbox affichage équipotentielle


EquipotentielleButton = new JCheckBox("Equipotentielle");
   EquipotentielleButton.setMnemonic(KeyEvent.VK_C); 
    EquipotentielleButton.setSelected(true);
    
// checkbox affichage gradien de couleur

ColorButton = new JCheckBox("Gradien de couleurs ");
   ColorButton.setMnemonic(KeyEvent.VK_C); 
    ColorButton.setSelected(true);

 //Register a listener for the check boxes.
   LigneDeChampButtonButton.addItemListener(this);
    FlecheLigneDeChampButton.addItemListener(this);
   EquipotentielleButton.addItemListener(this);
    ColorButton.addItemListener(this);


public void itemStateChanged(ItemEvent e) {
    
    Object source = e.getItemSelectable();

    if (source == LigneDeChampButtonButton) {
        //...make a note of it...
    } else if (source == FlecheLigneDeChampButton) {
        //...make a note of it...
    } else if (source == EquipotentielleButton) {
        //...make a note of it...
    } else if (source == tColorButton) {
        //...make a note of it...
    }

    if (e.getStateChange() == ItemEvent.DESELECTED)
        //...make a note of it...
    ...
    updatePanneauprincipal();
}
}
