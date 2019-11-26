package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: aabm */
public final class aabm implements aaea {
    public final aabs a;
    public final Collection b = new ArrayList();
    public volatile int c;
    private volatile boolean d = false;
    private final aadw e;
    private final /* synthetic */ aabe f;

    private final aabm a(aabo aabo) {
        this.b.add(aabo);
        return this;
    }

    public final aaea a(aadq aadq) {
        return aaed.a(this, aadq);
    }

    public final aaea a(int i) {
        this.c = i;
        return this;
    }

    public final bblt a() {
        return a(this.f.a, true);
    }

    private final bblt a(bbmn bbmn, boolean z) {
        synchronized (this) {
            if (this.d) {
                throw new IllegalStateException("Cannot commit a set of pending edits more than once.");
            }
            this.d = true;
        }
        bblt b = ((bblt) this.a.a(new aabp(this, z))).b(bbmn);
        bblv e = bbzr.e();
        b.a(e);
        return new bbqd(e);
    }

    public final bblt b() {
        return a(this.f.a, false);
    }

    /* synthetic */ aabm(aabe aabe, aabs aabs, aadw aadw) {
        this.f = aabe;
        this.a = aabs;
        this.e = aadw;
        this.c = 0;
    }

    public final aaea a(aadt aadt) {
        aabs aabs = this.a;
        aabs.getClass();
        a(new aacc(aabs, aadt.a(this.e)));
        return this;
    }

    public final aaea a(Iterable iterable) {
        amqw.a((Object) iterable, (Object) "entity list should not be null");
        for (aadq aadq : iterable) {
            if (aadq != null) {
                aaed.a(this, aadq);
            }
        }
        return this;
    }

    public final aabm a(aadq aadq, int i) {
        amqw.a((Object) aadq, (Object) "entity should not be null");
        aabs aabs = this.a;
        aabs.getClass();
        a(new aacc(aabs, aadq));
        return this;
    }

    public final /* synthetic */ aaea b(aadq aadq, int i) {
        a(aadq, i);
        return this;
    }
}
