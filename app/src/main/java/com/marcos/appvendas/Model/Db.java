package com.marcos.appvendas.Model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Db extends SQLiteOpenHelper {

    public static String DbName = "Vendas.db";
    public static int version = 1;
    private static String tblClientes ="CREATE TABLE [CLIENTES](" +
            "cli_codigo INTEGER," +
            "cli_nome VARCHAR DEFAULT 50," +
            "cli_fantasia, cli_endereco VARCHAR DEFAULT 50," +
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

    private String tblProdutos = "CREATE TABLE [PRODUTOS] (" +
            "prd_codigo, INTEGER" +
            "prd_EAN13, VARCHAR DEFAULT 13" +
            "prd_descricao, VARCHAR DEFAULT 50" +
            "prd_unMedida, VARCHAR DEFAULT 10" +
            "prd_custo, DECIMAL(10,2)" +
            "prd_preco,DECIMAL(10,2)" +
            "prd_categoria VARCHAR DEFAULT 30)";

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
