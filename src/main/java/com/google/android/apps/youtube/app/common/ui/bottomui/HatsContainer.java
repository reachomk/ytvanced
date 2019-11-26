package com.google.android.apps.youtube.app.common.ui.bottomui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.GridLayout;
import android.widget.ImageView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import defpackage.bga;
import defpackage.bgx;
import defpackage.bhf;
import defpackage.bhj;
import defpackage.fbw;
import defpackage.fbx;
import defpackage.fby;
import defpackage.fbz;
import defpackage.xpr;

public class HatsContainer extends GridLayout {
    public ViewGroup a;
    public boolean b;
    public boolean c = false;
    private View d;
    private ImageView e;
    private View f;
    private YouTubeTextView g;
    private HatsSurvey h;
    private fbz i;
    private int j = 0;

    public HatsContainer(Context context) {
        super(context);
    }

    public HatsContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HatsContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (ViewGroup) findViewById(R.id.hats_content_container);
        this.d = findViewById(R.id.hats_dismiss);
        this.f = findViewById(R.id.hats_expand_spacing);
        this.e = (ImageView) findViewById(R.id.hats_expand);
        this.e.setOnClickListener(new fbx(this));
    }

    public final fbz a() {
        if (this.i == null) {
            this.i = new fbz(this);
        }
        return this.i;
    }

    public final void a(YouTubeTextView youTubeTextView) {
        YouTubeTextView youTubeTextView2 = this.g;
        if (youTubeTextView2 != null) {
            this.a.removeView(youTubeTextView2);
        }
        this.g = youTubeTextView;
        youTubeTextView = this.g;
        if (youTubeTextView != null) {
            this.a.addView(youTubeTextView);
            this.g.setOnClickListener(new fbw(this));
        }
    }

    public final void a(HatsSurvey hatsSurvey) {
        HatsSurvey hatsSurvey2 = this.h;
        if (hatsSurvey2 != null) {
            this.a.removeView(hatsSurvey2);
        }
        this.h = hatsSurvey;
        hatsSurvey = this.h;
        if (hatsSurvey != null) {
            this.a.addView(hatsSurvey);
        }
    }

    public final void a(OnClickListener onClickListener) {
        this.d.setOnClickListener(onClickListener);
    }

    public final void b() {
        this.j = 0;
        c();
        if (this.c) {
            c();
        }
    }

    public final void c() {
        if (this.j != 0 || this.g == null) {
            bhj bhj = new bhj();
            bhj.b(1);
            bhj = (bhj) bhj.a(new LinearInterpolator());
            bgx bga = new bga(2);
            bga.c = 75;
            bga.c(this.g);
            bhj = bhj.a(bga);
            bga = new bga(1);
            bga.c = 150;
            bga.c(this.h);
            bgx a = bhj.a(bga);
            bga = new fby();
            bga.c = 300;
            bga.c((View) this);
            bhj bhj2 = new bhj();
            bhj2.b(0);
            bhj2.a(a);
            bhj2.a(bga);
            bhf.a(this, bhj2);
            xpr.a(this.e, false);
            xpr.a(this.f, false);
            View view = this.g;
            if (view != null) {
                xpr.a(view, false);
            }
            xpr.a(this.h, true);
            xpr.a(this.d, this.b);
            this.j = 2;
            return;
        }
        xpr.a(this.e, true);
        xpr.a(this.f, true);
        xpr.a(this.g, true);
        xpr.a(this.h, false);
        xpr.a(this.d, this.b);
        this.j = 1;
    }
}
