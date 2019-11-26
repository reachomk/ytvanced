package defpackage;

/* renamed from: ayyl */
public final class ayyl extends anxo implements anzf {
    private ayyl() {
        super(ayym.c);
    }

    public final ayyl a(String str) {
        copyOnWrite();
        ayym ayym = (ayym) this.instance;
        if (str != null) {
            ayym.a |= 1;
            ayym.b = str;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ ayyl(byte b) {
        super(ayym.c);
    }
}
