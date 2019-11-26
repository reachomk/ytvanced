package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: aggk */
final class aggk implements xbt {
    aggk() {
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE channelSubscriptions");
    }
}
