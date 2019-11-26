package defpackage;

import android.net.Uri;

/* renamed from: hkw */
final /* synthetic */ class hkw implements xao {
    private final hku a;
    private final qg b;
    private final String c;
    private final int d;
    private final Uri e;
    private final boolean f;

    hkw(hku hku, qg qgVar, String str, int i, Uri uri, boolean z) {
        this.a = hku;
        this.b = qgVar;
        this.c = str;
        this.d = i;
        this.e = uri;
        this.f = z;
    }

    public final void accept(Object obj) {
        this.a.a(this.b, this.c, this.d, this.e, this.f);
    }

    public final void accept(Throwable th) {
        this.a.a(this.b, this.c, this.d, this.e, this.f);
    }
}
