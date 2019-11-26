package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: agca */
final class agca implements agxk {
    public final /* synthetic */ agbu a;
    private final Map b = new HashMap();

    public final void a() {
        this.a.b.a(new agbz(this));
    }

    public final void a(agqz agqz) {
    }

    public final void b() {
    }

    public final void b(agqz agqz) {
    }

    public final void c(agqz agqz) {
    }

    public final void f(agqz agqz) {
    }

    public final void d(agqz agqz) {
        if (agxj.a(agqz)) {
            g(agqz);
            String b = agxj.b(agqz.f);
            if (this.b.containsKey(b) && this.a.i.a() - ((Long) this.b.get(b)).longValue() > agbu.l) {
                h(agqz);
            }
            this.b.put(b, Long.valueOf(this.a.i.a()));
        }
    }

    public final void e(agqz agqz) {
        if (agxj.a(agqz)) {
            for (agea agea : this.a.j.c(agxj.b(agqz.f))) {
                agea.b(agqz);
                this.a.a(agea.c());
            }
        }
    }

    private final void g(agqz agqz) {
        this.a.b.a(new agcc(this, agqz));
    }

    private final void h(agqz agqz) {
        for (String str : this.a.h(agxj.b(agqz.f))) {
            agqt a = this.a.a(str);
            if (!(a == null || a.c == null)) {
                this.a.b.a(new agcb(this, str, new ArrayList(), (aghw) this.a.e.get(), agqz));
            }
        }
    }

    /* synthetic */ agca(agbu agbu) {
        this.a = agbu;
    }

    public final void a(agqz agqz, int i, agqf agqf) {
        if (agxj.a(agqz)) {
            g(agqz);
            if (agqf.a()) {
                h(agqz);
            }
        }
    }
}
