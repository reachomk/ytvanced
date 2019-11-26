package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;

/* renamed from: cdx */
final class cdx extends cgs {
    public final int a;
    public Bitmap b;
    private final Handler c;
    private final long d;

    cdx(Handler handler, int i, long j) {
        this.c = handler;
        this.a = i;
        this.d = j;
    }

    public final /* synthetic */ void a(Object obj, chb chb) {
        this.b = (Bitmap) obj;
        this.c.sendMessageAtTime(this.c.obtainMessage(1, this), this.d);
    }
}
