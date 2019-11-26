package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: bcrf */
public final class bcrf extends bcqk {
    public static final bcrf n = new bcrf(bcrc.G);
    private static final ConcurrentHashMap o = new ConcurrentHashMap();
    public static final long serialVersionUID = -6212696554273812441L;

    public static bcrf L() {
        return bcrf.b(bcpt.a());
    }

    public static bcrf b(bcpt bcpt) {
        if (bcpt == null) {
            bcpt = bcpt.a();
        }
        bcrf bcrf = (bcrf) o.get(bcpt);
        if (bcrf == null) {
            bcrf = new bcrf(bcrg.a(n, bcpt));
            bcrf bcrf2 = (bcrf) o.putIfAbsent(bcpt, bcrf);
            return bcrf2 == null ? bcrf : bcrf2;
        }
    }

    private bcrf(bcpl bcpl) {
        super(bcpl, null);
    }

    public final bcpl b() {
        return n;
    }

    public final bcpl a(bcpt bcpt) {
        return bcpt != a() ? bcrf.b(bcpt) : this;
    }

    public final String toString() {
        bcpt a = a();
        String str = "ISOChronology";
        if (a == null) {
            return str;
        }
        String str2 = a.d;
        StringBuilder stringBuilder = new StringBuilder((str.length() + 2) + String.valueOf(str2).length());
        stringBuilder.append("ISOChronology[");
        stringBuilder.append(str2);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(bcqn bcqn) {
        if (this.a.a() == bcpt.a) {
            bcqn.H = new bcro(bcrh.a, bcpm.c);
            bcqn.G = new bcrz((bcro) bcqn.H, bcpm.d);
            bcqn.C = new bcrz((bcro) bcqn.H, bcpm.i);
            bcqn.k = bcqn.H.d();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bcrf)) {
            return false;
        }
        return a().equals(((bcrf) obj).a());
    }

    public final int hashCode() {
        return a().hashCode() + 800855;
    }

    private final Object writeReplace() {
        return new bcre(a());
    }

    static {
        o.put(bcpt.a, n);
    }
}
