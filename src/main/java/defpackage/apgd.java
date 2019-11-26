package defpackage;

/* renamed from: apgd */
public final class apgd extends anxo implements anzf {
    private apgd() {
        super(apge.j);
    }

    public final apgd a(String str) {
        copyOnWrite();
        apge apge = (apge) this.instance;
        if (str != null) {
            apge.a |= 1;
            apge.b = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final apgm a() {
        apgm apgm = ((apge) this.instance).g;
        return apgm == null ? apgm.b : apgm;
    }

    /* synthetic */ apgd(byte b) {
        super(apge.j);
    }
}
