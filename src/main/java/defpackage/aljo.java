package defpackage;

import android.view.MenuItem;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: aljo */
final class aljo implements ase {
    private final /* synthetic */ aljp a;

    aljo(aljp aljp) {
        this.a = aljp;
    }

    public final boolean a(MenuItem menuItem) {
        if (((aja) menuItem).a != R.id.add_connection) {
            return false;
        }
        alfe alfe = this.a.Z;
        aatd aatd = alfe.a;
        if (aatd != null) {
            aphg a = aatd.a();
            if (!(a == null || (a.a & 4096) == 0)) {
                Map hashMap = new HashMap();
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", alfe);
                aaas aaas = alfe.b;
                apxu apxu = a.m;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                aaas.a(apxu, hashMap);
            }
        }
        return true;
    }
}
