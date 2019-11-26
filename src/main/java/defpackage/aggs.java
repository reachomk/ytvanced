package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: aggs */
final class aggs implements xbt {
    aggs() {
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE videosV2 ADD COLUMN video_added_timestamp INTEGER DEFAULT 0");
    }
}
