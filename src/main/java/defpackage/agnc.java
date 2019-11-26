package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: agnc */
final class agnc implements xbt {
    private agnc() {
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE ytb_progress (transfer_id TEXT PRIMARY KEY,filepath TEXT,progress BLOB DEFAULT NULL)");
    }

    /* synthetic */ agnc(byte b) {
    }
}
