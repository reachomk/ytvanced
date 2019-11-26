package defpackage;

/* renamed from: imd */
final class imd extends imf {
    private final String e;
    private final String f;

    public final abgh a(abgh abgh) {
        abgh.a(this.e, this.f);
        return abgh;
    }

    /* Access modifiers changed, original: final */
    public final boolean a() {
        return true;
    }

    public final boolean a(imf imf) {
        return imf instanceof imd ? ((imd) imf).e.equals(this.e) : false;
    }

    /* synthetic */ imd(ima ima, String str, String str2, afsw afsw) {
        super(ima, null, anvu.a, afsw);
        this.e = (String) amqw.a((Object) str);
        this.f = str2;
    }
}
