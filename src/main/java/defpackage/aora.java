package defpackage;

/* renamed from: aora */
public final class aora extends anxo implements anzf {
    private aora() {
        super(aoqx.h);
    }

    public final aora a(int i) {
        copyOnWrite();
        aoqx aoqx = (aoqx) this.instance;
        aoqx.a |= 4;
        aoqx.d = i;
        return this;
    }

    /* synthetic */ aora(byte b) {
        super(aoqx.h);
    }

    public final aora b(int i) {
        copyOnWrite();
        aoqx aoqx = (aoqx) this.instance;
        aoqx.a |= 8;
        aoqx.e = i - 1;
        return this;
    }

    public final aora c(int i) {
        copyOnWrite();
        aoqx aoqx = (aoqx) this.instance;
        aoqx.a |= 16;
        aoqx.f = i - 1;
        return this;
    }
}
