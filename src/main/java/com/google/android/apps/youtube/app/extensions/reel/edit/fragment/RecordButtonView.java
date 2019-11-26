package com.google.android.apps.youtube.app.extensions.reel.edit.fragment;

import android.content.Context;
import android.transition.ChangeBounds;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.google.android.youtube.R;
import defpackage.gbj;

public class RecordButtonView extends FrameLayout {
    public ImageView a = ((ImageView) findViewById(R.id.reel_camera_record_button));
    public FrameLayout b = ((FrameLayout) findViewById(R.id.reel_record_button_view_container));
    public ProgressBar c = ((ProgressBar) findViewById(R.id.reel_camera_circle_time_limit_progress_bar));
    private FrameLayout d = ((FrameLayout) findViewById(R.id.reel_camera_record_button_touch_area));

    public RecordButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.reel_camera_circular_progress_record_button_view, this, true);
    }

    public final void a() {
        gbj.a(this.a.getBackground());
        gbj.a(this.c.getProgressDrawable());
        TransitionManager.beginDelayedTransition(this.b, new TransitionSet().addTransition(new ChangeBounds().setDuration(200)));
        LayoutParams layoutParams = this.c.getLayoutParams();
        layoutParams.width = (int) getResources().getDimension(R.dimen.reel_circular_progress_camera_record_button_view_width);
        layoutParams.height = (int) getResources().getDimension(R.dimen.reel_circular_progress_camera_record_button_view_height);
        this.c.setLayoutParams(layoutParams);
    }

    public final void setContentDescription(CharSequence charSequence) {
        super.setContentDescription(charSequence);
        this.d.setContentDescription(charSequence);
    }

    public final void setOnClickListener(OnClickListener onClickListener) {
        this.d.setOnClickListener(onClickListener);
    }

    public final void setOnTouchListener(OnTouchListener onTouchListener) {
        this.d.setOnTouchListener(onTouchListener);
    }

    public final void b() {
        gbj.a(this.a.getBackground(), 200);
        gbj.a(this.c.getProgressDrawable(), 200);
        TransitionManager.beginDelayedTransition(this.b, new TransitionSet().addTransition(new ChangeBounds().setDuration(200)));
        LayoutParams layoutParams = this.a.getLayoutParams();
        layoutParams.width = (int) getResources().getDimension(R.dimen.reel_circular_progress_camera_record_button_animation_inner_width);
        layoutParams.height = (int) getResources().getDimension(R.dimen.reel_circular_progress_camera_record_button_animation_inner_height);
        this.a.setLayoutParams(layoutParams);
        layoutParams = this.c.getLayoutParams();
        layoutParams.width = (int) getResources().getDimension(R.dimen.reel_circular_progress_camera_record_button_outer_white_ring_width);
        layoutParams.height = (int) getResources().getDimension(R.dimen.reel_circular_progress_camera_record_button_outer_white_ring_height);
        this.c.setLayoutParams(layoutParams);
    }
}
