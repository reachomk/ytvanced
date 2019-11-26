package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: abgh */
public final class abgh extends aaml {
    public String a;
    public final List b = new ArrayList();
    public String c;

    protected abgh(aamd aamd, afpt afpt) {
        super("browse/edit_playlist", aamd, afpt);
    }

    public final abgh a(List list) {
        for (awhn add : list) {
            this.b.add(add);
        }
        return this;
    }

    public final abgh a(String str, String str2) {
        awhm awhm = (awhm) awhn.l.createBuilder();
        awhm.a(36);
        awhm.copyOnWrite();
        awhn awhn = (awhn) awhm.instance;
        if (str != null) {
            awhn.a |= 8;
            awhn.d = str;
            if (str2 != null) {
                awhm.copyOnWrite();
                awhn awhn2 = (awhn) awhm.instance;
                awhn2.a |= 16;
                awhn2.e = str2;
            }
            this.b.add((awhn) ((anxl) awhm.build()));
            return this;
        }
        throw new NullPointerException();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        boolean z = true;
        amqw.b(this.a != null);
        if (this.b.size() <= 0) {
            z = false;
        }
        amqw.b(z);
    }

    public final /* synthetic */ anzd c() {
        atev atev;
        atey atey = (atey) atev.f.createBuilder();
        String str = this.a;
        if (str != null) {
            atey.copyOnWrite();
            atev = (atev) atey.instance;
            atev.a |= 2;
            atev.c = str;
        }
        List list = this.b;
        atey.copyOnWrite();
        atev = (atev) atey.instance;
        if (!atev.d.a()) {
            atev.d = anxl.mutableCopy(atev.d);
        }
        anvf.addAll(list, atev.d);
        str = this.c;
        if (str != null) {
            atey.copyOnWrite();
            atev = (atev) atey.instance;
            atev.a |= 4;
            atev.e = str;
        }
        return atey;
    }
}
