package defpackage;

import android.media.MediaFormat;

/* renamed from: amfi */
public final class amfi {
    public final long a;
    public final amfn b;
    public final amdr c;
    public long d;
    public MediaFormat e;

    public amfi(amdr amdr, amfn amfn) {
        this.c = amdr;
        this.a = amdr.q;
        this.b = amfn;
    }

    public final MediaFormat a() {
        amqw.b(this.e != null);
        return this.e;
    }

    public static int a(double d) {
        return ((int) Math.round(d / 8.0d)) << 3;
    }
}
