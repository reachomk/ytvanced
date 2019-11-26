package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.lang.ref.WeakReference;

/* renamed from: qgy */
final class qgy extends qgo {
    private final /* synthetic */ Intent a;
    private final /* synthetic */ WeakReference b;
    private final /* synthetic */ qgc c;
    private final /* synthetic */ qfu d = null;
    private final /* synthetic */ qdu e;

    qgy(Intent intent, WeakReference weakReference, qgc qgc, qfu qfu, qdu qdu) {
        this.a = intent;
        this.b = weakReference;
        this.c = qgc;
        this.e = qdu;
    }

    public final void a(GoogleHelp googleHelp) {
        long nanoTime = System.nanoTime();
        this.a.putExtra("EXTRA_START_TICK", nanoTime);
        Activity activity = (Activity) this.b.get();
        if (activity == null) {
            this.c.c(qfx.a);
            return;
        }
        if (!(this.d == null && this.e == null)) {
            qgn qgn = new qgn(googleHelp);
            Context applicationContext = activity.getApplicationContext();
            qdu qdu = this.e;
            qfu qfu = this.d;
            qha qha = new qha(qgn.a);
            if (qfu != null) {
                qha.a.g = true;
                qgn.a(qgn.b.a(applicationContext, qgn.a, qfu, nanoTime));
            }
            if (qdu != null) {
                qha.a.h = true;
                Context context = applicationContext;
                qdu qdu2 = qdu;
                long j = nanoTime;
                qgn.a(qgn.b.b(context, qgn.a, qdu2, j));
                qgn.a(qgn.b.a(context, qgn.a, qdu2, j));
            }
        }
        qha qha2 = new qha(googleHelp);
        qha2.a.f = psf.b;
        if (qha2.a() != null) {
            qha2.a().a = qfx.a(activity);
        }
        qfx.a(this.c, activity, this.a, googleHelp);
    }
}
