package defpackage;

/* renamed from: amv */
final class amv implements Runnable {
    public final /* synthetic */ amt a;

    amv(amt amt) {
        this.a = amt;
    }

    public final void run() {
        amt amt = this.a;
        amt.b = null;
        amt.drawableStateChanged();
    }
}
