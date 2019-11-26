package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: alzd */
final class alzd extends SQLiteOpenHelper {
    alzd(Context context, String str) {
        super(context, str, null, 1);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS job_storage_jobs");
        sQLiteDatabase.execSQL("CREATE TABLE job_storage_jobs (id TEXT PRIMARY KEY,version INTEGER,data BLOB)");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        boolean z = false;
        amqw.a(i <= 0);
        if (i2 == 1) {
            z = true;
        }
        amqw.a(z);
        onCreate(sQLiteDatabase);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        boolean z = false;
        amqw.a(i > 1);
        if (i2 == 1) {
            z = true;
        }
        amqw.a(z);
        onCreate(sQLiteDatabase);
    }
}
