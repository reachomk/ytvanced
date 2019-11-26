package defpackage;

import android.text.TextUtils;
import java.util.List;

/* renamed from: aava */
public final class aava extends aaml {
    public String a;
    public String b;
    public List c = null;
    public String d;
    public String e;
    public String p;
    public String q;
    public String r;

    public aava(aamd aamd, afpt afpt) {
        super("comment/create_comment", aamd, afpt);
        String str = "";
        this.a = str;
        this.b = str;
        this.d = str;
        this.e = str;
        this.p = str;
        this.q = str;
        this.r = str;
        g();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        xvd.a(this.a);
        boolean z = true;
        if (TextUtils.isEmpty(this.b) && TextUtils.isEmpty(this.d)) {
            z = false;
        }
        amqw.a(z);
    }

    public final /* synthetic */ anzd c() {
        asgd asgd;
        String str;
        asgd asgd2;
        asgc asgc = (asgc) asgd.i.createBuilder();
        asgc.a(this.a);
        asgc.b(this.b);
        List list = this.c;
        if (list != null && list.size() > 0) {
            asfo asfo = (asfo) asfp.b.createBuilder();
            List list2 = this.c;
            asfo.copyOnWrite();
            asfp asfp = (asfp) asfo.instance;
            if (!asfp.a.a()) {
                asfp.a = anxl.mutableCopy(asfp.a);
            }
            anvf.addAll(list2, asfp.a);
            asfp asfp2 = (asfp) ((anxl) asfo.build());
            asgc.copyOnWrite();
            asgd = (asgd) asgc.instance;
            if (asfp2 != null) {
                asgd.c = asfp2;
                asgd.b = 8;
            } else {
                throw new NullPointerException();
            }
        }
        if (!TextUtils.isEmpty(this.d)) {
            asfi asfi = (asfi) asfj.d.createBuilder();
            str = this.d;
            asfi.copyOnWrite();
            asfj asfj = (asfj) asfi.instance;
            if (str != null) {
                asfj.a |= 1;
                asfj.b = str;
                if (!TextUtils.isEmpty(this.r)) {
                    str = this.r;
                    asfi.copyOnWrite();
                    asfj = (asfj) asfi.instance;
                    if (str != null) {
                        asfj.a |= 2;
                        asfj.c = str;
                    } else {
                        throw new NullPointerException();
                    }
                }
                asgc.copyOnWrite();
                asgd2 = (asgd) asgc.instance;
                asgd2.c = (anxl) asfi.build();
                asgd2.b = 9;
            } else {
                throw new NullPointerException();
            }
        }
        if (!TextUtils.isEmpty(this.e)) {
            asfq asfq = (asfq) asfr.c.createBuilder();
            str = this.e;
            asfq.copyOnWrite();
            asfr asfr = (asfr) asfq.instance;
            if (str != null) {
                asfr.a |= 1;
                asfr.b = str;
                asgc.copyOnWrite();
                asgd2 = (asgd) asgc.instance;
                asgd2.c = (anxl) asfq.build();
                asgd2.b = 7;
            } else {
                throw new NullPointerException();
            }
        }
        if (!TextUtils.isEmpty(this.p)) {
            asfk asfk = (asfk) asfl.c.createBuilder();
            asfk.a(this.p);
            asgc.copyOnWrite();
            asgd2 = (asgd) asgc.instance;
            asgd2.c = (anxl) asfk.build();
            asgd2.b = 10;
        }
        if (!TextUtils.isEmpty(this.q)) {
            String substring;
            if (this.q.startsWith("fallback_")) {
                try {
                    substring = this.q.substring(9);
                    int a = apze.a(Integer.parseInt(substring));
                    if (a == 0) {
                        str = "Unrecognized value: ";
                        substring = String.valueOf(substring);
                        throw new NumberFormatException(substring.length() == 0 ? new String(str) : str.concat(substring));
                    }
                    asfe asfe = (asfe) asff.c.createBuilder();
                    asfe.copyOnWrite();
                    asff asff = (asff) asfe.instance;
                    asff.a |= 1;
                    asff.b = a - 1;
                    asgc.copyOnWrite();
                    asgd = (asgd) asgc.instance;
                    asgd.g = (asff) ((anxl) asfe.build());
                    asgd.a |= 16;
                } catch (NumberFormatException unused) {
                    xtl.c("Error parsing accessRestrictionValue for comment request.");
                }
            } else {
                substring = this.q;
                asgc.copyOnWrite();
                asgd = (asgd) asgc.instance;
                if (substring != null) {
                    asgd.a |= 32;
                    asgd.h = substring;
                } else {
                    throw new NullPointerException();
                }
            }
        }
        return asgc;
    }
}
