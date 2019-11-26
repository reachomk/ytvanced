package defpackage;

/* renamed from: acgg */
final /* synthetic */ class acgg implements Runnable {
    private final acfm a;
    private final int b;
    private final String c;

    acgg(acfm acfm, int i, String str) {
        this.a = acfm;
        this.b = i;
        this.c = str;
    }

    public final void run() {
        this.a.a(this.b, this.c);
    }
}
