package defpackage;

/* renamed from: anvo */
final class anvo {
    public int a;
    public long b;
    public Object c;
    public final anxa d;

    anvo() {
        this.d = anxa.b();
    }

    anvo(anxa anxa) {
        if (anxa != null) {
            this.d = anxa;
            return;
        }
        throw new NullPointerException();
    }
}
