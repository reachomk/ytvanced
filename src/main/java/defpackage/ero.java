package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.protos.youtube.api.innertube.FeedbackEndpointOuterClass;

/* renamed from: ero */
final class ero implements OnClickListener {
    private final /* synthetic */ erm a;

    ero(erm erm) {
        this.a = erm;
    }

    public final void onClick(View view) {
        aphj aphj = this.a.h.c.d;
        if (aphj == null) {
            aphj = aphj.d;
        }
        if ((aphj.a & 1) != 0) {
            aphj = this.a.h.c.d;
            if (aphj == null) {
                aphj = aphj.d;
            }
            aphg aphg = aphj.b;
            if (aphg == null) {
                aphg = aphg.s;
            }
            int i = aphg.a;
            apxu apxu;
            if ((i & 4096) != 0) {
                aaas aaas = this.a.h.b;
                apxu = aphg.m;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                aaas.a(apxu, null);
            } else if ((i & 2048) != 0) {
                apxu = aphg.l;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                this.a.h.b.a(apxu, null);
                anxr access$000 = anxl.checkIsLite(FeedbackEndpointOuterClass.feedbackEndpoint);
                apxu.a(access$000);
                if (apxu.h.a(access$000.d)) {
                    access$000 = anxl.checkIsLite(FeedbackEndpointOuterClass.feedbackEndpoint);
                    apxu.a(access$000);
                    Object b = apxu.h.b(access$000.d);
                    if (b == null) {
                        b = access$000.b;
                    } else {
                        b = access$000.a(b);
                    }
                    arjs arjs = ((arjq) b).f;
                    if (arjs == null) {
                        arjs = arjs.c;
                    }
                    if (arjs.b) {
                        erk erk = this.a.h;
                        erk.a.c(new akwd(erk.c));
                    }
                }
            }
        }
    }
}
