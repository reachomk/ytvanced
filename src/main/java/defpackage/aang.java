package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: aang */
public class aang {
    private final aamf a;
    private final xhf b;
    private final wxm c;
    private final wxj d;
    private final anze e;

    public aang(aamf aamf, xhf xhf, anze anze, wxm wxm, wxj wxj) {
        this.a = (aamf) amqw.a((Object) aamf);
        this.b = (xhf) amqw.a((Object) xhf);
        this.e = (anze) amqw.a((Object) anze);
        this.c = (wxm) amqw.a((Object) wxm);
        this.d = (wxj) amqw.a((Object) wxj);
    }

    @Deprecated
    public final anjv a(aaml aaml) {
        return a(aaml, aniv.a);
    }

    public final anjv a(aaml aaml, Executor executor) {
        aamc a = this.a.a(aaml, this.e, afsw.Z, this.c, this.d);
        return anic.a(this.b.a(a), new aanj(a), executor);
    }

    public final void a(aaml aaml, afsw afsw) {
        this.b.b(this.a.a(aaml, this.e, afsw, this.c, this.d));
    }

    public final anze b(aaml aaml) {
        xak.b();
        afsw a = afsx.a();
        a(aaml, a);
        try {
            return (anze) a.get();
        } catch (InterruptedException | ExecutionException e) {
            throw new aanq(e);
        }
    }
}
