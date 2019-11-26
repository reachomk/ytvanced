package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: aggf */
final class aggf implements xbt {
    aggf() {
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE final_video_list_video_ids (video_list_id TEXT,video_id TEXT,index_in_video_list INTEGER,saved_timestamp INTEGER)");
        sQLiteDatabase.execSQL("CREATE INDEX idx_final_video_list_id ON final_video_list_video_ids (video_id ASC)");
    }
}
