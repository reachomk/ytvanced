package com.google.android.apps.youtube.app.search.voice;

import android.content.Context;
import android.support.design.floatingactionbutton.FloatingActionButton;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.google.android.youtube.R;
import defpackage.iyi;
import defpackage.iyk;
import defpackage.tst;
import defpackage.xwe;

public final class MicrophoneView extends RelativeLayout {
    public BitmapSoundLevelsView a;
    public ImageView b;
    public int c;
    private FloatingActionButton d;
    private FloatingActionButton e;
    private Animation f;
    private ProgressBar g;
    private int h;
    private int i;

    public MicrophoneView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }

    public MicrophoneView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public MicrophoneView(Context context) {
        super(context);
        a(context);
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (BitmapSoundLevelsView) findViewById(R.id.sound_levels);
        this.d = (FloatingActionButton) findViewById(R.id.enabled_microphone);
        this.e = (FloatingActionButton) findViewById(R.id.disabled_microphone);
        this.e.setColorFilter(this.h);
        this.b = (ImageView) findViewById(R.id.pulsing_circle);
        this.g = (ProgressBar) findViewById(R.id.loading_view);
        this.g.setIndeterminateDrawable(new tst(getContext().getResources().getDimensionPixelSize(R.dimen.buffering_progress_max_thickness), getContext().getResources().getDimensionPixelSize(R.dimen.buffering_progress_inset), new int[]{this.i}));
        this.f = AnimationUtils.loadAnimation(getContext(), R.anim.pulsing_circle_anim_search);
        this.f.setAnimationListener(new iyi(this));
    }

    private final void a(Context context) {
        this.i = xwe.a(context, R.attr.ytBrandRed, 0);
        this.h = xwe.a(context, R.attr.ytIconActiveOther, 0);
    }

    public final void a() {
        if (this.b.getVisibility() != 4) {
            this.b.setAnimation(this.f);
            this.f.start();
        }
    }

    private static void a(View view, int i) {
        view.setAlpha(0.0f);
        view.animate().alpha(1.0f).setDuration((long) i).start();
    }

    public final void b() {
        int i = this.c;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 0) {
            this.a.setEnabled(false);
            this.a.setVisibility(8);
            this.b.setVisibility(4);
            Animation animation = this.f;
            if (animation != null) {
                animation.cancel();
                this.f.reset();
            }
            this.g.setVisibility(8);
            this.d.setVisibility(8);
            this.e.animate().alpha(1.0f).setListener(null).start();
            this.e.setVisibility(0);
        } else if (i2 != 1) {
            if (i2 == 2) {
                this.e.setVisibility(0);
                this.a.setEnabled(true);
                this.a.setVisibility(0);
                this.b.setVisibility(0);
                a();
                this.d.setVisibility(0);
                FloatingActionButton floatingActionButton = this.e;
                floatingActionButton.setAlpha(1.0f);
                floatingActionButton.animate().alpha(0.0f).setDuration(536).setListener(new iyk(floatingActionButton));
                a(this.d, 536);
            } else if (i2 == 3) {
                this.d.setVisibility(8);
                this.e.setVisibility(8);
                this.a.setEnabled(false);
                this.a.setVisibility(4);
                this.b.setVisibility(4);
                Animation animation2 = this.f;
                if (animation2 != null) {
                    animation2.cancel();
                    this.f.reset();
                }
                this.g.setVisibility(0);
            }
        } else {
            this.e.setVisibility(0);
            this.a.setEnabled(true);
            this.a.setVisibility(0);
            this.b.setVisibility(0);
            a();
            a(this.a, 218);
            a(this.e, 218);
        }
    }

    static {
        MicrophoneView.class.getSimpleName();
    }
}
