package defpackage;

/* renamed from: acdm */
final class acdm implements aceh {
    private final /* synthetic */ acdg a;

    public final void a(Object obj) {
        if (obj instanceof auhk) {
            auhk auhk = (auhk) obj;
            int i = this.a.p;
            auhk.copyOnWrite();
            auhl auhl = (auhl) auhk.instance;
            auhl.a |= 8192;
            auhl.o = i / 1000;
            i = this.a.e;
            auhk.copyOnWrite();
            auhl = (auhl) auhk.instance;
            auhl.a |= 64;
            auhl.h = i / 1000;
            i = this.a.m;
            auhk.copyOnWrite();
            auhl = (auhl) auhk.instance;
            auhl.a |= 16;
            auhl.f = i / 1000;
            auhk.a((int) (this.a.g.b() / 1000.0d));
            if (auhk.a().d > 0 && auhk.a().c > 0) {
                long j = auhk.a().d - auhk.a().c;
                if (j > 0) {
                    auhk.a((int) ((this.a.y * 1000) / j));
                }
            }
            this.a.y = 0;
        }
    }

    /* synthetic */ acdm(acdg acdg) {
        this.a = acdg;
    }
}
