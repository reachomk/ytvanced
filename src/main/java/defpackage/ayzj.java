package defpackage;

/* renamed from: ayzj */
public final class ayzj extends anxo implements anzf {
    private ayzj() {
        super(ayzk.f);
    }

    public final ayzj a(ayza ayza) {
        copyOnWrite();
        ayzk ayzk = (ayzk) this.instance;
        if (ayza != null) {
            ayzk.a |= 1;
            ayzk.b = ayza.d;
            return this;
        }
        throw new NullPointerException();
    }

    public final ayzj a(String str) {
        copyOnWrite();
        ayzk ayzk = (ayzk) this.instance;
        if (str != null) {
            ayzk.a |= 2;
            ayzk.c = str;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ ayzj(byte b) {
        super(ayzk.f);
    }

    public final ayzj a(int i) {
        copyOnWrite();
        ayzk ayzk = (ayzk) this.instance;
        ayzk.a |= 32;
        ayzk.e = i - 1;
        return this;
    }
}
