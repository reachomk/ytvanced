package defpackage;

/* renamed from: atqp */
public final class atqp extends anxo implements anzf {
    private atqp() {
        super(atqq.f);
    }

    public final atqp a(String str) {
        copyOnWrite();
        atqq atqq = (atqq) this.instance;
        if (str != null) {
            atqq.a |= 2;
            atqq.c = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final int a() {
        return ((atqq) this.instance).d.size();
    }

    /* synthetic */ atqp(byte b) {
        super(atqq.f);
    }
}
