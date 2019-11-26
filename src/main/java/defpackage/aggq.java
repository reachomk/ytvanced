package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: aggq */
final class aggq implements xbt {
    aggq() {
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE streams ADD COLUMN transfer_added_timestamp INTEGER DEFAULT 0");
        sQLiteDatabase.execSQL("ALTER TABLE streams ADD COLUMN transfer_completed_timestamp INTEGER DEFAULT 0");
        sQLiteDatabase.execSQL("ALTER TABLE streams ADD COLUMN transfer_started_timestamp INTEGER DEFAULT 0");
        sQLiteDatabase.execSQL("ALTER TABLE streams ADD COLUMN storage_format INTEGER DEFAULT 0");
        sQLiteDatabase.execSQL("ALTER TABLE streams ADD COLUMN wrapped_key BLOB DEFAULT NULL");
        sQLiteDatabase.execSQL("ALTER TABLE streams ADD COLUMN disco_key_iv BLOB DEFAULT NULL");
        sQLiteDatabase.execSQL("ALTER TABLE streams ADD COLUMN disco_key BLOB DEFAULT NULL");
        sQLiteDatabase.execSQL("ALTER TABLE streams ADD COLUMN disco_nonce_text BLOB DEFAULT NULL");
        sQLiteDatabase.execSQL("ALTER TABLE streams ADD COLUMN encryption_key_type INTEGER DEFAULT 0");
        sQLiteDatabase.execSQL("ALTER TABLE videosV2 ADD COLUMN video_preview_proto BLOB DEFAULT NULL");
        sQLiteDatabase.execSQL("ALTER TABLE videosV2 ADD COLUMN download_attempts INTEGER DEFAULT 0");
    }
}
