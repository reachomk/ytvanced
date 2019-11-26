package defpackage;

import android.view.View;
import android.view.ViewStub;
import com.google.android.youtube.R;

/* renamed from: iet */
public final class iet {
    private static final bcpu c = bcpu.a(200);
    private static final bcpu d = bcpu.a(200);
    public final ailp a;
    public final ailp b;
    private final xnz e;

    iet(ViewStub viewStub, long j) {
        View inflate = viewStub.inflate();
        ailq b = ailp.f().a(c).b(amul.a(ailo.a(0.3f, 1.0f, d), ailo.a(1.0f, 0.3f, d)));
        this.a = b.a(amul.a(inflate.findViewById(R.id.swipey_edu_arrow3), inflate.findViewById(R.id.swipey_edu_arrow2), inflate.findViewById(R.id.swipey_edu_arrow1))).a();
        this.b = b.a(amul.a(inflate.findViewById(R.id.swipey_edu_arrow4), inflate.findViewById(R.id.swipey_edu_arrow5), inflate.findViewById(R.id.swipey_edu_arrow6))).a();
        this.e = new xnz(inflate, j, 8);
        this.e.a(new iew(this));
    }

    public final void a(boolean z, boolean z2) {
        if (z) {
            if (z2) {
                this.b.d();
                this.a.d();
            }
            this.e.a(true, z2);
            return;
        }
        this.e.b(z2);
    }
}
