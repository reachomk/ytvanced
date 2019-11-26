package defpackage;

/* renamed from: amij */
final /* synthetic */ class amij implements Runnable {
    private final amii a;
    private final String b;

    amij(amii amii, String str) {
        this.a = amii;
        this.b = str;
    }

    public final void run() {
        amii amii = this.a;
        String str = this.b;
        amii.a(str, false);
        amii.a(str);
    }
}
