package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: rod */
final class rod implements Callable {
    private final /* synthetic */ Context a;

    rod(Context context) {
        this.a = context;
    }

    public final /* synthetic */ Object call() {
        rnz d = rlj.d();
        Context context = this.a;
        if (!d.c) {
            synchronized (d.a) {
                if (d.c) {
                } else {
                    d.e = context.getApplicationContext() != null ? context.getApplicationContext() : context;
                    try {
                        Context c = psl.c(context);
                        if (c == null) {
                            c = context.getApplicationContext();
                            if (c == null) {
                                c = context;
                            }
                        }
                        if (c != null) {
                            roa roa = rlj.a.c;
                            d.d = c.getSharedPreferences("google_ads_flags", 0);
                            SharedPreferences sharedPreferences = d.d;
                            if (sharedPreferences != null) {
                                sharedPreferences.registerOnSharedPreferenceChangeListener(d);
                            }
                            d.a();
                            d.c = true;
                        } else {
                            d.b.open();
                        }
                    } finally {
                        d.b.open();
                    }
                }
            }
        }
        return null;
    }
}
