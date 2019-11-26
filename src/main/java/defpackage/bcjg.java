package defpackage;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: bcjg */
public abstract class bcjg {
    private static final String b = bcjg.class.getSimpleName();
    public final Context a;

    public bcjg(Context context) {
        if (context != null) {
            this.a = context;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }

    public abstract bcjc a();

    public abstract String b();

    public abstract String c();

    public abstract boolean d();

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[class=");
        stringBuilder.append(getClass().getName());
        stringBuilder.append(", name=");
        stringBuilder.append(b());
        stringBuilder.append(", version=");
        stringBuilder.append(c());
        stringBuilder.append(", enabled=");
        stringBuilder.append(d());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public static List a(Context context) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int identifier = context.getResources().getIdentifier("CronetProviderClassName", "string", context.getPackageName());
        String str = "org.chromium.net.impl.JavaCronetProvider";
        String str2 = "org.chromium.net.impl.NativeCronetProvider";
        String str3 = "com.google.android.gms.net.GmsCoreCronetProvider";
        String str4 = "com.google.android.gms.net.PlayServicesCronetProvider";
        if (identifier != 0) {
            String string = context.getResources().getString(identifier);
            if (!(string == null || string.equals(str4) || string.equals(str3) || string.equals(str) || string.equals(str2) || bcjg.a(context, string, linkedHashSet, true))) {
                String str5 = b;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unable to instantiate Cronet implementation class ");
                stringBuilder.append(string);
                stringBuilder.append(" that is listed as in the app string resource file under CronetProviderClassName key");
                Log.e(str5, stringBuilder.toString());
            }
        }
        bcjg.a(context, str4, linkedHashSet, false);
        bcjg.a(context, str3, linkedHashSet, false);
        bcjg.a(context, str2, linkedHashSet, false);
        bcjg.a(context, str, linkedHashSet, false);
        return Collections.unmodifiableList(new ArrayList(linkedHashSet));
    }

    private static boolean a(Context context, String str, Set set, boolean z) {
        try {
            set.add((bcjg) context.getClassLoader().loadClass(str).asSubclass(bcjg.class).getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context}));
            return true;
        } catch (InstantiationException e) {
            bcjg.a(str, z, e);
            return false;
        } catch (InvocationTargetException e2) {
            bcjg.a(str, z, e2);
            return false;
        } catch (NoSuchMethodException e3) {
            bcjg.a(str, z, e3);
            return false;
        } catch (IllegalAccessException e4) {
            bcjg.a(str, z, e4);
            return false;
        } catch (ClassNotFoundException e5) {
            bcjg.a(str, z, e5);
            return false;
        }
    }

    private static void a(String str, boolean z, Exception exception) {
        if (z) {
            String str2 = b;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to load provider class: ");
            stringBuilder.append(str);
            Log.e(str2, stringBuilder.toString(), exception);
        }
    }
}
