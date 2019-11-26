package defpackage;

/* renamed from: aciy */
final class aciy implements Runnable {
    private final /* synthetic */ int a;
    private final /* synthetic */ int b;
    private final /* synthetic */ acis c;

    aciy(acis acis, int i, int i2) {
        this.c = acis;
        this.a = i;
        this.b = i2;
    }

    public final void run() {
        acjb acjb = this.c.g;
        if (acjb != null) {
            acjb.a(this.a, this.b);
        }
    }
}
