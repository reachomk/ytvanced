package defpackage;

/* renamed from: aptm */
public final class aptm extends anxo implements anzf {
    private aptm() {
        super(aptn.c);
    }

    /* synthetic */ aptm(byte b) {
        super(aptn.c);
    }

    public final aptm a(int i) {
        copyOnWrite();
        aptn aptn = (aptn) this.instance;
        aptn.a |= 1;
        aptn.b = i - 1;
        return this;
    }
}
