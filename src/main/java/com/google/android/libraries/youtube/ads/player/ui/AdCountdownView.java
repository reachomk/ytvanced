package com.google.android.libraries.youtube.ads.player.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.youtube.R;
import defpackage.abe;
import defpackage.abr;
import defpackage.ajrc;
import defpackage.vsm;
import defpackage.vyz;
import defpackage.vza;
import defpackage.vzn;
import defpackage.vzo;
import defpackage.vzq;

public class AdCountdownView extends LinearLayout implements OnClickListener {
    public vzq a;
    public vzn b;
    public vyz c;
    public ImageView d;
    public boolean e;
    public boolean f;
    public boolean g;
    public vsm h;
    public int i;
    public int j;
    public int k;
    public int l;
    private CharSequence m;
    private CharSequence n;

    public AdCountdownView(Context context) {
        super(context);
        b();
    }

    public AdCountdownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public AdCountdownView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b();
    }

    public AdCountdownView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        b();
    }

    private final void b() {
        LayoutInflater.from(getContext()).inflate(R.layout.ad_countdown, this, true);
        setOrientation(0);
        this.f = true;
        Resources resources = getResources();
        this.d = (ImageView) findViewById(R.id.content_thumbnail);
        this.d.setOnClickListener(this);
        this.c = new vyz(getContext(), resources, (ImageView) findViewById(R.id.countdown_background), (AdCountdownTextView) findViewById(R.id.countdown_text), getAlpha());
        this.a = new vzq(this, getBackground(), getAlpha());
        a();
        this.i = resources.getDimensionPixelSize(R.dimen.skip_button_default_bottom_margin);
        this.j = resources.getDimensionPixelSize(R.dimen.skip_button_cta_bottom_margin);
        this.k = resources.getDimensionPixelSize(R.dimen.countdown_view_thumbnail_default_height);
        this.l = resources.getDimensionPixelSize(R.dimen.countdown_view_thumbnail_default_width);
        this.m = resources.getText(R.string.video_after_ad_mulitline);
        this.n = resources.getText(R.string.video_after_ads_mulitline);
    }

    public final void a() {
        a(false);
        vyz vyz = this.c;
        ajrc a = ajrc.a(vyz.n);
        if (a != null) {
            vyz.c.setTypeface(a.a(vyz.a, 0), 0);
        }
        vyz.d.c = null;
        vyz.c.setClickable(true);
        vyz.c.setAlpha(1.0f);
        AdCountdownTextView adCountdownTextView = vyz.c;
        adCountdownTextView.setPadding(vyz.j, adCountdownTextView.getPaddingTop(), vyz.k, vyz.c.getPaddingBottom());
        vyz.b.getLayoutParams().width = vyz.l;
        vyz.b.getLayoutParams().height = vyz.m;
        vyz.c.getLayoutParams().height = vyz.m;
        adCountdownTextView = vyz.c;
        adCountdownTextView.setLayoutParams(new LayoutParams(-2, adCountdownTextView.getLayoutParams().height));
        vzn vzn = vyz.q;
        if (vzn != null) {
            vzn.a();
        }
        this.f = true;
        vzn = this.b;
        if (vzn != null) {
            vzn.a();
        }
        int i = this.l;
        int i2 = this.k;
        this.d.getLayoutParams().width = i;
        this.d.getLayoutParams().height = i2;
    }

    public final void a(boolean z) {
        this.e = z;
        CharSequence charSequence = this.m;
        if (charSequence != null) {
            if (z || this.h == vsm.POST_ROLL) {
                charSequence = "";
            } else if (this.g) {
                charSequence = this.n;
            }
            vzo vzo = this.c.d;
            vzo.b = charSequence;
            vzo.b();
        }
    }

    public final void setVisibility(int i) {
        super.setVisibility(i);
        this.c.b();
        if (!this.e && this.f && i == 0) {
            this.c.a();
        }
    }

    public final void onClick(View view) {
        if (!this.e && this.f) {
            this.c.b();
            vyz vyz = this.c;
            vyz.c.setClickable(true);
            abr p = abe.p(vyz.c);
            p.a(1.0f);
            p.a((long) vyz.p);
            p.b(0);
            p.a(new vza(vyz));
        }
    }
}
