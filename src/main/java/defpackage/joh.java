package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.youtube.R;
import java.util.Map;

/* renamed from: joh */
final class joh implements OnClickListener {
    private final /* synthetic */ Map a;
    private final /* synthetic */ joe b;

    joh(joe joe, Map map) {
        this.b = joe;
        this.a = map;
    }

    public final void onClick(View view) {
        aphj aphj = this.b.Z.h;
        if (aphj == null) {
            aphj = aphj.d;
        }
        aphg aphg = aphj.b;
        if (aphg == null) {
            aphg = aphg.s;
        }
        if ((aphg.a & 2048) != 0) {
            joe joe = this.b;
            joe.ae.setVisibility(0);
            joe.ae.setText(R.string.vdp_purchase_processing);
            joe.ae.setGravity(17);
            joe.af.setVisibility(8);
            joe.ad.setVisibility(0);
            joe = this.b;
            aaas aaas = joe.ac;
            aphj = joe.Z.h;
            if (aphj == null) {
                aphj = aphj.d;
            }
            aphg = aphj.b;
            if (aphg == null) {
                aphg = aphg.s;
            }
            apxu apxu = aphg.l;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, this.a);
        }
        acvx t = ((acwa) this.b.p()).t();
        aphj aphj2 = this.b.Z.h;
        if (aphj2 == null) {
            aphj2 = aphj.d;
        }
        aphg aphg2 = aphj2.b;
        if (aphg2 == null) {
            aphg2 = aphg.s;
        }
        t.a(3, new acvs(aphg2.r), null);
    }
}
