package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.google.android.libraries.youtube.edit.filters.ui.ChooseFilterView;

/* renamed from: gdl */
public final class gdl implements OnClickListener, ggb, zon {
    public View a;
    public ChooseFilterView b;
    public Button c;
    public boolean d;
    public float e;
    public gdk f;
    public acvx g;

    public final void d() {
    }

    public final void e() {
    }

    public final void f() {
    }

    public final void onClick(View view) {
        if (view == this.c) {
            this.f.m();
            this.g.a(3, new acvs(acwc.UPLOAD_VIDEO_EDITING_CONFIRM_FILTER_BUTTON), null);
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

    public final void g() {
        if (this.d) {
            gfu.a(this);
            this.d = false;
        }
    }
}
