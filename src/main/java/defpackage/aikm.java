package defpackage;

import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;

/* renamed from: aikm */
public final class aikm implements aizi, aizm {
    public final aijx a;
    private final aikq b;
    private final Set c = new HashSet();
    private final aikl d = new aikl(this);
    private int e;

    aikm(aijx aijx, aikq aikq) {
        this.a = (aijx) amqw.a((Object) aijx);
        this.b = (aikq) amqw.a((Object) aikq);
        this.d.a();
        amqw.a((Object) this);
        aikq.b = new WeakReference(this);
    }

    public final aizu c() {
        return null;
    }

    public final boolean a() {
        aijx aijx = this.a;
        return (aijx instanceof aizi) && ((aizi) aijx).a();
    }

    public final void o_(boolean z) {
        if (a()) {
            aijx aijx = this.a;
            if (aijx instanceof aizi) {
                ((aizi) aijx).o_(z);
                b(false);
            }
        }
    }

    public final boolean b() {
        if (a()) {
            aijx aijx = this.a;
            if ((aijx instanceof aizi) && ((aizi) aijx).b()) {
                return true;
            }
        }
        return false;
    }

    public final void a(aafv aafv) {
        Object d = d();
        this.a.a(aafv);
        a(d, true);
    }

    public final void a(boolean z) {
        this.a.b(z);
        b(false);
    }

    public final boolean b(aiqq aiqq) {
        return this.a.b(aiqq);
    }

    public final aizl a(aiqq aiqq) {
        return this.a.a(aiqq);
    }

    public final aiqq a(aizl aizl) {
        Object d = d();
        aiqq a = this.a.a(aizl);
        a(d, false);
        boolean z = true;
        if (!(aizl.e == aizn.AUTOPLAY || aizl.e == aizn.AUTONAV)) {
            z = false;
        }
        aiqs s = a.s();
        s.e = z;
        s.d = z;
        return s.b();
    }

    public final aiqw bD_() {
        return aiqw.a;
    }

    public final void a(aizl aizl, aiqq aiqq) {
        Object d = d();
        this.a.a(aizl, aiqq);
        a(d, false);
    }

    public final void a(aizp aizp) {
        this.c.add(aizp);
    }

    public final void b(aizp aizp) {
        this.c.remove(aizp);
    }

    public final void bE_() {
        this.d.b();
        aikq aikq = this.b;
        amqw.a((Object) this);
        WeakReference weakReference = aikq.b;
        if (weakReference == null || amqq.a(this, weakReference.get())) {
            aikq.b = null;
        }
    }

    private final Object d() {
        this.d.b();
        return this.b.a();
    }

    private final void a(Object obj, boolean z) {
        this.d.a();
        this.b.b(obj);
        b(z);
    }

    private final void b(boolean z) {
        int b = b(aizl.b);
        int b2 = b(aizl.a);
        boolean b3 = b();
        int i = 0;
        int i2 = 2;
        b = b == 2 ? 1 : 0;
        if (b2 != 2) {
            i2 = 0;
        }
        b |= i2;
        if (b3) {
            i = 4;
        }
        b |= i;
        if (this.e != b || z) {
            this.e = b;
            for (aizp a : this.c) {
                a.a();
            }
        }
    }

    public final int b(aizl aizl) {
        return this.a.b(aizl);
    }
}
