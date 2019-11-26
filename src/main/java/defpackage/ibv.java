package defpackage;

/* renamed from: ibv */
public final class ibv implements vvd {
    public final wac a;
    public final acvx b;
    public final vrk c;
    public final int d;
    public vzr e;
    public icq f;
    public icp g;
    public final vzp h = new vzp();
    public wad i;
    public vzu j;
    public vzx k;
    public wae l;
    public boolean m;
    public boolean n;

    public ibv(wac wac, acvx acvx, vrk vrk, int i) {
        this.a = wac;
        this.b = acvx;
        this.c = vrk;
        this.d = i;
        this.n = false;
    }

    public final void a(wae wae) {
        this.l = (wae) amqw.a((Object) wae);
        this.a.f = wae;
        vzx vzx = this.k;
        if (vzx != null) {
            vzx.a = wae;
        }
    }

    public final void a(vxc vxc) {
        boolean a = vvc.a(vxc, 2);
        this.e.b(vxc.i(), a);
        icq icq = this.f;
        vxi k = vxc.k();
        vxd b = k.b();
        if (!b.equals(icq.b.b())) {
            icp icp = icq.a;
            CharSequence charSequence = b.b;
            CharSequence charSequence2 = b.c;
            aygk aygk = b.d;
            if (aygk == null) {
                aygk = null;
            }
            icp.a(charSequence, charSequence2, aygk);
        }
        icq.b = k;
        this.h.b(Boolean.valueOf(a), vxc.c());
        this.i.b(vxc.g(), a);
        this.j.b(vxc.l(), a);
        this.k.b(vxc.m(), a);
    }
}
