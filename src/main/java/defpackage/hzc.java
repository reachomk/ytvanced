package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: hzc */
public final class hzc implements ahzi, esu {
    private final Activity a;
    private final acvx b;
    private final est c;
    private eso d;
    private TextView e;
    private ahzf f;

    public hzc(Activity activity, acvx acvx, est est) {
        this.a = activity;
        this.b = acvx;
        this.c = est;
    }

    public final View a(ajuh ajuh, ahzf ahzf, ViewGroup viewGroup) {
        axwa axwa;
        if (this.d == null) {
            this.e = (TextView) this.a.getLayoutInflater().inflate(R.layout.subscribe_button, viewGroup, true).findViewById(R.id.subscribe_button);
            this.d = this.c.a(this.e, null);
            this.d.a((esu) this);
        }
        aret aret = ajuh.s;
        if (aret.a == 55419609) {
            axwa = (axwa) aret.b;
        } else {
            axwa = axwa.M;
        }
        this.f = ahzf;
        this.d.a(axwa, this.b);
        return this.e;
    }

    public final void a(boolean z, boolean z2) {
        ahzf ahzf = this.f;
        if (ahzf != null && z == z2) {
            ahzf.bA_();
        }
    }
}
