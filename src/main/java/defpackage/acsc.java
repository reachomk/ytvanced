package defpackage;

import android.app.Activity;
import com.google.android.youtube.R;

/* renamed from: acsc */
final /* synthetic */ class acsc implements abzj {
    private final acrz a;
    private final Activity b;
    private final abza c;

    acsc(acrz acrz, Activity activity, abza abza) {
        this.a = acrz;
        this.b = activity;
        this.c = abza;
    }

    public final void a() {
        acrz acrz = this.a;
        Activity activity = this.b;
        abza abza = this.c;
        synchronized (acrz.q) {
            if (acrz.p) {
                return;
            }
            acrz.m = new acab(acrz.f, acag.a(activity, R.raw.external_texture_frag), acag.a(activity, R.raw.sampler2d_texture_frag), acrz, acrz.n.c, abza.d().b);
            abza.a(new abzh(abza, new abzd(acrz.m)));
        }
    }
}
