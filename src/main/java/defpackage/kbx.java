package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: kbx */
final class kbx implements OnClickListener {
    private final /* synthetic */ aaas a;
    private final /* synthetic */ albi b;
    private final /* synthetic */ Context c;
    private final /* synthetic */ kbv d;

    kbx(kbv kbv, aaas aaas, albi albi, Context context) {
        this.d = kbv;
        this.a = aaas;
        this.b = albi;
        this.c = context;
    }

    public final void onClick(View view) {
        kbv kbv = this.d;
        if (kbv.a != null) {
            apxu apxu = kbv.c;
            if (apxu != null) {
                new Handler().postDelayed(new kbw(this.a, apxu, kbv.b, this.b, this.c, kbv.d), 500);
                kbv = this.d;
                if (kbv.e != null && kbv.f != null && kbv.b() != null) {
                    kbv = this.d;
                    kbv.e.a(3, new acvs(kbv.b()), null);
                }
            }
        }
    }
}
