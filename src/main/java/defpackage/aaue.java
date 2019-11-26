package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: aaue */
public final class aaue extends aaml {
    public String[] a;
    public String[] b;
    public axhs c;
    public String d;
    public String e;
    public String p;

    public aaue(aamd aamd, afpt afpt) {
        super("conversation/share_to_conversation", aamd, afpt);
        g();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
    }

    public final /* synthetic */ anzd c() {
        asez asez = (asez) asew.i.createBuilder();
        List asList = Arrays.asList(this.a);
        asez.copyOnWrite();
        asew asew = (asew) asez.instance;
        if (!asew.c.a()) {
            asew.c = anxl.mutableCopy(asew.c);
        }
        anvf.addAll(asList, asew.c);
        asList = Arrays.asList(this.b);
        asez.copyOnWrite();
        asew = (asew) asez.instance;
        if (!asew.d.a()) {
            asew.d = anxl.mutableCopy(asew.d);
        }
        anvf.addAll(asList, asew.d);
        axhs axhs = this.c;
        if (axhs != null) {
            asez.copyOnWrite();
            asew = (asew) asez.instance;
            asew.e = axhs;
            asew.a |= 2;
        }
        String str = this.d;
        if (str != null) {
            asez.copyOnWrite();
            asew = (asew) asez.instance;
            asew.a |= 4;
            asew.f = str;
        }
        str = this.e;
        if (str != null) {
            asez.copyOnWrite();
            asew = (asew) asez.instance;
            asew.a |= 16;
            asew.h = str;
        }
        str = this.p;
        if (str != null) {
            asez.copyOnWrite();
            asew = (asew) asez.instance;
            asew.a |= 8;
            asew.g = str;
        }
        return asez;
    }
}
