package defpackage;

import android.os.Vibrator;
import com.google.android.youtube.R;

/* renamed from: ahyv */
final class ahyv extends ajmp {
    public final /* synthetic */ ahys a;

    public ahyv(ahys ahys, long j) {
        this.a = ahys;
        super(j, Long.MAX_VALUE, ajms.DEFAULT, ajmr.NOT_DRAWABLE, null);
    }

    public final void a(boolean z, boolean z2, boolean z3) {
        ahys ahys = this.a;
        if (ahys.r.d && !z2 && !z3) {
            ahys.g.post(new ahyy(this));
        } else if (ahys.e.c() || z2) {
            this.a.c.a(true);
            ahys = this.a;
            ahys.j = true;
            ahys.k();
            this.a.j();
            ahys = this.a;
            ahys.f.a(ahys.r.c);
            if (!(z2 || z3 || !xrn.c(this.a.a))) {
                ahys = this.a;
                if (ahys.t == null) {
                    ahys.t = (Vibrator) ahys.a.getSystemService("vibrator");
                }
                if (this.a.t.hasVibrator()) {
                    ahys = this.a;
                    ahys.t.vibrate((long) ahys.a.getResources().getInteger(R.integer.invideo_accessibility_vibration_duration_ms));
                }
            }
        }
    }

    public final void a() {
        this.a.c.a(false);
        ahys ahys = this.a;
        ahys.j = false;
        ahys.k();
        this.a.j();
    }
}
