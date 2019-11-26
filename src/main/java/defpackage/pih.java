package defpackage;

import android.accounts.Account;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.auth.TokenData;
import java.io.IOException;

/* renamed from: pih */
public final class pih {
    public static final String a = "androidPackageName";
    public static final ComponentName b = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
    public static final qox c = new qox("Auth", "GoogleAuthUtil");
    private static final String[] d = new String[]{"com.google", "com.google.work", "cn.google"};

    public static String a(Context context, Account account, String str) {
        return pih.a(context, account, str, new Bundle());
    }

    public static String a(Context context, Account account, String str, Bundle bundle) {
        Bundle bundle2;
        pih.a(account);
        pzr.c("Calling this from your main thread can lead to deadlock");
        pzr.a(str, (Object) "Scope cannot be empty or null.");
        pih.a(account);
        pih.a(context);
        if (bundle != null) {
            bundle2 = new Bundle(bundle);
        } else {
            bundle2 = new Bundle();
        }
        String str2 = context.getApplicationInfo().packageName;
        bundle2.putString("clientPackageName", str2);
        if (TextUtils.isEmpty(bundle2.getString(a))) {
            bundle2.putString(a, str2);
        }
        bundle2.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
        return ((TokenData) pih.a(context, b, new piw(account, str, bundle2))).a;
    }

    private static void a(Account account) {
        if (account == null) {
            throw new IllegalArgumentException("Account cannot be null");
        } else if (TextUtils.isEmpty(account.name)) {
            throw new IllegalArgumentException("Account name cannot be empty!");
        } else {
            String[] strArr = d;
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                if (!strArr[i].equals(account.type)) {
                    i++;
                } else {
                    return;
                }
            }
            throw new IllegalArgumentException("Account type not supported");
        }
    }

    public static void a(Context context) {
        try {
            psl.b(context.getApplicationContext(), 8400000);
        } catch (psj e) {
            throw new pij(e.a, e.getMessage(), e.a());
        } catch (psg e2) {
            throw new pii(e2.getMessage());
        }
    }

    public static Object a(Object obj) {
        if (obj != null) {
            return obj;
        }
        c.a("GoogleAuthUtil", "Binder call returned null.");
        throw new IOException("Service unavailable.");
    }

    public static Object a(Context context, ComponentName componentName, pik pik) {
        String str = "Error on service connection.";
        ServiceConnection qbl = new qbl();
        pyw a = pyw.a(context);
        String str2 = "GoogleAuthUtil";
        if (a.a(new pyv(componentName), qbl, str2)) {
            try {
                pzr.c("BlockingServiceConnection.getService() called on main thread");
                if (qbl.a) {
                    throw new IllegalStateException("Cannot call get on this connection more than once");
                }
                qbl.a = true;
                Object a2 = pik.a((IBinder) qbl.b.take());
                a.a(componentName, qbl);
                return a2;
            } catch (RemoteException | InterruptedException e) {
                c.b(str2, str, e);
                throw new IOException(str, e);
            } catch (Throwable th) {
                a.a(componentName, qbl);
            }
        } else {
            throw new IOException("Could not bind to service.");
        }
    }
}
