package defpackage;

/* renamed from: asxv */
public final class asxv extends anxo implements anzf {
    private asxv() {
        super(asxw.u);
    }

    public final asxv a(String str) {
        copyOnWrite();
        asxw asxw = (asxw) this.instance;
        if (str != null) {
            asxw.a |= 2;
            asxw.d = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final asxv a(asxq asxq) {
        copyOnWrite();
        asxw asxw = (asxw) this.instance;
        asxw.e = (asxn) ((anxl) asxq.build());
        asxw.a |= 4;
        return this;
    }

    public final asxv a(aswu aswu) {
        copyOnWrite();
        asxw asxw = (asxw) this.instance;
        asxw.f = (aswr) ((anxl) aswu.build());
        asxw.a |= 8;
        return this;
    }

    @Deprecated
    public final asxv a(asxi asxi) {
        copyOnWrite();
        asxw asxw = (asxw) this.instance;
        asxw.g = (asxf) ((anxl) asxi.build());
        asxw.a |= 16;
        return this;
    }

    public final asxv a(asxo asxo) {
        copyOnWrite();
        asxw asxw = (asxw) this.instance;
        asxw.h = (asxl) ((anxl) asxo.build());
        asxw.a |= 128;
        return this;
    }

    public final asxv a(asxc asxc) {
        copyOnWrite();
        asxw asxw = (asxw) this.instance;
        asxw.k = (aswz) ((anxl) asxc.build());
        asxw.a |= 16384;
        return this;
    }

    public final boolean a() {
        return (((asxw) this.instance).a & 4194304) != 0;
    }

    public final asxh b() {
        asxh asxh = ((asxw) this.instance).p;
        return asxh == null ? asxh.d : asxh;
    }

    public final asxv a(asxk asxk) {
        copyOnWrite();
        asxw asxw = (asxw) this.instance;
        asxw.p = (asxh) ((anxl) asxk.build());
        asxw.a |= 4194304;
        return this;
    }

    public final asxv a(asxe asxe) {
        copyOnWrite();
        asxw asxw = (asxw) this.instance;
        asxw.q = (asxb) ((anxl) asxe.build());
        asxw.a |= 8388608;
        return this;
    }

    /* synthetic */ asxv(byte b) {
        super(asxw.u);
    }
}
