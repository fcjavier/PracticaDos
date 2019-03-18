/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timersavedata;

import java.awt.Component;
import java.beans.PropertyEditorSupport;

/**
 *
 * @author USER
 */
public class SavePropertyEditorSupport extends PropertyEditorSupport {

    SaveDataPanel saveDataPanel = new SaveDataPanel();

    @Override
    public boolean supportsCustomEditor() {
        return true; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Component getCustomEditor() {
        return saveDataPanel; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getJavaInitializationString() {
        int tiempo = saveDataPanel.recogerDatos().getTiempo();
        boolean activar = saveDataPanel.recogerDatos().isActivo();
        return "new timersavedata.Save(" + tiempo + "," + activar + ")";
    }

    @Override
    public Object getValue() {
        return saveDataPanel.recogerDatos(); //To change body of generated methods, choose Tools | Templates.
    }

}
