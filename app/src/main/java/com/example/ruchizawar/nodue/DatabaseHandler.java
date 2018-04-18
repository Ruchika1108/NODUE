package com.example.ruchizawar.nodue;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by RUCHI ZAWAR on 13/04/2018.
 */

public class DatabaseHandler extends SQLiteOpenHelper {

   // private static final int DATABASE_VERSION = 1;
   private static final String DATABASE_NAME = "Student.db";
    private static final String TABLE_NAME = "Student";


  /* public static final String PRN = "prn";
    public static final String NAME = "name";
    public static final String BRANCH = "branch";
    public static final String YEAR = "year";
    public static final String FEESCATEGORY="feescategory";
    public static final String TOTALFEES="totalfees";
    public static final String FEESPAID="feespaid";
    public static final String REMAININGFEES="remainingfees";*/


    public DatabaseHandler(Context context)
    {
        super(context,DATABASE_NAME,null,1);
       // SQLiteDatabase dp=this.getWritableDatabase();

    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
       // String CREATE_STUDENT_DETAIL_TABLE="CREATE TABLE " + TABLE_NAME + "( " + PRN + " PRIMARY KEY," + NAME + "TEXT," + BRANCH +"TEXT," + YEAR + "TEXT," + FEESCATEGORY + "TEXT," + TOTALFEES + "TEXT," + FEESPAID + "TEXT," + REMAININGFEES + "TEXT" + ")";

    db.execSQL(" CREATE TABLE " + TABLE_NAME + " (PRN TEXT PRIMARY KEY,NAME TEXT,BRANCH TEXT,YEAR TEXT,FEESCATEGORY TEXT,TOTALFEES TEXT,FEESPAID TEXT )");



    }

    @Override
    public void onUpgrade(SQLiteDatabase db,int i, int i1)
    {
        db.execSQL(" DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public boolean insertdata( String prn, String name, String branch, String year, String feescategory,  String totalfees,  String  feespaid )
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(" PRN ",prn);
        contentValues.put(" NAME ",name);
        contentValues.put(" BRANCH ",branch);
        contentValues.put(" YEAR ",year);
        contentValues.put(" FEESCATEGORY ",feescategory);
        contentValues.put(" TOTALFEES ",totalfees);
        contentValues.put(" FEESPAID ",feespaid);




        long result= db.insert(TABLE_NAME,null,contentValues);
        if (result==-1){
            return false;
        }
        else {
            return true;
        }
    }

    public Cursor getData(String prn)//cursor class provied random read write
    {
        SQLiteDatabase db = this.getWritableDatabase();
        String query = " SELECT * FROM " + TABLE_NAME + " WHERE PRN = '" + prn + "'";
        Cursor cursor = db.rawQuery(query,null);

      return cursor;
    }



}
