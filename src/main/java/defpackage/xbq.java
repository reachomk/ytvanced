package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: xbq */
public final class xbq implements xbt {
    private final String a;

    public xbq(String str) {
        this.a = str;
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        String str = this.a;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 127);
        stringBuilder.append("CREATE TABLE ");
        stringBuilder.append(str);
        stringBuilder.append(" (insertionOrder INTEGER PRIMARY KEY AUTOINCREMENT,key TEXT KEY,value BLOB NOT NULL,sortingValue INTEGER NOT NULL)");
        sQLiteDatabase.execSQL(stringBuilder.toString());
    }
}
