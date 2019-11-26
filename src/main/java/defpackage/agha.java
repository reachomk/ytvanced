package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: agha */
final class agha implements xbt {
    agha() {
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE drm ADD COLUMN drm_params TEXT ");
    }
}
