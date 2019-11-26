package defpackage;

/* renamed from: tjq */
public abstract class tjq implements tix {
    public abstract anmh b();

    public final tix a(String str) {
        anmh b = b();
        pzr.a((Object) str);
        b.a("name", str);
        return this;
    }

    public final tix b(String str) {
        anmh b = b();
        pzr.a((Object) str);
        b.c = str;
        return this;
    }

    public final tix c(String str) {
        anmh b = b();
        pzr.a((Object) str);
        b.a("image", str);
        return this;
    }

    public final tix a(tiv tiv) {
        anmh b = b();
        Object obj = ((tjo) tiv).a;
        pzr.a(b.b == null, (Object) "setMetadata may only be called once");
        pzr.a(obj);
        b.b = obj.a();
        return this;
    }

    public final /* synthetic */ tis a() {
        return new tjp(b().a());
    }
}
