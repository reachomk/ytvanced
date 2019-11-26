package defpackage;

import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: xig */
final class xig extends bckz {
    public final AtomicInteger a = new AtomicInteger(0);
    private final ByteBuffer b = ByteBuffer.allocateDirect(4096);

    private xig() {
    }

    public final void a() {
        while (this.a.getAndDecrement() > 0) {
            xvj.a();
        }
    }

    public final void a(bckx bckx, bclb bclb, String str) {
        bckx.b();
    }

    public final void a(bckx bckx, bclb bclb) {
        bckx.a(this.b);
        String.format(Locale.US, "Prewarm started %s", new Object[]{bclb.a()});
    }

    public final void a(bckx bckx, bclb bclb, ByteBuffer byteBuffer) {
        bckx.a(this.b);
        String.format(Locale.US, "Prewarm completed %s", new Object[]{bclb.a()});
    }

    public final void b(bckx bckx, bclb bclb) {
        String.format(Locale.US, "Prewarm succeeded %s", new Object[]{bclb.a()});
        a();
    }

    public final void a(bckx bckx, bclb bclb, bcjd bcjd) {
        String.format(Locale.US, "Prewarm failed %s", new Object[]{bclb.a()});
        a();
    }

    public final void c(bckx bckx, bclb bclb) {
        a();
    }

    /* synthetic */ xig(byte b) {
    }
}
