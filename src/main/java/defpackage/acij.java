package defpackage;

/* renamed from: acij */
final class acij implements aceh {
    private final /* synthetic */ acih a;

    public final void a(Object obj) {
        if (obj instanceof auhk) {
            auhk auhk = (auhk) obj;
            int i = this.a.m;
            auhk.copyOnWrite();
            auhl auhl = (auhl) auhk.instance;
            auhl.a |= 128;
            auhl.i = i;
            i = this.a.n;
            auhk.copyOnWrite();
            auhl = (auhl) auhk.instance;
            auhl.a |= 256;
            auhl.j = i;
            long j = this.a.l;
            auhk.copyOnWrite();
            auhl auhl2 = (auhl) auhk.instance;
            auhl2.a |= 2;
            auhl2.c = j / 1000;
            if (auhk.a().d > 0 && auhk.a().c > 0) {
                j = auhk.a().d - auhk.a().c;
                if (j > 0) {
                    long j2 = (this.a.r * 1000) / j;
                    auhk.copyOnWrite();
                    auhl auhl3 = (auhl) auhk.instance;
                    auhl3.a |= 8;
                    auhl3.e = (float) j2;
                }
            }
            this.a.r = 0;
        }
    }

    /* synthetic */ acij(acih acih) {
        this.a = acih;
    }
}
