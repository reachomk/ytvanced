package defpackage;

import android.content.ContentValues;

/* renamed from: uss */
final class uss implements Runnable {
    private final /* synthetic */ ContentValues a;
    private final /* synthetic */ String[] b;
    private final /* synthetic */ usp c;

    uss(usp usp, ContentValues contentValues, String[] strArr) {
        this.c = usp;
        this.a = contentValues;
        this.b = strArr;
    }

    public final void run() {
        this.c.a.getWritableDatabase().update("identity", this.a, "account = ?", this.b);
        this.c.b.open();
    }
}
