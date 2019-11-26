package defpackage;

/* renamed from: abcf */
public final class abcf extends aaml {
    public anvu a = anvu.a;
    public String b;
    public augl c;
    public String d;

    public abcf(aamd aamd, afpt afpt) {
        super("live_chat/send_message", aamd, afpt);
        g();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
    }

    public final /* synthetic */ anzd c() {
        athn athn = (athn) atho.g.createBuilder();
        anvu anvu = this.a;
        athn.copyOnWrite();
        atho atho = (atho) athn.instance;
        if (anvu != null) {
            String str;
            atho.a |= 2;
            atho.e = anvu;
            augl augl = this.c;
            if (augl == null) {
                str = this.b;
                athn.copyOnWrite();
                atho = (atho) athn.instance;
                if (str != null) {
                    atho.b = 4;
                    atho.c = str;
                } else {
                    throw new NullPointerException();
                }
            }
            athn.copyOnWrite();
            atho = (atho) athn.instance;
            atho.c = augl;
            atho.b = 6;
            str = aali.b(this.d);
            athn.copyOnWrite();
            atho = (atho) athn.instance;
            if (str != null) {
                atho.a |= 16;
                atho.f = str;
                return athn;
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }
}
