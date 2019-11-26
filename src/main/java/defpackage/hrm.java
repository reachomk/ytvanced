package defpackage;

import android.view.View;

/* renamed from: hrm */
public final class hrm implements akok {
    public agqy a;
    private final /* synthetic */ hrf b;

    public final boolean a(View view) {
        hrf hrf = this.b;
        aqgs aqgs = hrf.x;
        if (aqgs == null || (aqgs.a & 1048576) == 0 || amqu.a(hrf.y)) {
            return false;
        }
        hrf = this.b;
        akor akor = hrf.v;
        if (akor != null) {
            aqgs aqgs2 = hrf.x;
            if (aqgs2 != null) {
                hkq.b(akor, aqgs2);
            }
        }
        agqy agqy = this.a;
        if (agqy != null && (agqy.u() == agqs.PLAYABLE || this.b.a())) {
            return false;
        }
        hrf = this.b;
        hrf.d.a(hrf.y, this.a, null);
        return true;
    }

    /* synthetic */ hrm(hrf hrf) {
        this.b = hrf;
    }
}
