package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* renamed from: jzd */
final class jzd implements jyw {
    public final jzf a;
    private final Context b;
    private final akkq c;
    private final ViewGroup d;

    jzd(Context context, akkq akkq, ViewGroup viewGroup, jzf jzf) {
        this.b = context;
        this.c = akkq;
        this.d = viewGroup;
        this.a = jzf;
    }

    public final void a(ajry ajry) {
        this.d.removeAllViews();
        if (ajry.f != null) {
            ajsa[] ajsaArr = (ajsa[]) ajry.getExtension(ajrx.c);
            int i = 0;
            for (aygk aygk : ajry.f) {
                if (ajsaArr == null || i >= ajsaArr.length || ajsaArr[i] == null) {
                    View inflate = LayoutInflater.from(this.b).inflate(R.layout.carousel_pagination_thumbnail, this.d, false);
                    ImageView imageView = (ImageView) inflate.findViewById(R.id.thumbnail);
                    this.c.a(imageView, aygk);
                    imageView.setOnClickListener(new jzc(this, this.d.getChildCount()));
                    this.d.addView(inflate);
                }
                i++;
            }
        }
    }

    public final void a(int i) {
        int i2 = 0;
        while (i2 < this.d.getChildCount()) {
            View childAt = this.d.getChildAt(i2);
            childAt.setAlpha(i2 == i ? 1.0f : 0.5f);
            xpr.a(childAt.findViewById(R.id.selected_position_indicator), i2 == i);
            i2++;
        }
    }

    public final void a(boolean z) {
        xpr.a(this.d, z);
    }

    public final int a() {
        return this.d.getMeasuredWidth();
    }
}
