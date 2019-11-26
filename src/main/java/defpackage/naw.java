package defpackage;

/* renamed from: naw */
final /* synthetic */ class naw implements Runnable {
    private final nau a;
    private final CharSequence b;
    private final CharSequence c;
    private final CharSequence d;

    naw(nau nau, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        this.a = nau;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = charSequence3;
    }

    public final void run() {
        nau nau = this.a;
        nau.a.a(this.b, this.c, this.d);
    }
}
