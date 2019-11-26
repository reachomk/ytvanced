package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: ahzw */
public final class ahzw implements OnClickListener {
    public final ViewGroup a;
    public final ahzy b = new ahzy();
    public ahzj c;
    public final Animation d;
    public final Animation e;
    public airc f;
    private final ahys g;
    private final ahzx h;
    private final int i;

    public ahzw(Context context, ahys ahys, ViewGroup viewGroup) {
        amqw.a((Object) context);
        this.g = (ahys) amqw.a((Object) ahys);
        this.a = (ViewGroup) amqw.a((Object) viewGroup);
        this.h = (ahzx) amqw.a((Object) ahys);
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        this.b.a = (FrameLayout) layoutInflater.inflate(R.layout.endscreen_hovercard_layout, this.g.h, false);
        this.b.a.setOnClickListener(this);
        ahzy ahzy = this.b;
        ahzy.b = ahzy.a.findViewById(R.id.background_tint);
        ahzy = this.b;
        ahzy.c = ahzy.a.findViewById(R.id.hovercard_layout);
        ahzy = this.b;
        ahzy.d = ahzy.c.findViewById(R.id.hovercard_info_view);
        this.b.d.setOnClickListener(this);
        ahzy = this.b;
        ahzy.e = (ImageView) ahzy.a.findViewById(R.id.hovercard_thumbnail);
        ahzy = this.b;
        ahzy.f = (ImageView) ahzy.a.findViewById(R.id.hovercard_thumbnail_circular);
        ahzy = this.b;
        ahzy.h = (TextView) ahzy.a.findViewById(R.id.hovercard_title);
        ahzy = this.b;
        ahzy.i = (TextView) ahzy.a.findViewById(R.id.hovercard_details);
        ahzy = this.b;
        ahzy.j = (TextView) ahzy.a.findViewById(R.id.hovercard_watch_button);
        ahzy = this.b;
        ahzy.g = (ViewGroup) ahzy.c.findViewById(R.id.thumbnail_container);
        ahzy = this.b;
        ahzy.k = (TextView) ahzy.a.findViewById(R.id.hovercard_cancel_button);
        this.b.j.setOnClickListener(this);
        this.b.k.setOnClickListener(this);
        ahzy = this.b;
        ahzy.l = (FrameLayout) ahzy.c.findViewById(R.id.hovercard_subscribe_container);
        this.i = xss.a(context.getResources().getDisplayMetrics(), 400);
        this.d = new AlphaAnimation(0.0f, 1.0f);
        this.d.setDuration((long) context.getResources().getInteger(R.integer.endscreen_hovercard_fade_in_duration_ms));
        this.e = new AlphaAnimation(1.0f, 0.0f);
        this.e.setDuration((long) context.getResources().getInteger(R.integer.endscreen_hovercard_fade_in_duration_ms));
        this.e.setAnimationListener(new ahzv(this));
    }

    public final void a(boolean z) {
        if (z) {
            ahzy ahzy = this.b;
            if (!(ahzy == null || ahzy.a == null || (this.e.hasStarted() && !this.e.hasEnded()))) {
                this.b.a.clearAnimation();
                this.d.reset();
                this.b.a.startAnimation(this.e);
            }
            return;
        }
        a();
    }

    public final void a() {
        ahzy ahzy = this.b;
        if (ahzy != null) {
            FrameLayout frameLayout = ahzy.a;
            if (frameLayout != null && frameLayout.getParent() != null) {
                this.a.removeView(this.b.a);
            }
        }
    }

    public final void b() {
        if (this.b != null) {
            float f = this.f != airc.FULLSCREEN ? 0.9f : 0.6f;
            ahzy ahzy = this.b;
            if (ahzy != null) {
                View view = ahzy.c;
                if (view != null) {
                    LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                    layoutParams.width = Math.min(this.i, (int) (((float) this.a.getWidth()) * f));
                    this.b.c.setLayoutParams(layoutParams);
                }
            }
        }
    }

    public final void onClick(View view) {
        ahzx ahzx;
        if (view.getId() == R.id.hovercard_watch_button || view.getId() == R.id.hovercard_info_view) {
            ahzx = this.h;
            if (ahzx != null) {
                ahzx.d(this.c);
            }
        } else if (view.getId() == R.id.hovercard_cancel_button || view.getId() == R.id.background) {
            ahzx = this.h;
            if (ahzx != null) {
                ahzx.i();
            }
        }
    }
}
