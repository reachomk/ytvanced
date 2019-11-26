package defpackage;

import android.text.TextUtils;

/* renamed from: aisl */
public class aisl {
    private final abka a;
    private final xci b;
    private final aisj c;

    public aisl(xci xci, abka abka, aisj aisj) {
        this.b = xci;
        this.a = abka;
        this.c = aisj;
    }

    protected aisl() {
        this.b = null;
        this.a = null;
        this.c = new aisj();
    }

    public final void a(String str, String str2, int i, String str3, byte[] bArr, afsw afsw) {
        a(str, str2, i, str3, bArr, afsw, null);
    }

    private final void a(String str, String str2, int i, String str3, byte[] bArr, afsw afsw, acxt acxt) {
        this.b.d(new ahjw());
        if (acxt != null) {
            acxt.a("wn_s");
        }
        abkg a = a(str, str2, i, str3, bArr, acxt);
        aafv a2 = this.c.a(a);
        if (a2 != null) {
            a(a2, afsw, acxt);
        } else {
            this.a.a(a, new aisk(this, afsw, acxt));
        }
    }

    public final anjv a(aiqq aiqq) {
        return a(aiqq, null);
    }

    public final anjv a(aiqq aiqq, acxt acxt) {
        afsx a = afsx.a();
        String b = aiqq.b();
        if (TextUtils.isEmpty(b)) {
            if (aiqq.a.c.size() <= 0) {
                b = "";
            } else {
                nkm nkm = aiqq.a;
                b = (String) nkm.c.get(aiqq.e());
            }
        }
        a(b, aiqq.c(), aiqq.d(), aiqq.h(), aiqq.k(), a, acxt);
        return a;
    }

    /* Access modifiers changed, original: protected */
    public abkg a(String str, String str2, int i, String str3, byte[] bArr, acxt acxt) {
        abkg a = this.a.a();
        a.b = (String) amqw.a((Object) str2);
        a.c = i;
        a.c(str);
        a.d(str3);
        a.a(bArr);
        a.n = new aism(this.b, acxt);
        return a;
    }

    public final void a(aafv aafv, afsw afsw, acxt acxt) {
        this.b.d(new ahjx());
        if (acxt != null) {
            acxt.a("wn_r");
        }
        afsw.a(aafv);
    }
}
