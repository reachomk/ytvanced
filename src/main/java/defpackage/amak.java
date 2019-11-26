package defpackage;

/* renamed from: amak */
final /* synthetic */ class amak implements Runnable {
    private final amae a;
    private final String b;
    private final String c;
    private final double d;

    amak(amae amae, String str, String str2, double d) {
        this.a = amae;
        this.b = str;
        this.c = str2;
        this.d = d;
    }

    public final void run() {
        amae amae = this.a;
        String str = this.b;
        String str2 = this.c;
        double d = this.d;
        for (amaq a : amae.a(str)) {
            a.a(str2, d);
        }
    }
}
