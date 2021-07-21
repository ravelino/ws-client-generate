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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de SegurancaVO complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SegurancaVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alreadyLoggedIn" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="cdLogo" type="{http://schemas.xmlsoap.org/soap/encoding/}string"/&gt;
 *         &lt;element name="cdLoja" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="cdOrganizacao" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="cdPerfil" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="cdSistema" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="cdUsuario" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="dsErrorPage" type="{http://schemas.xmlsoap.org/soap/encoding/}string"/&gt;
 *         &lt;element name="dtFimValidade" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="nmArquivoImagemLogo" type="{http://schemas.xmlsoap.org/soap/encoding/}string"/&gt;
 *         &lt;element name="nmArquivoImagemOrganizacao" type="{http://schemas.xmlsoap.org/soap/encoding/}string"/&gt;
 *         &lt;element name="nmNomeUsuario" type="{http://schemas.xmlsoap.org/soap/encoding/}string"/&gt;
 *         &lt;element name="nmSistema" type="{http://schemas.xmlsoap.org/soap/encoding/}string"/&gt;
 *         &lt;element name="nmUsuario" type="{http://schemas.xmlsoap.org/soap/encoding/}string"/&gt;
 *         &lt;element name="permissoes" type="{http://xml.apache.org/xml-soap}Map"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegurancaVO", namespace = "http://vo.seg.certegy.com.br", propOrder = {
    "alreadyLoggedIn",
    "cdLogo",
    "cdLoja",
    "cdOrganizacao",
    "cdPerfil",
    "cdSistema",
    "cdUsuario",
    "dsErrorPage",
    "dtFimValidade",
    "nmArquivoImagemLogo",
    "nmArquivoImagemOrganizacao",
    "nmNomeUsuario",
    "nmSistema",
    "nmUsuario",
    "permissoes"
})
public class SegurancaVO {

    protected boolean alreadyLoggedIn;
    @XmlElement(required = true, nillable = true)
    protected String cdLogo;
    protected int cdLoja;
    protected int cdOrganizacao;
    protected int cdPerfil;
    protected int cdSistema;
    protected int cdUsuario;
    @XmlElement(required = true, nillable = true)
    protected String dsErrorPage;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtFimValidade;
    @XmlElement(required = true, nillable = true)
    protected String nmArquivoImagemLogo;
    @XmlElement(required = true, nillable = true)
    protected String nmArquivoImagemOrganizacao;
    @XmlElement(required = true, nillable = true)
    protected String nmNomeUsuario;
    @XmlElement(required = true, nillable = true)
    protected String nmSistema;
    @XmlElement(required = true, nillable = true)
    protected String nmUsuario;
    @XmlElement(required = true, nillable = true)
    protected Map permissoes;

    /**
     * Obtém o valor da propriedade alreadyLoggedIn.
     * 
     */
    public boolean isAlreadyLoggedIn() {
        return alreadyLoggedIn;
    }

    /**
     * Define o valor da propriedade alreadyLoggedIn.
     * 
     */
    public void setAlreadyLoggedIn(boolean value) {
        this.alreadyLoggedIn = value;
    }

    /**
     * Obtém o valor da propriedade cdLogo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdLogo() {
        return cdLogo;
    }

    /**
     * Define o valor da propriedade cdLogo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdLogo(String value) {
        this.cdLogo = value;
    }

    /**
     * Obtém o valor da propriedade cdLoja.
     * 
     */
    public int getCdLoja() {
        return cdLoja;
    }

    /**
     * Define o valor da propriedade cdLoja.
     * 
     */
    public void setCdLoja(int value) {
        this.cdLoja = value;
    }

    /**
     * Obtém o valor da propriedade cdOrganizacao.
     * 
     */
    public int getCdOrganizacao() {
        return cdOrganizacao;
    }

    /**
     * Define o valor da propriedade cdOrganizacao.
     * 
     */
    public void setCdOrganizacao(int value) {
        this.cdOrganizacao = value;
    }

    /**
     * Obtém o valor da propriedade cdPerfil.
     * 
     */
    public int getCdPerfil() {
        return cdPerfil;
    }

    /**
     * Define o valor da propriedade cdPerfil.
     * 
     */
    public void setCdPerfil(int value) {
        this.cdPerfil = value;
    }

    /**
     * Obtém o valor da propriedade cdSistema.
     * 
     */
    public int getCdSistema() {
        return cdSistema;
    }

    /**
     * Define o valor da propriedade cdSistema.
     * 
     */
    public void setCdSistema(int value) {
        this.cdSistema = value;
    }

    /**
     * Obtém o valor da propriedade cdUsuario.
     * 
     */
    public int getCdUsuario() {
        return cdUsuario;
    }

    /**
     * Define o valor da propriedade cdUsuario.
     * 
     */
    public void setCdUsuario(int value) {
        this.cdUsuario = value;
    }

    /**
     * Obtém o valor da propriedade dsErrorPage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsErrorPage() {
        return dsErrorPage;
    }

    /**
     * Define o valor da propriedade dsErrorPage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsErrorPage(String value) {
        this.dsErrorPage = value;
    }

    /**
     * Obtém o valor da propriedade dtFimValidade.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtFimValidade() {
        return dtFimValidade;
    }

    /**
     * Define o valor da propriedade dtFimValidade.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtFimValidade(XMLGregorianCalendar value) {
        this.dtFimValidade = value;
    }

    /**
     * Obtém o valor da propriedade nmArquivoImagemLogo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmArquivoImagemLogo() {
        return nmArquivoImagemLogo;
    }

    /**
     * Define o valor da propriedade nmArquivoImagemLogo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmArquivoImagemLogo(String value) {
        this.nmArquivoImagemLogo = value;
    }

    /**
     * Obtém o valor da propriedade nmArquivoImagemOrganizacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmArquivoImagemOrganizacao() {
        return nmArquivoImagemOrganizacao;
    }

    /**
     * Define o valor da propriedade nmArquivoImagemOrganizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmArquivoImagemOrganizacao(String value) {
        this.nmArquivoImagemOrganizacao = value;
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
     * Obtém o valor da propriedade nmSistema.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmSistema() {
        return nmSistema;
    }

    /**
     * Define o valor da propriedade nmSistema.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmSistema(String value) {
        this.nmSistema = value;
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

    /**
     * Obtém o valor da propriedade permissoes.
     * 
     * @return
     *     possible object is
     *     {@link Map }
     *     
     */
    public Map getPermissoes() {
        return permissoes;
    }

    /**
     * Define o valor da propriedade permissoes.
     * 
     * @param value
     *     allowed object is
     *     {@link Map }
     *     
     */
    public void setPermissoes(Map value) {
        this.permissoes = value;
    }

}
