package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: utp */
final class utp implements xbt {
    utp() {
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE identity ADD COLUMN profile_account_name_proto BLOB");
        sQLiteDatabase.execSQL("ALTER TABLE identity ADD COLUMN profile_account_photo_thumbnails_proto BLOB");
        sQLiteDatabase.execSQL("ALTER TABLE identity ADD COLUMN profile_mobile_banner_thumbnails_proto BLOB");
    }
}
