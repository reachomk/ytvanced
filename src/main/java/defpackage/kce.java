package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.youtube.R;

/* renamed from: kce */
public final class kce implements akot {
    private final Context a;
    private final View b;
    private final akou c;
    private final zzl d;

    public kce(Context context, zzl zzl) {
        this.a = context;
        this.d = zzl;
        this.c = new flu(context);
        this.b = View.inflate(context, R.layout.empty_footer, null);
        this.c.a(this.b);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.c.a();
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        if (xss.b(this.a) && foh.p(this.d)) {
            this.b.setMinimumHeight(this.a.getResources().getDimensionPixelSize(R.dimen.empty_footer_min_height_linear_grid_feed_tablet));
        }
        this.c.a(akor);
    }
}
