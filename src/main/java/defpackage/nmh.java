package defpackage;

/* renamed from: nmh */
final class nmh implements Runnable {
    private final /* synthetic */ nmm a;
    private final /* synthetic */ nmi b;

    nmh(nmi nmi, nmm nmm) {
        this.b = nmi;
        this.a = nmm;
    }

    public final void run() {
        this.b.c.a(this.a);
    }
}
