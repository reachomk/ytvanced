package defpackage;

/* renamed from: asib */
public final class asib extends anxo implements anzf {
    private asib() {
        super(ashy.l);
    }

    public final ashl a() {
        ashl ashl = ((ashy) this.instance).b;
        return ashl == null ? ashl.O : ashl;
    }

    public final asib a(ashn ashn) {
        copyOnWrite();
        ashy ashy = (ashy) this.instance;
        ashy.b = (ashl) ((anxl) ashn.build());
        ashy.a |= 1;
        return this;
    }

    public final asik b() {
        asik asik = ((ashy) this.instance).d;
        return asik == null ? asik.e : asik;
    }

    public final asib a(asin asin) {
        copyOnWrite();
        ashy ashy = (ashy) this.instance;
        ashy.d = (asik) ((anxl) asin.build());
        ashy.a |= 4;
        return this;
    }

    public final asia c() {
        asia asia = ((ashy) this.instance).f;
        return asia == null ? asia.g : asia;
    }

    public final asib a(asid asid) {
        copyOnWrite();
        ashy ashy = (ashy) this.instance;
        ashy.f = (asia) ((anxl) asid.build());
        ashy.a |= 16;
        return this;
    }

    /* synthetic */ asib(byte b) {
        super(ashy.l);
    }
}
