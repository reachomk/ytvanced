package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: aggb */
final class aggb implements xbt {
    aggb() {
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE channelSubscriptions (channel_id TEXT PRIMARY KEY,preferred_stream_quality INTEGER,channel_offlineability_proto BLOB,channel_video_option_proto BLOB,saved_time INTEGER,last_check_time INTEGER)");
    }
}
