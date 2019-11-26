package defpackage;

/* renamed from: wqm */
public final class wqm {
    public anvu a;
    public int b;

    public final azls a() {
        azlr azlr = (azlr) azls.d.createBuilder();
        anvu anvu = this.a;
        azlr.copyOnWrite();
        azls azls = (azls) azlr.instance;
        if (anvu != null) {
            azls.a |= 1;
            azls.b = anvu;
            int i = this.b;
            if (i == 0) {
                i = 1;
            }
            azlr.copyOnWrite();
            azls = (azls) azlr.instance;
            azls.a |= 2;
            azls.c = i - 1;
            return (azls) ((anxl) azlr.build());
        }
        throw new NullPointerException();
    }
}
