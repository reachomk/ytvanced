package defpackage;

import org.chromium.net.impl.CronetBidirectionalStream;

/* renamed from: bclk */
public final class bclk implements Runnable {
    private final /* synthetic */ bcla a;
    private final /* synthetic */ CronetBidirectionalStream b;

    public bclk(CronetBidirectionalStream cronetBidirectionalStream, bcla bcla) {
        this.b = cronetBidirectionalStream;
        this.a = bcla;
    }

    public final void run() {
        synchronized (this.b.c) {
            if (this.b.d()) {
                return;
            }
            try {
                bciw bciw = this.b;
                bciw.a.a(bciw, bciw.g, this.a);
            } catch (Exception e) {
                this.b.a(e);
            }
        }
    }
}
