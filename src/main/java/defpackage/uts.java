package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: uts */
final class uts implements xbt {
    uts() {
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE identity_temp(id TEXT PRIMARY KEY,account TEXT,page_id TEXT)");
        sQLiteDatabase.execSQL("CREATE TABLE profile(id TEXT PRIMARY KEY,profile_display_name TEXT,profile_display_email TEXT,profile_thumbnail_uri TEXT,profile_account_name_proto BLOB,profile_account_photo_thumbnails_proto BLOB,profile_mobile_banner_thumbnails_proto BLOB,FOREIGN KEY(id) REFERENCES identity(id));");
        sQLiteDatabase.execSQL("INSERT OR IGNORE INTO identity_temp(id, account, page_id) SELECT id, account, gaia_id FROM identity");
        sQLiteDatabase.execSQL("INSERT OR IGNORE INTO profile(id, profile_display_name, profile_display_email, profile_thumbnail_uri, profile_account_name_proto, profile_account_photo_thumbnails_proto, profile_mobile_banner_thumbnails_proto) SELECT id, profile_display_name, profile_display_email, profile_thumbnail_uri, profile_account_name_proto, profile_account_photo_thumbnails_proto, profile_mobile_banner_thumbnails_proto FROM identity");
        sQLiteDatabase.execSQL("DROP TABLE identity");
        sQLiteDatabase.execSQL("ALTER TABLE identity_temp RENAME TO identity");
    }
}
