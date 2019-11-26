package defpackage;

import android.text.TextUtils;

/* renamed from: abma */
public final class abma extends aaml {
    public String a;
    public String b;
    public String c;
    public byte[] d = ablj.g;
    public byte[] e = null;
    public String p;
    public String q;
    public byte[] r;
    public byte[] s;
    public String t;
    public String u;
    private final String v;

    public abma(aamd aamd, afpt afpt) {
        super("ypc/complete_transaction", aamd, afpt);
        String str = "";
        this.a = str;
        this.b = str;
        this.c = str;
        this.p = str;
        this.q = str;
        this.v = str;
        this.r = ablj.b;
        this.s = ablj.a;
        this.t = str;
        this.u = str;
        this.j = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        atqa atqa = (atqa) ((anxl) n().build());
        boolean[] zArr = new boolean[3];
        int i = atqa.a;
        boolean z = false;
        zArr[0] = (i & 8) != 0;
        zArr[1] = (i & 16) != 0;
        zArr[2] = (i & 32) != 0;
        int a = anha.a(zArr);
        if (a == 1 || (a == 0 && !atqa.h.isEmpty())) {
            z = true;
        }
        amqw.b(z, (Object) "More than one params field or none set. ");
    }

    private final atpz n() {
        String str;
        atqa atqa;
        anvu a;
        atpz atpz = (atpz) atqa.n.createBuilder();
        if (!TextUtils.isEmpty(this.c)) {
            str = this.c;
            atpz.copyOnWrite();
            atqa = (atqa) atpz.instance;
            if (str != null) {
                atqa.a |= 2;
                atqa.c = str;
            } else {
                throw new NullPointerException();
            }
        }
        if (bchf.a(this.d)) {
            a = anvu.a(this.d);
            atpz.copyOnWrite();
            atqa = (atqa) atpz.instance;
            if (a != null) {
                atqa.a |= 4;
                atqa.d = a;
            } else {
                throw new NullPointerException();
            }
        }
        if (!TextUtils.isEmpty(this.a)) {
            str = this.a;
            atpz.copyOnWrite();
            atqa = (atqa) atpz.instance;
            if (str != null) {
                atqa.a |= 8;
                atqa.e = str;
            } else {
                throw new NullPointerException();
            }
        } else if (!TextUtils.isEmpty(this.b)) {
            str = this.b;
            atpz.copyOnWrite();
            atqa = (atqa) atpz.instance;
            if (str != null) {
                atqa.a |= 16;
                atqa.f = str;
            } else {
                throw new NullPointerException();
            }
        } else if (bchf.a(this.e)) {
            a = anvu.a(this.e);
            atpz.copyOnWrite();
            atqa = (atqa) atpz.instance;
            if (a != null) {
                atqa.a |= 32;
                atqa.g = a;
            } else {
                throw new NullPointerException();
            }
        }
        if (!TextUtils.isEmpty(this.t)) {
            str = this.t;
            atpz.copyOnWrite();
            atqa = (atqa) atpz.instance;
            if (str != null) {
                atqa.a |= 64;
                atqa.h = str;
            } else {
                throw new NullPointerException();
            }
        }
        if (!(TextUtils.isEmpty(this.p) || TextUtils.isEmpty(this.q))) {
            asgc asgc = (asgc) asgd.i.createBuilder();
            asgc.a(this.p);
            asgc.b(this.q);
            atpz.copyOnWrite();
            atqa = (atqa) atpz.instance;
            atqa.i = (asgd) ((anxl) asgc.build());
            atqa.a |= 128;
        }
        str = this.v;
        atpz.copyOnWrite();
        atqa = (atqa) atpz.instance;
        if (str != null) {
            atqa.a |= 1024;
            atqa.l = str;
            a = anvu.a(this.r);
            atpz.copyOnWrite();
            atqa = (atqa) atpz.instance;
            if (a != null) {
                atqa.a |= 256;
                atqa.j = a;
                a = anvu.a(this.s);
                atpz.copyOnWrite();
                atqa = (atqa) atpz.instance;
                if (a != null) {
                    atqa.a |= 512;
                    atqa.k = a;
                    if (!TextUtils.isEmpty(this.u)) {
                        apvp apvp = (apvp) apvq.c.createBuilder();
                        String str2 = this.u;
                        apvp.copyOnWrite();
                        apvq apvq = (apvq) apvp.instance;
                        if (str2 != null) {
                            apvq.a |= 1;
                            apvq.b = str2;
                            atpz.copyOnWrite();
                            atqa = (atqa) atpz.instance;
                            atqa.m = (apvq) ((anxl) apvp.build());
                            atqa.a |= 2048;
                        } else {
                            throw new NullPointerException();
                        }
                    }
                    return atpz;
                }
                throw new NullPointerException();
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }

    public final /* synthetic */ anzd c() {
        return n();
    }
}
