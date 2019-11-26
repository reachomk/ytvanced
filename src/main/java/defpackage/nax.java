package defpackage;

/* renamed from: nax */
final /* synthetic */ class nax implements Runnable {
    private final nau a;
    private final CharSequence b;
    private final CharSequence c;
    private final boolean d;
    private final CharSequence e;
    private final int f;
    private final CharSequence g;
    private final int h;

    nax(nau nau, CharSequence charSequence, CharSequence charSequence2, boolean z, CharSequence charSequence3, int i, CharSequence charSequence4, int i2) {
        this.a = nau;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = z;
        this.e = charSequence3;
        this.f = i;
        this.g = charSequence4;
        this.h = i2;
    }

    public final void run() {
        nau nau = this.a;
        nau.a.a(this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }
}
