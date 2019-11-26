package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.google.android.youtube.R;

/* renamed from: ahzt */
public class ahzt extends ahzj {
    private FrameLayout p;
    private ImageView q;
    private akkq r;
    private FrameLayout s;

    public ahzt(Context context, ahys ahys, ajuh ajuh) {
        super(context, ahys, ajuh);
    }

    public final boolean d() {
        return true;
    }

    public final View b() {
        if (this.p == null) {
            this.p = (FrameLayout) LayoutInflater.from(this.a).inflate(R.layout.endscreen_element_layout_icon, this.c.h, false);
            this.p.setOnClickListener(this);
            this.s = (FrameLayout) this.p.findViewById(R.id.image_container);
            ahzj.a(this.s);
            this.s.addView(c());
            ((ViewGroup) this.p.findViewById(R.id.icon_container)).addView(j());
            j().setBackgroundColor(0);
            a(this.p);
        }
        return this.p;
    }

    private final ImageView j() {
        if (this.q == null) {
            this.q = new ImageView(this.a);
            this.q.setLayoutParams(new LayoutParams(-1, -1));
            this.q.setScaleType(ScaleType.FIT_CENTER);
        }
        return this.q;
    }

    public final void a(akkq akkq) {
        super.a(akkq);
        this.r = akkq;
        akkq.a(j(), this.b.b);
    }

    public void a(ahzy ahzy) {
        super.a(ahzy);
        ahzy.e.setVisibility(0);
        akkq akkq = this.r;
        if (akkq != null) {
            akkq.a(ahzy.e, this.b.a);
        }
        ahzy.f.setVisibility(8);
    }
}
