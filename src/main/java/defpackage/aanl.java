package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: aanl */
public class aanl {
    private final aamn a;
    private final xhf b;
    private final wxm c;
    private final Class d;

    public aanl(aamn aamn, xhf xhf, Class cls, wxm wxm) {
        this.a = (aamn) amqw.a((Object) aamn);
        this.b = (xhf) amqw.a((Object) xhf);
        this.d = (Class) amqw.a((Object) cls);
        this.c = (wxm) amqw.a((Object) wxm);
    }

    @Deprecated
    public final anjv a(aaml aaml) {
        return a(aaml, aniv.a);
    }

    public final anjv a(aaml aaml, Executor executor) {
        aamk a = this.a.a(aaml, this.d, afsw.Z, this.c);
        return anic.a(this.b.a(a), new aank(a), executor);
    }

    public final void a(aaml aaml, afsw afsw) {
        this.b.b(this.a.a(aaml, this.d, afsw, this.c));
    }

    public final aoca b(aaml aaml) {
        xak.b();
        afsw a = afsx.a();
        a(aaml, a);
        try {
            return (aoca) a.get();
        } catch (InterruptedException | ExecutionException e) {
            throw new aanq(e);
        }
    }
}
