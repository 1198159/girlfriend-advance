package com.lemoulinstudio.gfa.nb.screen;

import com.lemoulinstudio.gfa.nb.filetype.rom.RomDataNode;
import com.lemoulinstudio.gfa.nb.filetype.rom.RomDataObject;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import org.openide.util.ImageUtilities;
import org.openide.windows.TopComponent;

/**
 *
 * @author Vincent Cantin
 */
public abstract class ScreenTopComponent extends TopComponent {

  private final RomDataObject dataObject;
  private PropertyChangeListener propertyChangeListener;

  public ScreenTopComponent(final RomDataObject dataObject) {
    this.dataObject = dataObject;
    
    this.propertyChangeListener = new PropertyChangeListener() {
      public void propertyChange(PropertyChangeEvent evt) {
        setName(dataObject.getName());
      }
    };

    dataObject.addPropertyChangeListener(propertyChangeListener);

    associateLookup(dataObject.getLookup());

    setName(dataObject.getName());
    setIcon(ImageUtilities.loadImage(RomDataNode.IMAGE_ICON_BASE, true));
  }

  public RomDataObject getDataObject() {
    return dataObject;
  }

  @Override
  public int getPersistenceType() {
    return TopComponent.PERSISTENCE_NEVER;
  }

  private static final String PREFERRED_ID = "ScreenTopComponent";

  @Override
  protected String preferredID() {
    return PREFERRED_ID;
  }

  @Override
  protected void componentClosed() {
    dataObject.removePropertyChangeListener(propertyChangeListener);
  }

}
