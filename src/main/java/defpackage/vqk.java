package defpackage;

import android.net.Uri;

/* renamed from: vqk */
public final class vqk implements aftl {
    private final vqi a;

    public vqk(vqi vqi) {
        this.a = vqi;
    }

    public final String a(Uri uri, String str) {
        Integer num = (Integer) vqq.a.get(str);
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        String str2 = "0";
        vqi vqi;
        if (intValue == 4) {
            vqi = this.a;
            if (vqi != null) {
                str2 = Integer.toString(vqi.b.k);
            }
            return str2;
        } else if (intValue == 10) {
            vqi = this.a;
            if (!(vqi == null || vqi.b.i == 0)) {
                str2 = "1";
            }
            return str2;
        } else if (intValue == 24) {
            vqi = this.a;
            if (vqi != null) {
                str2 = Integer.toString(vqi.b.i);
            }
            return str2;
        } else if (intValue == 16) {
            vqi = this.a;
            if (vqi != null) {
                str2 = Integer.toString(vqi.b.j);
            }
            return str2;
        } else if (intValue != 17) {
            return null;
        } else {
            vqi = this.a;
            if (vqi != null) {
                String str3 = vqi.c;
                if (str3 != null) {
                    return str3;
                }
            }
            return "";
        }
    }

    public final String a() {
        return vqk.class.getSimpleName();
    }
}
