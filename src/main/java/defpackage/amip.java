package defpackage;

/* renamed from: amip */
public abstract class amip {
    public final ambw b;
    public final int g;

    public abstract alzf a(Throwable th, String str, alyz alyz, boolean z);

    public abstract amec a(amea amea);

    public anjv a(String str, alyz alyz) {
        return anjf.a(a(amjq.a(), false));
    }

    public abstract String a();

    public void a(long j, amea amea) {
    }

    public abstract amcj b();

    public abstract anjv b(String str, alyz alyz);

    public abstract bbnr c();

    public abstract boolean d();

    public boolean e() {
        return false;
    }

    public amcj f() {
        return null;
    }

    /* Access modifiers changed, original: protected|final */
    public final alzf a(amec amec, boolean z) {
        return a(amec, z, null);
    }

    /* Access modifiers changed, original: protected|final */
    public final alzf a(amec amec, boolean z, bbnw bbnw) {
        bbnr c = c();
        if (c != null) {
            return new amis(this, amec, bbnw, amec, z, c);
        }
        throw new IllegalStateException("Only GarbageCollection has a null setState func and should not call createJobUpdater");
    }

    amip(int i, ambw ambw) {
        this.g = i;
        this.b = ambw;
    }
}
