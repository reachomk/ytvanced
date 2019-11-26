package defpackage;

/* renamed from: aeul */
final /* synthetic */ class aeul implements Runnable {
    private final aety a;
    private final long b;
    private final long c;

    aeul(aety aety, long j, long j2) {
        this.a = aety;
        this.b = j;
        this.c = j2;
    }

    public final void run() {
        this.a.a(this.b, this.c);
    }
}
