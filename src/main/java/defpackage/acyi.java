package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

@Deprecated
/* renamed from: acyi */
public final class acyi implements acya {
    public final afpu a;
    public final did b;
    public final xhv c;
    public final List d = new ArrayList();
    public final List e = new ArrayList();
    private final xci f;
    private final Map g = new HashMap();

    public acyi(xci xci, afpu afpu, did did, xhv xhv) {
        this.f = (xci) amqw.a((Object) xci);
        this.a = (afpu) amqw.a((Object) afpu);
        this.b = (did) amqw.a((Object) did);
        this.c = (xhv) amqw.a((Object) xhv);
    }

    private final acyh b(Class cls) {
        acyh acyh = (acyh) this.g.get(cls);
        if (acyh != null) {
            return acyh;
        }
        xcn acyh2 = new acyh(this);
        this.f.a((Object) this, cls, acyh2);
        this.g.put(cls, acyh2);
        return acyh2;
    }

    public final acyb a(Class cls, acxx acxx) {
        return a(cls, acxx, null);
    }

    public final acyb a(Class cls, Class cls2, acxx acxx, boolean z) {
        return a(cls, cls2, acxx, null, z);
    }

    public final acyc a(Class cls, Class cls2, acxx acxx) {
        acym acym = new acym(this, acxx, cls, cls2);
        b(cls).b.add(acym);
        return acym;
    }

    public final acyb a(Class cls, acxx acxx, amqv amqv) {
        return a(cls, null, acxx, amqv, false);
    }

    private final acyb a(Class cls, Class cls2, acxx acxx, amqv amqv, boolean z) {
        acyl acyl = new acyl(this, acxx, cls2, amqv, z);
        b(cls).a.add(acyl);
        return acyl;
    }

    public final void a(Class cls, String str) {
        b(cls).c.add(new acyo(this, str));
    }

    public final void a(Class cls, acye acye) {
        b(cls).d.add(new acyn(this, acye));
    }

    public final void a(Class cls, acxz acxz) {
        b(cls).e.add(new acyk(this, acxz));
    }

    public final boolean a(Class cls) {
        return c(cls) != null;
    }

    private final acxv c(Class cls) {
        for (acxv acxv : this.d) {
            if (acxv.getClass().equals(cls)) {
                return acxv;
            }
        }
        return null;
    }

    public final void a(acxv acxv, Class cls, boolean z) {
        if (cls != null) {
            Object c = c(cls);
            if (c != null) {
                amqw.a(c);
                String.format("CsiAction CLONE [%s] from %s", new Object[]{acxv.a, acxv.a(c)});
                if (c.b() && !c.e && acxv.b() && !acxv.e) {
                    Long l = c.d.a;
                    if (l != null) {
                        acxv.b.addAll(c.b);
                        acxy acxy = c.c;
                        long longValue = l.longValue();
                        acxy acxy2 = acxv.c;
                        dil a = dik.a(longValue);
                        Iterator it = acxy.a.iterator();
                        while (it.hasNext()) {
                            acxy2.a(a, ((dil) it.next()).a.longValue(), r6.b);
                        }
                        Map a2 = acxy.a();
                        if (!(a2 == null || a2.isEmpty())) {
                            for (Entry entry : a2.entrySet()) {
                                acxy2.a((String) entry.getKey(), (String) entry.getValue());
                            }
                        }
                        acxv.d = a;
                    }
                }
                if (z) {
                    c.c();
                    this.d.remove(c);
                    this.e.remove(c);
                }
            }
        }
    }
}
