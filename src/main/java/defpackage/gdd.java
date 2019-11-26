package defpackage;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.libraries.youtube.edit.audioswap.ui.AudioCrossFadeView;
import com.google.android.libraries.youtube.edit.audioswap.ui.AudioTrackView;

/* renamed from: gdd */
public final class gdd implements OnClickListener, ggb {
    public Context a;
    public View b;
    public AudioTrackView c;
    public AudioCrossFadeView d;
    public TextView e;
    public TextView f;
    public ImageButton g;
    public Button h;
    public Button i;
    public boolean j;
    public float k;
    public gdc l;

    public final void d() {
    }

    public final void e() {
    }

    public final void onClick(View view) {
        if (view == this.h) {
            this.l.e();
        } else if (view == this.g) {
            this.l.f();
        } else if (view == this.i) {
            this.l.g();
        }
    }

    public final View a() {
        return this.b;
    }

    public final float b() {
        return !this.j ? this.k : 0.0f;
    }

    public final float c() {
        return this.j ? this.k : 0.0f;
    }

    public final void f() {
        if (this.j) {
            gfu.a(this);
            this.j = false;
            xpr.a(this.b, false);
        }
    }
}
