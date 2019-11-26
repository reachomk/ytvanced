package defpackage;

import android.content.Context;

/* renamed from: ejt */
public final class ejt {
    public final Context a;
    public apah b;
    private apal c;
    private apan d;
    private arml e;
    private arml f;
    private apah g;

    public ejt(Context context) {
        this.a = (Context) amqw.a((Object) context);
    }

    public final apaj a() {
        apaj apaj;
        apai apai = (apai) apaj.k.createBuilder();
        apal apal = this.c;
        if (apal != null) {
            apai.copyOnWrite();
            apaj = (apaj) apai.instance;
            apaj.i = apal;
            apaj.a |= 128;
        }
        apan apan = this.d;
        if (apan != null) {
            apai.copyOnWrite();
            apaj = (apaj) apai.instance;
            apaj.c = apan;
            apaj.b = 3;
        }
        arml arml = this.e;
        if (arml != null) {
            apai.copyOnWrite();
            apaj = (apaj) apai.instance;
            apaj.d = arml;
            apaj.a |= 1;
        }
        arml = this.f;
        if (arml != null) {
            apai.copyOnWrite();
            apaj = (apaj) apai.instance;
            apaj.e = arml;
            apaj.a |= 2;
        }
        apah apah = this.g;
        if (apah != null) {
            apai.copyOnWrite();
            apaj = (apaj) apai.instance;
            apaj.g = apah;
            apaj.a |= 32;
        }
        apah = this.b;
        if (apah != null) {
            apai.copyOnWrite();
            apaj = (apaj) apai.instance;
            apaj.h = apah;
            apaj.a |= 64;
        }
        return (apaj) ((anxl) apai.build());
    }

    public final ejt a(arwh arwh) {
        apam apam = (apam) apan.c.createBuilder();
        apam.copyOnWrite();
        apan apan = (apan) apam.instance;
        if (arwh != null) {
            apan.a |= 1;
            apan.b = arwh.el;
            this.d = (apan) ((anxl) apam.build());
            return this;
        }
        throw new NullPointerException();
    }

    public final ejt a(int i) {
        this.e = ajqy.a(this.a.getString(i));
        return this;
    }

    public final ejt b(int i) {
        this.f = ajqy.a(this.a.getString(i));
        return this;
    }

    public final ejt c(int i) {
        apak apak = (apak) apal.c.createBuilder();
        apak.copyOnWrite();
        apal apal = (apal) apak.instance;
        apal.a |= 1;
        apal.b = i - 1;
        this.c = (apal) ((anxl) apak.build());
        return this;
    }

    public final ejt a(int i, int i2, int i3, apxu apxu) {
        aphf aphf = (aphf) aphg.s.createBuilder();
        aphf.a(3);
        aphf.b(4);
        aphf.a(ajqy.a(this.a.getString(i3)));
        if (apxu != null) {
            aphf.b(apxu);
        }
        apag apag = (apag) apah.c.createBuilder();
        apag.a(aphf);
        this.g = (apah) ((anxl) apag.build());
        return this;
    }
}
