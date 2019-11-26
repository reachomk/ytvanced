package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.widget.AppCompatImageButton;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import com.google.android.youtube.R;
import defpackage.bah;
import defpackage.bai;
import defpackage.ra;

public class MediaRouteExpandCollapseButton extends AppCompatImageButton {
    public final AnimationDrawable a;
    public final AnimationDrawable b;
    public final String c;
    public final String d;
    public boolean e;
    public OnClickListener f;

    public MediaRouteExpandCollapseButton(Context context) {
        this(context, null);
    }

    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = (AnimationDrawable) ra.a(context, (int) R.drawable.mr_group_expand);
        this.b = (AnimationDrawable) ra.a(context, (int) R.drawable.mr_group_collapse);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(bai.b(context, i), Mode.SRC_IN);
        this.a.setColorFilter(porterDuffColorFilter);
        this.b.setColorFilter(porterDuffColorFilter);
        this.c = context.getString(R.string.mr_controller_expand_group);
        this.d = context.getString(R.string.mr_controller_collapse_group);
        setImageDrawable(this.a.getFrame(0));
        setContentDescription(this.c);
        super.setOnClickListener(new bah(this));
    }

    public final void setOnClickListener(OnClickListener onClickListener) {
        this.f = onClickListener;
    }
}
