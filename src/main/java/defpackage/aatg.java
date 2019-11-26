package defpackage;

/* renamed from: aatg */
public final class aatg extends aamz {
    public aatg(aamd aamd, afpt afpt, String str) {
        asdr asdr = (asdr) asdo.d.createBuilder();
        str = (String) amqw.a((Object) str);
        asdr.copyOnWrite();
        asdo asdo = (asdo) asdr.instance;
        if (str != null) {
            asdo.a |= 2;
            asdo.c = str;
            super(aamd, afpt, "conversation/edit_post", asdr);
            g();
            return;
        }
        throw new NullPointerException();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
    }
}
