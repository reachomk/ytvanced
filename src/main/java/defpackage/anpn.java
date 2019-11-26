package defpackage;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: anpn */
public final class anpn {
    public int a = 0;
    public final Map b = new zj();
    private final anpj c;

    public anpn(anpj anpj) {
        this.c = anpj;
    }

    public final synchronized ryi a(String str) {
        ryl ryl;
        String a;
        synchronized (this.c) {
            a = this.c.a();
            anpj anpj = this.c;
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(a).length() + 1) + String.valueOf(str).length());
            stringBuilder.append(a);
            stringBuilder.append(",");
            stringBuilder.append(str);
            anpj.a(stringBuilder.toString());
        }
        ryl = new ryl();
        this.b.put(Integer.valueOf(this.a + (!TextUtils.isEmpty(a) ? a.split(",").length - 1 : 0)), ryl);
        return ryl.a;
    }

    public final synchronized boolean a() {
        return b() != null;
    }

    public final String b() {
        String a;
        synchronized (this.c) {
            a = this.c.a();
        }
        if (!TextUtils.isEmpty(a)) {
            String[] split = a.split(",");
            if (split.length > 1 && !TextUtils.isEmpty(split[1])) {
                return split[1];
            }
        }
        return null;
    }

    public final synchronized boolean b(String str) {
        synchronized (this.c) {
            String a = this.c.a();
            String str2 = ",";
            String valueOf = String.valueOf(str);
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            if (a.startsWith(valueOf)) {
                str2 = ",";
                str = String.valueOf(str);
                if (str.length() == 0) {
                    str = new String(str2);
                } else {
                    str = str2.concat(str);
                }
                this.c.a(a.substring(str.length()));
                return true;
            }
            return false;
        }
    }
}
