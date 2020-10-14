package com.marcos.appvendas.Model;

public class SqlParametroBean {

    private Integer parm_usu_codigo;
    private String parm_importar_cliente;
    private String parm_ip_local;
    private String parm_ip_remoto;
    private String parm_permitido_estoque_negativo;
    private Integer parm_desconto_do_vendedor;

    public Integer getSu_codigoIntegerInteger() {
        return parm_usu_codigo;
    }

    public void setSu_codigoIntegerInteger(Integer su_codigoIntegerInteger) {
        this.parm_usu_codigo = su_codigoIntegerInteger;
    }

    public String getParm_importar_cliente() {
        return parm_importar_cliente;
    }

    public void setParm_importar_cliente(String parm_importar_cliente) {
        this.parm_importar_cliente = parm_importar_cliente;
    }

    public String getParm_ip_local() {
        return parm_ip_local;
    }

    public void setParm_ip_local(String parm_ip_local) {
        this.parm_ip_local = parm_ip_local;
    }

    public String getParm_ip_remoto() {
        return parm_ip_remoto;
    }

    public void setParm_ip_remoto(String parm_ip_remoto) {
        this.parm_ip_remoto = parm_ip_remoto;
    }

    public String getParm_permitido_estoque_negativo() {
        return parm_permitido_estoque_negativo;
    }

    public void setParm_permitido_estoque_negativo(String parm_permitido_estoque_negativo) {
        this.parm_permitido_estoque_negativo = parm_permitido_estoque_negativo;
    }

    public Integer getParm_desconto_do_vendedor() {
        return parm_desconto_do_vendedor;
    }

    public void setParm_desconto_do_vendedor(Integer parm_desconto_do_vendedor) {
        this.parm_desconto_do_vendedor = parm_desconto_do_vendedor;
    }
}
