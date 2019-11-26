package defpackage;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: xhg */
public final class xhg {
    public String a;
    public String b;
    public xhb c;
    private xgx d;
    private final int e = 2;

    xhg() {
    }

    public final xhc a() {
        xgx xgx;
        xgy xgy;
        xhb xhb = this.c;
        if (xhb != null) {
            String str = xhb.c;
            if (!TextUtils.isEmpty(str)) {
                xgx xgx2 = this.d;
                String str2 = "Content-Type";
                if (xgx2 == null || !xgx2.a(str2)) {
                    a(str2, str);
                }
            }
            String str3;
            if (this.c.a()) {
                xgx = this.d;
                str3 = "Transfer-Encoding";
                if (xgx == null || !xgx.a(str3)) {
                    a(str3, "chunked");
                }
            } else {
                xgx = this.d;
                str3 = "Content-Length";
                if (xgx == null || !xgx.a(str3)) {
                    a(str3, Long.toString(this.c.b));
                }
            }
        }
        xgx = this.d;
        if (xgx == null) {
            xgy = xgy.a;
        } else {
            xgy = xgx.a();
        }
        return new xfl(this.a, this.b, xgy, this.c, this.e);
    }

    private final xgx b() {
        if (this.d == null) {
            this.d = xgy.b();
        }
        return this.d;
    }

    public final xhg a(String str, String str2) {
        b().a(str, str2);
        return this;
    }

    public final xhg b(String str, String str2) {
        xgx b = b();
        Iterator it = b.a.iterator();
        while (it.hasNext()) {
            if (str.equalsIgnoreCase((String) ((Entry) it.next()).getKey())) {
                it.remove();
            }
        }
        b.a(str, str2);
        return this;
    }
}
