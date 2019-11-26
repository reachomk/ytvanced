package defpackage;

/* renamed from: aocu */
public final class aocu extends anxo implements anzf {
    private aocu() {
        super(aocr.f);
    }

    public final aocu a(String str) {
        copyOnWrite();
        aocr aocr = (aocr) this.instance;
        if (str != null) {
            aocr.a |= 1;
            aocr.b = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final aocu a(int i) {
        copyOnWrite();
        aocr aocr = (aocr) this.instance;
        aocr.a |= 2;
        aocr.c = i;
        return this;
    }

    public final aocu a(long j) {
        copyOnWrite();
        aocr aocr = (aocr) this.instance;
        aocr.a |= 4;
        aocr.d = j;
        return this;
    }

    public final aocu b(int i) {
        copyOnWrite();
        aocr aocr = (aocr) this.instance;
        aocr.a |= 8;
        aocr.e = i;
        return this;
    }

    /* synthetic */ aocu(byte b) {
        super(aocr.f);
    }
}
