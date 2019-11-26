package defpackage;

import android.text.TextUtils;
import java.io.IOException;

/* renamed from: ztc */
final /* synthetic */ class ztc implements Runnable {
    private final zta a;
    private final String b;
    private final zte c;

    ztc(zta zta, String str, zte zte) {
        this.a = zta;
        this.b = str;
        this.c = zte;
    }

    public final void run() {
        zta zta = this.a;
        String str = this.b;
        zte zte = this.c;
        String d = zta.d();
        int i = 6;
        if (TextUtils.isEmpty(d)) {
            i = 2;
        } else {
            zta.a(3, str);
            try {
                sff a = zta.a(str);
                if (a == null) {
                    zta.b(3, str);
                    i = 1;
                } else {
                    sfg.a(zta.c, a.a, d, zta.e());
                    if (zta.a(str) == null) {
                        zta.b(3, str);
                        i = 4;
                    } else {
                        zta.c(3, str);
                    }
                }
            } catch (IOException unused) {
                zta.c(3, str);
            }
        }
        zta.b.runOnUiThread(new ztf(zte, i));
        zta.a.a(i, zta.b);
    }
}
