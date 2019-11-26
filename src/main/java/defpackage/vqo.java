package defpackage;

import android.net.Uri;
import java.util.Map;

/* renamed from: vqo */
public final class vqo implements aftl {
    private final tps a;
    private final Map b;

    private vqo(tps tps, Map map) {
        this.a = tps;
        this.b = map;
    }

    public static vqo a(tps tps, Map map) {
        return new vqo(tps, map);
    }

    public final String a(Uri uri, String str) {
        Integer num = (Integer) vqq.a.get(str);
        if (num == null) {
            return null;
        }
        if (!afti.a(this.b, str, uri)) {
            return (String) vqq.b.get(str);
        }
        int intValue = num.intValue();
        String str2 = "";
        tps tps;
        if (intValue == 49) {
            tps = this.a;
            if (tps != null) {
                str2 = tps.a;
            }
            return str2;
        } else if (intValue != 60) {
            switch (intValue) {
                case cv.bf /*62*/:
                    tps = this.a;
                    if (tps != null) {
                        str2 = tps.c;
                    }
                    return str2;
                case cv.bg /*63*/:
                    tps = this.a;
                    if (tps != null) {
                        str2 = tps.d;
                    }
                    return str2;
                case 64:
                    tps = this.a;
                    if (tps != null) {
                        str2 = tps.e;
                    }
                    return str2;
                default:
                    return null;
            }
        } else {
            tps = this.a;
            if (tps != null) {
                str2 = tps.b;
            }
            return str2;
        }
    }

    public final String a() {
        return vqo.class.getSimpleName();
    }

    /* synthetic */ vqo(tps tps, Map map, byte b) {
        this(tps, map);
    }
}
