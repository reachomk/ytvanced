package defpackage;

/* renamed from: atrw */
public final class atrw extends anxo implements anzf {
    private atrw() {
        super(atrx.f);
    }

    public final atrw a(String str) {
        copyOnWrite();
        atrx atrx = (atrx) this.instance;
        if (str != null) {
            atrx.a |= 1;
            atrx.b = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final atrw a(azfa azfa) {
        copyOnWrite();
        atrx atrx = (atrx) this.instance;
        if (azfa != null) {
            atrx.c = azfa;
            atrx.a |= 2;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ atrw(byte b) {
        super(atrx.f);
    }

    public final atrw a(int i) {
        copyOnWrite();
        atrx atrx = (atrx) this.instance;
        if (i != 0) {
            atrx.a |= 8;
            atrx.e = i - 1;
            return this;
        }
        throw new NullPointerException();
    }
}
