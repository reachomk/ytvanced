package defpackage;

import android.util.Range;

/* renamed from: ahsy */
public final class ahsy {
    public ahsv a;
    public ahsv b;
    public ahss c;
    public ahss d;
    public ahtg e;
    public ahtg f;
    public ahtg g;
    public Range h;
    public ahtf i;
    public ahtf j;
    private ahtf k;

    public final void a(ahtc ahtc) {
        float f = ahtc.d;
        if (f <= 0.0f) {
            f = ahtc.c;
        }
        this.k = new ahtf(1024, new ahtd(new ahth(ahtc.f, ahtc.g, f, ahtc.e, ahtc.h, ahtc.i), ahtc));
    }

    public final byte[] a() {
        return this.k.a;
    }
}
