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
 * <p>Classe Java de RetornoSegurancaWSVO complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RetornoSegurancaWSVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigo" type="{http://schemas.xmlsoap.org/soap/encoding/}string"/&gt;
 *         &lt;element name="descricao" type="{http://schemas.xmlsoap.org/soap/encoding/}string"/&gt;
 *         &lt;element name="seguranca" type="{http://vo.seg.certegy.com.br}SegurancaVO"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetornoSegurancaWSVO", namespace = "http://vo.seg.certegy.com.br", propOrder = {
    "codigo",
    "descricao",
    "seguranca"
})
public class RetornoSegurancaWSVO {

    @XmlElement(required = true, nillable = true)
    protected String codigo;
    @XmlElement(required = true, nillable = true)
    protected String descricao;
    @XmlElement(required = true, nillable = true)
    protected SegurancaVO seguranca;

    /**
     * Obtém o valor da propriedade codigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Define o valor da propriedade codigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Obtém o valor da propriedade descricao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define o valor da propriedade descricao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricao(String value) {
        this.descricao = value;
    }

    /**
     * Obtém o valor da propriedade seguranca.
     * 
     * @return
     *     possible object is
     *     {@link SegurancaVO }
     *     
     */
    public SegurancaVO getSeguranca() {
        return seguranca;
    }

    /**
     * Define o valor da propriedade seguranca.
     * 
     * @param value
     *     allowed object is
     *     {@link SegurancaVO }
     *     
     */
    public void setSeguranca(SegurancaVO value) {
        this.seguranca = value;
    }

}
