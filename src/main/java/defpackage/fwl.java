package defpackage;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager.BadTokenException;
import com.google.android.apps.youtube.app.extensions.reel.watch.activity.ReelWatchActivity;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import java.util.Map;

/* renamed from: fwl */
public final class fwl implements aaap {
    public final gax a;
    private final Activity b;
    private final Context c;
    private final wxd d;
    private final adqf e;
    private final gqm f;
    private final zzl g;

    public fwl(Activity activity, wxd wxd, gax gax, adqf adqf, gqm gqm, zzl zzl) {
        this.b = activity;
        this.d = wxd;
        this.a = gax;
        this.e = adqf;
        this.c = null;
        this.f = gqm;
        this.g = zzl;
    }

    public fwl(Context context, adqf adqf) {
        this.c = (Context) amqw.a((Object) context);
        this.e = (adqf) amqw.a((Object) adqf);
        this.b = null;
        this.d = null;
        this.a = null;
        this.f = null;
        this.g = null;
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
        apxu.a(access$000);
        amqw.a(apxu.h.a(access$000.d));
        if (this.e.c() != null || this.e.g()) {
            a();
            return;
        }
        Context context;
        aiqs a = aiqq.a();
        a.a = apxu;
        aiqq b = a.b();
        zzl zzl = this.g;
        awxz awxz = null;
        arvt b2 = zzl != null ? zzl.b() : null;
        if (!(b2 == null || (b2.a & aocf.UNSET_ENUM_VALUE) == 0)) {
            awxk awxk = b2.v;
            if (awxk == null) {
                awxk = awxk.f;
            }
            if ((awxk.a & 2048) != 0) {
                awxk awxk2 = b2.v;
                if (awxk2 == null) {
                    awxk2 = awxk.f;
                }
                awxz = awxk2.e;
                if (awxz == null) {
                    awxz = awxz.f;
                }
            }
        }
        gqm gqm = this.f;
        if (gqm != null && (awxz == null || !awxz.e)) {
            gqm.a();
        }
        Activity activity = this.b;
        if (activity == null) {
            context = this.c;
        } else {
            context = activity.getBaseContext();
        }
        Intent a2 = ReelWatchActivity.a(context, b);
        Bundle bundle = (Bundle) xsb.a(map, (Object) "com.google.android.libraries.youtube.innertube.bundle", Bundle.class);
        fwo fwo = new fwo(this);
        Context context2 = this.b;
        if (context2 == null) {
            context2 = this.c;
        }
        ReelWatchActivity.a(context2, this.d, a2, fwo, bundle);
    }

    private final void a() {
        try {
            Context context = this.b;
            if (context == null) {
                context = this.c;
            }
            new Builder(context).setTitle(R.string.reel_cast_not_supported_title).setMessage(R.string.reel_cast_not_supported_message).setNeutralButton(R.string.app_got_it, null).create().show();
        } catch (BadTokenException unused) {
        }
    }
}
