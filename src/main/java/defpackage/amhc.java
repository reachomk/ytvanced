package defpackage;

import android.content.Context;

/* renamed from: amhc */
public final class amhc extends amip {
    public final Context a;
    public final ambw b;

    public amhc(Context context, ambw ambw) {
        super(33, ambw);
        this.a = context;
        this.b = ambw;
    }

    public final amec a(amea amea) {
        return null;
    }

    public final String a() {
        return "GarbageCollectionTask";
    }

    public final amcj b() {
        return null;
    }

    public final bbnr c() {
        return null;
    }

    public final boolean d() {
        return false;
    }

    public final boolean e() {
        return false;
    }

    public final anjv b(String str, alyz alyz) {
        return anjf.a(new amhb(this, alyz, str), aniv.a);
    }

    public final anjv a(String str, alyz alyz) {
        throw new UnsupportedOperationException();
    }

    public final alzf a(Throwable th, String str, alyz alyz, boolean z) {
        return new alze(this.b);
    }
}
