package defpackage;

import android.text.TextUtils;

/* renamed from: aaxj */
public final class aaxj extends aaml {
    public String a;
    public String b;
    public boolean c;
    public asor d;
    public asoz e;
    public int p = 1;

    public aaxj(aamd aamd, afpt afpt) {
        super("flag/flag", aamd, afpt);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        boolean z = true;
        int a = amqu.a(this.a) ^ 1;
        if (!amqu.a(null)) {
            a++;
        }
        if (!amqu.a(null)) {
            a++;
        }
        if (a != 1) {
            z = false;
        }
        amqw.a(z);
    }

    public final /* synthetic */ anzd c() {
        String str;
        ason ason;
        asoq asoq = (asoq) ason.j.createBuilder();
        if (!TextUtils.isEmpty(this.a)) {
            str = this.a;
            asoq.copyOnWrite();
            ason = (ason) asoq.instance;
            if (str != null) {
                ason.a |= 2;
                ason.c = str;
            } else {
                throw new NullPointerException();
            }
        }
        int i = this.p;
        if (i != 0) {
            asoq.copyOnWrite();
            ason = (ason) asoq.instance;
            ason.a |= 4;
            ason.d = i - 1;
        }
        asoq.copyOnWrite();
        ason ason2 = (ason) asoq.instance;
        ason2.a |= 2048;
        ason2.i = 0;
        if (!TextUtils.isEmpty(this.b)) {
            str = this.b;
            asoq.copyOnWrite();
            ason = (ason) asoq.instance;
            if (str != null) {
                ason.a |= 8;
                ason.e = str;
            } else {
                throw new NullPointerException();
            }
        }
        boolean z = this.c;
        asoq.copyOnWrite();
        ason = (ason) asoq.instance;
        ason.a |= 16;
        ason.f = z;
        if (!TextUtils.isEmpty(null)) {
            asoq.copyOnWrite();
            throw new NullPointerException();
        } else if (!TextUtils.isEmpty(null)) {
            asoq.copyOnWrite();
            throw new NullPointerException();
        } else if (!TextUtils.isEmpty(null)) {
            asoq.copyOnWrite();
            throw new NullPointerException();
        } else if (!TextUtils.isEmpty(null)) {
            asoq.copyOnWrite();
            throw new NullPointerException();
        } else if (!TextUtils.isEmpty(null)) {
            asoq.copyOnWrite();
            throw new NullPointerException();
        } else if (!TextUtils.isEmpty(null)) {
            asoq.copyOnWrite();
            throw new NullPointerException();
        } else if (TextUtils.isEmpty(null)) {
            asor asor = this.d;
            if (asor != null) {
                asoq.copyOnWrite();
                ason = (ason) asoq.instance;
                ason.g = asor;
                ason.a |= 512;
            }
            asoz asoz = this.e;
            if (asoz != null) {
                asoq.copyOnWrite();
                ason = (ason) asoq.instance;
                ason.h = asoz;
                ason.a |= 1024;
            }
            return asoq;
        } else {
            asoq.copyOnWrite();
            throw new NullPointerException();
        }
    }
}
