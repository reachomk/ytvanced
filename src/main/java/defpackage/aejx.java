package defpackage;

/* renamed from: aejx */
final /* synthetic */ class aejx implements Runnable {
    private final aejy a;
    private final InterruptedException b;

    aejx(aejy aejy, InterruptedException interruptedException) {
        this.a = aejy;
        this.b = interruptedException;
    }

    public final void run() {
        aejy aejy = this.a;
        aejy.a.a(this.b);
    }
}
