package defpackage;

/* renamed from: answ */
public final class answ extends anxo implements anzf {
    private answ() {
        super(ansx.l);
    }

    public final answ a(String str) {
        copyOnWrite();
        ansx ansx = (ansx) this.instance;
        if (str != null) {
            ansx.b = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final answ a(ansr ansr) {
        copyOnWrite();
        ansx ansx = (ansx) this.instance;
        if (ansr != null) {
            ansx.c = ansr;
            return this;
        }
        throw new NullPointerException();
    }

    public final answ a(Iterable iterable) {
        copyOnWrite();
        ansx ansx = (ansx) this.instance;
        if (!ansx.d.a()) {
            ansx.d = anxl.mutableCopy(ansx.d);
        }
        anvf.addAll(iterable, ansx.d);
        return this;
    }

    public final answ a(antp antp) {
        copyOnWrite();
        ansx ansx = (ansx) this.instance;
        if (antp != null) {
            ansx.e = antp.getNumber();
            return this;
        }
        throw new NullPointerException();
    }

    public final answ b(String str) {
        copyOnWrite();
        ansx ansx = (ansx) this.instance;
        if (str != null) {
            ansx.h = str;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ answ(byte b) {
        super(ansx.l);
    }
}
