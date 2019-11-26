package defpackage;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: rxs */
public final class rxs {
    private static final Object a = new Object();
    private static Method b = null;

    public static void a(Context context) {
        pzr.a((Object) context, (Object) "Context must not be null");
        psh.c(context, 11925000);
        try {
            context = psl.c(context);
            if (context == null) {
                if (Log.isLoggable("ProviderInstaller", 6)) {
                    Log.e("ProviderInstaller", "Failed to get remote context");
                }
                throw new psg(8);
            }
            synchronized (a) {
                try {
                    if (b == null) {
                        b = context.getClassLoader().loadClass("com.google.android.gms.common.security.ProviderInstallerImpl").getMethod("insertProvider", new Class[]{Context.class});
                    }
                    b.invoke(null, new Object[]{context});
                } catch (Exception e) {
                    Throwable cause = e.getCause();
                    if (Log.isLoggable("ProviderInstaller", 6)) {
                        Object message;
                        if (cause != null) {
                            message = cause.getMessage();
                        } else {
                            message = e.getMessage();
                        }
                        String str = "ProviderInstaller";
                        String str2 = "Failed to install provider: ";
                        String valueOf = String.valueOf(message);
                        if (valueOf.length() == 0) {
                            valueOf = new String(str2);
                        } else {
                            valueOf = str2.concat(valueOf);
                        }
                        Log.e(str, valueOf);
                    }
                    throw new psg(8);
                } catch (Throwable th) {
                }
            }
        } catch (NotFoundException unused) {
            if (Log.isLoggable("ProviderInstaller", 6)) {
                Log.e("ProviderInstaller", "Failed to get remote context - resource not found");
            }
            throw new psg(8);
        }
    }
}
