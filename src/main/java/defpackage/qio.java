package defpackage;

/* renamed from: qio */
final /* synthetic */ class qio implements Runnable {
    private final qik a;
    private final qiq b;

    qio(qik qik, qiq qiq) {
        this.a = qik;
        this.b = qiq;
    }

    public final void run() {
        this.a.a(this.b.a);
    }
}
