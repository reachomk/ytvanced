package defpackage;

/* renamed from: tja */
public final class tja implements tim {
    private final anls a;

    public tja(String str) {
        this.a = new anls(str);
    }

    public final tim a(String str, String str2) {
        anls anls = this.a;
        pzr.a((Object) str);
        pzr.a((Object) str2);
        anls.c = str;
        anls.d = str2;
        return this;
    }

    public final tim a(tip tip) {
        anls anls = this.a;
        Object obj = ((tjd) tip).a;
        pzr.a(obj);
        anls.e = obj.a();
        return this;
    }

    public final tin a() {
        anls anls = this.a;
        Object obj = "setObject is required before calling build().";
        pzr.a(anls.c, obj);
        pzr.a(anls.d, obj);
        String str = anls.b;
        String str2 = anls.c;
        String str3 = anls.d;
        anmu anmu = anls.e;
        if (anmu == null) {
            anmu = new anlr().a();
        }
        return new tjb(new anmv(str, str2, str3, null, anmu, null, anls.a));
    }
}
