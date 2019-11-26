package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: agyb */
public final class agyb {
    public static final String[] a = new String[]{"file_path", "status", "status_reason", "bytes_transferred", "bytes_total", "extras", "output_extras", "accountname", "priority", "failure_count"};
    public final Context b;
    public final Object c = new Object();
    public SQLiteDatabase d;

    public agyb(Context context) {
        this.b = context;
    }

    public final void a(agxh agxh) {
        synchronized (this.c) {
            this.d.insert("transfers", null, agyb.d(agxh));
        }
    }

    public final void b(agxh agxh) {
        synchronized (this.c) {
            this.d.update("transfers", agyb.d(agxh), "file_path = ?", new String[]{agxh.a});
        }
    }

    public final void c(agxh agxh) {
        a(agxh.a);
    }

    public final void a(String str) {
        synchronized (this.c) {
            this.d.delete("transfers", "file_path = ?", new String[]{str});
        }
    }

    private static ContentValues d(agxh agxh) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("file_path", agxh.a);
        contentValues.put("status", Integer.valueOf(agxh.b.ordinal()));
        contentValues.put("status_reason", Integer.valueOf(agxh.c));
        contentValues.put("bytes_transferred", Long.valueOf(agxh.d));
        contentValues.put("bytes_total", Long.valueOf(agxh.e));
        contentValues.put("extras", agxh.f.a());
        contentValues.put("output_extras", agxh.g.a());
        contentValues.put("accountname", agxh.h);
        contentValues.put("priority", Integer.valueOf(agxh.i));
        contentValues.put("failure_count", Integer.valueOf(agxh.j));
        return contentValues;
    }
}
