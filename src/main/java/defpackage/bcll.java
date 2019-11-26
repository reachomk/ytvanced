package defpackage;

import org.chromium.net.impl.CronetBidirectionalStream;

/* renamed from: bcll */
public final class bcll implements Runnable {
    private final /* synthetic */ CronetBidirectionalStream a;

    public bcll(CronetBidirectionalStream cronetBidirectionalStream) {
        this.a = cronetBidirectionalStream;
    }

    public final void run() {
        synchronized (this.a.c) {
            if (this.a.d()) {
                return;
            }
            this.a.e = 2;
            try {
                CronetBidirectionalStream cronetBidirectionalStream = this.a;
                cronetBidirectionalStream.a.a(cronetBidirectionalStream, cronetBidirectionalStream.g);
            } catch (Exception e) {
                this.a.a(e);
            }
        }
    }
}
