package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.HashSet;

/* renamed from: xdj */
public final class xdj implements wya {
    private final wxz a;
    private final xdr b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;

    public xdj(Context context, wxz wxz, xdq xdq, bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = wxz;
        this.c = bcaa;
        this.d = bcaa2;
        this.e = bcaa3;
        this.b = xdq.a(context);
    }

    private static int a(int i) {
        return i != 0 ? i != 2 ? 0 : 1 : 2;
    }

    private final boolean a(String str, xeb xeb) {
        try {
            xeb.a(str);
            this.b.a(xeb.a());
            return true;
        } catch (AbstractMethodError | IllegalArgumentException | SecurityException e) {
            xtl.a("Unable to schedule task", e);
            return false;
        }
    }

    private final boolean b(String str, xeb xeb) {
        String d = this.a.d(str);
        if (d != null) {
            try {
                xeb.a(d);
                this.b.a(xeb.a());
                this.a.a(str, d);
                return true;
            } catch (AbstractMethodError | IllegalArgumentException | SecurityException e) {
                xtl.a("Unable to schedule task", e);
            }
        }
        return false;
    }

    public final boolean a(String str, long j, long j2, boolean z, int i, boolean z2, Bundle bundle, wxy wxy, boolean z3) {
        xdx xdx = (xdx) this.c.get();
        xdx.a(j).b(j2).a(z).a(xdj.a(i)).c(z2).b(z3);
        if (bundle != null) {
            xdx.a(bundle);
        }
        if (wxy != null) {
            xdx.a(a(wxy));
        }
        return a(str, xdx);
    }

    public final boolean a(String str, long j, long j2, boolean z, int i, boolean z2, Bundle bundle, wxy wxy, boolean z3, boolean z4) {
        xdu xdu = (xdu) this.d.get();
        xdu.a(j, j2 + j).a(z).a(xdj.a(i)).c(z2).b(z3);
        if (bundle != null) {
            xdu.a(bundle);
        }
        if (wxy != null) {
            xdu.a(a(wxy));
        }
        if (z4) {
            return b(str, xdu);
        }
        return a(str, xdu);
    }

    public final void a(String str) {
        this.b.a(str);
    }

    public final void b(String str) {
        if (this.a.a(str)) {
            for (String str2 : new HashSet(this.a.b(str))) {
                if (!TextUtils.isEmpty(str2)) {
                    this.b.a(str2);
                }
                this.a.b(str, str2);
            }
        }
    }

    private final xdw a(wxy wxy) {
        xdz xdz = (xdz) this.e.get();
        int i = 1;
        if (wxy.a != 1) {
            i = 0;
        }
        return xdz.a(i).b(wxy.b).c(wxy.c).a();
    }
}
