package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;

/* renamed from: hkz */
final /* synthetic */ class hkz implements xar {
    private final hku a;
    private final qg b;
    private final String c;
    private final int d;
    private final Uri e;
    private final boolean f;

    hkz(hku hku, qg qgVar, String str, int i, Uri uri, boolean z) {
        this.a = hku;
        this.b = qgVar;
        this.c = str;
        this.d = i;
        this.e = uri;
        this.f = z;
    }

    public final void accept(Object obj) {
        amqp amqp = (amqp) obj;
        this.a.a(this.b, amqp.a() ? (Bitmap) ((alug) amqp.b()).a() : null, this.c, this.d, this.e, false, this.f);
    }
}
