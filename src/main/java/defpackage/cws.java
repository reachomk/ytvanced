package defpackage;

/* renamed from: cws */
final class cws implements cyi {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ boolean b;
    private final /* synthetic */ cwh c;
    private final /* synthetic */ cwc d;
    private final /* synthetic */ cwo e;

    cws(cwo cwo, boolean z, boolean z2, cwh cwh, cwc cwc) {
        this.e = cwo;
        this.a = z;
        this.b = z2;
        this.c = cwh;
        this.d = cwc;
    }

    public final void a() {
        if (this.a) {
            if (this.b) {
                cno.a();
            }
            try {
                cwo cwo = this.e;
                cwh cwh = this.c;
                if (cwh != null) {
                    cwo.b(cwh);
                }
                if (this.b) {
                    cno.c();
                }
            } catch (Throwable th) {
                if (this.b) {
                    cno.c();
                }
            }
        }
    }

    public final void a(boolean z, long j) {
        cwo cwo = this.e;
        cwh cwh = this.c;
        boolean z2 = this.a;
        cwc cwc = this.d;
        if (cwh != null) {
            cwo.a(cwh, z2, z, j, cwc);
        }
    }
}
