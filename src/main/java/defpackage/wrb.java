package defpackage;

/* renamed from: wrb */
public final class wrb {
    public int a;
    private anvu b;

    public final wrb a(byte[] bArr) {
        this.b = anvu.a(bArr);
        return this;
    }

    public final azmc a() {
        azmc azmc;
        azmb azmb = (azmb) azmc.d.createBuilder();
        anvu anvu = this.b;
        if (anvu != null) {
            azmb.copyOnWrite();
            azmc = (azmc) azmb.instance;
            azmc.a |= 1;
            azmc.b = anvu;
        }
        int i = this.a;
        if (i != 0) {
            azmb.copyOnWrite();
            azmc = (azmc) azmb.instance;
            azmc.a |= 2;
            azmc.c = i - 1;
        }
        return (azmc) ((anxl) azmb.build());
    }
}
