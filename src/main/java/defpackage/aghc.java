package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: aghc */
final class aghc implements xbt {
    aghc() {
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE streams ADD COLUMN ytb_uri TEXT DEFAULT NULL");
    }
}
