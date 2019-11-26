package defpackage;

import android.text.TextUtils;
import com.google.android.gms.common.api.Status;

/* renamed from: pqy */
final class pqy extends ppk {
    private final /* synthetic */ String a;

    pqy(ptd ptd, String str) {
        this.a = str;
        super(ptd);
    }

    public final void a(ppa ppa) {
        if (TextUtils.isEmpty(this.a)) {
            a(new Status(2001, "IllegalArgument: sessionId cannot be null or empty", null));
            return;
        }
        try {
            String str = this.a;
            synchronized (ppa.u) {
                if (ppa.s != null) {
                    a(new Status(2001));
                } else {
                    ppa.s = this;
                }
            }
            ppn ppn = (ppn) ppa.v();
            if (ppa.h()) {
                ppn.a(str);
            } else {
                ppa.b(2016);
            }
        } catch (IllegalStateException unused) {
            b();
        }
    }
}
