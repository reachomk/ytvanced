package defpackage;

/* renamed from: aaua */
public final class aaua extends aamz {
    public aaua(aamd aamd, afpt afpt, String str, boolean z) {
        atfu atfu = (atfu) atfr.e.createBuilder();
        atfu.copyOnWrite();
        atfr atfr = (atfr) atfu.instance;
        if (str != null) {
            atfr.a |= 2;
            atfr.c = str;
            atfu.copyOnWrite();
            atfr atfr2 = (atfr) atfu.instance;
            atfr2.a |= 4;
            atfr2.d = z;
            super(aamd, afpt, "conversation/related_video_replies", atfu);
            return;
        }
        throw new NullPointerException();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        xvd.a(((atfr) ((atfu) c()).instance).c);
    }
}
