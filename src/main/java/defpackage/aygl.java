package defpackage;

/* renamed from: aygl */
public final class aygl extends anxo implements anzf {
    private aygl() {
        super(aygm.e);
    }

    public final aygl a(String str) {
        copyOnWrite();
        aygm aygm = (aygm) this.instance;
        if (str != null) {
            aygm.a |= 1;
            aygm.b = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final aygl a(int i) {
        copyOnWrite();
        aygm aygm = (aygm) this.instance;
        aygm.a |= 2;
        aygm.c = i;
        return this;
    }

    public final aygl b(int i) {
        copyOnWrite();
        aygm aygm = (aygm) this.instance;
        aygm.a |= 4;
        aygm.d = i;
        return this;
    }

    /* synthetic */ aygl(byte b) {
        super(aygm.e);
    }
}
