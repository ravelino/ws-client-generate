//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.07.08 às 08:58:57 AM BRT 
//


package br.com.ravelino.login.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de LoginPciRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="LoginPciRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nmUsuario" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="snUsuario" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cdSistema" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ipUsuario" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoginPciRequest", namespace = "http://vo.seg.certegy.com.br", propOrder = {
    "nmUsuario",
    "snUsuario",
    "cdSistema",
    "ipUsuario"
})
public class LoginPciRequest {

    @XmlElement(required = true, nillable = true)
    protected java.lang.String nmUsuario;
    @XmlElement(required = true, nillable = true)
    protected java.lang.String snUsuario;
    @XmlElement(required = true, nillable = true)
    protected java.lang.String cdSistema;
    @XmlElement(required = true, nillable = true)
    protected java.lang.String ipUsuario;

    /**
     * Obtém o valor da propriedade nmUsuario.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getNmUsuario() {
        return nmUsuario;
    }

    /**
     * Define o valor da propriedade nmUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setNmUsuario(java.lang.String value) {
        this.nmUsuario = value;
    }

    /**
     * Obtém o valor da propriedade snUsuario.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getSnUsuario() {
        return snUsuario;
    }

    /**
     * Define o valor da propriedade snUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setSnUsuario(java.lang.String value) {
        this.snUsuario = value;
    }

    /**
     * Obtém o valor da propriedade cdSistema.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getCdSistema() {
        return cdSistema;
    }

    /**
     * Define o valor da propriedade cdSistema.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setCdSistema(java.lang.String value) {
        this.cdSistema = value;
    }

    /**
     * Obtém o valor da propriedade ipUsuario.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getIpUsuario() {
        return ipUsuario;
    }

    /**
     * Define o valor da propriedade ipUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setIpUsuario(java.lang.String value) {
        this.ipUsuario = value;
    }

}
