package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.quantum.snackbar.Snackbar;
import java.util.HashMap;
import java.util.Map;

/* renamed from: alpw */
final /* synthetic */ class alpw implements OnClickListener {
    private final zye a;
    private final aaas b;
    private final apxu c;
    private final Snackbar d;

    alpw(zye zye, aaas aaas, apxu apxu, Snackbar snackbar) {
        this.a = zye;
        this.b = aaas;
        this.c = apxu;
        this.d = snackbar;
    }

    public final void onClick(View view) {
        zye zye = this.a;
        aaas aaas = this.b;
        apxu apxu = this.c;
        Snackbar snackbar = this.d;
        Map hashMap = new HashMap();
        Map map = zye.c;
        if (map != null) {
            hashMap.putAll(map);
        }
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", zye.d);
        if (aaas != null) {
            aaas.a(apxu, hashMap);
        }
        snackbar.d();
    }
}
