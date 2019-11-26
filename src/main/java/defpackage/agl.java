package defpackage;

/* renamed from: agl */
final class agl implements Runnable {
    private final /* synthetic */ agi a;

    agl(agi agi) {
        this.a = agi;
    }

    public final void run() {
        this.a.a(true);
        this.a.invalidateSelf();
    }
}
