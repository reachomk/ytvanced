package defpackage;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.youtube.R;

/* renamed from: kfp */
final class kfp {
    private final ese a;
    private final fmx b;
    private final FrameLayout c;

    public kfp(ViewGroup viewGroup, ese ese, fmx fmx) {
        this.a = ese;
        this.b = fmx;
        this.c = (FrameLayout) viewGroup.findViewById(R.id.sub_menu_container);
        this.c.addView(ese.c);
        this.c.setVisibility(8);
    }

    public final void a(akor akor, axqn axqn, avir avir) {
        if (axqn != null) {
            this.c.setVisibility(0);
            this.a.a_(akor, axqn);
            aruh aruh = avir != null ? avir.a == 102716411 ? (aruh) avir.b : aruh.j : null;
            if (aruh != null) {
                this.b.a(aruh, this.c, avir, akor.a);
            }
            return;
        }
        this.c.setVisibility(8);
    }
}
