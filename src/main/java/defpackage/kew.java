package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.youtube.R;
import java.util.ArrayList;

/* renamed from: kew */
public final class kew implements akot {
    private final aknk a;
    private final Context b;
    private final zzl c;

    public kew(aknn aknn, Context context, zzl zzl) {
        this.a = aknn.a();
        this.b = context;
        this.c = zzl;
    }

    public final View K_() {
        return this.a.K_();
    }

    public final void a(akpb akpb) {
        this.a.a(akpb);
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        akni akni = (akni) obj;
        if (xss.b(this.b) && foh.p(this.c)) {
            akor.a("grid_row_presenter_top_padding", Integer.valueOf(this.b.getResources().getDimensionPixelSize(R.dimen.main_app_grid_row_linear_grid_feed_tablet_top_padding)));
            akor.a("grid_row_presenter_bottom_padding", Integer.valueOf(this.b.getResources().getDimensionPixelSize(R.dimen.main_app_grid_row_linear_grid_feed_tablet_bottom_padding)));
        }
        if (xss.b(this.b) && foh.s(this.c)) {
            akor.a("grid_row_presenter_horizontal_row_padding", Integer.valueOf(this.b.getResources().getDimensionPixelSize(R.dimen.main_app_grid_row_linear_grid_feed_tablet_row_padding)));
            aknl aknl = new aknl();
            aknl.a = akni.a;
            aknl.b = new ArrayList(akni.b);
            aknl.c = akni.c;
            aknl.d = akni.d;
            int i = akni.f;
            aknl.e = i;
            aknl.f = i;
            aknl.g = akni.g;
            aknl.g = this.b.getResources().getDimensionPixelSize(R.dimen.main_app_grid_row_linear_grid_feed_tablet_row_child_padding);
            akni = aknl.a();
        }
        this.a.a_(akor, akni);
    }
}
