package defpackage;

/* renamed from: aokl */
public final class aokl extends anxq implements anzf {
    private aokl() {
        super(aokm.f);
    }

    public final aokl a(String str) {
        copyOnWrite();
        aokm aokm = (aokm) this.instance;
        aokm.a |= 1;
        aokm.b = str;
        return this;
    }

    public final aokl a() {
        copyOnWrite();
        aokm aokm = (aokm) this.instance;
        aokm.a |= 4;
        aokm.d = true;
        return this;
    }

    /* synthetic */ aokl(byte b) {
        super(aokm.f);
    }
}
