package defpackage;

/* renamed from: bcas */
public final class bcas extends anxo implements anzf {
    private bcas() {
        super(bcap.e);
    }

    public final bcas a(int i) {
        copyOnWrite();
        bcap bcap = (bcap) this.instance;
        bcap.a |= 1;
        bcap.b = i;
        return this;
    }

    public final bcas b(int i) {
        copyOnWrite();
        bcap bcap = (bcap) this.instance;
        bcap.a |= 2;
        bcap.c = i;
        return this;
    }

    public final bcas a(bcah bcah) {
        copyOnWrite();
        bcap bcap = (bcap) this.instance;
        if (bcah != null) {
            bcap.d = bcah;
            bcap.a |= 4;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ bcas(byte b) {
        super(bcap.e);
    }
}
