package defpackage;

import android.text.TextUtils;
import android.util.Log;

/* renamed from: shu */
final /* synthetic */ class shu implements ar {
    private final shr a;

    shu(shr shr) {
        this.a = shr;
    }

    public final void a(Object obj) {
        shr shr = this.a;
        shk shk = (shk) obj;
        int ordinal = shk.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                String str;
                if (ordinal == 2) {
                    str = shr.o.h.d;
                    if (TextUtils.isEmpty(str)) {
                        shr.a((CharSequence) "empty url", null);
                    } else {
                        shr.p = false;
                        shr.l.a();
                        shr.m.loadUrl(str);
                    }
                } else if (!(ordinal == 3 || ordinal == 4)) {
                    str = String.valueOf(shk);
                    StringBuilder stringBuilder = new StringBuilder(str.length() + 30);
                    stringBuilder.append("An unknown state encountered: ");
                    stringBuilder.append(str);
                    Log.e("Gm2ConsentActivity", stringBuilder.toString());
                }
            }
            shr.l.a();
            return;
        }
        shr.l.b();
        shr.l.setVisibility(8);
    }
}
