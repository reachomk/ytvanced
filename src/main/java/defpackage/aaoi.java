package defpackage;

/* renamed from: aaoi */
public final class aaoi extends aaml {
    private final asrn a;

    public aaoi(aamd aamd, afpt afpt, String str, String str2) {
        super("account/get_profile_card", aamd, afpt);
        asrq asrq = (asrq) asrn.e.createBuilder();
        asrq.copyOnWrite();
        asrn asrn = (asrn) asrq.instance;
        if (str != null) {
            asrn.a |= 2;
            asrn.c = str;
            asrq.copyOnWrite();
            asrn = (asrn) asrq.instance;
            if (str2 != null) {
                asrn.a |= 4;
                asrn.d = str2;
                this.a = (asrn) ((anxl) asrq.build());
                return;
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
    }

    public final /* synthetic */ anzd c() {
        return (asrq) ((anxo) this.a.toBuilder());
    }
}
