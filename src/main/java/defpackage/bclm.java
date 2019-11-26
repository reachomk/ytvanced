package defpackage;

import org.chromium.net.impl.CronetBidirectionalStream;

/* renamed from: bclm */
public final class bclm implements Runnable {
    private final /* synthetic */ bcjd a;
    private final /* synthetic */ CronetBidirectionalStream b;

    public bclm(CronetBidirectionalStream cronetBidirectionalStream, bcjd bcjd) {
        this.b = cronetBidirectionalStream;
        this.a = bcjd;
    }

    public final void run() {
        this.b.a(this.a);
    }
}
