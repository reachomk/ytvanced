package defpackage;

import android.text.TextUtils;

/* renamed from: abib */
public final class abib extends aaml {
    public String a;
    public String b;
    public String c;
    public atgy d;
    public atgl e;
    private String p;
    private final atgm q;
    private final int r = 1;

    public abib(String str, aamd aamd, afpt afpt, boolean z) {
        super(str, aamd, afpt, aall.ENABLED);
        this.h = z;
        this.q = (atgm) atgj.a.createBuilder();
        g();
    }

    public final abib c(String str) {
        this.p = aali.b(str);
        return this;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        aali.a(this.p, this.a);
    }

    public final String a() {
        afkr k = k();
        k.a("query", this.p);
        k.a("params", this.b);
        k.a("conversationId", this.c);
        k.a("continuation", this.a);
        k.a("filterOptions", ((atgj) ((anxl) this.q.build())).toByteArray());
        atgl atgl = this.e;
        if (atgl != null) {
            k.a("searchFormData", atgl.toByteArray());
        }
        return k.a();
    }

    public final /* synthetic */ anzd c() {
        atgr atgr;
        atgu atgu = (atgu) atgr.m.createBuilder();
        String str = this.b;
        if (str != null) {
            atgu.copyOnWrite();
            atgr = (atgr) atgu.instance;
            atgr.a |= 4;
            atgr.d = str;
        }
        str = this.c;
        if (str != null) {
            atgu.copyOnWrite();
            atgr = (atgr) atgu.instance;
            atgr.a |= 2048;
            atgr.l = str;
        }
        atgm atgm = this.q;
        if (atgm != null) {
            atgu.copyOnWrite();
            atgr = (atgr) atgu.instance;
            atgr.g = (atgj) ((anxl) atgm.build());
            atgr.a |= 32;
        }
        str = this.p;
        if (str != null) {
            atgu.copyOnWrite();
            atgr = (atgr) atgu.instance;
            atgr.a |= 2;
            atgr.c = str;
        }
        atgl atgl = this.e;
        if (atgl != null) {
            atgu.copyOnWrite();
            atgr = (atgr) atgu.instance;
            atgr.h = atgl;
            atgr.a |= 64;
        }
        int i = this.r;
        if (i != 0) {
            atgu.copyOnWrite();
            atgr = (atgr) atgu.instance;
            atgr.a |= 16;
            atgr.f = i - 1;
        }
        str = this.a;
        if (str != null) {
            atgu.copyOnWrite();
            atgr = (atgr) atgu.instance;
            atgr.a |= 8;
            atgr.e = str;
        }
        atgy atgy = this.d;
        if (atgy != null) {
            atgu.copyOnWrite();
            atgr = (atgr) atgu.instance;
            atgr.k = atgy;
            atgr.a |= 1024;
        }
        if (!TextUtils.isEmpty(null)) {
            arkk arkk = (arkk) arkl.f.createBuilder();
            arkk.a(null);
            atgu.a((arkl) ((anxl) arkk.build()));
        }
        return atgu;
    }
}
