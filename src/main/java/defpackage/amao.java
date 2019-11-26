package defpackage;

/* renamed from: amao */
final /* synthetic */ class amao implements Runnable {
    private final amae a;
    private final String b;
    private final String c;
    private final int d;

    amao(amae amae, String str, String str2, int i) {
        this.a = amae;
        this.b = str;
        this.c = str2;
        this.d = i;
    }

    public final void run() {
        amae amae = this.a;
        String str = this.b;
        String str2 = this.c;
        int i = this.d;
        for (amaq a : amae.a(str)) {
            a.a(str2, i);
        }
    }
}
