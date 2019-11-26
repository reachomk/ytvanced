package defpackage;

/* renamed from: abcd */
public final class abcd extends aaml {
    public anvu a = anvu.a;

    public abcd(aamd aamd, afpt afpt) {
        super("live_chat/manage_user", aamd, afpt);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
    }

    public final /* synthetic */ anzd c() {
        aswa aswa = (aswa) asvx.d.createBuilder();
        anvu anvu = this.a;
        aswa.copyOnWrite();
        asvx asvx = (asvx) aswa.instance;
        if (anvu != null) {
            asvx.a |= 2;
            asvx.c = anvu;
            return aswa;
        }
        throw new NullPointerException();
    }
}
