package defpackage;

/* renamed from: amim */
final /* synthetic */ class amim implements Runnable {
    private final amii a;
    private final String b;

    amim(amii amii, String str) {
        this.a = amii;
        this.b = str;
    }

    public final void run() {
        this.a.a(this.b);
    }
}
