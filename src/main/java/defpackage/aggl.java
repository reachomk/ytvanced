package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: aggl */
final class aggl implements xbt {
    aggl() {
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE ads ADD COLUMN ad_intro_video_id TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE ads ADD COLUMN ad_intro_player_response BLOB DEFAULT NULL");
    }
}
