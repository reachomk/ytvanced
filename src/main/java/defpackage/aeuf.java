package defpackage;

/* renamed from: aeuf */
final /* synthetic */ class aeuf implements Runnable {
    private final aety a;
    private final long b;

    aeuf(aety aety, long j) {
        this.a = aety;
        this.b = j;
    }

    public final void run() {
        this.a.b(this.b);
    }
}
