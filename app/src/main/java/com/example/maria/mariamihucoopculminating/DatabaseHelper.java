package com.example.maria.mariamihucoopculminating;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Maria on 2017-12-31.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    String emptyPassword = "No_Password";
    String notApplicable = "N/A";

    private static final int DATABASE_VERSION = 2;
    private static final String DATABASE_NAME = "counsellors.db";
    private static final String TABLE_NAME = "counsellors";
    private static final String COLUMN_ID = "id";
    private static final String COLUMN_FIRSTNAME = "FirstName";
    private static final String COLUMN_LASTNAME = "LastName";
    private static final String COLUMN_AGE = "Age";
    private static final String COLUMN_POSITION = "Position";
    private static final String COLUMN_ALLERGIES = "Allergies";
    private static final String COLUMN_EXTRA = "ExtraNotes";
    private static final String COLUMN_ACCOUNTACCESS = "Access2Account";
   private static final String COLUMN_PASSWORD = "Password";
    SQLiteDatabase sqLiteDatabase;

    private static final String TABLE_CREATE = "create table counsellors (id integer primary key not null , " + "FirstName text not null , LastName text not null , Age text not null , Position text not null , Allergies text not null , ExtraNotes text not null , Access2Account text not null, Password text not null);";

    public DatabaseHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(TABLE_CREATE);
        this.sqLiteDatabase = sqLiteDatabase;
    }

    public void insertAdmin(){
        sqLiteDatabase = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        String query = "select * from "+TABLE_NAME;
        Cursor cursor = sqLiteDatabase.rawQuery(query, null);
        int count = cursor.getCount();

        values.put(COLUMN_ID, count);
        values.put(COLUMN_FIRSTNAME , "mytpADMIN");
        values.put(COLUMN_LASTNAME , notApplicable);
        values.put(COLUMN_AGE, notApplicable);
        values.put(COLUMN_POSITION, notApplicable);
        values.put(COLUMN_ALLERGIES, notApplicable);
        values.put(COLUMN_EXTRA, notApplicable);
        values.put(COLUMN_ACCOUNTACCESS, notApplicable);
        values.put(COLUMN_PASSWORD, "account2018");

        sqLiteDatabase.insert(TABLE_NAME, null, values);
        sqLiteDatabase.close();
    }


    public void insertCounsellor(Counsellors c){
        sqLiteDatabase = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        String query = "select * from "+TABLE_NAME;
        Cursor cursor = sqLiteDatabase.rawQuery(query, null);
        int count = cursor.getCount();

        values.put(COLUMN_ID, count);
        values.put(COLUMN_FIRSTNAME , c.getCounsellorFirstName());
        values.put(COLUMN_LASTNAME , c.getCounsellorLastName());
        values.put(COLUMN_AGE, c.getCounsellorAge());
        values.put(COLUMN_POSITION, c.getCounsellorPosition());
        values.put(COLUMN_ALLERGIES, c.getCounsellorAllergies());
        values.put(COLUMN_EXTRA, c.getCounsellorExtraNotes());
        values.put(COLUMN_ACCOUNTACCESS, c.getAccountAccess());
        values.put(COLUMN_PASSWORD, emptyPassword);

        sqLiteDatabase.insert(TABLE_NAME, null, values);
        sqLiteDatabase.close();
    }

    public String getCounsellorID(String name){
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        String query = "select id, FirstName from "+TABLE_NAME;
        Cursor find = sqLiteDatabase.rawQuery(query, null);
        String ID, FN;
        ID = "";

        if(find.moveToFirst()){
            do{
                FN = find.getString(1);

                if(FN.equals(name)){
                    ID = find.getString(0);
                    break;
                }
            }
            while(find.moveToNext());
        }
        return ID;
    }

    public void updatePass(String newPass, int id, String oldPass){
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        String query = "UPDATE " + TABLE_NAME + " SET " + COLUMN_PASSWORD + " = '" + newPass + "' WHERE " + COLUMN_ID + " = '" + id + "'" + " AND " + COLUMN_PASSWORD + " = '" + oldPass + "'";
        sqLiteDatabase.execSQL(query);
    }

    public String searchForAccountAccess(String FirstName){
        sqLiteDatabase = this.getReadableDatabase();
        String query = "select FirstName, Access2Account from "+TABLE_NAME;
        Cursor cursor2 = sqLiteDatabase.rawQuery(query, null);
        String FN, AA;
        AA = "";

        if(cursor2.moveToFirst()){
            do{
                FN = cursor2.getString(0);

                if(FN.equals(FirstName)){
                    AA = cursor2.getString(1);
                    break;
                }
            }
            while(cursor2.moveToNext());
        }
        return AA;
    }

    public String searchForName(String FirstName){
        sqLiteDatabase = this.getReadableDatabase();
        String query = "select FirstName, Access2Account from "+TABLE_NAME;
        Cursor cursor3 = sqLiteDatabase.rawQuery(query, null);
        String FN, result;
        result = "";

        if(cursor3.moveToFirst()){
            do{
                FN = cursor3.getString(0);

                if(FN.equals(FirstName)){
                    result = cursor3.getString(0);
                    break;
                }
            }
            while(cursor3.moveToNext());
        }
        return result;
    }


   public String searchforADMIN(String name){
        sqLiteDatabase = this.getReadableDatabase();
        String query = "select FirstName from "+TABLE_NAME;
        Cursor cursor3 = sqLiteDatabase.rawQuery(query, null);
        String FN, result;
        result = "false";
        String adminName = "mytpADMIN";

        if(cursor3.moveToFirst()){
            do{
                FN = cursor3.getString(0);

                if(FN.equals(name)){
                    if(FN.equals(adminName)){
                        result = "true";
                        break;
                    }
                }
            }
            while(cursor3.moveToNext());
        }
        return result;
    }

    public String searchPass(String FirstName){
        sqLiteDatabase = this.getReadableDatabase();
        String query = "select FirstName, Password from "+TABLE_NAME;
        Cursor cursor = sqLiteDatabase.rawQuery(query, null);

        String FN, pass;
        pass = "not found";

        if(cursor.moveToFirst()){
            do {
                FN = cursor.getString(0); //this tells the cursor WHICH of the above values, ie. username or password, it should be taking

                if(FN.equals(FirstName)){
                    pass = cursor.getString(1);
                    break;
                }
            }
            while(cursor.moveToNext());
        }
        return pass;
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        String query = "DROP TABLE IF EXISTS "+TABLE_NAME;
        sqLiteDatabase.execSQL(query);
        this.onCreate(sqLiteDatabase);
    }
}
