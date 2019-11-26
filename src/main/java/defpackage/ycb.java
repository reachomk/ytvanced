package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.Collections;

/* renamed from: ycb */
final /* synthetic */ class ycb implements OnClickListener {
    private final ybz a;

    ycb(ybz ybz) {
        this.a = ybz;
    }

    public final void onClick(View view) {
        xyu xyu = this.a.ae;
        aphg aphg = xyu.d;
        if (aphg != null) {
            if ((aphg.a & 262144) != 0) {
                xyu.a.a(3, new acvs(aphg.r), null);
            }
            aphg = xyu.d;
            if ((aphg.a & 8192) != 0) {
                aaas aaas = xyu.b;
                apxu apxu = aphg.n;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                aaas.a(apxu, Collections.singletonMap("com.google.android.libraries.youtube.innertube.endpoint.tag", xyu));
            } else if (xyu.e) {
                xyu.c.dismiss();
            }
        }
    }
}
