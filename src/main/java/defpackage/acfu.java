package defpackage;

/* renamed from: acfu */
final /* synthetic */ class acfu implements Runnable {
    private final acfh a;
    private final int b;
    private final String c;
    private final aqhy d;

    acfu(acfh acfh, int i, String str, aqhy aqhy) {
        this.a = acfh;
        this.b = i;
        this.c = str;
        this.d = aqhy;
    }

    public final void run() {
        this.a.a(this.b, this.c, this.d);
    }
}
