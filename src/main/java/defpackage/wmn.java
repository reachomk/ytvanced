package defpackage;

/* renamed from: wmn */
public final class wmn {
    public anvu a;

    public final azlw a() {
        azlv azlv = (azlv) azlw.c.createBuilder();
        anvu anvu = this.a;
        if (anvu != null) {
            azlv.copyOnWrite();
            azlw azlw = (azlw) azlv.instance;
            azlw.a |= 1;
            azlw.b = anvu;
        }
        return (azlw) ((anxl) azlv.build());
    }
}
