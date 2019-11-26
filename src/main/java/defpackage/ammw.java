package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

/* renamed from: ammw */
public final class ammw implements ammy {
    public static final ammw a = new ammw(Collections.emptyMap(), false);
    public static final ammw b = new ammw(Collections.emptyMap(), true);
    public final Map c;
    public final boolean d;

    private ammw(Map map, boolean z) {
        this.c = map;
        this.d = z;
    }

    public final ammw a() {
        throw null;
    }

    public static ammv b() {
        return new ammv();
    }

    public final ammw a(int i) {
        ammw ammw = (ammw) this.c.get(Integer.valueOf(i));
        if (ammw == null) {
            ammw = a;
        }
        return this.d ? ammw.c() : ammw;
    }

    public final ammw c() {
        if (!this.c.isEmpty()) {
            return new ammw(this.c, this.d ^ 1);
        }
        return !this.d ? b : a;
    }

    public final String toString() {
        amqo a = amql.a(this);
        if (equals(a)) {
            a.a("empty()");
        } else if (equals(b)) {
            a.a("all()");
        } else {
            a.a("fields", this.c);
            a.a("inverted", this.d);
        }
        return a.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            ammw ammw = (ammw) obj;
            return amqq.a(this.c, ammw.c) && amqq.a(Boolean.valueOf(this.d), Boolean.valueOf(ammw.d));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, Boolean.valueOf(this.d)});
    }

    public final ammv d() {
        ammv b = ammw.b();
        b.a(e());
        return b;
    }

    private final ammx e() {
        amna amna = (amna) ammx.d.createBuilder();
        boolean z = this.d;
        amna.copyOnWrite();
        ((ammx) amna.instance).c = z;
        for (Integer intValue : this.c.keySet()) {
            int intValue2 = intValue.intValue();
            ammw ammw = (ammw) this.c.get(Integer.valueOf(intValue2));
            ammx ammx;
            if (ammw.equals(b)) {
                amna.copyOnWrite();
                ammx = (ammx) amna.instance;
                if (!ammx.b.a()) {
                    ammx.b = anxl.mutableCopy(ammx.b);
                }
                ammx.b.d(intValue2);
            } else {
                amnc amnc = (amnc) ammz.c.createBuilder();
                amnc.copyOnWrite();
                ((ammz) amnc.instance).a = intValue2;
                ammx e = ammw.e();
                amnc.copyOnWrite();
                ammz ammz = (ammz) amnc.instance;
                if (e != null) {
                    ammz.b = e;
                    ammz ammz2 = (ammz) ((anxl) amnc.build());
                    amna.copyOnWrite();
                    ammx = (ammx) amna.instance;
                    if (ammz2 != null) {
                        if (!ammx.a.a()) {
                            ammx.a = anxl.mutableCopy(ammx.a);
                        }
                        ammx.a.add(ammz2);
                    } else {
                        throw new NullPointerException();
                    }
                }
                throw new NullPointerException();
            }
        }
        return (ammx) ((anxl) amna.build());
    }

    /* synthetic */ ammw(Map map, boolean z, byte b) {
        this(map, z);
    }
}
