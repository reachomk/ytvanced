package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;

/* renamed from: ehl */
final /* synthetic */ class ehl implements ehp {
    private final ehm a;
    private final Bitmap b;
    private final String c;
    private final Uri d;
    private final Activity e;

    ehl(ehm ehm, Bitmap bitmap, String str, Uri uri, Activity activity) {
        this.a = ehm;
        this.b = bitmap;
        this.c = str;
        this.d = uri;
        this.e = activity;
    }

    public final void a(Bundle bundle) {
        ehm ehm = this.a;
        Bitmap bitmap = this.b;
        String str = this.c;
        Uri uri = this.d;
        Activity activity = this.e;
        thx a = ((thx) ehm.e.get()).a(new eho(bundle)).a(bitmap);
        if (!ehm.b.a()) {
            a = a.a(ehm.g.a(ehm.f.a(ehm.h.a()).a()).a());
        }
        tke a2 = ehm.c.a(str).b().a(uri).a(a.a(), activity.getCacheDir());
        if (ehm.b.a()) {
            a2.a(ehm.a.a(ehm.b.c()));
        }
        ehm.d.a(activity).a(a2.a());
    }
}
