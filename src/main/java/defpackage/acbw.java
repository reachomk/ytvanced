package defpackage;

/* renamed from: acbw */
final class acbw implements aceh {
    private final /* synthetic */ acay a;

    public final void a(Object obj) {
        if (obj instanceof auhk) {
            auhk auhk = (auhk) obj;
            achm achm = this.a.k;
            if (achm != null) {
                int h = achm.h();
                auhk.copyOnWrite();
                auhl auhl = (auhl) auhk.instance;
                auhl.a |= 2048;
                auhl.m = h / 1000;
                h = this.a.k.h();
                auhk.copyOnWrite();
                auhl = (auhl) auhk.instance;
                auhl.a |= 512;
                auhl.k = h / 1000;
                h = this.a.k.h();
                auhk.copyOnWrite();
                auhl auhl2 = (auhl) auhk.instance;
                auhl2.a |= 1024;
                auhl2.l = h / 1000;
            }
        }
    }

    /* synthetic */ acbw(acay acay) {
        this.a = acay;
    }
}
