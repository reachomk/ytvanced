package defpackage;

/* renamed from: amam */
final /* synthetic */ class amam implements Runnable {
    private final amae a;
    private final String b;
    private final String c;
    private final amec d;

    amam(amae amae, String str, String str2, amec amec) {
        this.a = amae;
        this.b = str;
        this.c = str2;
        this.d = amec;
    }

    public final void run() {
        amae amae = this.a;
        String str = this.b;
        String str2 = this.c;
        amec amec = this.d;
        for (amaq a : amae.a(str)) {
            a.a(str2, amec);
        }
    }
}
