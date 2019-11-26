package defpackage;

import java.io.InputStream;

/* renamed from: bbar */
final class bbar implements Runnable {
    private final /* synthetic */ InputStream a;
    private final /* synthetic */ bbah b;

    bbar(bbah bbah, InputStream inputStream) {
        this.b = bbah;
        this.a = inputStream;
    }

    public final void run() {
        this.b.a.a(this.a);
    }
}
