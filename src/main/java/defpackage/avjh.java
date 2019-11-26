package defpackage;

/* renamed from: avjh */
public final class avjh extends anxo implements anzf {
    private avjh() {
        super(avjf.h);
    }

    public final String a() {
        return ((avjf) this.instance).b;
    }

    public final avjh a(String str) {
        copyOnWrite();
        avjf avjf = (avjf) this.instance;
        if (str != null) {
            avjf.a |= 1;
            avjf.b = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final avjh a(int i) {
        copyOnWrite();
        avjf avjf = (avjf) this.instance;
        avjf.a |= 2;
        avjf.c = i;
        return this;
    }

    public final avjh b(int i) {
        copyOnWrite();
        avjf avjf = (avjf) this.instance;
        avjf.a |= 4;
        avjf.d = i;
        return this;
    }

    public final avjh b(String str) {
        copyOnWrite();
        avjf avjf = (avjf) this.instance;
        if (str != null) {
            avjf.a |= 32;
            avjf.e = str;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ avjh(byte b) {
        super(avjf.h);
    }
}
