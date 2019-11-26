package defpackage;

/* renamed from: abjz */
public final class abjz extends aaml {
    public int a = -1;
    public boolean b;

    public abjz(aamd aamd, afpt afpt) {
        super("video_effects/get_multi_page_sticker_catalog", aamd, afpt, aall.ENABLED);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
    }

    public final String a() {
        afkr k = k();
        k.a("getDefaultPage", this.b);
        k.a("page", (long) this.a);
        return k.a();
    }

    public final /* synthetic */ anzd c() {
        asrh asrh;
        asrk asrk = (asrk) asrh.f.createBuilder();
        asrk.copyOnWrite();
        asrh asrh2 = (asrh) asrk.instance;
        asrh2.a |= 4;
        asrh2.d = "";
        int i = this.a;
        if (i >= 0) {
            asrk.copyOnWrite();
            asrh = (asrh) asrk.instance;
            asrh.a |= 2;
            asrh.c = i;
        }
        boolean z = this.b;
        asrk.copyOnWrite();
        asrh = (asrh) asrk.instance;
        asrh.a |= 8;
        asrh.e = z;
        return asrk;
    }
}
