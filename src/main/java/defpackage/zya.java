package defpackage;

/* renamed from: zya */
public final class zya implements xhj {
    private final afms a;

    public zya(afms afms) {
        this.a = (afms) amqw.a((Object) afms);
    }

    public final void a(xle xle, bqh bqh) {
        boolean o;
        if (xle instanceof aamc) {
            o = ((aamc) xle).o();
        } else if (xle instanceof aamk) {
            o = ((aamk) xle).o();
        } else {
            return;
        }
        if (o) {
            afsv afsv = (afsv) xle;
            if (this.a.a()) {
                for (String e : afsv.m()) {
                    xtl.e(e);
                }
            }
            if (this.a.c()) {
                bpz bpz = bqh.b;
                if (bpz != null) {
                    bqd bqd = new bqd(bpz.a, bpz.g);
                    xtl.e("Logging response for YouTube API call.");
                    for (String e2 : afsv.b(bqd)) {
                        xtl.e(e2);
                    }
                }
            }
        }
    }
}
