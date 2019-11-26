package defpackage;

import android.text.TextUtils;

/* renamed from: xyn */
public final class xyn extends aaml {
    public String a;
    public String b;
    public aqje c;
    public boolean d;
    public Boolean e;

    public xyn(aamd aamd, afpt afpt) {
        super("conversation/get_shared", aamd, afpt);
        g();
        a(aall.ENABLED);
    }

    public final void b() {
        amqw.a(TextUtils.isEmpty(this.a) != TextUtils.isEmpty(this.b));
    }

    public final String a() {
        String str = this.a;
        String str2 = this.b;
        afkr afkr = new afkr();
        afkr.a("params", str);
        afkr.a("continuation", str2);
        return afkr.a();
    }

    public final /* synthetic */ anzd c() {
        String str;
        aseg aseg;
        asej asej = (asej) aseg.h.createBuilder();
        int i = 2;
        if (!TextUtils.isEmpty(this.a)) {
            str = this.a;
            asej.copyOnWrite();
            aseg = (aseg) asej.instance;
            if (str != null) {
                aseg.a |= 2;
                aseg.c = str;
            } else {
                throw new NullPointerException();
            }
        }
        if (!TextUtils.isEmpty(this.b)) {
            str = this.b;
            asej.copyOnWrite();
            aseg = (aseg) asej.instance;
            if (str != null) {
                aseg.a |= 4;
                aseg.d = str;
            } else {
                throw new NullPointerException();
            }
        }
        aqje aqje = this.c;
        if (aqje != null) {
            asej.copyOnWrite();
            aseg = (aseg) asej.instance;
            aseg.f = aqje;
            aseg.a |= 16;
        }
        Boolean bool = this.e;
        if (bool != null) {
            if (bool.booleanValue()) {
                i = 3;
            }
            asej.copyOnWrite();
            aseg aseg2 = (aseg) asej.instance;
            aseg2.a |= 64;
            aseg2.g = i - 1;
        }
        boolean z = this.d;
        asej.copyOnWrite();
        aseg aseg3 = (aseg) asej.instance;
        aseg3.a |= 8;
        aseg3.e = z;
        return asej;
    }
}
