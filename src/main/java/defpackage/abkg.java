package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: abkg */
public final class abkg extends aaml {
    public String a;
    public String b;
    public int c = 0;
    public String d;
    public String e;
    public atog p;
    public atou q;
    public String r;
    public long s = -1;
    public amul t;
    public String u;
    public int v;
    private String w;
    private boolean x = false;
    private final List y = new ArrayList();

    public abkg(String str, aamd aamd, afpt afpt, boolean z) {
        super((String) amqw.a((Object) str), aamd, afpt, aall.ENABLED);
        this.h = z;
    }

    public final abkg c(String str) {
        this.a = (String) amqw.a((Object) str);
        return this;
    }

    public final abkg d(String str) {
        this.d = (String) amqw.a((Object) str);
        return this;
    }

    public final abkg e(String str) {
        this.w = (String) amqw.a((Object) str);
        return this;
    }

    public final abkg n() {
        this.x = true;
        return this;
    }

    public final abkg b(int i) {
        this.y.add(Integer.valueOf(i));
        return this;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        boolean z = true;
        if (TextUtils.isEmpty(this.b) && TextUtils.isEmpty(this.a) && TextUtils.isEmpty(this.e) && TextUtils.isEmpty(null)) {
            z = false;
        }
        amqw.b(z);
    }

    public final String a() {
        afkr k = k();
        k.a("videoId", this.a);
        k.a("playlistId", this.b);
        k.a("playlistIndex", (long) aali.a(this.c));
        k.a("gamingEventId", null);
        k.a("params", this.d);
        k.a("adParams", this.w);
        k.a("continuation", this.e);
        k.a("isAdPlayback", this.x);
        k.a("mdxUseDevServer", false);
        String str = "forceAdUrls";
        if (this.t == null) {
            k.a(str, "null");
        } else {
            k.a(str, amqh.a(",").a(this.t));
        }
        k.a("forceAdGroupId", this.u);
        k.a("isAudioOnly", false);
        int i = this.v;
        if (i != 0) {
            k.a("autonavState", (long) (i - 1));
        }
        k.a("serializedThirdPartyEmbedConfig", this.r);
        return k.a();
    }

    public final /* synthetic */ anzd c() {
        String str;
        atpa atpa;
        atoz atoz = (atoz) atpa.v.createBuilder();
        boolean z = this.x;
        atoz.copyOnWrite();
        atpa atpa2 = (atpa) atoz.instance;
        atpa2.a |= 256;
        atpa2.i = z;
        atoz.copyOnWrite();
        atpa atpa3 = (atpa) atoz.instance;
        atpa3.a |= 4096;
        atpa3.k = false;
        atoz.copyOnWrite();
        atpa3 = (atpa) atoz.instance;
        atpa3.a |= 16777216;
        atpa3.o = false;
        atoz.copyOnWrite();
        atpa3 = (atpa) atoz.instance;
        atpa3.a |= 134217728;
        atpa3.q = false;
        if (!TextUtils.isEmpty(this.a)) {
            str = this.a;
            atoz.copyOnWrite();
            atpa = (atpa) atoz.instance;
            if (str != null) {
                atpa.a |= 2;
                atpa.d = str;
            } else {
                throw new NullPointerException();
            }
        }
        if (!TextUtils.isEmpty(this.b)) {
            str = this.b;
            atoz.copyOnWrite();
            atpa = (atpa) atoz.instance;
            if (str != null) {
                atpa.a |= 4;
                atpa.e = str;
            } else {
                throw new NullPointerException();
            }
        }
        if (TextUtils.isEmpty(null)) {
            atpa atpa4;
            int i = this.c;
            if (i > 0) {
                atoz.copyOnWrite();
                atpa = (atpa) atoz.instance;
                atpa.a |= 64;
                atpa.h = i;
            }
            str = this.d;
            if (str != null) {
                atoz.copyOnWrite();
                atpa = (atpa) atoz.instance;
                atpa.a |= 16;
                atpa.f = str;
            }
            str = this.w;
            if (str != null) {
                atoz.copyOnWrite();
                atpa = (atpa) atoz.instance;
                atpa.a |= 512;
                atpa.j = str;
            }
            str = this.e;
            if (str != null) {
                atoz.copyOnWrite();
                atpa = (atpa) atoz.instance;
                atpa.a |= 32;
                atpa.g = str;
            }
            List list = this.y;
            if (list != null) {
                atoz.copyOnWrite();
                atpa = (atpa) atoz.instance;
                if (!atpa.m.a()) {
                    atpa.m = anxl.mutableCopy(atpa.m);
                }
                anvf.addAll(list, atpa.m);
            }
            i = this.v;
            if (!(i == 0 || i == 1)) {
                atoz.copyOnWrite();
                atpa4 = (atpa) atoz.instance;
                if (i != 0) {
                    atpa4.a |= 67108864;
                    atpa4.p = i - 1;
                } else {
                    throw new NullPointerException();
                }
            }
            atog atog = this.p;
            if (atog != null) {
                atoz.copyOnWrite();
                atpa4 = (atpa) atoz.instance;
                atpa4.r = atog;
                atpa4.a |= 536870912;
            }
            atou atou = this.q;
            if (atou != null) {
                atoz.copyOnWrite();
                atpa4 = (atpa) atoz.instance;
                atpa4.u = atou;
                atpa4.b |= 4;
            }
            str = this.r;
            if (str != null) {
                atoz.copyOnWrite();
                atpa4 = (atpa) atoz.instance;
                atpa4.b |= 1;
                atpa4.t = str;
            }
            amul amul = this.t;
            if (amul != null && !amul.isEmpty()) {
                arkm arkm = (arkm) arkn.c.createBuilder();
                arkm.a((String) this.t.get(0));
                arkk arkk = (arkk) arkl.f.createBuilder();
                arkk.a((arkn) ((anxl) arkm.build()));
                atoz.a(arkk);
            } else if (!TextUtils.isEmpty(this.u)) {
                arkk arkk2 = (arkk) arkl.f.createBuilder();
                arkk2.a(this.u);
                atoz.a(arkk2);
            }
            ator ator = (ator) atos.c.createBuilder();
            long j = this.s;
            ator.copyOnWrite();
            atos atos = (atos) ator.instance;
            atos.a = 1 | atos.a;
            atos.b = j;
            atoz.copyOnWrite();
            atpa2 = (atpa) atoz.instance;
            atpa2.s = (atos) ((anxl) ator.build());
            atpa2.a |= aocf.UNSET_ENUM_VALUE;
            return atoz;
        }
        atoz.copyOnWrite();
        throw new NullPointerException();
    }
}
