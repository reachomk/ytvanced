package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.googlehelp.GoogleHelp;

/* renamed from: tkl */
class tkl implements tkg {
    private final qfw a;

    tkl(Activity activity) {
        this.a = new qfw(activity);
    }

    public final void a(Intent intent) {
        qfw qfw = this.a;
        if (intent.getAction().equals("com.google.android.gms.googlehelp.HELP")) {
            String str = "EXTRA_GOOGLE_HELP";
            if (intent.hasExtra(str)) {
                int a = psl.a(qfw.a, 11925000);
                if (a != 0) {
                    intent = new Intent("android.intent.action.VIEW").setData(((GoogleHelp) intent.getParcelableExtra(str)).b);
                    if (a == 7 || qfw.a.getPackageManager().queryIntentActivities(intent, 0).size() <= 0) {
                        Activity activity = qfw.a;
                        if (psl.c(activity, a)) {
                            a = 18;
                        }
                        psf.a.b(activity, a, 0, null);
                        return;
                    }
                    qfw.a.startActivity(intent);
                    return;
                }
                qgf a2 = qhf.a(qfw.a);
                pzr.a(a2.i);
                pzl.a(qgf.h.a(a2.f, a2.i, intent));
                return;
            }
        }
        throw new IllegalArgumentException("The intent you are trying to launch is not GoogleHelp intent! This class only supports GoogleHelp intents.");
    }
}
