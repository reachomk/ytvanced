package defpackage;

/* renamed from: aeuc */
final /* synthetic */ class aeuc implements Runnable {
    private final aety a;
    private final long b;

    aeuc(aety aety, long j) {
        this.a = aety;
        this.b = j;
    }

    public final void run() {
        this.a.a(this.b);
    }
}
