package defpackage;

import android.content.Context;

/* renamed from: akwv */
public final class akwv implements akvz {
    private final Context a;
    private final aaas b;
    private final akpb c = new aknw();
    private akwq d;

    public akwv(Context context, aaas aaas) {
        this.a = (Context) amqw.a((Object) context);
        this.b = (aaas) amqw.a((Object) aaas);
    }

    public final void a(Class cls) {
        if (auvj.class.isAssignableFrom(cls)) {
            this.c.a(auvj.class, a());
        }
    }

    public final void a(akvo akvo) {
        akwq a = a();
        a.b = new akwt(akvo);
        a.a = new akws(akvo);
    }

    private final akwq a() {
        if (this.d == null) {
            this.d = new akwq(this.a, this.b);
        }
        return this.d;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        return this.c;
    }
}
