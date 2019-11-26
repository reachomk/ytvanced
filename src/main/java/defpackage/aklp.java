package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;

/* renamed from: aklp */
final /* synthetic */ class aklp implements Runnable {
    private final brj a;
    private final int b = aocf.UNSET_ENUM_VALUE;
    private final int c = aocf.UNSET_ENUM_VALUE;
    private final wxg d;
    private final Uri e;

    aklp(brj brj, wxg wxg, Uri uri) {
        this.a = brj;
        this.d = wxg;
        this.e = uri;
    }

    public final void run() {
        brj brj = this.a;
        int i = this.b;
        int i2 = this.c;
        wxg wxg = this.d;
        Object obj = this.e;
        try {
            wxg.a(obj, (Bitmap) brj.a(i, i2).get());
        } catch (Exception e) {
            wxg.a(obj, e);
        }
    }
}
