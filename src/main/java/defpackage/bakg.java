package defpackage;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.IBinder;
import android.os.IInterface;
import com.google.vr.vrcore.base.api.VrCoreUtils;

/* renamed from: bakg */
public final class bakg {
    public static int a;
    private static Context b;
    private static bakb c;

    public static bakb a(Context context) {
        if (c == null) {
            bakb bake;
            IBinder a = bakg.a(bakg.b(context).getClassLoader(), "com.google.vr.vrcore.library.VrCreator");
            if (a != null) {
                IInterface queryLocalInterface = a.queryLocalInterface("com.google.vr.vrcore.library.api.IVrCreator");
                bake = queryLocalInterface instanceof bakb ? (bakb) queryLocalInterface : new bake(a);
            } else {
                bake = null;
            }
            c = bake;
        }
        return c;
    }

    public static Context b(Context context) {
        if (b == null) {
            int vrCoreClientApiVersion = VrCoreUtils.getVrCoreClientApiVersion(context);
            if (vrCoreClientApiVersion >= 9) {
                try {
                    b = context.createPackageContext("com.google.vr.vrcore", 3);
                    a = vrCoreClientApiVersion;
                } catch (NameNotFoundException unused) {
                    throw new bahp(1);
                }
            }
            throw new bahp(4);
        }
        return b;
    }

    private static IBinder a(ClassLoader classLoader, String str) {
        String str2;
        try {
            return (IBinder) classLoader.loadClass(str).newInstance();
        } catch (ClassNotFoundException unused) {
            str = String.valueOf(str);
            str2 = "Unable to find dynamic class ";
            if (str.length() == 0) {
                str = new String(str2);
            } else {
                str = str2.concat(str);
            }
            throw new IllegalStateException(str);
        } catch (InstantiationException unused2) {
            str = String.valueOf(str);
            str2 = "Unable to instantiate the remote class ";
            if (str.length() == 0) {
                str = new String(str2);
            } else {
                str = str2.concat(str);
            }
            throw new IllegalStateException(str);
        } catch (IllegalAccessException unused3) {
            str = String.valueOf(str);
            str2 = "Unable to call the default constructor of ";
            if (str.length() == 0) {
                str = new String(str2);
            } else {
                str = str2.concat(str);
            }
            throw new IllegalStateException(str);
        }
    }
}
