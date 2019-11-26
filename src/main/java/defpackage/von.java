package defpackage;

import android.content.SharedPreferences;

/* renamed from: von */
public final class von implements abkh {
    private final voe a;

    public von(SharedPreferences sharedPreferences) {
        this.a = new voe(sharedPreferences);
    }

    public final void a(abkg abkg) {
        if (this.a.a.getBoolean(voj.WATCH_NEXT.d, false)) {
            voi a = this.a.a(voj.WATCH_NEXT);
            String c;
            Object b;
            switch (a.ordinal()) {
                case 12:
                    c = this.a.c(voj.WATCH_NEXT);
                    if (c != null) {
                        abkg.u = c;
                        return;
                    }
                    break;
                case 13:
                    b = this.a.b(voj.WATCH_NEXT);
                    if (b != null) {
                        abkg.t = amul.a(b);
                        return;
                    }
                    break;
                case 14:
                    break;
                default:
                    String str = "https://afimplex.appspot.com/mobile/";
                    c = String.valueOf(a.c);
                    if (c.length() == 0) {
                        b = new String(str);
                    } else {
                        b = str.concat(c);
                    }
                    abkg.t = amul.a(b);
                    break;
            }
        }
    }
}
