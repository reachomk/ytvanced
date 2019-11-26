package defpackage;

import org.chromium.net.impl.CronetUrlRequest;

/* renamed from: bcmh */
public final class bcmh implements Runnable {
    private final /* synthetic */ bcko a;
    private final /* synthetic */ CronetUrlRequest b;

    public bcmh(CronetUrlRequest cronetUrlRequest, bcko bcko) {
        this.b = cronetUrlRequest;
        this.a = bcko;
    }

    public final void run() {
        this.b.e.a(this.a);
    }
}
