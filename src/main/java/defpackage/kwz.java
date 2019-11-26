package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: kwz */
final /* synthetic */ class kwz implements OnClickListener {
    private final kww a;
    private final aaas b;
    private final kwy c;

    kwz(kww kww, aaas aaas, kwy kwy) {
        this.a = kww;
        this.b = aaas;
        this.c = kwy;
    }

    public final void onClick(View view) {
        kww kww = this.a;
        aaas aaas = this.b;
        kwy kwy = this.c;
        int a = awhb.a(kww.a.e);
        if (a == 0) {
            a = 1;
        }
        a--;
        awgy awgy;
        if (a == 0) {
            apxu apxu = kww.a.f;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, null);
            kwy.b();
        } else if (a != 3) {
            apxu apxu2 = kww.a.f;
            if (apxu2 == null) {
                apxu2 = apxu.d;
            }
            aaas.a(apxu2, null);
            awgy = (awgy) ((anxo) kww.a.toBuilder());
            awgy.a(4);
            kww.a = (awgz) ((anxl) awgy.build());
            kww.b();
        } else {
            apxu apxu3 = kww.a.g;
            if (apxu3 == null) {
                apxu3 = apxu.d;
            }
            aaas.a(apxu3, null);
            awgy = (awgy) ((anxo) kww.a.toBuilder());
            awgy.a(2);
            kww.a = (awgz) ((anxl) awgy.build());
            kww.b();
            kwy.a();
        }
    }
}
