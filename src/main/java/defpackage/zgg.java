package defpackage;

/* renamed from: zgg */
final class zgg implements Runnable {
    private final /* synthetic */ zgd a;

    zgg(zgd zgd) {
        this.a = zgd;
    }

    public final void run() {
        this.a.invalidateSelf();
    }
}
