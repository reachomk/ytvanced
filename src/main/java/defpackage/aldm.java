package defpackage;

import java.util.Arrays;
import java.util.Set;

/* renamed from: aldm */
public final class aldm {
    public axxl a = null;
    public axxt b;
    public Set c;
    public axxt d;
    public Set e;
    public axxt f;
    public Set g;
    public boolean h;
    private axxt[] i;
    private axxv[] j;

    public final CharSequence a() {
        axxl axxl = this.a;
        if (axxl != null) {
            aphj aphj = axxl.g;
            if (aphj == null) {
                aphj = aphj.d;
            }
            if ((aphj.a & 1) != 0) {
                aphj = this.a.g;
                if (aphj == null) {
                    aphj = aphj.d;
                }
                aphg aphg = aphj.b;
                if (aphg == null) {
                    aphg = aphg.s;
                }
                arml arml = aphg.g;
                if (arml == null) {
                    arml = arml.f;
                }
                return ajqy.a(arml);
            }
        }
        return null;
    }

    public final CharSequence b() {
        axxl axxl = this.a;
        if (axxl != null) {
            aphj aphj = axxl.h;
            if (aphj == null) {
                aphj = aphj.d;
            }
            if ((aphj.a & 1) != 0) {
                aphj = this.a.h;
                if (aphj == null) {
                    aphj = aphj.d;
                }
                aphg aphg = aphj.b;
                if (aphg == null) {
                    aphg = aphg.s;
                }
                arml arml = aphg.g;
                if (arml == null) {
                    arml = arml.f;
                }
                return ajqy.a(arml);
            }
        }
        return null;
    }

    public final axxt[] c() {
        if (this.i == null) {
            this.i = new axxt[this.a.b.size()];
            for (int i = 0; i < this.a.b.size(); i++) {
                axxt axxt;
                axxn axxn = (axxn) this.a.b.get(i);
                if (axxn.a == 119719473) {
                    axxt = (axxt) axxn.b;
                } else {
                    axxt = axxt.i;
                }
                this.i[i] = axxt;
            }
        }
        return this.i;
    }

    public final axxv[] d() {
        if (this.j == null) {
            this.j = new axxv[this.a.c.size()];
            for (int i = 0; i < this.a.c.size(); i++) {
                axxv axxv;
                axxp axxp = (axxp) this.a.c.get(i);
                if (axxp.a == 94522740) {
                    axxv = (axxv) axxp.b;
                } else {
                    axxv = axxv.g;
                }
                this.j[i] = axxv;
            }
        }
        return this.j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aldm) {
            aldm aldm = (aldm) obj;
            if (amqq.a(aldm.a, this.a) && aldm.e.equals(this.e) && amqq.a(aldm.d, this.d) && amqq.a(aldm.b, this.b) && aldm.c.equals(this.c) && amqq.a(aldm.f, this.f)) {
                Set set = aldm.g;
                if (set == null && this.g == null) {
                    return true;
                }
                if (set == null && this.g == null) {
                    set = null;
                    if (set.equals(set)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a.toByteArray())), Integer.valueOf(Arrays.hashCode(this.d.toByteArray())), this.e, this.c, Integer.valueOf(Arrays.hashCode(this.b.toByteArray())), Integer.valueOf(Arrays.hashCode(this.f.toByteArray())), this.g});
    }
}
