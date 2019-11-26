package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.youtube.R;

/* renamed from: hbn */
final class hbn extends abwg {
    private View h;
    private View i;
    private RecyclerView j;
    private final /* synthetic */ hbg k;

    public hbn(hbg hbg, akvz akvz, akpe akpe, acvx acvx) {
        this.k = hbg;
        super(hbg.b, akvz, akpe, acvx);
    }

    public final RecyclerView a() {
        return this.k.e;
    }

    public final RecyclerView b() {
        if (!this.k.a.a()) {
            return null;
        }
        if (this.j == null) {
            this.j = (RecyclerView) this.k.f.findViewById(R.id.ticker);
            this.j.a(null);
        }
        return this.j;
    }

    public final View c() {
        if (this.h == null) {
            this.h = this.k.f.findViewById(R.id.more_comments_icon_container);
        }
        return this.h;
    }

    /* Access modifiers changed, original: protected|final */
    public final View d() {
        if (this.i == null) {
            this.i = this.k.f.findViewById(R.id.more_comments_icon);
        }
        return this.i;
    }
}
