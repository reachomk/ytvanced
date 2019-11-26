package defpackage;

/* renamed from: aoyf */
public final class aoyf extends anxo implements anzf {
    private aoyf() {
        super(aoyg.e);
    }

    public final aoyf a(String str) {
        copyOnWrite();
        aoyg aoyg = (aoyg) this.instance;
        if (str != null) {
            aoyg.a |= 1;
            aoyg.b = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final aoyf b(String str) {
        copyOnWrite();
        aoyg aoyg = (aoyg) this.instance;
        if (str != null) {
            aoyg.a |= 2;
            aoyg.c = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final aoyf a(boolean z) {
        copyOnWrite();
        aoyg aoyg = (aoyg) this.instance;
        aoyg.a |= 4;
        aoyg.d = z;
        return this;
    }

    /* synthetic */ aoyf(byte b) {
        super(aoyg.e);
    }
}
