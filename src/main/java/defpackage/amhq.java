package defpackage;

/* renamed from: amhq */
final /* synthetic */ class amhq implements bbnw {
    private final Long a;

    amhq(Long l) {
        this.a = l;
    }

    public final void accept(Object obj) {
        amdz amdz = (amdz) obj;
        long longValue = this.a.longValue();
        amdz.copyOnWrite();
        amea amea = (amea) amdz.instance;
        amea.a |= 131072;
        amea.r = longValue;
    }
}
