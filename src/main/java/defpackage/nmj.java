package defpackage;

/* renamed from: nmj */
final class nmj implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ long b;
    private final /* synthetic */ long c;
    private final /* synthetic */ nmi d;

    nmj(nmi nmi, String str, long j, long j2) {
        this.d = nmi;
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    public final void run() {
        this.d.c.a(this.a, this.b, this.c);
    }
}
