package defpackage;

/* renamed from: arkk */
public final class arkk extends anxo implements anzf {
    private arkk() {
        super(arkl.f);
    }

    @Deprecated
    public final arkk a(String str) {
        copyOnWrite();
        arkl arkl = (arkl) this.instance;
        if (str != null) {
            arkl.a |= 2;
            arkl.c = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final arkk a(arkn arkn) {
        copyOnWrite();
        arkl arkl = (arkl) this.instance;
        if (arkn != null) {
            arkl.d = arkn;
            arkl.a |= 16;
            return this;
        }
        throw new NullPointerException();
    }

    public final arkk a(Iterable iterable) {
        copyOnWrite();
        arkl arkl = (arkl) this.instance;
        if (!arkl.e.a()) {
            arkl.e = anxl.mutableCopy(arkl.e);
        }
        anvf.addAll(iterable, arkl.e);
        return this;
    }

    /* synthetic */ arkk(byte b) {
        super(arkl.f);
    }
}
