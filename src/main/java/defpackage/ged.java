package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.google.android.libraries.video.trim.VideoTrimView;

/* renamed from: ged */
public final class ged implements OnClickListener, ggb {
    public View a;
    public VideoTrimView b;
    public Button c;
    public boolean d;
    public float e;
    public gec f;
    public acvx g;

    public final void d() {
    }

    public final void e() {
    }

    public final void onClick(View view) {
        if (view == this.c) {
            this.f.au();
            this.g.a(3, new acvs(acwc.REEL_CONFIRM_EDIT_BUTTON), null);
        }
    }

    public final View a() {
        return this.a;
    }

    public final float b() {
        return !this.d ? this.e : 0.0f;
    }

    public final float c() {
        return this.d ? this.e : 0.0f;
    }

    public final void f() {
        if (this.d) {
            xpr.a(this.b, false);
            gfu.a(this);
            this.d = false;
        }
    }
}
