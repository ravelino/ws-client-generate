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
 * <p>Classe Java de RetornoWSVO complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RetornoWSVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cdErroRetorno" type="{http://schemas.xmlsoap.org/soap/encoding/}string"/&gt;
 *         &lt;element name="dsErroRetorno" type="{http://schemas.xmlsoap.org/soap/encoding/}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetornoWSVO", namespace = "http://vo.seg.certegy.com.br", propOrder = {
    "cdErroRetorno",
    "dsErroRetorno"
})
public class RetornoWSVO {

    @XmlElement(required = true, nillable = true)
    protected String cdErroRetorno;
    @XmlElement(required = true, nillable = true)
    protected String dsErroRetorno;

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

}
