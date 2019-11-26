package defpackage;

/* renamed from: abaw */
public final class abaw extends aaml {
    public String a;
    public String b;
    public String c;

    public abaw(aamd aamd, afpt afpt) {
        super("live_chat/enable_superchat", aamd, afpt);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
    }

    public final /* synthetic */ anzd c() {
        asms asms;
        asmv asmv = (asmv) asms.f.createBuilder();
        String str = this.a;
        if (str != null) {
            asmv.copyOnWrite();
            asms = (asms) asmv.instance;
            asms.a |= 2;
            asms.c = str;
        }
        str = this.b;
        if (str != null) {
            asmv.copyOnWrite();
            asms = (asms) asmv.instance;
            asms.a |= 4;
            asms.d = str;
        }
        str = this.c;
        if (str != null) {
            asmv.copyOnWrite();
            asms = (asms) asmv.instance;
            asms.a |= 8;
            asms.e = str;
        }
        return asmv;
    }
}
