package defpackage;

/* renamed from: obx */
final /* synthetic */ class obx implements Runnable {
    private final obr a;
    private final int b;

    obx(obr obr, int i) {
        this.a = obr;
        this.b = i;
    }

    public final void run() {
        obr obr = this.a;
        obr.a.b(this.b);
    }
}
