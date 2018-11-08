package pe.edu.tecsup.uv_aqp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseRadiacion extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "BD_UV_Aqp.db";
    private static final int VERSION = 1;
    public static final String Baja1 = "Baja1";
    public static final String Baja2 = "Baja2";
    public static final String Moderada3 = "Moderada3";
    public static final String Moderada4 = "Moderada4";
    public static final String Moderada5 = "Moderada5";
    public static final String Alta6 = "Alta6";
    public static final String Alta7 = "Alta7";
    public static final String MuyAlta8 = "MuyAlta8";
    public static final String MuyAlta9 = "MuyAlta9";
    public static final String MuyAlta10 = "MuyAlta10";
    public static final String ExtremadamenteAlta11 = "ExtemadamenteAlta11";
    public static final String ExtremadamenteAlta12 = "ExtemadamenteAlta12";
    public static final String ExtremadamenteAlta13 = "ExtemadamenteAlta13";
    public static final String ExtremadamenteAlta14 = "ExtemadamenteAlta14";
    public static final String ExtremadamenteAlta15 = "ExtemadamenteAlta15";


    public DatabaseRadiacion(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE PMuyClara ( Baja1 TEXT, Baja2 TEXT, Moderada3 TEXT, Moderada4 TEXT, Moderada5 TEXT, Alta6 TEXT, Alta7 TEXT, MuyAlta8 TEXT, MuyAlta9 TEXT, MuyAlta10 TEXT, ExtremadamenteAlta11 TEXT, ExtremadamenteAlta12 TEXT, ExtremadamenteAlta13 TEXT, ExtremadamenteAlta14 TEXT, ExtremadamenteAlta15 TEXT);");
        sqLiteDatabase.execSQL("CREATE TABLE PClara ( Baja1 TEXT, Baja2 TEXT, Moderada3 TEXT, Moderada4 TEXT, Moderada5 TEXT, Alta6 TEXT, Alta7 TEXT, MuyAlta8 TEXT, MuyAlta9 TEXT, MuyAlta10 TEXT, ExtremadamenteAlta11 TEXT, ExtremadamenteAlta12 TEXT, ExtremadamenteAlta13 TEXT, ExtremadamenteAlta14 TEXT, ExtremadamenteAlta15 TEXT);");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

}
