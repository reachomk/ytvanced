package defpackage;

import com.google.android.youtube.R;
import java.util.Map;

/* renamed from: fwe */
final class fwe implements afsw {
    private final /* synthetic */ Map a;
    private final /* synthetic */ fwb b;

    fwe(fwb fwb, Map map) {
        this.b = fwb;
        this.a = map;
    }

    public final void a(bqn bqn) {
        String valueOf = String.valueOf(bqn);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 40);
        stringBuilder.append("PurchaseDataPlanEndpointCommand failed: ");
        stringBuilder.append(valueOf);
        xtl.c(stringBuilder.toString());
        joi joi = this.b.b;
        joi.f();
        joi.a(joi.a.getString(R.string.vdp_purchase_unsuccessful_title), joi.a.getString(R.string.vdp_purchase_unsuccessful_description), null);
        joi.a(null, false);
    }
}
