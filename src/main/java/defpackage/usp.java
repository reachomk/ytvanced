package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.ConditionVariable;
import java.util.concurrent.Executor;

/* renamed from: usp */
final class usp {
    public final xbp a;
    public final ConditionVariable b = new ConditionVariable(true);
    public final Executor c;

    usp(xbp xbp, Executor executor) {
        this.a = (xbp) amqw.a((Object) xbp);
        this.c = (Executor) amqw.a((Object) executor);
    }

    /* Access modifiers changed, original: final */
    public final void a(String str) {
        a("profile", "id = ?", new String[]{str});
    }

    /* Access modifiers changed, original: final */
    public final afpt b(String str) {
        this.b.block();
        Cursor a = a("identity", utt.a, str);
        try {
            if (a.moveToFirst()) {
                ust a2 = usp.a(a);
                a.close();
                return a2;
            }
            a.close();
            return null;
        } catch (Throwable th) {
            if (a != null) {
                a.close();
            }
        }
    }

    public final Cursor a(String str, String[] strArr, String str2) {
        return this.a.getReadableDatabase().query(str, strArr, "id = ?", new String[]{str2}, null, null, null, "1");
    }

    public final void a(String str, String str2, String[] strArr) {
        this.b.close();
        this.c.execute(new usr(this, str, str2, strArr));
    }

    public final void a(String str, ContentValues contentValues) {
        this.b.close();
        this.c.execute(new usu(this, str, contentValues));
    }

    public static ust a(Cursor cursor) {
        if (cursor.getInt(3) == 1) {
            return ust.a(cursor.getString(0), cursor.getString(1), cursor.getString(4));
        }
        return ust.a(cursor.getString(0), cursor.getString(1), (1 ^ cursor.isNull(2)) != 0 ? cursor.getString(2) : null, cursor.getString(4));
    }

    public static void a(ContentValues contentValues, String str, aaft aaft) {
        if (aaft == null || !aaft.a()) {
            contentValues.putNull(str);
        } else {
            contentValues.put(str, aaft.d().toByteArray());
        }
    }
}
