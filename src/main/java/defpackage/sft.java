package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: sft */
public final class sft extends SQLiteOpenHelper {
    public sft(Context context) {
        super(context, "cache.db", null, 1);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE CacheTable (_id INTEGER PRIMARY KEY AUTOINCREMENT,accountId TEXT NOT NULL,thirdPartyServiceProvider TEXT NOT NULL,token TEXT NOT NULL,expiryTime INTEGER ,scopes TEXT NOT NULL )");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS CacheTable");
        onCreate(sQLiteDatabase);
    }
}
