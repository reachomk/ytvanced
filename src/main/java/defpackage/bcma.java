package defpackage;

import org.chromium.net.impl.CronetUploadDataStream;
import org.chromium.net.impl.CronetUrlRequest;

/* renamed from: bcma */
public final class bcma implements Runnable {
    private final /* synthetic */ CronetUrlRequest a;

    public bcma(CronetUrlRequest cronetUrlRequest) {
        this.a = cronetUrlRequest;
    }

    public final void run() {
        CronetUploadDataStream cronetUploadDataStream = this.a.f;
        synchronized (cronetUploadDataStream.g) {
            cronetUploadDataStream.i = 2;
        }
        try {
            cronetUploadDataStream.c.f();
            long a = cronetUploadDataStream.b.a();
            cronetUploadDataStream.d = a;
            cronetUploadDataStream.e = a;
        } catch (Throwable th) {
            cronetUploadDataStream.a(th);
        }
        synchronized (cronetUploadDataStream.g) {
            cronetUploadDataStream.i = 3;
        }
        synchronized (this.a.c) {
            if (this.a.e()) {
                return;
            }
            CronetUrlRequest cronetUrlRequest = this.a;
            CronetUploadDataStream cronetUploadDataStream2 = cronetUrlRequest.f;
            long j = cronetUrlRequest.a;
            synchronized (cronetUploadDataStream2.g) {
                cronetUploadDataStream2.h = cronetUploadDataStream2.nativeAttachUploadDataToRequest(j, cronetUploadDataStream2.d);
            }
            this.a.d();
        }
    }
}
