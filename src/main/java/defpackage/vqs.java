package defpackage;

import android.net.Uri;

/* renamed from: vqs */
public final class vqs implements aftl {
    private final xsc a;
    private final xpt b;
    private final xhv c;
    private final xvz d;
    private final String e;

    public vqs(vdj vdj, xsc xsc, xpt xpt, xhv xhv, xvz xvz) {
        String valueOf = String.valueOf(vdj.a());
        String str = "a.";
        if (valueOf.length() == 0) {
            valueOf = new String(str);
        } else {
            valueOf = str.concat(valueOf);
        }
        this.e = valueOf;
        this.a = xsc;
        if (!vdj.g()) {
            xpt = null;
        }
        this.b = xpt;
        this.c = xhv;
        this.d = xvz;
    }

    public final String a(Uri uri, String str) {
        Integer num = (Integer) vqq.a.get(str);
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        String str2 = "0";
        if (intValue == 12) {
            xhv xhv = this.c;
            if (xhv != null) {
                str2 = String.valueOf(xhv.k());
            }
            return str2;
        } else if (intValue == 25) {
            xpt xpt = this.b;
            if (xpt != null) {
                return String.valueOf(xpt.b());
            }
            xtl.d("userPresenceTracker is not supported and should not expect receiving LACT macro");
            return "-1";
        } else if (intValue == 31) {
            return this.e;
        } else {
            if (intValue == 33) {
                xvz xvz = this.d;
                if (xvz != null) {
                    str2 = Integer.toString(Math.round(xvz.a() * 100.0f));
                }
                return str2;
            } else if (intValue != 34) {
                return null;
            } else {
                return Long.toString(this.a.a());
            }
        }
    }

    public final String a() {
        return vqs.class.getSimpleName();
    }
}
