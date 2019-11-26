package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: aj */
public final class aj {
    private static Map a = new HashMap();
    private static Map b = new HashMap();

    static y a(Object obj) {
        if (obj instanceof t) {
            return new w((t) obj);
        }
        if (obj instanceof y) {
            return (y) obj;
        }
        Class cls = obj.getClass();
        if (aj.a(cls) != 2) {
            return new aw(obj);
        }
        List list = (List) b.get(cls);
        int i = 0;
        if (list.size() == 1) {
            return new ba(aj.a((Constructor) list.get(0), obj));
        }
        v[] vVarArr = new v[list.size()];
        while (i < list.size()) {
            vVarArr[i] = aj.a((Constructor) list.get(i), obj);
            i++;
        }
        return new r(vVarArr);
    }

    private static v a(Constructor constructor, Object obj) {
        try {
            return (v) constructor.newInstance(new Object[]{obj});
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX WARNING: Missing block: B:30:0x00a7, code skipped:
            if (((java.lang.Boolean) r0.b.get(r10)).booleanValue() != false) goto L_0x011f;
     */
    private static int a(java.lang.Class r10) {
        /*
        r0 = ".";
        r1 = a;
        r1 = r1.containsKey(r10);
        if (r1 != 0) goto L_0x0129;
    L_0x000a:
        r1 = r10.getCanonicalName();
        r2 = 2;
        r3 = 1;
        if (r1 != 0) goto L_0x0014;
    L_0x0012:
        goto L_0x011f;
    L_0x0014:
        r1 = 0;
        r4 = 0;
        r5 = r10.getPackage();	 Catch:{ ClassNotFoundException -> 0x0082, NoSuchMethodException -> 0x007b }
        r6 = r10.getCanonicalName();	 Catch:{ ClassNotFoundException -> 0x0082, NoSuchMethodException -> 0x007b }
        if (r5 == 0) goto L_0x0025;
    L_0x0020:
        r5 = r5.getName();	 Catch:{ ClassNotFoundException -> 0x0082, NoSuchMethodException -> 0x007b }
        goto L_0x0027;
    L_0x0025:
        r5 = "";
    L_0x0027:
        r7 = r5.isEmpty();	 Catch:{ ClassNotFoundException -> 0x0082, NoSuchMethodException -> 0x007b }
        if (r7 != 0) goto L_0x0036;
    L_0x002d:
        r7 = r5.length();	 Catch:{ ClassNotFoundException -> 0x0082, NoSuchMethodException -> 0x007b }
        r7 = r7 + r3;
        r6 = r6.substring(r7);	 Catch:{ ClassNotFoundException -> 0x0082, NoSuchMethodException -> 0x007b }
    L_0x0036:
        r7 = new java.lang.StringBuilder;	 Catch:{ ClassNotFoundException -> 0x0082, NoSuchMethodException -> 0x007b }
        r7.<init>();	 Catch:{ ClassNotFoundException -> 0x0082, NoSuchMethodException -> 0x007b }
        r8 = "_";
        r6 = r6.replace(r0, r8);	 Catch:{ ClassNotFoundException -> 0x0082, NoSuchMethodException -> 0x007b }
        r7.append(r6);	 Catch:{ ClassNotFoundException -> 0x0082, NoSuchMethodException -> 0x007b }
        r6 = "_LifecycleAdapter";
        r7.append(r6);	 Catch:{ ClassNotFoundException -> 0x0082, NoSuchMethodException -> 0x007b }
        r6 = r7.toString();	 Catch:{ ClassNotFoundException -> 0x0082, NoSuchMethodException -> 0x007b }
        r7 = r5.isEmpty();	 Catch:{ ClassNotFoundException -> 0x0082, NoSuchMethodException -> 0x007b }
        if (r7 != 0) goto L_0x0065;
    L_0x0053:
        r7 = new java.lang.StringBuilder;	 Catch:{ ClassNotFoundException -> 0x0082, NoSuchMethodException -> 0x007b }
        r7.<init>();	 Catch:{ ClassNotFoundException -> 0x0082, NoSuchMethodException -> 0x007b }
        r7.append(r5);	 Catch:{ ClassNotFoundException -> 0x0082, NoSuchMethodException -> 0x007b }
        r7.append(r0);	 Catch:{ ClassNotFoundException -> 0x0082, NoSuchMethodException -> 0x007b }
        r7.append(r6);	 Catch:{ ClassNotFoundException -> 0x0082, NoSuchMethodException -> 0x007b }
        r6 = r7.toString();	 Catch:{ ClassNotFoundException -> 0x0082, NoSuchMethodException -> 0x007b }
    L_0x0065:
        r0 = java.lang.Class.forName(r6);	 Catch:{ ClassNotFoundException -> 0x0082, NoSuchMethodException -> 0x007b }
        r5 = new java.lang.Class[r3];	 Catch:{ ClassNotFoundException -> 0x0082, NoSuchMethodException -> 0x007b }
        r5[r4] = r10;	 Catch:{ ClassNotFoundException -> 0x0082, NoSuchMethodException -> 0x007b }
        r0 = r0.getDeclaredConstructor(r5);	 Catch:{ ClassNotFoundException -> 0x0082, NoSuchMethodException -> 0x007b }
        r5 = r0.isAccessible();	 Catch:{ ClassNotFoundException -> 0x0082, NoSuchMethodException -> 0x007b }
        if (r5 != 0) goto L_0x0083;
    L_0x0077:
        r0.setAccessible(r3);	 Catch:{ ClassNotFoundException -> 0x0082, NoSuchMethodException -> 0x007b }
        goto L_0x0083;
    L_0x007b:
        r10 = move-exception;
        r0 = new java.lang.RuntimeException;
        r0.<init>(r10);
        throw r0;
    L_0x0082:
        r0 = r1;
    L_0x0083:
        if (r0 == 0) goto L_0x0091;
    L_0x0085:
        r1 = b;
        r0 = java.util.Collections.singletonList(r0);
        r1.put(r10, r0);
    L_0x008e:
        r3 = 2;
        goto L_0x011f;
    L_0x0091:
        r0 = defpackage.q.a;
        r5 = r0.b;
        r5 = r5.containsKey(r10);
        if (r5 == 0) goto L_0x00ab;
    L_0x009b:
        r0 = r0.b;
        r0 = r0.get(r10);
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x00cf;
    L_0x00a9:
        goto L_0x011f;
    L_0x00ab:
        r5 = defpackage.q.a(r10);
        r6 = r5.length;
        r7 = 0;
    L_0x00b1:
        if (r7 >= r6) goto L_0x00c6;
    L_0x00b3:
        r8 = r5[r7];
        r9 = android.arch.lifecycle.OnLifecycleEvent.class;
        r8 = r8.getAnnotation(r9);
        r8 = (android.arch.lifecycle.OnLifecycleEvent) r8;
        if (r8 != 0) goto L_0x00c2;
    L_0x00bf:
        r7 = r7 + 1;
        goto L_0x00b1;
    L_0x00c2:
        r0.a(r10, r5);
        goto L_0x011f;
    L_0x00c6:
        r0 = r0.b;
        r5 = java.lang.Boolean.valueOf(r4);
        r0.put(r10, r5);
    L_0x00cf:
        r0 = r10.getSuperclass();
        r5 = defpackage.aj.b(r0);
        if (r5 == 0) goto L_0x00ec;
    L_0x00d9:
        r1 = defpackage.aj.a(r0);
        if (r1 == r3) goto L_0x011f;
    L_0x00df:
        r1 = new java.util.ArrayList;
        r5 = b;
        r0 = r5.get(r0);
        r0 = (java.util.Collection) r0;
        r1.<init>(r0);
    L_0x00ec:
        r0 = r10.getInterfaces();
        r5 = r0.length;
    L_0x00f1:
        if (r4 >= r5) goto L_0x0116;
    L_0x00f3:
        r6 = r0[r4];
        r7 = defpackage.aj.b(r6);
        if (r7 == 0) goto L_0x0113;
    L_0x00fb:
        r7 = defpackage.aj.a(r6);
        if (r7 == r3) goto L_0x011f;
    L_0x0101:
        if (r1 != 0) goto L_0x0108;
    L_0x0103:
        r1 = new java.util.ArrayList;
        r1.<init>();
    L_0x0108:
        r7 = b;
        r6 = r7.get(r6);
        r6 = (java.util.Collection) r6;
        r1.addAll(r6);
    L_0x0113:
        r4 = r4 + 1;
        goto L_0x00f1;
    L_0x0116:
        if (r1 == 0) goto L_0x011f;
    L_0x0118:
        r0 = b;
        r0.put(r10, r1);
        goto L_0x008e;
    L_0x011f:
        r0 = a;
        r1 = java.lang.Integer.valueOf(r3);
        r0.put(r10, r1);
        return r3;
    L_0x0129:
        r0 = a;
        r10 = r0.get(r10);
        r10 = (java.lang.Integer) r10;
        r10 = r10.intValue();
        return r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aj.a(java.lang.Class):int");
    }

    private static boolean b(Class cls) {
        return cls != null && ag.class.isAssignableFrom(cls);
    }
}
