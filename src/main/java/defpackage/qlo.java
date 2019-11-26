package defpackage;

/* renamed from: qlo */
final class qlo implements Runnable {
    private final /* synthetic */ qmq a;
    private final /* synthetic */ String b;

    qlo(qmq qmq, String str) {
        this.a = qmq;
        this.b = str;
    }

    public final void run() {
        qmq.a(this.b);
    }
}
