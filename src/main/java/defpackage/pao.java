package defpackage;

/* renamed from: pao */
final /* synthetic */ class pao implements Runnable {
    private final pak a;
    private final int b;
    private final long c;

    pao(pak pak, int i, long j) {
        this.a = pak;
        this.b = i;
        this.c = j;
    }

    public final void run() {
        pak pak = this.a;
        pak.a.a(this.b, this.c);
    }
}
