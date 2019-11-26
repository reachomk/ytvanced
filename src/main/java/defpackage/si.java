package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: si */
class si extends sm {
    private static Class a = null;
    private static Constructor b = null;
    private static Method d = null;
    private static Method e = null;
    private static boolean f = false;

    si() {
    }

    private static void a() {
        Method method;
        if (!f) {
            Class cls;
            Method method2;
            f = true;
            Constructor constructor = null;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                Constructor constructor2 = cls.getConstructor(new Class[0]);
                method2 = cls.getMethod("addFontWeightStyle", new Class[]{String.class, Integer.TYPE, Boolean.TYPE});
                constructor = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
                method = constructor;
                constructor = constructor2;
            } catch (ClassNotFoundException | NoSuchMethodException e) {
                Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
                method = constructor;
                cls = method;
                method2 = cls;
            }
            b = constructor;
            a = cls;
            d = method2;
            e = method;
        }
    }

    private static File a(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("/proc/self/fd/");
            stringBuilder.append(parcelFileDescriptor.getFd());
            String readlink = Os.readlink(stringBuilder.toString());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    private static Object b() {
        si.a();
        try {
            return b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARNING: Missing block: B:30:?, code skipped:
            r5.close();
     */
    /* JADX WARNING: Missing block: B:31:0x0046, code skipped:
            r5 = move-exception;
     */
    /* JADX WARNING: Missing block: B:33:?, code skipped:
            defpackage.ankx.a(r3, r5);
     */
    /* JADX WARNING: Missing block: B:40:?, code skipped:
            r4.close();
     */
    public android.graphics.Typeface a(android.content.Context r3, android.os.CancellationSignal r4, defpackage.yp[] r5, int r6) {
        /*
        r2 = this;
        r0 = r5.length;
        r1 = 0;
        if (r0 <= 0) goto L_0x0057;
    L_0x0004:
        r5 = defpackage.sm.a(r5, r6);
        r6 = r3.getContentResolver();
        r5 = r5.a;	 Catch:{ IOException -> 0x0057 }
        r0 = "r";
        r4 = r6.openFileDescriptor(r5, r0, r4);	 Catch:{ IOException -> 0x0057 }
        if (r4 == 0) goto L_0x0057;
    L_0x0016:
        r5 = defpackage.si.a(r4);	 Catch:{ all -> 0x004b }
        if (r5 == 0) goto L_0x002b;
    L_0x001c:
        r6 = r5.canRead();	 Catch:{ all -> 0x004b }
        if (r6 != 0) goto L_0x0023;
    L_0x0022:
        goto L_0x002b;
    L_0x0023:
        r3 = android.graphics.Typeface.createFromFile(r5);	 Catch:{ all -> 0x004b }
        r4.close();	 Catch:{ IOException -> 0x0057 }
        return r3;
    L_0x002b:
        r5 = new java.io.FileInputStream;	 Catch:{ all -> 0x004b }
        r6 = r4.getFileDescriptor();	 Catch:{ all -> 0x004b }
        r5.<init>(r6);	 Catch:{ all -> 0x004b }
        r3 = defpackage.sm.a(r3, r5);	 Catch:{ all -> 0x003f }
        r5.close();	 Catch:{ all -> 0x004b }
        r4.close();	 Catch:{ IOException -> 0x0057 }
        return r3;
    L_0x003f:
        r3 = move-exception;
        throw r3;	 Catch:{ all -> 0x0041 }
    L_0x0041:
        r6 = move-exception;
        r5.close();	 Catch:{ all -> 0x0046 }
        goto L_0x004a;
    L_0x0046:
        r5 = move-exception;
        defpackage.ankx.a(r3, r5);	 Catch:{ all -> 0x004b }
    L_0x004a:
        throw r6;	 Catch:{ all -> 0x004b }
    L_0x004b:
        r3 = move-exception;
        throw r3;	 Catch:{ all -> 0x004d }
    L_0x004d:
        r5 = move-exception;
        r4.close();	 Catch:{ all -> 0x0052 }
        goto L_0x0056;
    L_0x0052:
        r4 = move-exception;
        defpackage.ankx.a(r3, r4);	 Catch:{ IOException -> 0x0057 }
    L_0x0056:
        throw r5;	 Catch:{ IOException -> 0x0057 }
    L_0x0057:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.si.a(android.content.Context, android.os.CancellationSignal, yp[], int):android.graphics.Typeface");
    }

    public Typeface a(Context context, rt rtVar, Resources resources, int i) {
        Object b = si.b();
        rs[] rsVarArr = rtVar.a;
        int length = rsVarArr.length;
        int i2 = 0;
        while (i2 < length) {
            rs rsVar = rsVarArr[i2];
            File a = sq.a(context);
            if (a == null) {
                return null;
            }
            try {
                if (sq.a(a, resources, rsVar.f)) {
                    String path = a.getPath();
                    int i3 = rsVar.b;
                    boolean z = rsVar.c;
                    si.a();
                    if (((Boolean) d.invoke(b, new Object[]{path, Integer.valueOf(i3), Boolean.valueOf(z)})).booleanValue()) {
                        a.delete();
                        i2++;
                    } else {
                        a.delete();
                        return null;
                    }
                }
                a.delete();
                return null;
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            } catch (RuntimeException unused) {
                a.delete();
            } catch (Throwable th) {
                a.delete();
            }
        }
        si.a();
        try {
            Array.set(Array.newInstance(a, 1), 0, b);
            return (Typeface) e.invoke(null, new Object[]{r12});
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }
}
