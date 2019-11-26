package defpackage;

/* renamed from: wqu */
public final class wqu {
    public int a;
    private anvu b;

    public final wqu a(byte[] bArr) {
        this.b = anvu.a(bArr);
        return this;
    }

    public final azly a() {
        azly azly;
        azlx azlx = (azlx) azly.d.createBuilder();
        anvu anvu = this.b;
        if (anvu != null) {
            azlx.copyOnWrite();
            azly = (azly) azlx.instance;
            azly.a |= 1;
            azly.b = anvu;
        }
        int i = this.a;
        if (i != 0) {
            azlx.copyOnWrite();
            azly = (azly) azlx.instance;
            azly.a |= 2;
            azly.c = i - 1;
        }
        return (azly) ((anxl) azlx.build());
    }
}
