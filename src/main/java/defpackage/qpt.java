package defpackage;

/* renamed from: qpt */
final class qpt implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ qpu b;

    qpt(qpu qpu, String str) {
        this.b = qpu;
        this.a = str;
    }

    public final void run() {
        this.b.a.a(this.a);
    }
}
