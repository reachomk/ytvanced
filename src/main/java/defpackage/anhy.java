package defpackage;

import sun.misc.Unsafe;

/* renamed from: anhy */
final class anhy extends anho {
    public static final Unsafe a;
    public static final long b;
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;

    private anhy() {
    }

    /* Access modifiers changed, original: final */
    public final void a(ania ania, Thread thread) {
        a.putObject(ania, e, thread);
    }

    /* Access modifiers changed, original: final */
    public final void a(ania ania, ania ania2) {
        a.putObject(ania, f, ania2);
    }

    /* Access modifiers changed, original: final */
    public final boolean a(anhl anhl, ania ania, ania ania2) {
        return a.compareAndSwapObject(anhl, c, ania, ania2);
    }

    /* Access modifiers changed, original: final */
    public final boolean a(anhl anhl, anhs anhs, anhs anhs2) {
        return a.compareAndSwapObject(anhl, b, anhs, anhs2);
    }

    /* Access modifiers changed, original: final */
    public final boolean a(anhl anhl, Object obj, Object obj2) {
        return a.compareAndSwapObject(anhl, d, obj, obj2);
    }

    /* synthetic */ anhy(byte b) {
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0005 */
    /* JADX WARNING: Failed to process nested try/catch */
    static {
        /*
        r0 = sun.misc.Unsafe.getUnsafe();	 Catch:{ SecurityException -> 0x0005 }
        goto L_0x0010;
    L_0x0005:
        r0 = new anhx;	 Catch:{ PrivilegedActionException -> 0x005f }
        r0.<init>();	 Catch:{ PrivilegedActionException -> 0x005f }
        r0 = java.security.AccessController.doPrivileged(r0);	 Catch:{ PrivilegedActionException -> 0x005f }
        r0 = (sun.misc.Unsafe) r0;	 Catch:{ PrivilegedActionException -> 0x005f }
    L_0x0010:
        r1 = defpackage.anhl.class;
        r2 = "waiters";
        r2 = r1.getDeclaredField(r2);	 Catch:{ Exception -> 0x0055 }
        r2 = r0.objectFieldOffset(r2);	 Catch:{ Exception -> 0x0055 }
        c = r2;	 Catch:{ Exception -> 0x0055 }
        r2 = "listeners";
        r2 = r1.getDeclaredField(r2);	 Catch:{ Exception -> 0x0055 }
        r2 = r0.objectFieldOffset(r2);	 Catch:{ Exception -> 0x0055 }
        b = r2;	 Catch:{ Exception -> 0x0055 }
        r2 = "value";
        r1 = r1.getDeclaredField(r2);	 Catch:{ Exception -> 0x0055 }
        r1 = r0.objectFieldOffset(r1);	 Catch:{ Exception -> 0x0055 }
        d = r1;	 Catch:{ Exception -> 0x0055 }
        r1 = defpackage.ania.class;
        r2 = "thread";
        r1 = r1.getDeclaredField(r2);	 Catch:{ Exception -> 0x0055 }
        r1 = r0.objectFieldOffset(r1);	 Catch:{ Exception -> 0x0055 }
        e = r1;	 Catch:{ Exception -> 0x0055 }
        r1 = defpackage.ania.class;
        r2 = "next";
        r1 = r1.getDeclaredField(r2);	 Catch:{ Exception -> 0x0055 }
        r1 = r0.objectFieldOffset(r1);	 Catch:{ Exception -> 0x0055 }
        f = r1;	 Catch:{ Exception -> 0x0055 }
        a = r0;	 Catch:{ Exception -> 0x0055 }
        return;
    L_0x0055:
        r0 = move-exception;
        defpackage.amrs.a(r0);
        r1 = new java.lang.RuntimeException;
        r1.<init>(r0);
        throw r1;
    L_0x005f:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;
        r0 = r0.getCause();
        r2 = "Could not initialize intrinsics";
        r1.<init>(r2, r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anhy.<clinit>():void");
    }
}
