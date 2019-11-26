package defpackage;

/* renamed from: aof */
final class aof implements Runnable {
    private final /* synthetic */ aoa a;

    aof(aoa aoa) {
        this.a = aoa;
    }

    public final void run() {
        amt amt = this.a.e;
        if (amt != null && abe.H(amt) && this.a.e.getCount() > this.a.e.getChildCount()) {
            int childCount = this.a.e.getChildCount();
            aoa aoa = this.a;
            if (childCount <= aoa.k) {
                aoa.r.setInputMethodMode(2);
                this.a.f_();
            }
        }
    }
}
