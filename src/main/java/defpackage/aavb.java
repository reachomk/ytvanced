package defpackage;

import android.text.TextUtils;

/* renamed from: aavb */
public final class aavb extends aaml {
    public String a;
    public String b;
    public String c;
    private final String d;

    public aavb(aamd aamd, afpt afpt) {
        super("comment/create_comment_reply", aamd, afpt);
        String str = "";
        this.a = str;
        this.d = str;
        this.b = str;
        this.c = str;
        g();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.d);
        if (valueOf2.length() == 0) {
            valueOf2 = new String(valueOf);
        } else {
            valueOf2 = valueOf.concat(valueOf2);
        }
        xvd.a(valueOf2);
        xvd.a(this.b);
    }

    public final /* synthetic */ anzd c() {
        asgb asgb;
        asga asga = (asga) asgb.h.createBuilder();
        String str = this.a;
        if (str != null) {
            asga.copyOnWrite();
            asgb = (asgb) asga.instance;
            asgb.a |= 2;
            asgb.e = str;
        }
        str = this.d;
        if (str != null) {
            asga.copyOnWrite();
            asgb = (asgb) asga.instance;
            asgb.a |= 8;
            asgb.g = str;
        }
        str = this.b;
        asga.copyOnWrite();
        asgb = (asgb) asga.instance;
        if (str != null) {
            asgb.a |= 4;
            asgb.f = str;
            if (!TextUtils.isEmpty(this.c)) {
                asfk asfk = (asfk) asfl.c.createBuilder();
                asfk.a(this.c);
                asga.copyOnWrite();
                asgb = (asgb) asga.instance;
                asgb.c = (anxl) asfk.build();
                asgb.b = 7;
            }
            return asga;
        }
        throw new NullPointerException();
    }
}
