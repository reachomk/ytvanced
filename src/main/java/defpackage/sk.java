package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

/* renamed from: sk */
public class sk extends si {
    public final Class a;
    public final Method b;
    private final Constructor d;
    private final Method e;
    private final Method f;
    private final Method g;
    private final Method h;

    public sk() {
        Constructor constructor;
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class cls = null;
        try {
            Class cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(new Class[0]);
            method = cls2.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, FontVariationAxis[].class});
            method2 = cls2.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, Integer.TYPE, FontVariationAxis[].class, Integer.TYPE, Integer.TYPE});
            method3 = cls2.getMethod("freeze", new Class[0]);
            method4 = cls2.getMethod("abortCreation", new Class[0]);
            cls = a(cls2);
            Class cls3 = cls2;
            method5 = cls;
            cls = cls3;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to collect necessary methods for class ");
            stringBuilder.append(e.getClass().getName());
            Log.e("TypefaceCompatApi26Impl", stringBuilder.toString(), e);
            method5 = cls;
            method4 = method5;
            constructor = method4;
            method = constructor;
            method2 = method;
            method3 = method2;
        }
        this.a = cls;
        this.d = constructor;
        this.e = method;
        this.f = method2;
        this.g = method3;
        this.h = method4;
        this.b = method5;
    }

    private final boolean a() {
        if (this.e == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.e != null;
    }

    private final Object b() {
        try {
            return this.d.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private final boolean a(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.e.invoke(obj, new Object[]{context.getAssets(), str, Integer.valueOf(0), Boolean.valueOf(false), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* Access modifiers changed, original: protected */
    public Typeface a(Object obj) {
        try {
            Array.set(Array.newInstance(this.a, 1), 0, obj);
            Method method = this.b;
            r4 = new Object[3];
            Integer valueOf = Integer.valueOf(-1);
            r4[1] = valueOf;
            r4[2] = valueOf;
            return (Typeface) method.invoke(null, r4);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    private final boolean b(Object obj) {
        try {
            return ((Boolean) this.g.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private final void c(Object obj) {
        try {
            this.h.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final Typeface a(Context context, rt rtVar, Resources resources, int i) {
        if (!a()) {
            return super.a(context, rtVar, resources, i);
        }
        Object b = b();
        if (b != null) {
            rs[] rsVarArr = rtVar.a;
            int length = rsVarArr.length;
            int i2 = 0;
            while (i2 < length) {
                rs rsVar = rsVarArr[i2];
                if (a(context, b, rsVar.a, rsVar.e, rsVar.b, rsVar.c, FontVariationAxis.fromFontVariationSettings(rsVar.d))) {
                    i2++;
                } else {
                    c(b);
                    return null;
                }
            }
            if (b(b)) {
                return a(b);
            }
        }
        return null;
    }

    /* JADX WARNING: Missing block: B:18:?, code skipped:
            r12.close();
     */
    public final android.graphics.Typeface a(android.content.Context r12, android.os.CancellationSignal r13, defpackage.yp[] r14, int r15) {
        /*
        r11 = this;
        r0 = r14.length;
        r1 = 0;
        if (r0 <= 0) goto L_0x00b2;
    L_0x0004:
        r2 = r11.a();
        if (r2 != 0) goto L_0x0046;
    L_0x000a:
        r14 = defpackage.sm.a(r14, r15);
        r12 = r12.getContentResolver();
        r15 = r14.a;	 Catch:{ IOException -> 0x0045 }
        r0 = "r";
        r12 = r12.openFileDescriptor(r15, r0, r13);	 Catch:{ IOException -> 0x0045 }
        if (r12 == 0) goto L_0x0045;
    L_0x001c:
        r13 = new android.graphics.Typeface$Builder;	 Catch:{ all -> 0x0039 }
        r15 = r12.getFileDescriptor();	 Catch:{ all -> 0x0039 }
        r13.<init>(r15);	 Catch:{ all -> 0x0039 }
        r15 = r14.c;	 Catch:{ all -> 0x0039 }
        r13 = r13.setWeight(r15);	 Catch:{ all -> 0x0039 }
        r14 = r14.d;	 Catch:{ all -> 0x0039 }
        r13 = r13.setItalic(r14);	 Catch:{ all -> 0x0039 }
        r13 = r13.build();	 Catch:{ all -> 0x0039 }
        r12.close();	 Catch:{ IOException -> 0x0045 }
        return r13;
    L_0x0039:
        r13 = move-exception;
        throw r13;	 Catch:{ all -> 0x003b }
    L_0x003b:
        r14 = move-exception;
        r12.close();	 Catch:{ all -> 0x0040 }
        goto L_0x0044;
    L_0x0040:
        r12 = move-exception;
        defpackage.ankx.a(r13, r12);	 Catch:{ IOException -> 0x0045 }
    L_0x0044:
        throw r14;	 Catch:{ IOException -> 0x0045 }
    L_0x0045:
        return r1;
    L_0x0046:
        r12 = defpackage.yj.a(r12, r14, r13);
        r13 = r11.b();
        if (r13 == 0) goto L_0x00b2;
    L_0x0050:
        r2 = 0;
        r3 = 0;
        r4 = 0;
    L_0x0053:
        if (r3 >= r0) goto L_0x009b;
    L_0x0055:
        r5 = r14[r3];
        r6 = r5.a;
        r6 = r12.get(r6);
        r6 = (java.nio.ByteBuffer) r6;
        r7 = 1;
        if (r6 != 0) goto L_0x0063;
    L_0x0062:
        goto L_0x0094;
    L_0x0063:
        r4 = r5.b;
        r8 = r5.c;
        r5 = r5.d;
        r9 = r11.f;	 Catch:{ IllegalAccessException | InvocationTargetException -> 0x0097, IllegalAccessException | InvocationTargetException -> 0x0097 }
        r10 = 5;
        r10 = new java.lang.Object[r10];	 Catch:{ IllegalAccessException | InvocationTargetException -> 0x0097, IllegalAccessException | InvocationTargetException -> 0x0097 }
        r10[r2] = r6;	 Catch:{ IllegalAccessException | InvocationTargetException -> 0x0097, IllegalAccessException | InvocationTargetException -> 0x0097 }
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ IllegalAccessException | InvocationTargetException -> 0x0097, IllegalAccessException | InvocationTargetException -> 0x0097 }
        r10[r7] = r4;	 Catch:{ IllegalAccessException | InvocationTargetException -> 0x0097, IllegalAccessException | InvocationTargetException -> 0x0097 }
        r4 = 2;
        r10[r4] = r1;	 Catch:{ IllegalAccessException | InvocationTargetException -> 0x0097, IllegalAccessException | InvocationTargetException -> 0x0097 }
        r4 = java.lang.Integer.valueOf(r8);	 Catch:{ IllegalAccessException | InvocationTargetException -> 0x0097, IllegalAccessException | InvocationTargetException -> 0x0097 }
        r6 = 3;
        r10[r6] = r4;	 Catch:{ IllegalAccessException | InvocationTargetException -> 0x0097, IllegalAccessException | InvocationTargetException -> 0x0097 }
        r4 = java.lang.Integer.valueOf(r5);	 Catch:{ IllegalAccessException | InvocationTargetException -> 0x0097, IllegalAccessException | InvocationTargetException -> 0x0097 }
        r5 = 4;
        r10[r5] = r4;	 Catch:{ IllegalAccessException | InvocationTargetException -> 0x0097, IllegalAccessException | InvocationTargetException -> 0x0097 }
        r4 = r9.invoke(r13, r10);	 Catch:{ IllegalAccessException | InvocationTargetException -> 0x0097, IllegalAccessException | InvocationTargetException -> 0x0097 }
        r4 = (java.lang.Boolean) r4;	 Catch:{ IllegalAccessException | InvocationTargetException -> 0x0097, IllegalAccessException | InvocationTargetException -> 0x0097 }
        r4 = r4.booleanValue();	 Catch:{ IllegalAccessException | InvocationTargetException -> 0x0097, IllegalAccessException | InvocationTargetException -> 0x0097 }
        if (r4 == 0) goto L_0x0097;
    L_0x0093:
        r4 = 1;
    L_0x0094:
        r3 = r3 + 1;
        goto L_0x0053;
    L_0x0097:
        r11.c(r13);
        return r1;
    L_0x009b:
        if (r4 == 0) goto L_0x00af;
    L_0x009d:
        r12 = r11.b(r13);
        if (r12 == 0) goto L_0x00ae;
    L_0x00a3:
        r12 = r11.a(r13);
        if (r12 == 0) goto L_0x00ae;
    L_0x00a9:
        r12 = android.graphics.Typeface.create(r12, r15);
        return r12;
    L_0x00ae:
        return r1;
    L_0x00af:
        r11.c(r13);
    L_0x00b2:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sk.a(android.content.Context, android.os.CancellationSignal, yp[], int):android.graphics.Typeface");
    }

    public final Typeface a(Context context, Resources resources, int i, String str, int i2) {
        if (!a()) {
            return super.a(context, resources, i, str, i2);
        }
        Object b = b();
        if (b != null) {
            if (!a(context, b, str, 0, -1, -1, null)) {
                c(b);
                return null;
            } else if (b(b)) {
                return a(b);
            }
        }
        return null;
    }

    /* Access modifiers changed, original: protected */
    public Method a(Class cls) {
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), Integer.TYPE, Integer.TYPE});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
