package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import java.util.HashMap;

/* renamed from: rum */
public final class rum extends qae {
    private static volatile Bundle d;
    private static volatile Bundle e;
    private final String a;
    private final String b;
    private final HashMap c = new HashMap();

    public rum(Context context, Looper looper, pte pte, pth pth, String str, pyp pyp) {
        super(context.getApplicationContext(), looper, 5, pyp, pte, pth);
        HashMap hashMap = new HashMap();
        this.a = str;
        this.b = pyp.e;
    }

    /* Access modifiers changed, original: protected|final */
    public final String a() {
        return "com.google.android.gms.people.service.START";
    }

    /* Access modifiers changed, original: protected|final */
    public final String b() {
        return "com.google.android.gms.people.internal.IPeopleService";
    }

    public final int c() {
        return 12451000;
    }

    public final psc[] t() {
        return rvt.a;
    }

    /* Access modifiers changed, original: protected|final */
    public final Bundle g() {
        Bundle bundle = new Bundle();
        bundle.putString("social_client_application_id", this.a);
        bundle.putString("real_client_package_name", this.b);
        bundle.putBoolean("support_new_image_callback", true);
        return bundle;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(int i, IBinder iBinder, Bundle bundle, int i2) {
        if (i == 0 && bundle != null) {
            a(bundle.getBundle("post_init_configuration"));
        }
        super.a(i, iBinder, bundle != null ? bundle.getBundle("post_init_resolution") : null, i2);
    }

    public final void e() {
        synchronized (this.c) {
            if (i()) {
                for (rud rud : this.c.values()) {
                    pue pue = null;
                    pue.a();
                    try {
                        ((ruj) super.v()).a(rud);
                    } catch (RemoteException e) {
                        Log.w("PeopleClient", "Failed to unregister listener", e);
                    } catch (IllegalStateException e2) {
                        Log.w("PeopleClient", "PeopleService is in unexpected state", e2);
                    }
                }
            }
            this.c.clear();
        }
        super.e();
    }

    private final synchronized void a(Bundle bundle) {
        if (bundle != null) {
            rub.a = bundle.getBoolean("use_contactables_api", true);
            qsm.a.a(bundle.getStringArray("config.url_uncompress.patterns"), bundle.getStringArray("config.url_uncompress.replacements"));
            d = bundle.getBundle("config.email_type_map");
            e = bundle.getBundle("config.phone_type_map");
        }
    }

    public final void a(ptu ptu, boolean z, int i) {
        super.u();
        ruc ruc = new ruc(ptu);
        try {
            ((ruj) super.v()).a(ruc, z, i);
        } catch (RemoteException unused) {
            ruc.a(8, null, null);
        }
    }
}
