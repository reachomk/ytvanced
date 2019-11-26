package defpackage;

/* renamed from: atvy */
public final class atvy extends anxo implements anzf {
    private atvy() {
        super(atvz.f);
    }

    public final atvy a(awzv awzv) {
        copyOnWrite();
        atvz atvz = (atvz) this.instance;
        if (awzv != null) {
            atvz.d = awzv;
            atvz.a |= 4;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ atvy(byte b) {
        super(atvz.f);
    }
}
