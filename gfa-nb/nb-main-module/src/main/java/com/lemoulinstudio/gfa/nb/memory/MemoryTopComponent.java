package com.lemoulinstudio.gfa.nb.memory;

import com.lemoulinstudio.gfa.core.GfaDevice;
import com.lemoulinstudio.gfa.nb.GfaContext;
import com.lemoulinstudio.gfa.nb.filetype.rom.RomDataObject.StoppedState;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import org.openide.util.Lookup;
import org.openide.util.LookupEvent;
import org.openide.util.LookupListener;
import org.openide.util.NbBundle;
import org.openide.windows.TopComponent;
import org.openide.windows.WindowManager;
//import org.openide.util.ImageUtilities;

/**
 * Top component which displays something.
 */
public final class MemoryTopComponent extends TopComponent {

  private static MemoryTopComponent instance;
  /** path to the icon used by the component and its open action */
//    static final String ICON_PATH = "SET/PATH/TO/ICON/HERE";
  private static final String PREFERRED_ID = "MemoryTopComponent";

  private GfaDevice device;
  private ComboBoxModel nbBytesComboBoxModel;
  private MemoryTable memoryTable;

  private Lookup.Result stoppedStateResult;

  public MemoryTopComponent() {
    nbBytesComboBoxModel = new DefaultComboBoxModel(new Object[] {1, 2, 4, 8, 16});
    memoryTable = new MemoryTable();

    initComponents();

    memoryTable.setParentScrollPane(jScrollPane1);
    nbBytesComboBox.setSelectedItem(4);

    setName(NbBundle.getMessage(MemoryTopComponent.class, "CTL_MemoryTopComponent"));
//        setIcon(ImageUtilities.loadImage(ICON_PATH, true));

    stoppedStateResult = GfaContext.getLookup().lookupResult(StoppedState.class);
    stoppedStateResult.addLookupListener(new LookupListener() {
      public void resultChanged(LookupEvent ev) {
        onEvent(GfaContext.getLookup().lookup(StoppedState.class));
      }
    });
    onEvent(GfaContext.getLookup().lookup(StoppedState.class));
  }

  @Override
  public Lookup getLookup() {
    return GfaContext.getLookup();
  }

  private void onEvent(StoppedState stoppedState) {
    device = (stoppedState == null ? null : stoppedState.getRomDataObject().getGfaDevice());
    memoryTable.setDevice(device);
  }

  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    javax.swing.JLabel nbBytesLabel = new javax.swing.JLabel();
    nbBytesComboBox = new javax.swing.JComboBox();
    javax.swing.JLabel gotoLabel = new javax.swing.JLabel();
    gotoTextField = new javax.swing.JTextField();
    jScrollPane1 = new javax.swing.JScrollPane();
    javax.swing.JTable jTable = memoryTable;

    org.openide.awt.Mnemonics.setLocalizedText(nbBytesLabel, org.openide.util.NbBundle.getMessage(MemoryTopComponent.class, "MemoryTopComponent.nbBytesLabel.text")); // NOI18N

    nbBytesComboBox.setModel(nbBytesComboBoxModel);
    nbBytesComboBox.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        nbBytesComboBoxActionPerformed(evt);
      }
    });

    org.openide.awt.Mnemonics.setLocalizedText(gotoLabel, org.openide.util.NbBundle.getMessage(MemoryTopComponent.class, "MemoryTopComponent.gotoLabel.text")); // NOI18N

    gotoTextField.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        gotoTextFieldActionPerformed(evt);
      }
    });

    jTable.setSelectionBackground(java.awt.Color.pink);
    jTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
    jScrollPane1.setViewportView(jTable);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
          .addGroup(layout.createSequentialGroup()
            .addComponent(nbBytesLabel)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(nbBytesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(gotoLabel)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(gotoTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(nbBytesLabel)
          .addComponent(nbBytesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(gotoLabel)
          .addComponent(gotoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
        .addContainerGap())
    );
  }// </editor-fold>//GEN-END:initComponents

  private void nbBytesComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nbBytesComboBoxActionPerformed
    memoryTable.setNbBytes((Integer) nbBytesComboBox.getSelectedItem());
  }//GEN-LAST:event_nbBytesComboBoxActionPerformed

  private void gotoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gotoTextFieldActionPerformed
    try {
      int viewedAddress = Integer.decode(gotoTextField.getText());
      memoryTable.setViewedAddress(viewedAddress);
    }
    catch (NumberFormatException e) {
      
    }
  }//GEN-LAST:event_gotoTextFieldActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JTextField gotoTextField;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JComboBox nbBytesComboBox;
  // End of variables declaration//GEN-END:variables
  /**
   * Gets default instance. Do not use directly: reserved for *.settings files only,
   * i.e. deserialization routines; otherwise you could get a non-deserialized instance.
   * To obtain the singleton instance, use {@link #findInstance}.
   */
  public static synchronized MemoryTopComponent getDefault() {
    if (instance == null) {
      instance = new MemoryTopComponent();
    }
    return instance;
  }

  /**
   * Obtain the MemoryTopComponent instance. Never call {@link #getDefault} directly!
   */
  public static synchronized MemoryTopComponent findInstance() {
    TopComponent win = WindowManager.getDefault().findTopComponent(PREFERRED_ID);
    if (win == null) {
      Logger.getLogger(MemoryTopComponent.class.getName()).warning(
              "Cannot find " + PREFERRED_ID + " component. It will not be located properly in the window system.");
      return getDefault();
    }
    if (win instanceof MemoryTopComponent) {
      return (MemoryTopComponent) win;
    }
    Logger.getLogger(MemoryTopComponent.class.getName()).warning(
            "There seem to be multiple components with the '" + PREFERRED_ID
            + "' ID. That is a potential source of errors and unexpected behavior.");
    return getDefault();
  }

  @Override
  public int getPersistenceType() {
    return TopComponent.PERSISTENCE_ALWAYS;
  }

  @Override
  protected String preferredID() {
    return PREFERRED_ID;
  }

}
