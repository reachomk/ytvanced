package defpackage;

/* renamed from: attc */
public final class attc extends anxo implements anzf {
    private attc() {
        super(attd.e);
    }

    public final attc a(String str) {
        copyOnWrite();
        attd attd = (attd) this.instance;
        if (str != null) {
            attd.a |= 1;
            attd.b = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final attc b(String str) {
        copyOnWrite();
        attd attd = (attd) this.instance;
        attd.a |= 4;
        attd.c = str;
        return this;
    }

    public final attc a(atte atte) {
        copyOnWrite();
        attd attd = (attd) this.instance;
        attd.d = (attf) ((anxl) atte.build());
        attd.a |= 8;
        return this;
    }

    /* synthetic */ attc(byte b) {
        super(attd.e);
    }
}
