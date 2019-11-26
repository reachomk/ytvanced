package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import java.io.File;
import java.util.Locale;

/* renamed from: xbj */
public abstract class xbj implements xbr {
    private final xbp a;
    private final String b;

    public xbj(xbp xbp, String str) {
        this.a = (xbp) amqw.a((Object) xbp);
        this.b = (String) amqw.a((Object) str);
    }

    public abstract Object a(byte[] bArr);

    public abstract byte[] a(Object obj);

    public abstract long b(Object obj);

    public final void a() {
        a(true);
    }

    public final void a(boolean z) {
        if (z) {
            xak.b();
        }
        this.a.getWritableDatabase().beginTransaction();
    }

    public final void b() {
        b(true);
    }

    public final void b(boolean z) {
        if (z) {
            xak.b();
        }
        this.a.getWritableDatabase().endTransaction();
    }

    public final void c() {
        c(true);
    }

    public final void c(boolean z) {
        if (z) {
            xak.b();
        }
        this.a.getWritableDatabase().setTransactionSuccessful();
    }

    public final void a(String str, Object obj) {
        a(xbl.a(str, obj), true);
    }

    public final void a(xbl xbl, boolean z) {
        if (z) {
            xak.b();
        }
        a(z);
        try {
            b(xbl, z);
            c(z);
        } finally {
            b(z);
        }
    }

    public final void b(xbl xbl, boolean z) {
        Object a;
        ContentValues contentValues = new ContentValues();
        contentValues.put("key", xbl.a);
        contentValues.put("value", a(xbl.b));
        contentValues.put("sortingValue", Long.valueOf(b(xbl.b)));
        String str = xbl.a;
        if (z) {
            xak.b();
        }
        Cursor query = this.a.getReadableDatabase().query(this.b, new String[]{r2}, "key=?", new String[]{str}, null, null, null, null);
        if (query.moveToNext()) {
            a = a(query.getBlob(0));
            query.close();
        } else {
            query.close();
            a = null;
        }
        if (a != null) {
            this.a.getWritableDatabase().update(this.b, contentValues, "key = ?", new String[]{xbl.a});
            return;
        }
        this.a.getWritableDatabase().insert(this.b, null, contentValues);
    }

    public final int a(String str) {
        xak.b();
        return this.a.getWritableDatabase().delete(this.b, "key = ?", new String[]{str});
    }

    public final xbu d() {
        xak.b();
        return new xbm(this, e());
    }

    private final Cursor e() {
        Cursor query = this.a.getReadableDatabase().query(this.b, new String[]{"value", "key"}, null, null, null, null, "sortingValue ASC, insertionOrder ASC");
        try {
            query.getCount();
            return query;
        } catch (SQLException e) {
            String str;
            xbp xbp = this.a;
            String str2 = "";
            if (xbp instanceof xbw) {
                xbw xbw = (xbw) xbp;
                str2 = xbw.getDatabaseName();
                File databasePath = xbw.a.getDatabasePath(xbw.getDatabaseName());
                if (databasePath == null) {
                    str = " is null";
                } else if (!databasePath.exists()) {
                    str = String.format("%s doesn't exist", new Object[]{databasePath.getAbsolutePath()});
                } else if (databasePath.canRead()) {
                    str = String.format("%s is readable", new Object[]{databasePath.getAbsolutePath()});
                } else {
                    str = String.format("%s is not readable", new Object[]{databasePath.getAbsolutePath()});
                }
            } else {
                str = str2;
            }
            throw new xbo(String.format(Locale.US, "%s trying to access db %s: %s", new Object[]{e.toString(), str2, str}));
        }
    }
}
