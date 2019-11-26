package defpackage;

/* renamed from: ajfo */
final /* synthetic */ class ajfo implements Runnable {
    private final ajfm a;
    private final afpt b;

    ajfo(ajfm ajfm, afpt afpt) {
        this.a = ajfm;
        this.b = afpt;
    }

    public final void run() {
        this.a.a(this.b);
    }
}
