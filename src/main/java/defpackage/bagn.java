package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import com.google.android.youtube.R;

/* renamed from: bagn */
public final class bagn {
    public final Context a;
    public final FrameLayout b;
    public View c;
    public ImageButton d;
    public View e;
    public ImageButton f;
    public RelativeLayout g;
    public bagh h;
    public volatile boolean i = true;
    public volatile boolean j = true;
    public volatile Runnable k = null;
    public volatile Runnable l = null;
    public volatile Runnable m;
    public volatile Runnable n = null;
    public volatile String o;
    public int p;
    private RelativeLayout q;
    private volatile boolean r = true;
    private volatile boolean s = false;
    private volatile float t = 1.0f;

    public bagn(Context context) {
        this.a = context;
        this.b = new bahc(this, context);
        a((int) R.layout.ui_layer);
    }

    public static int a(boolean z) {
        return !z ? 8 : 0;
    }

    public final void a(int i) {
        this.p = i;
        bagh bagh = this.h;
        Object obj = (bagh == null || bagh.getParent() == null) ? null : 1;
        this.h = null;
        RelativeLayout relativeLayout = this.q;
        if (relativeLayout != null) {
            this.b.removeView(relativeLayout);
        }
        this.q = (RelativeLayout) LayoutInflater.from(this.a).inflate(i, null, false);
        this.b.addView(this.q);
        if (obj != null) {
            b(this.s);
        }
        this.m = new bagq(this);
        this.c = this.q.findViewById(R.id.ui_settings_button_holder);
        View view = this.c;
        if (view != null) {
            view.setVisibility(bagn.a(this.j));
            this.c.setOnClickListener(new bagt(this));
        }
        this.d = (ImageButton) this.q.findViewById(R.id.ui_settings_button);
        this.d.setVisibility(bagn.a(this.j));
        this.d.setContentDescription("Settings");
        this.d.setOnClickListener(new bagw(this));
        this.e = this.q.findViewById(R.id.ui_back_button_holder);
        view = this.e;
        if (view != null) {
            view.setVisibility(bagn.a(b()));
            this.e.setOnClickListener(new bagv(this));
        }
        this.f = (ImageButton) this.q.findViewById(R.id.ui_back_button);
        this.f.setVisibility(bagn.a(b()));
        this.f.setOnClickListener(new bagy(this));
        if (ActivityManager.isRunningInTestHarness()) {
            LayoutParams layoutParams;
            view = this.c;
            if (view != null) {
                layoutParams = view.getLayoutParams();
                layoutParams.height = -2;
                layoutParams.width = -2;
                this.c.setLayoutParams(layoutParams);
            }
            view = this.e;
            if (view != null) {
                layoutParams = view.getLayoutParams();
                layoutParams.height = -2;
                layoutParams.width = -2;
                this.e.setLayoutParams(layoutParams);
            }
        }
        this.g = (RelativeLayout) this.q.findViewById(R.id.ui_alignment_marker);
        this.g.setVisibility(bagn.a(this.r));
        a(this.t);
    }

    public final bagh a() {
        if (this.h == null) {
            this.h = new bagh(this.a);
            this.h.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            this.h.setVisibility(bagn.a(this.s));
            if (this.o != null) {
                this.h.a(this.o);
            }
            if (this.n != null) {
                this.h.c = this.n;
            }
            this.h.a(this.l);
            this.q.addView(this.h);
        }
        return this.h;
    }

    public final void a(float f) {
        if (VERSION.SDK_INT >= 23 && (this.t != f || f != 1.0f)) {
            this.t = f;
            bagi.a(new bagp(this, f));
        }
    }

    public final void b(boolean z) {
        this.s = z;
        bagi.a(new bags(this, z));
    }

    private final boolean b() {
        return this.l != null;
    }
}
