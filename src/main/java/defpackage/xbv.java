package defpackage;

import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build.VERSION;

/* renamed from: xbv */
public final class xbv {
    public static void a(SQLiteOpenHelper sQLiteOpenHelper, long j) {
        if (VERSION.SDK_INT >= 27) {
            sQLiteOpenHelper.setIdleConnectionTimeout(j);
        }
    }
}
