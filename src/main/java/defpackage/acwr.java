package defpackage;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

/* renamed from: acwr */
final class acwr implements acxg {
    private final acwe a;
    private final acwu b;
    private final acxe c;
    private final Set d = new HashSet();
    private final Hashtable e = new Hashtable();

    acwr(acwe acwe, acwu acwu, acxe acxe) {
        this.a = (acwe) amqw.a((Object) acwe);
        this.b = (acwu) amqw.a((Object) acwu);
        this.c = (acxe) amqw.a((Object) acxe);
        acxe.a(this);
    }

    /* Access modifiers changed, original: final */
    public final void a(auko auko) {
        a(new acvw(auko));
    }

    public final void a(acvw acvw) {
        acwp c = this.b.c();
        if (this.c.a() || !c.b(acvw.d)) {
            synchronized (this.e) {
                this.e.put(acvw.d, acvw);
            }
            d();
            return;
        }
        synchronized (this.e) {
            this.e.remove(acvw.d);
        }
    }

    /* Access modifiers changed, original: final */
    public final void b(auko auko) {
        a(new acvu(auko));
    }

    private final void a(acvu acvu) {
        acwp c = this.b.c();
        if (this.c.a() || c.b(acvu.d)) {
            synchronized (this.e) {
                this.e.put(acvu.d, acvu);
            }
            d();
            return;
        }
        synchronized (this.e) {
            this.e.remove(acvu.d);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(azfa azfa) {
        a(new acvu(9, azfa));
    }

    /* Access modifiers changed, original: final */
    public final void a(azfa azfa, atst atst) {
        if (azfa != null) {
            a(new acwt(azfa, atst));
        }
    }

    public final void a(acwt acwt) {
        if (this.b.c() != null) {
            synchronized (this.d) {
                this.d.add(acwt);
            }
            c();
        }
    }

    private final void c() {
        if (this.c.a()) {
            acwp c = this.b.c();
            if (c != null) {
                synchronized (this.d) {
                    for (acwt acwt : this.d) {
                        acwe acwe = this.a;
                        azfa azfa = acwt.a;
                        acwe.a(c, new acvw(2, acwe.b(azfa), acwt.b));
                    }
                    this.d.clear();
                }
            }
        }
    }

    private final void d() {
        if (this.c.a()) {
            acwp c = this.b.c();
            if (c != null) {
                synchronized (this.e) {
                    for (acvr acvr : this.e.values()) {
                        if (acvr instanceof acvw) {
                            this.a.a(c, (acvw) acvr);
                        } else if (acvr instanceof acvu) {
                            this.a.a(c, (acvu) acvr);
                        }
                    }
                    this.e.clear();
                }
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        synchronized (this.d) {
            this.d.clear();
        }
        synchronized (this.e) {
            this.e.clear();
        }
    }

    public final void a() {
        c();
        if (!this.c.a()) {
            acwp c = this.b.c();
            if (c != null) {
                HashSet<acvr> hashSet = new HashSet();
                for (acvr acvr : c.f.values()) {
                    if (acvr.f == 5) {
                        hashSet.add(acvr);
                    }
                }
                synchronized (this.e) {
                    for (acvr acvr2 : hashSet) {
                        this.a.a(c, new acvu(acvr2.a, acvr2.c, acvr2.d.b.d(), (byte) 0));
                    }
                    for (acvr acvr3 : hashSet) {
                        a(new acvw(acvr3.a, acvr3.c, acvr3.d.b.d(), (byte) 0));
                    }
                }
            }
        }
        d();
    }
}
