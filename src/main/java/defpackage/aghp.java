package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

/* renamed from: aghp */
public final class aghp {
    public final agfd a;

    public aghp(agfd agfd) {
        this.a = agfd;
    }

    public static void a(SQLiteDatabase sQLiteDatabase) {
        try {
            if (sQLiteDatabase.inTransaction()) {
                sQLiteDatabase.endTransaction();
            }
        } catch (SQLiteException e) {
            xtl.b("Error while terminating OfflineSubscriptions db transaction", e);
        }
    }
}
