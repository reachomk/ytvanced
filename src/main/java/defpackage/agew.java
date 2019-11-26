package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: agew */
public final class agew {
    public final agfd a;
    public final List b = new ArrayList();
    private final bcaa c;

    public agew(agfd agfd, bcaa bcaa) {
        this.a = agfd;
        this.c = bcaa;
    }

    public final agpy a(String str) {
        Cursor query = this.a.a().query("channelsV13", agev.a, "id = ?", new String[]{str}, null, null, null, null);
        try {
            if (query.moveToNext()) {
                agpy a = new aget(query, (agpi) this.c.get()).a();
                return a;
            }
            query.close();
            return null;
        } finally {
            query.close();
        }
    }

    public static void a(SQLiteDatabase sQLiteDatabase) {
        try {
            if (sQLiteDatabase.inTransaction()) {
                sQLiteDatabase.endTransaction();
            }
        } catch (SQLiteException e) {
            xtl.b("Error while terminating OfflineChannels db transaction", e);
        }
    }

    public static ContentValues a(agpy agpy) {
        avnc avnc = agpy.d;
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", agpy.a);
        contentValues.put("offline_channel_data_proto", avnc.toByteArray());
        return contentValues;
    }
}
