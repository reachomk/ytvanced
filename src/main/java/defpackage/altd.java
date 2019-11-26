package defpackage;

import android.text.TextUtils;

/* renamed from: altd */
public final class altd {
    public final axro a = ((axro) axrp.h.createBuilder());

    public final altd a(altb altb) {
        axro axro = this.a;
        axrh a = altb.a();
        axro.copyOnWrite();
        axrp axrp = (axrp) axro.instance;
        if (a != null) {
            axrp.b = a;
            axrp.a |= 1;
            return this;
        }
        throw new NullPointerException();
    }

    public final altd a(String str) {
        int i = !TextUtils.isEmpty(str) ? 2 : 3;
        axro axro = this.a;
        axro.copyOnWrite();
        axrp axrp = (axrp) axro.instance;
        axrp.a = 2 | axrp.a;
        axrp.c = i - 1;
        return this;
    }

    public final altd b(String str) {
        axro axro = this.a;
        axro.copyOnWrite();
        axrp axrp = (axrp) axro.instance;
        axrp.a |= 4;
        axrp.d = str;
        return this;
    }

    public final altd c(String str) {
        axro axro = this.a;
        axro.copyOnWrite();
        axrp axrp = (axrp) axro.instance;
        if (str != null) {
            axrp.a |= 8;
            axrp.e = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final asmw a() {
        asmz asmz = (asmz) asmw.f.createBuilder();
        axrp axrp = (axrp) ((anxl) this.a.build());
        asmz.copyOnWrite();
        asmw asmw = (asmw) asmz.instance;
        if (axrp != null) {
            asmw.c = axrp;
            asmw.b = 86;
            return (asmw) ((anxl) asmz.build());
        }
        throw new NullPointerException();
    }
}
