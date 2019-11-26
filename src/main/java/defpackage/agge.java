package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: agge */
final class agge implements xbt {
    agge() {
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE video_lists (id TEXT PRMARY KEY,size INTEGER,type INTEGER,saved_timestamp INTEGER,last_update_timestamp INTEGER)");
        sQLiteDatabase.execSQL("CREATE TABLE video_list_videos (video_list_id TEXT,video_id TEXT,index_in_video_list INTEGER,saved_timestamp INTEGER)");
        sQLiteDatabase.execSQL("CREATE INDEX idx_video_list_video_id ON video_list_videos (video_id ASC)");
    }
}
