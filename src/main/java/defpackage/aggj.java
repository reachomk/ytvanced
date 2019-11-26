package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: aggj */
final class aggj implements xbt {
    aggj() {
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE video_listsV13 ADD COLUMN format_type INTEGER DEFAULT 0");
        int i = agqq.OFFLINE_IMMEDIATELY.c;
        StringBuilder stringBuilder = new StringBuilder(91);
        stringBuilder.append("ALTER TABLE video_listsV13 ADD COLUMN stream_transfer_condition INTEGER DEFAULT ");
        stringBuilder.append(i);
        sQLiteDatabase.execSQL(stringBuilder.toString());
        sQLiteDatabase.execSQL("ALTER TABLE video_listsV13 ADD COLUMN source_ve_type INTEGER DEFAULT 0");
        sQLiteDatabase.execSQL("ALTER TABLE video_listsV13 ADD COLUMN tracking_params BLOB DEFAULT NULL");
    }
}
