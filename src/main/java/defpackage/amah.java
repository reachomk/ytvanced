package defpackage;

/* renamed from: amah */
final /* synthetic */ class amah implements Runnable {
    private final amae a;
    private final String b;
    private final String c;
    private final ameo d;

    amah(amae amae, String str, String str2, ameo ameo) {
        this.a = amae;
        this.b = str;
        this.c = str2;
        this.d = ameo;
    }

    public final void run() {
        amae amae = this.a;
        String str = this.b;
        String str2 = this.c;
        ameo ameo = this.d;
        for (amaq a : amae.a(str)) {
            a.a(str2, ameo);
        }
    }
}
