package defpackage;

import android.text.TextUtils;

/* renamed from: abmd */
public final class abmd extends aaml {
    public String a;
    public apig b;
    public long c;
    private String d;

    public abmd(aamd aamd, afpt afpt) {
        super("ypc/get_cart", aamd, afpt);
        String str = "";
        this.a = str;
        this.d = str;
    }

    public final abmd c(String str) {
        this.d = aali.b(str);
        return this;
    }

    public final abmd b(byte[] bArr) {
        if (this.b == null) {
            this.b = (apig) apid.f.createBuilder();
        }
        apig apig = this.b;
        anvu a = anvu.a(bArr);
        apig.copyOnWrite();
        apid apid = (apid) apig.instance;
        if (a != null) {
            apid.a |= 1;
            apid.d = a;
            apig.build();
            return this;
        }
        throw new NullPointerException();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        boolean[] zArr = new boolean[4];
        int i = ((atqc) ((anxl) n().build())).a;
        boolean z = false;
        zArr[0] = (i & 2) != 0;
        zArr[1] = (i & 8) != 0;
        zArr[2] = (i & 16) != 0;
        zArr[3] = (i & 32) != 0;
        if (anha.a(zArr) == 1) {
            z = true;
        }
        amqw.b(z);
    }

    private final atqb n() {
        atqc atqc;
        atqb atqb = (atqb) atqc.h.createBuilder();
        String str;
        if (!TextUtils.isEmpty(this.a)) {
            str = this.a;
            atqb.copyOnWrite();
            atqc = (atqc) atqb.instance;
            if (str != null) {
                atqc.a |= 2;
                atqc.c = str;
            } else {
                throw new NullPointerException();
            }
        } else if (!TextUtils.isEmpty(this.d)) {
            long j = this.c;
            atqb.copyOnWrite();
            atqc atqc2 = (atqc) atqb.instance;
            atqc2.a |= 4;
            atqc2.d = j;
            str = this.d;
            atqb.copyOnWrite();
            atqc = (atqc) atqb.instance;
            if (str != null) {
                atqc.a |= 8;
                atqc.e = str;
            } else {
                throw new NullPointerException();
            }
        }
        apig apig = this.b;
        if (apig != null) {
            atqb.copyOnWrite();
            atqc = (atqc) atqb.instance;
            atqc.g = (apid) ((anxl) apig.build());
            atqc.a |= 32;
        }
        return atqb;
    }

    public final /* synthetic */ anzd c() {
        return n();
    }
}
