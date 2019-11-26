package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: aghh */
final class aghh implements xbt {
    aghh() {
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE drm (video_id TEXT,key_set_id BLOB,mimetype STRING,pssh_data BLOB,license_server_url STRING,last_updated_timestamp INTEGER,last_update_gls_authorized_formats STRING,last_update_sdk_version INTEGER,last_update_attempt_timestamp INTEGER,last_update_attempt_http_code INTEGER,last_update_attempt_gls_code INTEGER, PRIMARY KEY (video_id))");
        sQLiteDatabase.execSQL("CREATE INDEX idx_drm_video_id ON drm (video_id)");
    }
}
