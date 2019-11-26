package defpackage;

/* renamed from: acnh */
final /* synthetic */ class acnh implements Runnable {
    private final acnc a;
    private final boolean b;
    private final int c;

    acnh(acnc acnc, boolean z, int i) {
        this.a = acnc;
        this.b = z;
        this.c = i;
    }

    public final void run() {
        this.a.a(this.b, this.c);
    }
}
