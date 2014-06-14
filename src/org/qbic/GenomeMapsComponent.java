package org.qbic;

import com.vaadin.annotations.StyleSheet;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.JavaScript;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

/**
 * @author LehnereS
 */
@StyleSheet( {
                     "http://cdn.sencha.io/ext/gpl/4.2.1/resources/css/ext-all-gray.css",
                     "vaadin://org.qbic.genomeviewer/1.0.0/genome-viewer/vendor/jquery.qtip.min.css",
                     "vaadin://org.qbic.genomeviewer/1.0.0/genome-viewer/vendor/ChemDoodleWeb.css",
                     "vaadin://org.qbic.genomeviewer/1.0.0/genome-viewer/vendor/bootstrap-scoped-dist/css/bootstrap.min.css",
                     "vaadin://org.qbic.genomeviewer/1.0.0/genome-viewer/vendor/typeahead.js-bootstrap.css",
                     "vaadin://org.qbic.genomeviewer/1.0.0/genome-viewer/vendor/jquery.simplecolorpicker.css",
                     "vaadin://org.qbic.genomeviewer/1.0.0/genome-viewer/styles/css/style.css" } )
@com.vaadin.annotations.JavaScript( {
                                            "http://cdn.sencha.io/ext/gpl/4.2.1/ext-all.js",
                                            "http://cdn.sencha.io/ext/gpl/4.2.1/examples/shared/examples.js",
                                            "vaadin://org.qbic.genomeviewer/1.0.0/genome-viewer/vendor/underscore-min.js",
                                            "vaadin://org.qbic.genomeviewer/1.0.0/genome-viewer/vendor/backbone-min.js",
                                            "vaadin://org.qbic.genomeviewer/1.0.0/genome-viewer/vendor/jquery.min.js",
                                            "vaadin://org.qbic.genomeviewer/1.0.0/genome-viewer/vendor/bootstrap-scoped-dist/js/bootstrap.min.js",
                                            "vaadin://org.qbic.genomeviewer/1.0.0/genome-viewer/vendor/typeahead.min.js",
                                            "vaadin://org.qbic.genomeviewer/1.0.0/genome-viewer/vendor/jquery.mousewheel.min.js",
                                            "vaadin://org.qbic.genomeviewer/1.0.0/genome-viewer/vendor/gl-matrix-min.js",
                                            "vaadin://org.qbic.genomeviewer/1.0.0/genome-viewer/vendor/ChemDoodleWeb.js",
                                            "vaadin://org.qbic.genomeviewer/1.0.0/genome-viewer/vendor/jquery.cookie.js",
                                            "vaadin://org.qbic.genomeviewer/1.0.0/genome-viewer/vendor/purl.min.js",
                                            "vaadin://org.qbic.genomeviewer/1.0.0/genome-viewer/vendor/jquery.sha1.js",
                                            "vaadin://org.qbic.genomeviewer/1.0.0/genome-viewer/vendor/jquery.qtip.min.js",
                                            "vaadin://org.qbic.genomeviewer/1.0.0/genome-viewer/vendor/rawdeflate.js",
                                            "vaadin://org.qbic.genomeviewer/1.0.0/genome-viewer/vendor/xml2json.js",
                                            "vaadin://org.qbic.genomeviewer/1.0.0/genome-viewer/gv-config.js",
                                            "vaadin://org.qbic.genomeviewer/1.0.0/genome-viewer/genome-viewer.js",
                                    } )
public class GenomeMapsComponent extends CustomComponent {

    /**
     * standard constructor
     */
    public GenomeMapsComponent () {
        VerticalLayout layout = new VerticalLayout ();
        Label checkBrowser = new Label ();
        checkBrowser.setId ( "checkBrowser" );
        Label application = new Label ();
        application.setId ( "application" );
        Label status = new Label ();
        status.setId ( "status" );
        layout.addComponent ( checkBrowser );
        layout.addComponent ( application );
        layout.addComponent ( status );
        JavaScript.getCurrent ().execute (
                "Ext.Loader.setConfig({ enabled: true }); "
                + "Ext.Loader.setPath('Ext.ux', 'http://cdn.sencha.io/ext/gpl/4.2.1/examples/ux'); "
                + "Ext.QuickTips.init(); "
                + "Ext.require([ 'Ext.grid.plugin.BufferedRenderer','Ext.ux.grid.FiltersFeature' ]); "
                + "Ext.onReady(function() { run(); });" );
        setCompositionRoot ( layout );

    }
}
