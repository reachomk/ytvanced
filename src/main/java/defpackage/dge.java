package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: dge */
public final class dge extends SQLiteOpenHelper {
    public dge(Context context, String str) {
        super(context, str, null, 5);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(dgf.a);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS conversiontracking");
        onCreate(sQLiteDatabase);
    }
}
