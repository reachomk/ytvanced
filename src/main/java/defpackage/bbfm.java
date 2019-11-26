package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Logger;

/* renamed from: bbfm */
public final class bbfm implements bbdc {
    public static final RuntimeException a;
    private static final Logger b = Logger.getLogger(bbfm.class.getName());
    private static final Constructor c;
    private static final Method d;
    private final Object e;

    bbfm() {
        RuntimeException runtimeException = a;
        if (runtimeException == null) {
            try {
                this.e = c.newInstance(new Object[0]);
                return;
            } catch (InstantiationException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3);
            }
        }
        throw runtimeException;
    }

    public final void a() {
        try {
            d.invoke(this.e, new Object[]{Long.valueOf(1)});
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0056 A:{SKIP} */
    static {
        /*
        r0 = defpackage.bbfm.class;
        r0 = r0.getName();
        r0 = java.util.logging.Logger.getLogger(r0);
        b = r0;
        r0 = 0;
        r1 = "java.util.concurrent.atomic.LongAdder";
        r1 = java.lang.Class.forName(r1);	 Catch:{ all -> 0x0041 }
        r2 = "add";
        r3 = 1;
        r3 = new java.lang.Class[r3];	 Catch:{ all -> 0x0041 }
        r4 = java.lang.Long.TYPE;	 Catch:{ all -> 0x0041 }
        r5 = 0;
        r3[r5] = r4;	 Catch:{ all -> 0x0041 }
        r2 = r1.getMethod(r2, r3);	 Catch:{ all -> 0x0041 }
        r3 = "sum";
        r4 = new java.lang.Class[r5];	 Catch:{ all -> 0x003e }
        r1.getMethod(r3, r4);	 Catch:{ all -> 0x003e }
        r1 = r1.getConstructors();	 Catch:{ all -> 0x003e }
        r3 = r1.length;	 Catch:{ all -> 0x003e }
    L_0x002d:
        if (r5 >= r3) goto L_0x003b;
    L_0x002f:
        r4 = r1[r5];	 Catch:{ all -> 0x003e }
        r6 = r4.getParameterTypes();	 Catch:{ all -> 0x003e }
        r6 = r6.length;	 Catch:{ all -> 0x003e }
        if (r6 == 0) goto L_0x003c;
    L_0x0038:
        r5 = r5 + 1;
        goto L_0x002d;
    L_0x003b:
        r4 = r0;
    L_0x003c:
        r1 = r0;
        goto L_0x0053;
    L_0x003e:
        r1 = move-exception;
        r8 = r2;
        goto L_0x0043;
    L_0x0041:
        r1 = move-exception;
        r8 = r0;
    L_0x0043:
        r2 = b;
        r3 = java.util.logging.Level.FINE;
        r4 = "io.grpc.internal.ReflectionLongAdderCounter";
        r5 = "<clinit>";
        r6 = "LongAdder can not be found via reflection, this is normal for JDK7 and below";
        r7 = r1;
        r2.logp(r3, r4, r5, r6, r7);
        r4 = r0;
        r2 = r8;
    L_0x0053:
        if (r1 == 0) goto L_0x0056;
    L_0x0055:
        goto L_0x005f;
    L_0x0056:
        if (r4 == 0) goto L_0x005f;
    L_0x0058:
        c = r4;
        d = r2;
        a = r0;
        return;
    L_0x005f:
        c = r0;
        d = r0;
        r0 = new java.lang.RuntimeException;
        r0.<init>(r1);
        a = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbfm.<clinit>():void");
    }
}
