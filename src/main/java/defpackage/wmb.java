package defpackage;

import java.util.concurrent.Executor;

/* renamed from: wmb */
public final class wmb {
    public wmg a;
    public String b;
    public String c;
    public final Executor d;
    public final alyf e;
    public final afpu f;
    public final wmf g;
    public anjv h;
    public boolean i = false;

    public wmb(String str, afpu afpu, Executor executor, alyf alyf) {
        this.b = str;
        this.d = executor;
        this.e = alyf;
        this.f = (afpu) amqw.a((Object) afpu);
        this.g = new wmf(this);
    }

    public final void a() {
        try {
            this.i = false;
            anjv anjv = this.h;
            if (!(anjv == null || anjv.isDone())) {
                this.h.cancel(true);
            }
            this.e.a(this.g);
        } catch (IllegalStateException e) {
            xtl.a("Error releasing VideoIdHelper", e);
        }
    }
}
