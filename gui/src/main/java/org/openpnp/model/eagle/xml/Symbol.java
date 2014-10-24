//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.23 at 08:50:01 AM PDT 
//


package org.openpnp.model.eagle.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "description",
    "polygonOrWireOrTextOrDimensionOrPinOrCircleOrRectangleOrFrame"
})
@XmlRootElement(name = "symbol")
public class Symbol {

    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String name;
    protected Description description;
    @XmlElements({
        @XmlElement(name = "polygon", type = Polygon.class),
        @XmlElement(name = "wire", type = Wire.class),
        @XmlElement(name = "text", type = Text.class),
        @XmlElement(name = "dimension", type = Dimension.class),
        @XmlElement(name = "pin", type = Pin.class),
        @XmlElement(name = "circle", type = Circle.class),
        @XmlElement(name = "rectangle", type = Rectangle.class),
        @XmlElement(name = "frame", type = Frame.class)
    })
    protected List<Object> polygonOrWireOrTextOrDimensionOrPinOrCircleOrRectangleOrFrame;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link Description }
     *     
     */
    public Description getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link Description }
     *     
     */
    public void setDescription(Description value) {
        this.description = value;
    }

    /**
     * Gets the value of the polygonOrWireOrTextOrDimensionOrPinOrCircleOrRectangleOrFrame property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the polygonOrWireOrTextOrDimensionOrPinOrCircleOrRectangleOrFrame property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolygonOrWireOrTextOrDimensionOrPinOrCircleOrRectangleOrFrame().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Polygon }
     * {@link Wire }
     * {@link Text }
     * {@link Dimension }
     * {@link Pin }
     * {@link Circle }
     * {@link Rectangle }
     * {@link Frame }
     * 
     * 
     */
    public List<Object> getPolygonOrWireOrTextOrDimensionOrPinOrCircleOrRectangleOrFrame() {
        if (polygonOrWireOrTextOrDimensionOrPinOrCircleOrRectangleOrFrame == null) {
            polygonOrWireOrTextOrDimensionOrPinOrCircleOrRectangleOrFrame = new ArrayList<Object>();
        }
        return this.polygonOrWireOrTextOrDimensionOrPinOrCircleOrRectangleOrFrame;
    }

}
