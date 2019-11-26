package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.youtube.R;

/* renamed from: acna */
final class acna extends abwb {
    private RecyclerView h;
    private final /* synthetic */ acmw i;

    public acna(acmw acmw, akvz akvz) {
        this.i = acmw;
        super(acmw.ae, akvz, acmw.Z, acmw.c);
    }

    public final RecyclerView a() {
        return this.i.af;
    }

    public final View c() {
        return this.i.ag;
    }

    public final RecyclerView b() {
        if (!this.i.ab.a().y) {
            return null;
        }
        if (this.h == null) {
            this.h = (RecyclerView) this.i.ae.findViewById(R.id.ticker);
        }
        return this.h;
    }
}
