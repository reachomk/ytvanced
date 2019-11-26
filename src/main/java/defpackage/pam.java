package defpackage;

/* renamed from: pam */
final /* synthetic */ class pam implements Runnable {
    private final pak a;
    private final String b;
    private final long c;
    private final long d;

    pam(pak pak, String str, long j, long j2) {
        this.a = pak;
        this.b = str;
        this.c = j;
        this.d = j2;
    }

    public final void run() {
        pak pak = this.a;
        pak.a.a(this.b, this.c, this.d);
    }
}
