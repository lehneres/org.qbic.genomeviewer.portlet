package org.qbic.genomeviewer;

import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.*;

/**
 * Created by LehnereS on 14.06.2014.
 */
public class portlet extends UI {

    @Override
    public void init ( VaadinRequest request ) {
        final VerticalLayout layout = new VerticalLayout ();
        layout.setMargin ( false );
        setContent ( layout );
        layout.addComponent ( new GenomeMapsComponent () );
    }
}
