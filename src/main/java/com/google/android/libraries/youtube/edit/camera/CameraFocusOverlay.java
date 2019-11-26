package com.google.android.libraries.youtube.edit.camera;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.google.android.youtube.R;
import defpackage.zha;

public class CameraFocusOverlay extends FrameLayout {
    private ImageView a = ((ImageView) findViewById(R.id.camera_focus_animation_outer_circle));
    private ImageView b = ((ImageView) findViewById(R.id.camera_focus_animation_inner_circle));

    public CameraFocusOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.camera_focus_overlay, this, true);
    }

    public final void a(int i, int i2) {
        if (zha.a(getResources())) {
            i = getWidth() - i;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.focus_inner_circle_anim);
        this.b.setAnimation(loadAnimation);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), R.anim.focus_outer_circle_anim);
        this.a.setAnimation(loadAnimation2);
        LayoutParams layoutParams = (LayoutParams) this.a.getLayoutParams();
        layoutParams.setMarginStart(i - (this.a.getWidth() / 2));
        layoutParams.topMargin = i2 - (this.a.getHeight() / 2);
        this.a.setLayoutParams(layoutParams);
        layoutParams = (LayoutParams) this.b.getLayoutParams();
        layoutParams.setMarginStart(i - (this.b.getWidth() / 2));
        layoutParams.topMargin = i2 - (this.b.getHeight() / 2);
        this.b.setLayoutParams(layoutParams);
        loadAnimation2.start();
        loadAnimation.start();
    }
}
