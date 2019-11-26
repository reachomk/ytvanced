package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: mv */
public final class mv {
    public static final Method a;
    public static final Method b;
    private static final Class c;
    private static final Field d;
    private static final Field e;
    private static final Method f;
    private static final Handler g = new Handler(Looper.getMainLooper());

    public static boolean a(Activity activity) {
        if (VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (mv.a() && f == null) {
            return false;
        } else {
            if (b == null && a == null) {
                return false;
            }
            Application application;
            mz mzVar;
            try {
                Object obj = e.get(activity);
                if (obj != null) {
                    Object obj2 = d.get(activity);
                    if (obj2 != null) {
                        application = activity.getApplication();
                        mzVar = new mz(activity);
                        application.registerActivityLifecycleCallbacks(mzVar);
                        g.post(new mu(mzVar, obj));
                        if (mv.a()) {
                            Method method = f;
                            r6 = new Object[9];
                            Boolean valueOf = Boolean.valueOf(false);
                            r6[4] = valueOf;
                            r6[5] = null;
                            r6[6] = null;
                            r6[7] = valueOf;
                            r6[8] = valueOf;
                            method.invoke(obj2, r6);
                        } else {
                            activity.recreate();
                        }
                        g.post(new mx(application, mzVar));
                        return true;
                    }
                }
            } catch (Throwable unused) {
            }
            return false;
        }
    }

    protected static boolean a(Object obj, Activity activity) {
        try {
            Object obj2 = e.get(activity);
            if (obj2 != obj) {
                return false;
            }
            g.postAtFrontOfQueue(new mw(d.get(activity), obj2));
            return true;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    private static boolean a() {
        return VERSION.SDK_INT == 26 || VERSION.SDK_INT == 27;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005b A:{SYNTHETIC, Splitter:B:23:0x005b} */
    static {
        /*
        r0 = new android.os.Handler;
        r1 = android.os.Looper.getMainLooper();
        r0.<init>(r1);
        g = r0;
        r0 = 0;
        r1 = "android.app.ActivityThread";
        r1 = java.lang.Class.forName(r1);	 Catch:{ all -> 0x0013 }
        goto L_0x0014;
    L_0x0013:
        r1 = r0;
    L_0x0014:
        c = r1;
        r1 = 1;
        r2 = android.app.Activity.class;
        r3 = "mMainThread";
        r2 = r2.getDeclaredField(r3);	 Catch:{ all -> 0x0023 }
        r2.setAccessible(r1);	 Catch:{ all -> 0x0023 }
        goto L_0x0024;
    L_0x0023:
        r2 = r0;
    L_0x0024:
        d = r2;
        r2 = android.app.Activity.class;
        r3 = "mToken";
        r2 = r2.getDeclaredField(r3);	 Catch:{ all -> 0x0032 }
        r2.setAccessible(r1);	 Catch:{ all -> 0x0032 }
        goto L_0x0033;
    L_0x0032:
        r2 = r0;
    L_0x0033:
        e = r2;
        r2 = c;
        r3 = 3;
        r4 = "performStopActivity";
        r5 = 0;
        r6 = 2;
        if (r2 == 0) goto L_0x0054;
    L_0x003e:
        r7 = new java.lang.Class[r3];	 Catch:{ all -> 0x0054 }
        r8 = android.os.IBinder.class;
        r7[r5] = r8;	 Catch:{ all -> 0x0054 }
        r8 = java.lang.Boolean.TYPE;	 Catch:{ all -> 0x0054 }
        r7[r1] = r8;	 Catch:{ all -> 0x0054 }
        r8 = java.lang.String.class;
        r7[r6] = r8;	 Catch:{ all -> 0x0054 }
        r2 = r2.getDeclaredMethod(r4, r7);	 Catch:{ all -> 0x0054 }
        r2.setAccessible(r1);	 Catch:{ all -> 0x0054 }
        goto L_0x0055;
    L_0x0054:
        r2 = r0;
    L_0x0055:
        a = r2;
        r2 = c;
        if (r2 == 0) goto L_0x006d;
    L_0x005b:
        r7 = new java.lang.Class[r6];	 Catch:{ all -> 0x006d }
        r8 = android.os.IBinder.class;
        r7[r5] = r8;	 Catch:{ all -> 0x006d }
        r8 = java.lang.Boolean.TYPE;	 Catch:{ all -> 0x006d }
        r7[r1] = r8;	 Catch:{ all -> 0x006d }
        r2 = r2.getDeclaredMethod(r4, r7);	 Catch:{ all -> 0x006d }
        r2.setAccessible(r1);	 Catch:{ all -> 0x006d }
        goto L_0x006e;
    L_0x006d:
        r2 = r0;
    L_0x006e:
        b = r2;
        r2 = c;
        r4 = defpackage.mv.a();
        if (r4 != 0) goto L_0x0079;
    L_0x0078:
        goto L_0x00b3;
    L_0x0079:
        if (r2 == 0) goto L_0x00b3;
    L_0x007b:
        r4 = "requestRelaunchActivity";
        r7 = 9;
        r7 = new java.lang.Class[r7];	 Catch:{ all -> 0x00b3 }
        r8 = android.os.IBinder.class;
        r7[r5] = r8;	 Catch:{ all -> 0x00b3 }
        r5 = java.util.List.class;
        r7[r1] = r5;	 Catch:{ all -> 0x00b3 }
        r5 = java.util.List.class;
        r7[r6] = r5;	 Catch:{ all -> 0x00b3 }
        r5 = java.lang.Integer.TYPE;	 Catch:{ all -> 0x00b3 }
        r7[r3] = r5;	 Catch:{ all -> 0x00b3 }
        r3 = java.lang.Boolean.TYPE;	 Catch:{ all -> 0x00b3 }
        r5 = 4;
        r7[r5] = r3;	 Catch:{ all -> 0x00b3 }
        r3 = android.content.res.Configuration.class;
        r5 = 5;
        r7[r5] = r3;	 Catch:{ all -> 0x00b3 }
        r3 = android.content.res.Configuration.class;
        r5 = 6;
        r7[r5] = r3;	 Catch:{ all -> 0x00b3 }
        r3 = java.lang.Boolean.TYPE;	 Catch:{ all -> 0x00b3 }
        r5 = 7;
        r7[r5] = r3;	 Catch:{ all -> 0x00b3 }
        r3 = java.lang.Boolean.TYPE;	 Catch:{ all -> 0x00b3 }
        r5 = 8;
        r7[r5] = r3;	 Catch:{ all -> 0x00b3 }
        r2 = r2.getDeclaredMethod(r4, r7);	 Catch:{ all -> 0x00b3 }
        r2.setAccessible(r1);	 Catch:{ all -> 0x00b3 }
        r0 = r2;
    L_0x00b3:
        f = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mv.<clinit>():void");
    }
}
