package defpackage;

import android.content.Context;

/* renamed from: fzm */
public final class fzm {
    public final Context a;
    public final aiqf b;
    public final xoi c;
    public final ehz d;
    private final bcaa e;
    private final ajko f;

    public fzm(Context context, aiqf aiqf, bcaa bcaa, ajko ajko, xoi xoi, ehz ehz) {
        this.a = context;
        this.b = aiqf;
        this.e = bcaa;
        this.f = ajko;
        this.c = xoi;
        this.d = ehz;
    }

    public final aizy a() {
        return (aizy) this.e.get();
    }

    public final wv b() {
        return this.f.a();
    }

    private final boolean f() {
        aiqf aiqf = this.b;
        return aiqf.d != null || aiqf.k;
    }

    /* Access modifiers changed, original: final */
    public final boolean c() {
        return this.b.i;
    }

    /* Access modifiers changed, original: final */
    public final boolean d() {
        if (!f() && !c()) {
            return false;
        }
        if (!f()) {
            ajmq q = a().q();
            if (q != null) {
                aakj b = q.b();
                if (b != null) {
                    atdv l = b.l();
                    if (l != null) {
                        return aiqr.d(l);
                    }
                }
            }
        }
        return true;
    }

    /* Access modifiers changed, original: final */
    public final fzv e() {
        a().E();
        b().i();
        return fzv.a;
    }
}
