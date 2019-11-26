package defpackage;

/* renamed from: yii */
final /* synthetic */ class yii implements Runnable {
    private final Throwable a;

    yii(Throwable th) {
        this.a = th;
    }

    public final void run() {
        throw this.a;
    }
}
