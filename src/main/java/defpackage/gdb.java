package defpackage;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: gdb */
public final class gdb implements OnClickListener, ggb {
    public Context a;
    public float b;
    public boolean c;
    public gda d;
    public TextView e;
    public TextView f;
    public View g;
    public acvx h;

    public final void d() {
    }

    public final void e() {
    }

    public final void onClick(View view) {
        if (view == this.e) {
            this.d.c();
            f();
        } else if (view == this.f) {
            this.d.d();
            f();
            this.h.a(3, new acvs(acwc.UPLOAD_VIDEO_EDITING_MUTE_TOGGLE), null);
        }
    }

    public final View a() {
        return this.g;
    }

    public final float b() {
        return !this.c ? this.b : 0.0f;
    }

    public final float c() {
        return this.c ? this.b : 0.0f;
    }

    public final void f() {
        if (this.c) {
            gfu.a(this);
            this.c = false;
            xpr.a(this.g, false);
        }
    }

    public final void a(boolean z) {
        CharSequence text;
        if (!this.c) {
            gfu.a(this);
            this.c = true;
            xpr.a(this.g, true);
        }
        if (z) {
            text = this.a.getResources().getText(R.string.reel_edit_unmute_audio_button_text);
            this.f.setText(text);
            this.f.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.quantum_ic_volume_up_white_24, 0, 0, 0);
        } else {
            text = this.a.getResources().getText(R.string.reel_edit_mute_audio_button_text);
            this.f.setText(text);
            this.f.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.quantum_ic_volume_off_white_24, 0, 0, 0);
        }
        this.f.setContentDescription(text);
    }
}
