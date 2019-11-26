package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: xbn */
public final class xbn implements xbt {
    private final String a;

    public xbn(String str) {
        this.a = str;
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        String valueOf = String.valueOf(this.a);
        String str = "DROP TABLE IF EXISTS ";
        sQLiteDatabase.execSQL(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
    }
}
