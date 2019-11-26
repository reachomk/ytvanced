package com.google.android.libraries.youtube.edit.camera;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.youtube.R;

public class GalleryCameraRecordButtonView extends FrameLayout {
    public final ImageView a = ((ImageView) findViewById(R.id.gallery_camera_record_button_record_circle));
    public final ImageView b = ((ImageView) findViewById(R.id.gallery_camera_record_button_stop_rectangle));
    public final View c = findViewById(R.id.record_button_touch_area);
    public final float d;
    public final float e;
    public AnimatorSet f;

    public GalleryCameraRecordButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.gallery_camera_record_button_view, this, true);
        Resources resources = getResources();
        this.d = resources.getDimension(R.dimen.gallery_camera_record_button_record_circle_max_size) / resources.getDimension(R.dimen.gallery_camera_record_button_record_circle_init_size);
        float dimension = resources.getDimension(R.dimen.gallery_camera_record_button_stop_rectangle_min_size) / resources.getDimension(R.dimen.gallery_camera_record_button_stop_rectangle_init_size);
        this.e = dimension;
        this.b.setScaleX(dimension);
        this.b.setScaleY(this.e);
    }

    public final void setOnClickListener(OnClickListener onClickListener) {
        this.c.setOnClickListener(onClickListener);
    }
}
