package defpackage;

import android.graphics.Bitmap;
import java.util.concurrent.CountDownLatch;

/* renamed from: uom */
public final class uom extends uok {
    public final CountDownLatch c = new CountDownLatch(1);
    public Bitmap d;
    private final int e;

    public uom(int i) {
        super(10);
        this.e = i;
    }

    public final int a() {
        return this.e;
    }

    public final boolean a(int i) {
        return this.e == i;
    }

    public final void a(int i, Bitmap bitmap) {
        uhy.b(this.e == i);
        this.d = bitmap;
    }

    public final int b() {
        return this.d == null ? this.e : -1;
    }

    public final void c() {
        this.c.countDown();
    }

    public final void a(Exception exception) {
        ujo.a("Failed to extract thumbnail for video", exception);
        this.c.countDown();
    }
}
