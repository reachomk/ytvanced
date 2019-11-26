package defpackage;

/* renamed from: amba */
public final /* synthetic */ class amba implements Runnable {
    private final amav a;

    public amba(amav amav) {
        this.a = amav;
    }

    public final void run() {
        amav amav = this.a;
        if (amav.e) {
            amav.e = false;
            amav.c();
        }
    }
}
