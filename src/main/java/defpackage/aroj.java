package defpackage;

/* renamed from: aroj */
public final class aroj extends anxo implements anzf {
    private aroj() {
        super(arog.e);
    }

    public final aroj a(String str) {
        copyOnWrite();
        arog arog = (arog) this.instance;
        if (str != null) {
            arog.a |= 1;
            arog.b = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final aroj b(String str) {
        copyOnWrite();
        arog arog = (arog) this.instance;
        if (str != null) {
            arog.a |= 4;
            arog.d = str;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ aroj(byte b) {
        super(arog.e);
    }
}
