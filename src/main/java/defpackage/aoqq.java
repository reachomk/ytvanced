package defpackage;

/* renamed from: aoqq */
public final class aoqq extends anxo implements anzf {
    private aoqq() {
        super(aoqo.f);
    }

    public final aoqq a(String str) {
        copyOnWrite();
        aoqo aoqo = (aoqo) this.instance;
        if (str != null) {
            aoqo.a |= 1;
            aoqo.b = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final aoqq b(String str) {
        copyOnWrite();
        aoqo aoqo = (aoqo) this.instance;
        if (str != null) {
            aoqo.a |= 2;
            aoqo.c = str;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ aoqq(byte b) {
        super(aoqo.f);
    }
}
