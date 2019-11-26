package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation.AnimationListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: ahzj */
public class ahzj extends ajmp implements OnClickListener {
    private static final int[] p = new int[]{R.attr.selectableItemBackgroundBorderless};
    public final Context a;
    public final ajuh b;
    public final ahys c;
    public final ahzl d;
    public TextView e;
    public final float f;
    public final AnimationListener g = new ahzm(this);
    public final AlphaAnimation h;
    public final AlphaAnimation i;
    private FrameLayout q;
    private FrameLayout r;
    private ImageView s;

    public ahzj(Context context, ahys ahys, ajuh ajuh) {
        super(ajuh.i, ajuh.j, ajms.DEFAULT, ajmr.NOT_DRAWABLE, null);
        this.a = (Context) amqw.a((Object) context);
        this.b = (ajuh) amqw.a((Object) ajuh);
        this.c = (ahys) amqw.a((Object) ahys);
        this.d = (ahzl) amqw.a((Object) ahys);
        this.h = new AlphaAnimation(0.0f, 1.0f);
        this.h.setDuration((long) this.a.getResources().getInteger(R.integer.endscreen_hovercard_fade_in_duration_ms));
        this.i = new AlphaAnimation(1.0f, 0.0f);
        this.i.setDuration((long) this.a.getResources().getInteger(R.integer.endscreen_hovercard_fade_in_duration_ms));
        this.i.setAnimationListener(this.g);
        this.f = context.getResources().getDimension(R.dimen.endscreen_element_text_size) * 6.0f;
    }

    public boolean d() {
        return false;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(boolean z, boolean z2, boolean z3) {
        this.d.a(this);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a() {
        this.d.b(this);
    }

    public View b() {
        if (this.q == null) {
            this.q = (FrameLayout) LayoutInflater.from(this.a).inflate(R.layout.endscreen_element_layout_video, this.c.h, false);
            this.q.setOnClickListener(this);
            this.r = (FrameLayout) this.q.findViewById(R.id.image_container);
            this.r.addView(c(), -1, -1);
            ahzj.a(this.r);
            this.e = (TextView) this.q.findViewById(R.id.title_text);
            xpr.a(this.e, ajqy.a(this.b.k));
            a(this.q);
        }
        return this.q;
    }

    public ImageView c() {
        if (this.s == null) {
            this.s = new ImageView(this.a);
            this.s.setScaleType(ScaleType.CENTER_CROP);
        }
        return this.s;
    }

    public final void onClick(View view) {
        if (view == b()) {
            this.d.c(this);
        }
    }

    public void a(akkq akkq) {
        akkq.a(c(), this.b.a);
    }

    public void a(View view) {
        CharSequence b = ajqy.b(this.b.k);
        if (b == null) {
            b = ajqy.a(this.b.k);
        }
        view.setContentDescription(b);
    }

    public void a(ahzy ahzy) {
        xpr.a(ahzy.h, ajqy.a(this.b.k));
        xpr.a(ahzy.i, ajqy.a(this.b.l));
        ahzy.j.setText(ajqy.a(this.b.m));
        ahzy.k.setText(ajqy.a(this.b.n));
    }

    public static void a(FrameLayout frameLayout) {
        TypedArray obtainStyledAttributes = frameLayout.getContext().obtainStyledAttributes(p);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        frameLayout.setForeground(drawable);
    }
}
