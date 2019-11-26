package defpackage;

/* renamed from: amag */
final /* synthetic */ class amag implements Runnable {
    private final amae a;
    private final String b;
    private final String c;
    private final boolean d;

    amag(amae amae, String str, String str2, boolean z) {
        this.a = amae;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public final void run() {
        amae amae = this.a;
        String str = this.b;
        String str2 = this.c;
        boolean z = this.d;
        for (amaq a : amae.a(str)) {
            a.a(str2, z);
        }
    }
}
