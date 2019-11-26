package defpackage;

import org.chromium.net.impl.CronetUploadDataStream;

/* renamed from: bclz */
public final class bclz implements Runnable {
    private final /* synthetic */ CronetUploadDataStream a;

    public bclz(CronetUploadDataStream cronetUploadDataStream) {
        this.a = cronetUploadDataStream;
    }

    public final void run() {
        synchronized (this.a.g) {
            CronetUploadDataStream cronetUploadDataStream = this.a;
            if (cronetUploadDataStream.h == 0) {
                return;
            }
            cronetUploadDataStream.a(3);
            this.a.i = 1;
            try {
                this.a.b();
                CronetUploadDataStream cronetUploadDataStream2 = this.a;
                cronetUploadDataStream2.b.a(cronetUploadDataStream2);
            } catch (Exception e) {
                this.a.a(e);
            }
        }
    }
}
