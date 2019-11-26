package defpackage;

import android.content.ContentValues;

/* renamed from: usu */
final class usu implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ ContentValues b;
    private final /* synthetic */ usp c;

    usu(usp usp, String str, ContentValues contentValues) {
        this.c = usp;
        this.a = str;
        this.b = contentValues;
    }

    public final void run() {
        this.c.a.getWritableDatabase().insertWithOnConflict(this.a, null, this.b, 5);
        this.c.b.open();
    }
}
