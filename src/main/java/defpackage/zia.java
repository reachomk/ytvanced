package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.Resources;
import android.util.Property;
import android.view.ViewGroup.LayoutParams;
import com.google.android.libraries.youtube.edit.camera.RotateLayout;
import com.google.android.youtube.R;

/* renamed from: zia */
final class zia extends AnimatorListenerAdapter {
    private final /* synthetic */ Property a;
    private final /* synthetic */ Property b;
    private final /* synthetic */ float c;
    private final /* synthetic */ zhu d;

    zia(zhu zhu, Property property, Property property2, float f) {
        this.d = zhu;
        this.a = property;
        this.b = property2;
        this.c = f;
    }

    public final void onAnimationStart(Animator animator) {
        this.a.set(this.d.am, Float.valueOf(0.0f));
        this.b.set(this.d.am, Float.valueOf(this.c));
        LayoutParams layoutParams = this.d.al.getLayoutParams();
        LayoutParams layoutParams2 = this.d.ak.getLayoutParams();
        Resources resources = this.d.ak.getResources();
        zhu zhu = this.d;
        int i = zhu.ap;
        if (i == 0 || i == 180) {
            layoutParams.width = zhu.ae.getWidth();
            layoutParams2.width = layoutParams.width;
            this.d.ak.setBackgroundColor(resources.getColor(R.color.camera_header_background));
        } else {
            layoutParams.width = zhu.ae.getHeight();
            layoutParams2.width = this.d.a(resources, 0);
            this.d.ak.setBackgroundResource(R.drawable.camera_header_landscape_background);
        }
        zhu zhu2 = this.d;
        RotateLayout rotateLayout = zhu2.am;
        int i2 = zhu2.ap % 360;
        if (rotateLayout.a != i2) {
            rotateLayout.a = i2;
            rotateLayout.requestLayout();
        }
    }
}
