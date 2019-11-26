package defpackage;

import com.google.android.libraries.youtube.offline.transfer.service.OfflineTransferService;

/* renamed from: dkn */
final class dkn implements agzj {
    public volatile Object a = new baqe();
    public volatile bcaa b;
    public volatile Object c = new baqe();
    public volatile Object d = new baqe();
    public volatile Object e = new baqe();
    public volatile Object f = new baqe();
    public final /* synthetic */ diu g;
    private volatile bcaa h;
    private volatile bcaa i;
    private volatile bcaa j;
    private volatile bcaa k;
    private volatile bcaa l;
    private volatile bcaa m;

    public final bcaa a() {
        bcaa bcaa = this.h;
        if (bcaa != null) {
            return bcaa;
        }
        dko dko = new dko(this, 1);
        this.h = dko;
        return dko;
    }

    private final bcaa b() {
        bcaa bcaa = this.j;
        if (bcaa != null) {
            return bcaa;
        }
        dko dko = new dko(this, 2);
        this.j = dko;
        return dko;
    }

    public final agyq oP() {
        return new dkm(this);
    }

    public final void a(OfflineTransferService offlineTransferService) {
        offlineTransferService.g = this.g.oy();
        offlineTransferService.h = this.g.ox();
        offlineTransferService.i = this.g.kQ();
        offlineTransferService.j = (amro) this.g.cT();
        offlineTransferService.k = this.g.dn();
        offlineTransferService.l = this.g.kR();
        offlineTransferService.m = this.g.kX();
        offlineTransferService.n = this.g.kY();
        offlineTransferService.o = this.g.dr();
        diu diu = this.g;
        Object obj = diu.cl;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = diu.cl;
                if (obj2 instanceof baqe) {
                    agpl agpl = new agpl(diu.oy(), diu.ox(), diu.ga(), diu.dt(), diu.dr());
                    diu.cl = bapx.a(diu.cl, agpl);
                }
            }
            obj = obj2;
        }
        offlineTransferService.p = (agpl) obj;
        offlineTransferService.q = this.g.i();
        offlineTransferService.r = this.g.dj();
        amuu a = amur.a(6);
        Integer valueOf = Integer.valueOf(1);
        Object obj3 = this.i;
        if (obj3 == null) {
            obj3 = new dko(this, 0);
            this.i = obj3;
        }
        a = a.b(valueOf, obj3).b(Integer.valueOf(4), b()).b(Integer.valueOf(7), b());
        Integer valueOf2 = Integer.valueOf(3);
        Object obj4 = this.k;
        if (obj4 == null) {
            obj4 = new dko(this, 4);
            this.k = obj4;
        }
        a = a.b(valueOf2, obj4);
        valueOf = Integer.valueOf(2);
        obj3 = this.l;
        if (obj3 == null) {
            obj3 = new dko(this, 5);
            this.l = obj3;
        }
        a = a.b(valueOf, obj3);
        valueOf = Integer.valueOf(5);
        obj3 = this.m;
        if (obj3 == null) {
            obj3 = new dko(this, 6);
            this.m = obj3;
        }
        offlineTransferService.s = a.b(valueOf, obj3).b();
        offlineTransferService.t = amqp.b(this.g.gh());
    }

    /* synthetic */ dkn(diu diu) {
        this.g = diu;
    }
}
