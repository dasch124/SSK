//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.09.27 à 04:05:22 PM CEST 
//


package ssk.tei_c;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;sequence>
 *             &lt;element ref="{http://www.tei-c.org/ns/1.0}titleStmt"/>
 *             &lt;element ref="{http://www.tei-c.org/ns/1.0}editionStmt" minOccurs="0"/>
 *             &lt;element ref="{http://www.tei-c.org/ns/1.0}extent" minOccurs="0"/>
 *             &lt;element ref="{http://www.tei-c.org/ns/1.0}publicationStmt"/>
 *             &lt;element ref="{http://www.tei-c.org/ns/1.0}seriesStmt" minOccurs="0"/>
 *             &lt;element ref="{http://www.tei-c.org/ns/1.0}notesStmt" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;element ref="{http://www.tei-c.org/ns/1.0}sourceDesc" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element ref="{http://www.tei-c.org/ns/1.0}fileDesc"/>
 *           &lt;element ref="{http://www.tei-c.org/ns/1.0}profileDesc"/>
 *         &lt;/sequence>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://www.tei-c.org/ns/1.0}tei_att.sortable.attributes"/>
 *       &lt;attGroup ref="{http://www.tei-c.org/ns/1.0}tei_att.global.attributes"/>
 *       &lt;attGroup ref="{http://www.tei-c.org/ns/1.0}tei_att.declarable.attributes"/>
 *       &lt;attGroup ref="{http://www.tei-c.org/ns/1.0}tei_att.docStatus.attributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fileDesc",
    "profileDesc",
    "titleStmt",
    "editionStmt",
    "extent",
    "publicationStmt",
    "seriesStmt",
    "notesStmt",
    "sourceDescs"
})
@XmlRootElement(name = "biblFull")
public class BiblFull implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected FileDesc fileDesc;
    protected ProfileDesc profileDesc;
    protected TitleStmt titleStmt;
    protected EditionStmt editionStmt;
    protected Extent extent;
    protected PublicationStmt publicationStmt;
    protected SeriesStmt seriesStmt;
    protected NotesStmt notesStmt;
    @XmlElement(name = "sourceDesc")
    protected List<SourceDesc> sourceDescs;
    @XmlAttribute(name = "sortKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String sortKey;
    @XmlAttribute(name = "source")
    protected List<String> sources;
    @XmlAttribute(name = "n")
    protected String n;
    @XmlAttribute(name = "copyOf")
    @XmlSchemaType(name = "anyURI")
    protected String copyOf;
    @XmlAttribute(name = "synch")
    protected List<String> synches;
    @XmlAttribute(name = "prev")
    @XmlSchemaType(name = "anyURI")
    protected String prev;
    @XmlAttribute(name = "next")
    @XmlSchemaType(name = "anyURI")
    protected String next;
    @XmlAttribute(name = "sameAs")
    @XmlSchemaType(name = "anyURI")
    protected String sameAs;
    @XmlAttribute(name = "select")
    protected List<String> selects;
    @XmlAttribute(name = "corresp")
    protected List<String> corresps;
    @XmlAttribute(name = "exclude")
    protected List<String> excludes;
    @XmlAttribute(name = "id", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "rend")
    protected List<String> rends;
    @XmlAttribute(name = "style")
    protected String style;
    @XmlAttribute(name = "rendition")
    protected List<String> rendering;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    protected String lang;
    @XmlAttribute(name = "base", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlSchemaType(name = "anyURI")
    protected String base;
    @XmlAttribute(name = "resp")
    protected List<String> resps;
    @XmlAttribute(name = "cert")
    protected String cert;
    @XmlAttribute(name = "space", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String space;
    @XmlAttribute(name = "default")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String _default;
    @XmlAttribute(name = "status")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String status;

    /**
     * Obtient la valeur de la propriété fileDesc.
     * 
     * @return
     *     possible object is
     *     {@link FileDesc }
     *     
     */
    public FileDesc getFileDesc() {
        return fileDesc;
    }

    /**
     * Définit la valeur de la propriété fileDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link FileDesc }
     *     
     */
    public void setFileDesc(FileDesc value) {
        this.fileDesc = value;
    }

    /**
     * Obtient la valeur de la propriété profileDesc.
     * 
     * @return
     *     possible object is
     *     {@link ProfileDesc }
     *     
     */
    public ProfileDesc getProfileDesc() {
        return profileDesc;
    }

    /**
     * Définit la valeur de la propriété profileDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileDesc }
     *     
     */
    public void setProfileDesc(ProfileDesc value) {
        this.profileDesc = value;
    }

    /**
     * Obtient la valeur de la propriété titleStmt.
     * 
     * @return
     *     possible object is
     *     {@link TitleStmt }
     *     
     */
    public TitleStmt getTitleStmt() {
        return titleStmt;
    }

    /**
     * Définit la valeur de la propriété titleStmt.
     * 
     * @param value
     *     allowed object is
     *     {@link TitleStmt }
     *     
     */
    public void setTitleStmt(TitleStmt value) {
        this.titleStmt = value;
    }

    /**
     * Obtient la valeur de la propriété editionStmt.
     * 
     * @return
     *     possible object is
     *     {@link EditionStmt }
     *     
     */
    public EditionStmt getEditionStmt() {
        return editionStmt;
    }

    /**
     * Définit la valeur de la propriété editionStmt.
     * 
     * @param value
     *     allowed object is
     *     {@link EditionStmt }
     *     
     */
    public void setEditionStmt(EditionStmt value) {
        this.editionStmt = value;
    }

    /**
     * Obtient la valeur de la propriété extent.
     * 
     * @return
     *     possible object is
     *     {@link Extent }
     *     
     */
    public Extent getExtent() {
        return extent;
    }

    /**
     * Définit la valeur de la propriété extent.
     * 
     * @param value
     *     allowed object is
     *     {@link Extent }
     *     
     */
    public void setExtent(Extent value) {
        this.extent = value;
    }

    /**
     * Obtient la valeur de la propriété publicationStmt.
     * 
     * @return
     *     possible object is
     *     {@link PublicationStmt }
     *     
     */
    public PublicationStmt getPublicationStmt() {
        return publicationStmt;
    }

    /**
     * Définit la valeur de la propriété publicationStmt.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicationStmt }
     *     
     */
    public void setPublicationStmt(PublicationStmt value) {
        this.publicationStmt = value;
    }

    /**
     * Obtient la valeur de la propriété seriesStmt.
     * 
     * @return
     *     possible object is
     *     {@link SeriesStmt }
     *     
     */
    public SeriesStmt getSeriesStmt() {
        return seriesStmt;
    }

    /**
     * Définit la valeur de la propriété seriesStmt.
     * 
     * @param value
     *     allowed object is
     *     {@link SeriesStmt }
     *     
     */
    public void setSeriesStmt(SeriesStmt value) {
        this.seriesStmt = value;
    }

    /**
     * Obtient la valeur de la propriété notesStmt.
     * 
     * @return
     *     possible object is
     *     {@link NotesStmt }
     *     
     */
    public NotesStmt getNotesStmt() {
        return notesStmt;
    }

    /**
     * Définit la valeur de la propriété notesStmt.
     * 
     * @param value
     *     allowed object is
     *     {@link NotesStmt }
     *     
     */
    public void setNotesStmt(NotesStmt value) {
        this.notesStmt = value;
    }

    /**
     * Gets the value of the sourceDescs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceDescs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceDescs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SourceDesc }
     * 
     * 
     */
    public List<SourceDesc> getSourceDescs() {
        if (sourceDescs == null) {
            sourceDescs = new ArrayList<SourceDesc>();
        }
        return this.sourceDescs;
    }

    /**
     * Obtient la valeur de la propriété sortKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortKey() {
        return sortKey;
    }

    /**
     * Définit la valeur de la propriété sortKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortKey(String value) {
        this.sortKey = value;
    }

    /**
     * Gets the value of the sources property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sources property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSources().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSources() {
        if (sources == null) {
            sources = new ArrayList<String>();
        }
        return this.sources;
    }

    /**
     * Obtient la valeur de la propriété n.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getN() {
        return n;
    }

    /**
     * Définit la valeur de la propriété n.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setN(String value) {
        this.n = value;
    }

    /**
     * Obtient la valeur de la propriété copyOf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyOf() {
        return copyOf;
    }

    /**
     * Définit la valeur de la propriété copyOf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyOf(String value) {
        this.copyOf = value;
    }

    /**
     * Gets the value of the synches property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the synches property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSynches().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSynches() {
        if (synches == null) {
            synches = new ArrayList<String>();
        }
        return this.synches;
    }

    /**
     * Obtient la valeur de la propriété prev.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrev() {
        return prev;
    }

    /**
     * Définit la valeur de la propriété prev.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrev(String value) {
        this.prev = value;
    }

    /**
     * Obtient la valeur de la propriété next.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNext() {
        return next;
    }

    /**
     * Définit la valeur de la propriété next.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNext(String value) {
        this.next = value;
    }

    /**
     * Obtient la valeur de la propriété sameAs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSameAs() {
        return sameAs;
    }

    /**
     * Définit la valeur de la propriété sameAs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSameAs(String value) {
        this.sameAs = value;
    }

    /**
     * Gets the value of the selects property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selects property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelects().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSelects() {
        if (selects == null) {
            selects = new ArrayList<String>();
        }
        return this.selects;
    }

    /**
     * Gets the value of the corresps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the corresps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorresps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCorresps() {
        if (corresps == null) {
            corresps = new ArrayList<String>();
        }
        return this.corresps;
    }

    /**
     * Gets the value of the excludes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the excludes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExcludes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getExcludes() {
        if (excludes == null) {
            excludes = new ArrayList<String>();
        }
        return this.excludes;
    }

    /**
     * Obtient la valeur de la propriété id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the rends property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rends property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRends().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRends() {
        if (rends == null) {
            rends = new ArrayList<String>();
        }
        return this.rends;
    }

    /**
     * Obtient la valeur de la propriété style.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyle() {
        return style;
    }

    /**
     * Définit la valeur de la propriété style.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyle(String value) {
        this.style = value;
    }

    /**
     * Gets the value of the rendering property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rendering property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRendering().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRendering() {
        if (rendering == null) {
            rendering = new ArrayList<String>();
        }
        return this.rendering;
    }

    /**
     * Obtient la valeur de la propriété lang.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Définit la valeur de la propriété lang.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Obtient la valeur de la propriété base.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBase() {
        return base;
    }

    /**
     * Définit la valeur de la propriété base.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBase(String value) {
        this.base = value;
    }

    /**
     * Gets the value of the resps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getResps() {
        if (resps == null) {
            resps = new ArrayList<String>();
        }
        return this.resps;
    }

    /**
     * Obtient la valeur de la propriété cert.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCert() {
        return cert;
    }

    /**
     * Définit la valeur de la propriété cert.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCert(String value) {
        this.cert = value;
    }

    /**
     * Obtient la valeur de la propriété space.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpace() {
        return space;
    }

    /**
     * Définit la valeur de la propriété space.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpace(String value) {
        this.space = value;
    }

    /**
     * Obtient la valeur de la propriété default.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefault() {
        if (_default == null) {
            return "false";
        } else {
            return _default;
        }
    }

    /**
     * Définit la valeur de la propriété default.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefault(String value) {
        this._default = value;
    }

    /**
     * Obtient la valeur de la propriété status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        if (status == null) {
            return "draft";
        } else {
            return status;
        }
    }

    /**
     * Définit la valeur de la propriété status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
