package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.google.protos.youtube.api.innertube.GoogleMapsNavigationEndpointOuterClass;
import java.util.Map;

/* renamed from: fxn */
public final class fxn implements aaap, wxe {
    private final Context a;
    private final wxd b;
    private final aaas c;

    public fxn(wxd wxd, aaas aaas, Context context) {
        this.b = (wxd) amqw.a((Object) wxd);
        this.c = (aaas) amqw.a((Object) aaas);
        this.a = (Context) amqw.a((Object) context);
    }

    public final boolean a(int i, int i2, Intent intent) {
        return false;
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(GoogleMapsNavigationEndpointOuterClass.googleMapsNavigationEndpoint);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            access$000 = anxl.checkIsLite(GoogleMapsNavigationEndpointOuterClass.googleMapsNavigationEndpoint);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            arrp arrp = (arrp) b;
            Uri parse = (arrp.a & 1) != 0 ? Uri.parse(arrp.b) : null;
            Intent intent = new Intent("android.intent.action.VIEW", parse);
            intent.setPackage("com.google.android.apps.maps");
            PackageManager packageManager = this.a.getPackageManager();
            if (parse != null && packageManager.resolveActivity(intent, 65536) != null) {
                this.b.a(intent, 2100, this);
            } else if ((arrp.a & 2) != 0) {
                aaas aaas = this.c;
                apxu = arrp.c;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                aaas.a(apxu, map);
            }
        }
    }
}
