package com.google.android.apps.youtube.app.player.overlay;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import defpackage.aigp;
import defpackage.aigz;
import defpackage.ibm;

public class DefaultThumbnailOverlayView extends ImageView implements aigp {
    private aigz a;

    public DefaultThumbnailOverlayView(Context context) {
        super(context);
        a(context);
    }

    public DefaultThumbnailOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public DefaultThumbnailOverlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }

    public DefaultThumbnailOverlayView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(context);
    }

    private final void a(Context context) {
        setBackgroundColor(-16777216);
        setScaleType(ScaleType.CENTER_CROP);
        this.a = new ibm(this, context);
    }

    public final void at_() {
        this.a.at_();
    }

    public final void a(Bitmap bitmap) {
        this.a.a(bitmap);
    }

    public final void af_() {
        this.a.af_();
    }

    public final void ag_() {
        this.a.ag_();
    }
}
