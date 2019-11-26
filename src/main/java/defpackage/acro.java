package defpackage;

import android.app.Activity;

/* renamed from: acro */
public final class acro implements akvz {
    private final Activity a;
    private final aaas b;
    private final akvp c;
    private final akpb d = new aknw();
    private acrj e;

    public acro(nn nnVar, aaas aaas, aclh aclh) {
        this.a = (Activity) amqw.a((Object) nnVar);
        this.b = (aaas) amqw.a((Object) aaas);
        this.c = (akvp) amqw.a((Object) aclh);
    }

    public final void a(Class cls) {
        if (auvj.class.isAssignableFrom(cls)) {
            this.d.a(auvj.class, a());
        }
    }

    public final acrj a() {
        if (this.e == null) {
            this.e = new acrj(this.a, this.b, this.c);
        }
        return this.e;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        return this.d;
    }
}
