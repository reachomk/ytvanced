package defpackage;

/* renamed from: amgh */
public abstract class amgh extends amip {
    public abstract anjv a(String str, amea amea);

    public final anjv b(String str, alyz alyz) {
        return anjf.a(new amgk(this, str, alyz), aniv.a);
    }

    public abstract boolean b(amea amea);

    public final alzf a(Throwable th, String str, alyz alyz, boolean z) {
        try {
            amea a = alyz.a(str);
            if (a == null) {
                return a(amjq.a(19), z);
            }
            return a(th, a, z);
        } catch (alzc unused) {
            return a(amjq.a(21), z);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public alzf a(Throwable th, amea amea, boolean z) {
        return a(amgh.a(th), z);
    }

    /* Access modifiers changed, original: final */
    public final amea a(String str, alyz alyz, boolean z) {
        amea a = alyz.a(str);
        if (a == null) {
            throw new amgl();
        } else if (z && a.M) {
            throw new amgo();
        } else if (b(a)) {
            return a;
        } else {
            throw new amgm();
        }
    }

    static amec a(Throwable th) {
        if (th instanceof alzc) {
            return amjq.a(21);
        }
        if (th instanceof amgl) {
            return amjq.a(19);
        }
        if (th instanceof amgo) {
            return amjq.a(22);
        }
        if (th instanceof amgm) {
            return amjq.a(20);
        }
        if (th instanceof amgj) {
            return amjq.a(18);
        }
        return amjq.a(17);
    }

    amgh(int i, ambw ambw) {
        super(i, ambw);
    }
}
