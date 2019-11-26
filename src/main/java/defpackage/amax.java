package defpackage;

/* renamed from: amax */
public final /* synthetic */ class amax implements Runnable {
    private final amav a;

    public amax(amav amav) {
        this.a = amav;
    }

    public final void run() {
        amav amav = this.a;
        if (!amav.e) {
            amav.e = true;
            amav.c();
        }
    }
}
