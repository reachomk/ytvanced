package defpackage;

/* renamed from: bacw */
public final class bacw extends anxo implements anzf {
    private bacw() {
        super(bacx.e);
    }

    public final bacw a(badg badg) {
        copyOnWrite();
        bacx bacx = (bacx) this.instance;
        if (badg != null) {
            bacx.c = badg;
            bacx.b = 1;
            return this;
        }
        throw new NullPointerException();
    }

    public final bacw a(badj badj) {
        copyOnWrite();
        bacx bacx = (bacx) this.instance;
        bacx.c = (anxl) badj.build();
        bacx.b = 1;
        return this;
    }

    public final bacw a(badh badh) {
        copyOnWrite();
        bacx bacx = (bacx) this.instance;
        bacx.c = (anxl) badh.build();
        bacx.b = 2;
        return this;
    }

    public final bacw a(bacd bacd) {
        copyOnWrite();
        bacx bacx = (bacx) this.instance;
        bacx.c = (anxl) bacd.build();
        bacx.b = 3;
        return this;
    }

    public final bacw a(baba baba) {
        copyOnWrite();
        bacx bacx = (bacx) this.instance;
        bacx.c = (anxl) baba.build();
        bacx.b = 4;
        return this;
    }

    public final bacw a(baav baav) {
        copyOnWrite();
        bacx bacx = (bacx) this.instance;
        bacx.c = (anxl) baav.build();
        bacx.b = 6;
        return this;
    }

    public final bacw a(bado bado) {
        copyOnWrite();
        bacx bacx = (bacx) this.instance;
        bacx.c = (anxl) bado.build();
        bacx.b = 7;
        return this;
    }

    public final bacw a(boolean z) {
        copyOnWrite();
        bacx bacx = (bacx) this.instance;
        bacx.a |= 256;
        bacx.d = z;
        return this;
    }

    /* synthetic */ bacw(byte b) {
        super(bacx.e);
    }
}
