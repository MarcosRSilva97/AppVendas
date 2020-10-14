package com.marcos.appvendas.Model;

public class SqlParametroBean {

    private Integer parmUsuCodigo;
    private String parmImportarCliente;
    private String parmIpLocal;
    private String parmIpRemoto;
    private String parmPermitidoEstoqueNegativo;
    private Integer parmDescontoVendedor;

    public Integer getParmDescontoVendedor() {
        return parmDescontoVendedor;
    }

    public void setParmDescontoVendedor(Integer parmDescontoVendedor) {
        this.parmDescontoVendedor = parmDescontoVendedor;
    }

    public Integer getParmUsuCodigo() {
        return parmUsuCodigo;
    }

    public void setParmUsuCodigo(Integer parmUsuCodigo) {
        this.parmUsuCodigo = parmUsuCodigo;
    }

    public String getParmImportarCliente() {
        return parmImportarCliente;
    }

    public void setParmImportarCliente(String parmImportarCliente) {
        this.parmImportarCliente = parmImportarCliente;
    }

    public String getParmIpLocal() {
        return parmIpLocal;
    }

    public void setParmIpLocal(String parmIpLocal) {
        this.parmIpLocal = parmIpLocal;
    }

    public String getParmIpRemoto() {
        return parmIpRemoto;
    }

    public void setParmIpRemoto(String parmIpRemoto) {
        this.parmIpRemoto = parmIpRemoto;
    }

    public String getParmPermitidoEstoqueNegativo() {
        return parmPermitidoEstoqueNegativo;
    }

    public void setParmPermitidoEstoqueNegativo(String parmPermitidoEstoqueNegativo) {
        this.parmPermitidoEstoqueNegativo = parmPermitidoEstoqueNegativo;
    }
}