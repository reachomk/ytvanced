package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Build.VERSION;

@Deprecated
/* renamed from: rwg */
public abstract class rwg {
    public static Context a = null;
    public static volatile Boolean b = null;
    private static final Object i = new Object();
    private static volatile Boolean j = null;
    public final rwj c;
    public final String d;
    public final String e;
    public final Object f;
    public final Object g = null;
    public volatile SharedPreferences h = null;
    private volatile rvv k = null;

    public static void a(Context context) {
        qtx.a(context);
        synchronized (i) {
            if (VERSION.SDK_INT < 24 || !context.isDeviceProtectedStorage()) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
            }
            if (a != context) {
                j = null;
            }
            a = context;
        }
    }

    public abstract Object a(SharedPreferences sharedPreferences);

    public abstract Object a(String str);

    public static Object a(rwi rwi) {
        long clearCallingIdentity;
        try {
            rwi = rwi.a();
            return rwi;
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            Object a = rwi.a();
            return a;
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    public static boolean a() {
        if (j == null) {
            Context context = a;
            boolean z = false;
            if (context == null) {
                return false;
            }
            if (rn.a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                z = true;
            }
            j = Boolean.valueOf(z);
        }
        return j.booleanValue();
    }

    /* synthetic */ rwg(rwj rwj, String str, Object obj) {
        if (rwj.a != null) {
            this.c = rwj;
            String valueOf = String.valueOf(rwj.b);
            String valueOf2 = String.valueOf(str);
            if (valueOf2.length() == 0) {
                valueOf2 = new String(valueOf);
            } else {
                valueOf2 = valueOf.concat(valueOf2);
            }
            this.e = valueOf2;
            String valueOf3 = String.valueOf(rwj.c);
            str = String.valueOf(str);
            if (str.length() == 0) {
                str = new String(valueOf3);
            } else {
                str = valueOf3.concat(str);
            }
            this.d = str;
            this.f = obj;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }
}
