package com.google.android.libraries.youtube.player.features.storyboard;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.aimr;
import defpackage.aimv;
import defpackage.xpr;
import defpackage.xss;

public class ScrubbedPreviewView extends FrameLayout {
    public ImageView a;
    public TextView b;
    public ObjectAnimator c;
    public boolean d = false;

    public ScrubbedPreviewView(Context context) {
        super(context);
        Rect rect = new Rect();
        a(context, null, 0, 0);
    }

    public ScrubbedPreviewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Rect rect = new Rect();
        a(context, attributeSet, 0, R.style.ScrubbedPreview);
    }

    public ScrubbedPreviewView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Rect rect = new Rect();
        a(context, attributeSet, i, 0);
    }

    public ScrubbedPreviewView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Rect rect = new Rect();
        a(context, attributeSet, i, i2);
    }

    private final void a(Context context, AttributeSet attributeSet, int i, int i2) {
        LayoutInflater.from(context).inflate(R.layout.scrubbed_preview, this);
        this.a = (ImageView) findViewById(R.id.thumbnail);
        this.b = (TextView) findViewById(R.id.timestamp);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aimr.a, i, i2);
            try {
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, xss.a(context.getResources().getDisplayMetrics(), 90));
                i = Math.round(((float) dimensionPixelSize) * obtainStyledAttributes.getFloat(1, 1.778f));
                LayoutParams layoutParams = this.a.getLayoutParams();
                layoutParams.width = i;
                layoutParams.height = dimensionPixelSize;
                this.a.setLayoutParams(layoutParams);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        a();
        xpr.a((View) this, false);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a();
    }

    private final void a() {
        int integer = getResources().getInteger(R.integer.fade_duration_fast);
        this.c = ObjectAnimator.ofFloat(this, "alpha", new float[]{0.0f, 1.0f});
        this.c.setDuration((long) integer);
        this.c.addListener(new aimv(this));
    }
}
