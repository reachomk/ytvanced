package defpackage;

import org.chromium.net.impl.CronetBidirectionalStream;
import org.chromium.net.impl.CronetUrlRequestContext;

/* renamed from: bcln */
public final class bcln implements Runnable {
    private final /* synthetic */ CronetBidirectionalStream a;

    public bcln(CronetBidirectionalStream cronetBidirectionalStream) {
        this.a = cronetBidirectionalStream;
    }

    public final void run() {
        try {
            CronetBidirectionalStream cronetBidirectionalStream = this.a;
            cronetBidirectionalStream.a.c(cronetBidirectionalStream, cronetBidirectionalStream.g);
        } catch (Exception e) {
            bchu.c(CronetUrlRequestContext.a, "Exception in onCanceled method", e);
        }
    }
}
