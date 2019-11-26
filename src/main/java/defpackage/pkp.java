package defpackage;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: pkp */
public final class pkp {
    public static final pon a = new pon("CastContext");
    private static pkp e;
    public final pnu b;
    public final pkx c;
    public final pko d;
    private final Context f;
    private final plb g;
    private qnu h = new qnu(bbb.a(this.f));
    private qnk i;
    private final List j;

    public static pkp a(Context context) {
        pzr.b("Must be called from the main thread.");
        if (e == null) {
            pkz b = pkp.b(context.getApplicationContext());
            e = new pkp(context, b.getCastOptions(context.getApplicationContext()), b.getAdditionalSessionProviders(context.getApplicationContext()));
        }
        return e;
    }

    public static pkp a() {
        pzr.b("Must be called from the main thread.");
        return e;
    }

    private static pkz b(Context context) {
        try {
            Bundle bundle = qph.a(context).a(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                a.d("Bundle is null", new Object[0]);
            }
            String string = bundle.getString("com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME");
            if (string != null) {
                return (pkz) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new IllegalStateException("The fully qualified name of the implementation of OptionsProvider must be provided as a metadata in the AndroidManifest.xml with key com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME.");
        } catch (NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e) {
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        }
    }

    private pkp(Context context, pko pko, List list) {
        pnu a;
        pny c;
        poe b;
        String str = "Unable to call %s on %s.";
        this.f = context.getApplicationContext();
        this.d = pko;
        this.j = list;
        plb plb = null;
        if (TextUtils.isEmpty(this.d.a)) {
            this.i = null;
        } else {
            this.i = new qnk(this.f, this.d, this.h);
        }
        Map hashMap = new HashMap();
        qnk qnk = this.i;
        if (qnk != null) {
            hashMap.put(qnk.b, qnk.c);
        }
        List<Object> list2 = this.j;
        if (list2 != null) {
            for (Object obj : list2) {
                pzr.a(obj, (Object) "Additional SessionProvider must not be null.");
                String a2 = pzr.a(obj.b, (Object) "Category for SessionProvider must not be null or empty string.");
                pzr.b(hashMap.containsKey(a2) ^ 1, String.format("SessionProvider for category %s already added", new Object[]{a2}));
                hashMap.put(a2, obj.c);
            }
        }
        Context context2 = this.f;
        try {
            a = qnh.a(context2).a(qct.a(context2.getApplicationContext()), pko, this.h, hashMap);
        } catch (RemoteException unused) {
            qnh.a.b(str, "newCastContextImpl", qnm.class.getSimpleName());
            a = null;
        }
        this.b = a;
        try {
            c = this.b.c();
        } catch (RemoteException unused2) {
            a.b(str, "getDiscoveryManagerImpl", pnu.class.getSimpleName());
            c = null;
        }
        this.c = c != null ? new pkx(c) : null;
        try {
            b = this.b.b();
        } catch (RemoteException unused3) {
            a.b(str, "getSessionManagerImpl", pnu.class.getSimpleName());
            b = null;
        }
        if (b != null) {
            plb = new plb(b, this.f);
        }
        this.g = plb;
        pkw pkw = new pkw();
        if (this.g != null) {
            pow pow = new pow(this.f);
            pky pky = new pky();
        }
    }

    public final plb b() {
        pzr.b("Must be called from the main thread.");
        return this.g;
    }
}
