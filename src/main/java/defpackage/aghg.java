package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: aghg */
final class aghg implements xbt {
    aghg() {
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE subtitles_v5 (video_id STRING,language_code STRING,subtitles_path STRING,track_vss_id STRING,user_visible_track_name STRING)");
        sQLiteDatabase.execSQL("CREATE INDEX idx_subtitles_video_id_v5 ON subtitles_v5 (video_id ASC)");
        sQLiteDatabase.execSQL("INSERT INTO subtitles_v5(video_id,language_code,subtitles_path,track_vss_id,user_visible_track_name) SELECT video_id,language_code,subtitles_path,track_vss_id, (language_name || ' - ' || track_name) FROM subtitles WHERE (track_name IS NOT NULL AND track_name <> '' AND track_name != language_name)");
        sQLiteDatabase.execSQL("INSERT INTO subtitles_v5(video_id,language_code,subtitles_path,track_vss_id,user_visible_track_name) SELECT video_id,language_code,subtitles_path,track_vss_id,language_name FROM subtitles WHERE NOT (track_name IS NOT NULL AND track_name <> '' AND track_name != language_name)");
        sQLiteDatabase.execSQL("DROP TABLE subtitles");
    }
}
