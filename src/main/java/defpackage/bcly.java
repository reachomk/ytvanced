package defpackage;

import org.chromium.net.impl.CronetUploadDataStream;

/* renamed from: bcly */
public final class bcly implements Runnable {
    private final /* synthetic */ CronetUploadDataStream a;

    public bcly(CronetUploadDataStream cronetUploadDataStream) {
        this.a = cronetUploadDataStream;
    }

    public final void run() {
        try {
            this.a.b();
            this.a.b.close();
        } catch (Exception e) {
            bchu.c(CronetUploadDataStream.a, "Exception thrown when closing", e);
        }
    }
}
