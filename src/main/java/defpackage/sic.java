package defpackage;

import android.text.TextUtils;
import android.util.Log;

/* renamed from: sic */
final /* synthetic */ class sic implements ar {
    private final shz a;

    sic(shz shz) {
        this.a = shz;
    }

    public final void a(Object obj) {
        shz shz = this.a;
        shk shk = (shk) obj;
        int ordinal = shk.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                String str;
                if (ordinal == 2) {
                    str = shz.i.h.d;
                    if (TextUtils.isEmpty(str)) {
                        shz.a((CharSequence) "empty url", null);
                    } else {
                        shz.p = false;
                        shz.n.a();
                        shz.m.loadUrl(str);
                    }
                } else if (!(ordinal == 3 || ordinal == 4)) {
                    str = String.valueOf(shk);
                    StringBuilder stringBuilder = new StringBuilder(str.length() + 30);
                    stringBuilder.append("An unknown state encountered: ");
                    stringBuilder.append(str);
                    Log.e("Gm2CreateAccount", stringBuilder.toString());
                }
            }
            shz.n.a();
            return;
        }
        shz.n.b();
        shz.n.setVisibility(8);
    }
}
