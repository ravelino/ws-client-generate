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
 * <p>Classe Java de SaidaUsuarioWSVO complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SaidaUsuarioWSVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cdErroRetorno" type="{http://schemas.xmlsoap.org/soap/encoding/}string"/&gt;
 *         &lt;element name="cdSistema" type="{http://schemas.xmlsoap.org/soap/encoding/}string"/&gt;
 *         &lt;element name="cdUsuario" type="{http://schemas.xmlsoap.org/soap/encoding/}string"/&gt;
 *         &lt;element name="dsErroRetorno" type="{http://schemas.xmlsoap.org/soap/encoding/}string"/&gt;
 *         &lt;element name="nmNomeUsuario" type="{http://schemas.xmlsoap.org/soap/encoding/}string"/&gt;
 *         &lt;element name="nmUsuario" type="{http://schemas.xmlsoap.org/soap/encoding/}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaidaUsuarioWSVO", namespace = "http://vo.seg.certegy.com.br", propOrder = {
    "cdErroRetorno",
    "cdSistema",
    "cdUsuario",
    "dsErroRetorno",
    "nmNomeUsuario",
    "nmUsuario"
})
public class SaidaUsuarioWSVO {

    @XmlElement(required = true, nillable = true)
    protected String cdErroRetorno;
    @XmlElement(required = true, nillable = true)
    protected String cdSistema;
    @XmlElement(required = true, nillable = true)
    protected String cdUsuario;
    @XmlElement(required = true, nillable = true)
    protected String dsErroRetorno;
    @XmlElement(required = true, nillable = true)
    protected String nmNomeUsuario;
    @XmlElement(required = true, nillable = true)
    protected String nmUsuario;

    /**
     * Obtém o valor da propriedade cdErroRetorno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdErroRetorno() {
        return cdErroRetorno;
    }

    /**
     * Define o valor da propriedade cdErroRetorno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdErroRetorno(String value) {
        this.cdErroRetorno = value;
    }

    /**
     * Obtém o valor da propriedade cdSistema.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdSistema() {
        return cdSistema;
    }

    /**
     * Define o valor da propriedade cdSistema.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdSistema(String value) {
        this.cdSistema = value;
    }

    /**
     * Obtém o valor da propriedade cdUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdUsuario() {
        return cdUsuario;
    }

    /**
     * Define o valor da propriedade cdUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdUsuario(String value) {
        this.cdUsuario = value;
    }

    /**
     * Obtém o valor da propriedade dsErroRetorno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsErroRetorno() {
        return dsErroRetorno;
    }

    /**
     * Define o valor da propriedade dsErroRetorno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsErroRetorno(String value) {
        this.dsErroRetorno = value;
    }

    /**
     * Obtém o valor da propriedade nmNomeUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmNomeUsuario() {
        return nmNomeUsuario;
    }

    /**
     * Define o valor da propriedade nmNomeUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmNomeUsuario(String value) {
        this.nmNomeUsuario = value;
    }

    /**
     * Obtém o valor da propriedade nmUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmUsuario() {
        return nmUsuario;
    }

    /**
     * Define o valor da propriedade nmUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmUsuario(String value) {
        this.nmUsuario = value;
    }

}
