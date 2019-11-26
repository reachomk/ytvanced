package defpackage;

/* renamed from: odn */
final class odn extends Thread {
    private final /* synthetic */ odl a;

    odn(odl odl) {
        this.a = odl;
    }

    public final void run() {
        while (this.a.h()) {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        }
    }
}
