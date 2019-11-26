package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* renamed from: iog */
final class iog extends iob {
    public final /* synthetic */ ioc d;
    private final akko e = akko.h().a(new iof(this)).b(true).a();
    private final ImageView f = ((ImageView) this.a.findViewById(R.id.poster));
    private final ImageView g = ((ImageView) this.b.findViewById(R.id.background_hero));
    private final View h = this.b.findViewById(R.id.background_scrim);

    iog(ioc ioc) {
        this.d = ioc;
        super(ioc, R.layout.details_header_large_screen, ioc.b);
    }

    public final void a(akor akor, aqvl aqvl) {
        super.a(akor, aqvl);
        aygk a = ioc.a(ioc.a(aqvl), this.d.l);
        this.d.d.a(this.g, a, this.e);
        View view = this.g;
        boolean z = true;
        boolean z2 = a != null;
        xpr.a(view, z2);
        xpr.a(this.h, z2);
        View view2 = this.f;
        if ((aqvl.a & 512) == 0) {
            z = false;
        }
        xpr.a(view2, z);
        if ((aqvl.a & 512) != 0) {
            akkq akkq = this.d.d;
            ImageView imageView = this.f;
            aygk aygk = aqvl.n;
            if (aygk == null) {
                aygk = aygk.f;
            }
            akkq.a(imageView, aygk);
        }
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        a(akor, (aqvl) obj);
    }
}
