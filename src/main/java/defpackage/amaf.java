package defpackage;

/* renamed from: amaf */
final /* synthetic */ class amaf implements Runnable {
    private final amae a;
    private final String b;
    private final String c;
    private final boolean d;
    private final boolean e;

    amaf(amae amae, String str, String str2, boolean z, boolean z2) {
        this.a = amae;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = z2;
    }

    public final void run() {
        amae amae = this.a;
        String str = this.b;
        String str2 = this.c;
        boolean z = this.d;
        boolean z2 = this.e;
        for (amaq a : amae.a(str)) {
            a.a(str2, z, z2);
        }
    }
}
