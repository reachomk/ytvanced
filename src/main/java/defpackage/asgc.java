package defpackage;

/* renamed from: asgc */
public final class asgc extends anxo implements anzf {
    private asgc() {
        super(asgd.i);
    }

    public final asgc a(String str) {
        copyOnWrite();
        asgd asgd = (asgd) this.instance;
        if (str != null) {
            asgd.a |= 2;
            asgd.e = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final asgc b(String str) {
        copyOnWrite();
        asgd asgd = (asgd) this.instance;
        if (str != null) {
            asgd.a |= 4;
            asgd.f = str;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ asgc(byte b) {
        super(asgd.i);
    }
}
