package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AndroidApplicationEndpointOuterClass;
import java.util.Map;

/* renamed from: fth */
public final class fth implements aaap {
    private final Activity a;
    private final aaas b;

    public fth(Activity activity, aaas aaas) {
        this.a = activity;
        this.b = aaas;
    }

    public final void a(apxu apxu, Map map) {
        Intent a = xuz.a();
        anxr access$000 = anxl.checkIsLite(AndroidApplicationEndpointOuterClass.androidAppEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        aoqo aoqo = (aoqo) b;
        a.setClassName(aoqo.b, aoqo.c);
        for (atwo atwo : aoqo.d) {
            a.putExtra(atwo.d, atwo.b == 2 ? (String) atwo.c : "");
        }
        if ((this.a.getPackageManager().queryIntentActivities(a, 128).isEmpty() ^ 1) == 0) {
            a(aoqo, map);
            return;
        }
        try {
            this.a.startActivity(a);
        } catch (ActivityNotFoundException unused) {
            a(aoqo, map);
        }
    }

    private final void a(aoqo aoqo, Map map) {
        if ((aoqo.a & 4) != 0) {
            aaas aaas = this.b;
            apxu apxu = aoqo.e;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, map);
            return;
        }
        xpr.a(this.a, (int) R.string.error_generic, 0);
    }
}
