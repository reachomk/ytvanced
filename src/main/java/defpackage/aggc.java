package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: aggc */
final class aggc implements xbt {
    aggc() {
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        int i = agqq.OFFLINE_IMMEDIATELY.c;
        StringBuilder stringBuilder = new StringBuilder(85);
        stringBuilder.append("ALTER TABLE videosV2 ADD COLUMN stream_transfer_condition INTEGER DEFAULT ");
        stringBuilder.append(i);
        sQLiteDatabase.execSQL(stringBuilder.toString());
    }
}
