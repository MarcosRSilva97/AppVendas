package com.marcos.appvendas.Model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Db extends SQLiteOpenHelper {

    public static String DbName = "Vendas.db";
    public static int version = 1;

    private static String tblClientes = "CREATE TABLE CLIENTES(" +
            "cli_codigo INTEGER," +
            "cli_nome VARCHAR DEFAULT 50," +
            "cli_fantasia, " +
            "cli_endereco VARCHAR DEFAULT 50," +
            "user_codigo VARCHAR DEFAULT 50," +
            "cli_bairro VARCHAR DEFAULT 50," +
            "cli_cep VARCHAR DEFAULT 50," +
            "cid_codigo INTEGER," +
            "cli_contato DEFAULT VARCHAR 13," +
            "cli_nascimento DEFAULT VARCHAR 8," +
            "cli_cpf_cnpj DEFAULT VARCHAR 14," +
            "cli_rg_incestadual DEFAULT VARCHAR 40," +
            "cli_email DEFAULT VARCHAR 50," +
            "cli_enviado DEFAULT CHAR 1," +
            "cli_chave DEFAULT VARCHAR 100)";

    private static String tblProdutos = "CREATE TABLE PRODUTOS (" +
            "prd_codigo, INTEGER," +
            "prd_EAN13, VARCHAR DEFAULT 13," +
            "prd_descricao, VARCHAR DEFAULT 50," +
            "prd_unMedida, VARCHAR DEFAULT 10," +
            "prd_custo, DECIMAL(10,2)," +
            "prd_quantidade, DECIMAL (10,2)," +
            "prd_preco, DECIMAL(10,2)," +
            "prd_categoria VARCHAR DEFAULT 30)";

    private static String tblCabecalhoVenda = "CREATE TABLE CABECALHO_VENDA (" +
            "vendac_id INTEGER PRIMARY KEY AUTO_INCREMENT," +
            "vendac_chave VARCHAR DEFAULT 70," +
            "vendac_datahoravenda DATETIME," +
            "vendac_previsaoEntrega DATE," +
            "vendac__user_codigo INTEGER," +
            "vendac_user_nome VARCHAR DEFAULT 50," +
            "vendac_formaPgto VARCHAR DEFAULT 50," +
            "vendac_valor  DECIMAL(10,2)," +
            "vendac_pesoTotal  DECIMAL(10,2)" +
            "vendac_enviada CHAR DEFAULT 1," +
            "vendac_latitude DOUBLE,)," +
            "vendac_longitude DOUBLE)";

    private static String tblDetalheVenda = "CREATE TABLE DETALHE_VENDA(" +
            "vendac_chave VARCHAR DEFAULT 70," +
            "vendad_nro_item INTEGER," +
            "vendad_EAN13, VARCHAR DEFAULT 13," +
            "vendad_prd_codigo, INTEGER," +
            "vendad_prd_descricao, VARCHAR DEFAULT 50," +
            "vendad_quantidade DECIMAL(10,2)," +
            "vendad_preco_venda DECIMAL (10,2)" +
            "vendad_preco_total_item DECIMAL (10,2)";

    public Db(Context context){
        super(context, DbName,null,version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}