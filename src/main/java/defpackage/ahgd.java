package defpackage;

import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: ahgd */
public class ahgd {
    public final aiyx a;
    public final bapu b;
    private final ajbp c;
    private final Executor d;
    private final bdfu e = new bdfu();

    public ahgd(aiyx aiyx, ajbp ajbp, bapu bapu, Executor executor) {
        this.a = aiyx;
        this.c = ajbp;
        this.b = bapu;
        this.d = executor;
    }

    public void a() {
        bdfu bdfu = this.e;
        if (!bdfu.b) {
            Object obj;
            synchronized (bdfu) {
                obj = null;
                if (!bdfu.b) {
                    Set set = bdfu.a;
                    if (set != null) {
                        if (!set.isEmpty()) {
                            obj = 1;
                        }
                    }
                }
            }
            if (obj != null) {
                return;
            }
        }
        this.e.a(this.c.a.a(new ahgg(this), ahgf.a));
    }

    public void a(ahkn ahkn) {
        if (ahkn.a == airi.ENDED) {
            ((ahgk) this.b.get()).h();
            if (((ahgk) this.b.get()).a()) {
                this.d.execute(new ahgi(this));
            } else {
                this.a.a().e_(new ahkd());
            }
        }
    }
}
