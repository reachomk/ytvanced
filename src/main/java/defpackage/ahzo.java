package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.libraries.youtube.common.ui.CircularImageView;
import com.google.android.youtube.R;

/* renamed from: ahzo */
public class ahzo extends ahzj {
    private FrameLayout p;
    private CircularImageView q;
    private akkq r;
    private FrameLayout s;

    public ahzo(Context context, ahys ahys, ajuh ajuh) {
        super(context, ahys, ajuh);
    }

    public final boolean d() {
        return true;
    }

    public final View b() {
        if (this.p == null) {
            this.p = (FrameLayout) LayoutInflater.from(this.a).inflate(R.layout.endscreen_element_layout_circle, this.c.h, false);
            this.p.setOnClickListener(this);
            this.s = (FrameLayout) this.p.findViewById(R.id.image_container);
            this.s.addView(c(), 0);
            FrameLayout frameLayout = this.s;
            if (VERSION.SDK_INT >= 21) {
                ahzj.a(frameLayout);
                frameLayout.setOutlineProvider(new ahzn());
                frameLayout.setClipToOutline(true);
            }
            a(this.p);
        }
        return this.p;
    }

    public final ImageView c() {
        if (this.q == null) {
            this.q = new CircularImageView(this.a, null);
            this.q.setBackgroundDrawable(new ColorDrawable(ra.c(this.a, R.color.endscreen_element_border_color)));
        }
        return this.q;
    }

    public final void a(akkq akkq) {
        super.a(akkq);
        this.r = akkq;
    }

    public void a(ahzy ahzy) {
        super.a(ahzy);
        ahzy.f.setVisibility(0);
        akkq akkq = this.r;
        if (akkq != null) {
            akkq.a(ahzy.f, this.b.a);
        }
        ahzy.e.setVisibility(8);
    }
}
