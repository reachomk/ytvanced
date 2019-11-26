package defpackage;

import java.util.concurrent.Executor;

/* renamed from: llw */
public final class llw extends ahgd implements xcp {
    private final xci c;
    private final aikf d;
    private final bcaa e;
    private airc f;

    public llw(aiyx aiyx, xci xci, aikf aikf, bcaa bcaa, ajbp ajbp, bapu bapu, Executor executor) {
        super(aiyx, ajbp, bapu, executor);
        this.c = xci;
        this.d = aikf;
        this.e = bcaa;
    }

    public final void a() {
        this.c.a((Object) this);
    }

    public final void a(ahkn ahkn) {
        if (this.b != null) {
            ekn ekn = (ekn) this.e.get();
            if (ekn != null && ekn.c == eko.REEL) {
                super.a(ahkn);
                return;
            }
            enm enm = (enm) this.d.b();
            if (enm != null) {
                boolean z = false;
                if (ahkn.a == airi.ENDED) {
                    enm.a(true);
                    airc airc = this.f;
                    airc airc2 = airc.INLINE_IN_FEED;
                    Object obj = (airc == airc2 || !((ahgk) this.b.get()).a()) ? null : 1;
                    Object obj2 = (airc == airc2 || !((ahgk) this.b.get()).b()) ? null : 1;
                    if (obj == null && obj2 == null) {
                        z = true;
                    }
                    if (obj != null) {
                        ((ahgk) this.b.get()).f();
                    }
                    if (z) {
                        this.a.a().e_(new ahkd());
                    }
                } else if (ahkn.a.d()) {
                    enm.a(false);
                }
            }
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahjn.class, ahkn.class};
        } else if (i == 0) {
            this.f = ((ahjn) obj).a;
            return null;
        } else if (i == 1) {
            a((ahkn) obj);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
