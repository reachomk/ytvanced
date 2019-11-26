package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.Collections;

/* renamed from: ihh */
final class ihh implements OnClickListener {
    private final /* synthetic */ ihi a;

    ihh(ihi ihi) {
        this.a = ihi;
    }

    public final void onClick(View view) {
        ihi ihi = this.a;
        if (ihi.i != null) {
            Object obj = ihi.h;
            if (obj != null) {
                aphg aphg;
                aphj aphj;
                if (ihi.k == 4) {
                    aowq aowq = ((aowm) obj).c;
                    if (aowq == null) {
                        aowq = aowq.i;
                    }
                    aphj = aowq.b;
                    if (aphj == null) {
                        aphj = aphj.d;
                    }
                    aphg = aphj.b;
                    if (aphg == null) {
                        aphg = aphg.s;
                    }
                } else {
                    aowo aowo = ((aowm) obj).d;
                    if (aowo == null) {
                        aowo = aowo.d;
                    }
                    aphj = aowo.b;
                    if (aphj == null) {
                        aphj = aphj.d;
                    }
                    aphg = aphj.b;
                    if (aphg == null) {
                        aphg = aphg.s;
                    }
                }
                if (aphg != null && (aphg.a & 4096) != 0) {
                    ihc ihc = this.a.i;
                    Object obj2 = aphg.m;
                    if (obj2 == null) {
                        obj2 = apxu.d;
                    }
                    ihc.a(aphg, Collections.singletonList(obj2));
                }
            }
        }
    }
}
