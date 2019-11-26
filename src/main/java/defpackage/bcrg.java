package defpackage;

import java.util.HashMap;

/* renamed from: bcrg */
public final class bcrg extends bcqk {
    public static final long serialVersionUID = -1079258847191166848L;

    public static bcrg a(bcpl bcpl, bcpt bcpt) {
        if (bcpl != null) {
            bcpl = bcpl.b();
            if (bcpl == null) {
                throw new IllegalArgumentException("UTC chronology must not be null");
            } else if (bcpt != null) {
                return new bcrg(bcpl, bcpt);
            } else {
                throw new IllegalArgumentException("DateTimeZone must not be null");
            }
        }
        throw new IllegalArgumentException("Must supply a chronology");
    }

    static boolean a(bcpx bcpx) {
        return bcpx != null && bcpx.d() < 43200000;
    }

    private bcrg(bcpl bcpl, bcpt bcpt) {
        super(bcpl, bcpt);
    }

    public final bcpt a() {
        return (bcpt) this.b;
    }

    public final bcpl b() {
        return this.a;
    }

    public final bcpl a(bcpt bcpt) {
        if (bcpt == this.b) {
            return this;
        }
        if (bcpt != bcpt.a) {
            return new bcrg(this.a, bcpt);
        }
        return this.a;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(bcqn bcqn) {
        HashMap hashMap = new HashMap();
        bcqn.l = a(bcqn.l, hashMap);
        bcqn.k = a(bcqn.k, hashMap);
        bcqn.j = a(bcqn.j, hashMap);
        bcqn.i = a(bcqn.i, hashMap);
        bcqn.h = a(bcqn.h, hashMap);
        bcqn.g = a(bcqn.g, hashMap);
        bcqn.f = a(bcqn.f, hashMap);
        bcqn.e = a(bcqn.e, hashMap);
        bcqn.d = a(bcqn.d, hashMap);
        bcqn.c = a(bcqn.c, hashMap);
        bcqn.b = a(bcqn.b, hashMap);
        bcqn.a = a(bcqn.a, hashMap);
        bcqn.E = a(bcqn.E, hashMap);
        bcqn.F = a(bcqn.F, hashMap);
        bcqn.G = a(bcqn.G, hashMap);
        bcqn.H = a(bcqn.H, hashMap);
        bcqn.I = a(bcqn.I, hashMap);
        bcqn.x = a(bcqn.x, hashMap);
        bcqn.y = a(bcqn.y, hashMap);
        bcqn.z = a(bcqn.z, hashMap);
        bcqn.D = a(bcqn.D, hashMap);
        bcqn.A = a(bcqn.A, hashMap);
        bcqn.B = a(bcqn.B, hashMap);
        bcqn.C = a(bcqn.C, hashMap);
        bcqn.m = a(bcqn.m, hashMap);
        bcqn.n = a(bcqn.n, hashMap);
        bcqn.o = a(bcqn.o, hashMap);
        bcqn.p = a(bcqn.p, hashMap);
        bcqn.q = a(bcqn.q, hashMap);
        bcqn.r = a(bcqn.r, hashMap);
        bcqn.s = a(bcqn.s, hashMap);
        bcqn.u = a(bcqn.u, hashMap);
        bcqn.t = a(bcqn.t, hashMap);
        bcqn.v = a(bcqn.v, hashMap);
        bcqn.w = a(bcqn.w, hashMap);
    }

    private final bcpx a(bcpx bcpx, HashMap hashMap) {
        if (bcpx == null || !bcpx.b()) {
            return bcpx;
        }
        if (hashMap.containsKey(bcpx)) {
            return (bcpx) hashMap.get(bcpx);
        }
        bcri bcri = new bcri(bcpx, a());
        hashMap.put(bcpx, bcri);
        return bcri;
    }

    private final bcpn a(bcpn bcpn, HashMap hashMap) {
        if (bcpn == null || !bcpn.c()) {
            return bcpn;
        }
        if (hashMap.containsKey(bcpn)) {
            return (bcpn) hashMap.get(bcpn);
        }
        bcrj bcrj = new bcrj(bcpn, a(), a(bcpn.d(), hashMap), a(bcpn.e(), hashMap), a(bcpn.f(), hashMap));
        hashMap.put(bcpn, bcrj);
        return bcrj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bcrg) {
            bcrg bcrg = (bcrg) obj;
            return this.a.equals(bcrg.a) && a().equals(bcrg.a());
        }
    }

    public final int hashCode() {
        return ((a().hashCode() * 11) + 326565) + (this.a.hashCode() * 7);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = a().d;
        StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 19) + String.valueOf(str).length());
        stringBuilder.append("ZonedChronology[");
        stringBuilder.append(valueOf);
        stringBuilder.append(", ");
        stringBuilder.append(str);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}
