package defpackage;

import android.net.Uri;
import java.io.IOException;

/* renamed from: gje */
final /* synthetic */ class gje implements Runnable {
    private final gjf a;
    private final Uri b;
    private final byte[] c;
    private final wxg d;
    private final Uri e;
    private final int f;

    gje(gjf gjf, Uri uri, byte[] bArr, wxg wxg, Uri uri2, int i) {
        this.a = gjf;
        this.b = uri;
        this.c = bArr;
        this.d = wxg;
        this.e = uri2;
        this.f = i;
    }

    public final void run() {
        gjf gjf = this.a;
        Object obj = this.b;
        byte[] bArr = this.c;
        wxg wxg = this.d;
        Object obj2 = this.e;
        int i = this.f;
        gjd gjd = gjf.a;
        xak.b();
        gjm gjm = gjd.e;
        String lastPathSegment = obj.getLastPathSegment();
        xak.b();
        zjj zjj = gjm.a;
        if (zjj == null || !zjj.a(lastPathSegment, bArr)) {
            wxg.a(obj, new IOException());
            return;
        }
        if (gjd.a(obj2)) {
            bArr = gjd.a(bArr, i);
        }
        gjf.a.a((Uri) obj2, bArr);
        try {
            wxg.a(obj, gjf.a.c.a(bArr));
        } catch (xwd e) {
            wxg.a(obj2, e);
        }
    }
}
