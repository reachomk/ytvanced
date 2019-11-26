package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: tgp */
final class tgp implements tgj {
    public final String a;
    public boolean b = false;
    public final List c = new ArrayList();

    public tgp(String str) {
        this.a = str;
    }

    public final tgg a() {
        return new tgm(this);
    }

    public final tgj b() {
        this.b = true;
        return this;
    }

    public final tgj a(String str) {
        this.c.add(str);
        return this;
    }
}
