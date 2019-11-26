package defpackage;

/* renamed from: amgn */
public final class amgn extends amgh {
    public final abju a;
    private final atlx c;
    private final alys d;
    private final amch e;

    public amgn(atlx atlx, abju abju, amch amch, alys alys, ambw ambw) {
        super(31, ambw);
        this.c = atlx;
        this.a = abju;
        this.d = alys;
        this.e = amch;
    }

    public final String a() {
        return "DeleteVideoOnCancellationTask";
    }

    public final amcj b() {
        return null;
    }

    public final boolean d() {
        return false;
    }

    public final boolean e() {
        return true;
    }

    public final amec a(amea amea) {
        amec amec = amea.N;
        return amec == null ? amec.g : amec;
    }

    public final bbnr c() {
        return amgq.a;
    }

    public final amcj f() {
        return this.e;
    }

    public final anjv a(String str, amea amea) {
        return anjf.a(a(amjq.a(), true));
    }

    public final anjv a(String str, alyz alyz) {
        return anjf.a(new amgp(this, str, alyz), aniv.a);
    }

    /* Access modifiers changed, original: final */
    public final alzf a(Throwable th, amea amea, boolean z) {
        if (th instanceof aanq) {
            Object obj = amea.N;
            if (obj == null) {
                obj = amec.g;
            }
            return a(amjq.a(5, (amec) amqw.a(obj), this.c.p, this.d), z);
        }
        alys alys = this.d;
        String concat = "DeleteVideoOnCancellationTask".concat(" Throwable");
        int a = amek.a(amea.h);
        if (a == 0) {
            a = 1;
        }
        alys.a(concat, th, a);
        return super.a(th, amea, z);
    }

    /* Access modifiers changed, original: final */
    public final boolean b(amea amea) {
        int i = amea.a;
        return ((i & 1) == 0 || (i & 536870912) == 0) ? false : true;
    }
}
