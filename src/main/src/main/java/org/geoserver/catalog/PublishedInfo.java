/* (c) 2014 - 2015 Open Source Geospatial Foundation - all rights reserved
 * (c) 2001 - 2013 OpenPlans
 * This code is licensed under the GPL 2.0 license, available at the root
 * application directory.
 */
package org.geoserver.catalog;

import java.util.List;

/**
 * Interface for publishable entities contained in a Layer Group.
 *
 * @author Davide Savazzi - geo-solutions.it
 */
public interface PublishedInfo extends CatalogInfo {

    /** Returns the name. */
    String getName();

    /** Sets the name. */
    void setName(String name);

    /**
     * The derived prefixed name.
     *
     * <p>If a workspace is set this method returns:
     *
     * <pre>
     *   getWorkspace().getName() + ":" + getName();
     * </pre>
     *
     * Otherwise it simply returns:
     *
     * <pre>getName()</pre>
     */
    String prefixedName();

    /** Returns the title. */
    String getTitle();

    /** Sets the title. */
    void setTitle(String title);

    /** Returns the abstract. */
    String getAbstract();

    /** Sets the abstract. */
    void setAbstract(String abstractTxt);

    /** A persistent map of metadata. */
    MetadataMap getMetadata();

    /** Returns the list of authority URLs */
    List<AuthorityURLInfo> getAuthorityURLs();

    /** Returns the list of identifiers */
    List<LayerIdentifierInfo> getIdentifiers();

    /** The type of the layer. */
    PublishedType getType();

    /**
     * Gets the attribution information for this layer.
     *
     * @return an AttributionInfo instance with the layer's attribution information.
     * @see AttributionInfo
     */
    AttributionInfo getAttribution();

    /**
     * Sets the attribution information for this layer.
     *
     * @param attribution an AttributionInfo instance with the new attribution information.
     * @see AttributionInfo
     */
    void setAttribution(AttributionInfo attribution);
}
