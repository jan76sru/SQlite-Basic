package srujan.com.jounaldevsqlitetest;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    // Tbale name
    public static final String TABLE_NAME ="COUNTRIES";

    // Database Information
    static final String DB_NAME = "SRUJAN_COUNTRIES.DB";
    static final int DB_VERSION = 1;


    // Table columns
    public static final String _ID = "_id";
    public static final String SUBJECT = "subject";
    public static final String DESC = "description";

    //creating table
    private static final String CREATE_TABLE ="create table "+TABLE_NAME + "(" +_ID +" INTEGER PRIMARY KEY AUTOINCREMENT, " + SUBJECT + " TEXT NOT NULL ," + DESC + " TEXT );";


     public DatabaseHelper(Context context){
         super(context,DB_NAME,null,DB_VERSION);
     }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
         sqLiteDatabase.execSQL(CREATE_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+ TABLE_NAME);
        onCreate(sqLiteDatabase);

    }
}
