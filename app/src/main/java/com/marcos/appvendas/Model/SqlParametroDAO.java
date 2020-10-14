package com.marcos.appvendas.Model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteStatement;
import android.util.Log;

public class SqlParametroDAO {

    private Context context;
    private String sql;
    private boolean gravacao;

    public SqlParametroDAO(Context context){
        this.context = context;
    }

    public boolean gravarParametro(SqlParametroBean parametro){
        SQLiteDatabase db = new Db(context).getWritableDatabase();
        gravacao = false;

        sql = "INSERT INTO PARAMETROS (" +
                "parm_usu_codigo," +
                " parm_importar_cliente," +
                " parm_ip_local," +
                " parm_ip_remoto," +
                " parm_permitido_estoque_negativo," +
                " parm_desconto_do_vendedor)" +
                "VALUES (?,?,?,?,?,?)";

        SQLiteStatement statement = db.compileStatement(sql);

        try {
            statement.bindLong(1, parametro.);

        } catch (SQLiteException exception){
            Log.d("Script", exception.getMessage());
        }

        return  true;
    }
}
