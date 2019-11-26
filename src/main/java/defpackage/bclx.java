package defpackage;

import org.chromium.net.impl.CronetUploadDataStream;

/* renamed from: bclx */
public final class bclx implements Runnable {
    private final /* synthetic */ CronetUploadDataStream a;

    public bclx(CronetUploadDataStream cronetUploadDataStream) {
        this.a = cronetUploadDataStream;
    }

    public final void run() {
        synchronized (this.a.g) {
            CronetUploadDataStream cronetUploadDataStream = this.a;
            if (cronetUploadDataStream.h == 0) {
                return;
            }
            cronetUploadDataStream.a(3);
            cronetUploadDataStream = this.a;
            if (cronetUploadDataStream.f != null) {
                cronetUploadDataStream.i = 0;
                try {
                    this.a.b();
                    CronetUploadDataStream cronetUploadDataStream2 = this.a;
                    cronetUploadDataStream2.b.a(cronetUploadDataStream2, cronetUploadDataStream2.f);
                    return;
                } catch (Exception e) {
                    this.a.a(e);
                    return;
                }
            }
            throw new IllegalStateException("Unexpected readData call. Buffer is null");
        }
    }
}
