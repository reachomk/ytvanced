package defpackage;

/* renamed from: badj */
public final class badj extends anxo implements anzf {
    private badj() {
        super(badg.k);
    }

    public final badj a(babk babk) {
        copyOnWrite();
        badg badg = (badg) this.instance;
        if (babk != null) {
            badg.a |= 512;
            badg.h = babk.h;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ badj(byte b) {
        super(badg.k);
    }
}
