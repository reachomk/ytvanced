package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: alwu */
public final class alwu {
    public final uim a;
    public uik b;
    public final amro c = amrn.a(new alwx(this));
    public final amro d = amrn.a(new alww(this));
    public final amro e = amrn.a(new alxc(this));
    public final amro f = amrn.a(new alxf(this));
    public final amro g;
    public final amro h;
    public final amro i;
    public final amro j;
    public final amro k;
    public final amro l;
    private final amro m;
    private final amro n;

    public alwu(ScheduledExecutorService scheduledExecutorService, uil uil, String str) {
        amrn.a(new alxe(this));
        amrn.a(new alxh(this));
        this.m = amrn.a(new alxg(this));
        this.n = amrn.a(new alxj(this));
        amrn.a(new alxi(this));
        this.g = amrn.a(new alxl(this));
        this.h = amrn.a(new alwz(this));
        this.i = amrn.a(new alwy(this));
        this.j = amrn.a(new alxb(this));
        this.k = amrn.a(new alxa(this));
        this.l = amrn.a(new alxd(this));
        this.a = uim.a(str);
        this.b = this.a.c;
        uik uik = this.b;
        if (uik == null) {
            uim uim = this.a;
            uin uin = new uin(uil, scheduledExecutorService, uim);
            uim.c = uin;
            this.b = uin;
            return;
        }
        uik.a(uil);
    }

    public final void a(boolean z) {
        this.b.a(z);
    }

    public final void a(String str, String str2, boolean z) {
        ((uib) this.m.get()).a(str, str2, Boolean.valueOf(z));
    }

    public final void a(boolean z, String str) {
        ((uib) this.n.get()).a(Boolean.valueOf(z), str);
    }
}
