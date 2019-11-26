package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* renamed from: kkf */
public final class kkf extends jxc {
    public kkf(akvp akvp, fmx fmx, Context context, akyz akyz, ViewGroup viewGroup) {
        super(akvp, fmx, context, akyz, viewGroup, R.layout.slim_metadata_button, R.attr.ytIconInactive);
    }

    public final void a(axpc axpc, acvx acvx, akor akor) {
        super.a(axpc, acvx, akor);
        aphj aphj = axpc.e;
        if (aphj == null) {
            aphj = aphj.d;
        }
        aphg aphg = aphj.b;
        if (aphg == null) {
            aphg = aphg.s;
        }
        this.a.setAlpha(!aphg.f ? 1.0f : 0.5f);
    }
}
