package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.AccessController;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: rhv */
final class rhv {
    public static final rhz a;
    public static final boolean b;
    public static final boolean c;
    public static final long d = ((long) rhv.a(byte[].class));
    public static final boolean e;
    private static final Logger f = Logger.getLogger(rhv.class.getName());
    private static final Unsafe g = rhv.a();
    private static final Class h = rcv.a;
    private static final boolean i = rhv.c(Long.TYPE);
    private static final boolean j = rhv.c(Integer.TYPE);
    private static final long k = rhv.a(rhv.b());

    private rhv() {
    }

    private static int a(Class cls) {
        return c ? a.a.arrayBaseOffset(cls) : -1;
    }

    private static int b(Class cls) {
        return c ? a.a.arrayIndexScale(cls) : -1;
    }

    static int a(Object obj, long j) {
        return a.e(obj, j);
    }

    static void a(Object obj, long j, int i) {
        a.a(obj, j, i);
    }

    static long b(Object obj, long j) {
        return a.f(obj, j);
    }

    static void a(Object obj, long j, long j2) {
        a.a(obj, j, j2);
    }

    static boolean c(Object obj, long j) {
        return a.b(obj, j);
    }

    static void a(Object obj, long j, boolean z) {
        a.a(obj, j, z);
    }

    static float d(Object obj, long j) {
        return a.c(obj, j);
    }

    static void a(Object obj, long j, float f) {
        a.a(obj, j, f);
    }

    static double e(Object obj, long j) {
        return a.d(obj, j);
    }

    static void a(Object obj, long j, double d) {
        a.a(obj, j, d);
    }

    static Object f(Object obj, long j) {
        return a.a.getObject(obj, j);
    }

    static void a(Object obj, long j, Object obj2) {
        a.a.putObject(obj, j, obj2);
    }

    static byte a(byte[] bArr, long j) {
        return a.a((Object) bArr, d + j);
    }

    static void a(byte[] bArr, long j, byte b) {
        a.a((Object) bArr, d + j, b);
    }

    static void a(long j, byte b) {
        a.a(j, b);
    }

    static long a(ByteBuffer byteBuffer) {
        return a.f(byteBuffer, k);
    }

    static Unsafe a() {
        try {
            return (Unsafe) AccessController.doPrivileged(new ric());
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean c(Class cls) {
        Class cls2 = byte[].class;
        if (rcv.a()) {
            try {
                Class cls3 = h;
                cls3.getMethod("peekLong", new Class[]{cls, Boolean.TYPE});
                cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, Boolean.TYPE});
                cls3.getMethod("pokeInt", new Class[]{cls, Integer.TYPE, Boolean.TYPE});
                cls3.getMethod("peekInt", new Class[]{cls, Boolean.TYPE});
                cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
                cls3.getMethod("peekByte", new Class[]{cls});
                cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, Integer.TYPE, Integer.TYPE});
                cls3.getMethod("peekByteArray", new Class[]{cls, cls2, Integer.TYPE, Integer.TYPE});
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    private static Field b() {
        Field a;
        if (rcv.a()) {
            a = rhv.a(Buffer.class, "effectiveDirectAddress");
            if (a != null) {
                return a;
            }
        }
        a = rhv.a(Buffer.class, "address");
        return (a == null || a.getType() != Long.TYPE) ? null : a;
    }

    private static long a(Field field) {
        if (field != null) {
            rhz rhz = a;
            if (rhz != null) {
                return rhz.a.objectFieldOffset(field);
            }
        }
        return -1;
    }

    private static Field a(Class cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static byte g(Object obj, long j) {
        return (byte) (rhv.a(obj, -4 & j) >>> ((int) (((j ^ -1) & 3) << 3)));
    }

    public static byte h(Object obj, long j) {
        return (byte) (rhv.a(obj, -4 & j) >>> ((int) ((j & 3) << 3)));
    }

    public static void a(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = ((((int) j) ^ -1) & 3) << 3;
        rhv.a(obj, j2, ((b & 255) << i) | (rhv.a(obj, j2) & ((255 << i) ^ -1)));
    }

    public static void b(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        rhv.a(obj, j2, ((b & 255) << i) | (rhv.a(obj, j2) & ((255 << i) ^ -1)));
    }

    public static boolean i(Object obj, long j) {
        return rhv.g(obj, j) != (byte) 0;
    }

    public static boolean j(Object obj, long j) {
        return rhv.h(obj, j) != (byte) 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x02e6  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x013c A:{SYNTHETIC, Splitter:B:26:0x013c} */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x02cd  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x02e6  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x006d A:{SYNTHETIC, Splitter:B:14:0x006d} */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x013c A:{SYNTHETIC, Splitter:B:26:0x013c} */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x02cd  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x02e6  */
    static {
        /*
        r1 = double[].class;
        r2 = float[].class;
        r3 = long[].class;
        r4 = int[].class;
        r5 = boolean[].class;
        r0 = defpackage.rhv.class;
        r0 = r0.getName();
        r0 = java.util.logging.Logger.getLogger(r0);
        f = r0;
        r0 = defpackage.rhv.a();
        g = r0;
        r0 = defpackage.rcv.a;
        h = r0;
        r0 = java.lang.Long.TYPE;
        r0 = defpackage.rhv.c(r0);
        i = r0;
        r0 = java.lang.Integer.TYPE;
        r0 = defpackage.rhv.c(r0);
        j = r0;
        r0 = g;
        if (r0 == 0) goto L_0x005a;
    L_0x0034:
        r0 = defpackage.rcv.a();
        if (r0 == 0) goto L_0x0052;
    L_0x003a:
        r0 = i;
        if (r0 == 0) goto L_0x0046;
    L_0x003e:
        r0 = new rhx;
        r7 = g;
        r0.<init>(r7);
        goto L_0x005b;
    L_0x0046:
        r0 = j;
        if (r0 == 0) goto L_0x005a;
    L_0x004a:
        r0 = new rhy;
        r7 = g;
        r0.<init>(r7);
        goto L_0x005b;
    L_0x0052:
        r0 = new ria;
        r7 = g;
        r0.<init>(r7);
        goto L_0x005b;
    L_0x005a:
        r0 = 0;
    L_0x005b:
        a = r0;
        r0 = g;
        r7 = "objectFieldOffset";
        r8 = "com.google.protobuf.UnsafeUtil";
        r9 = "platform method missing - proto runtime falling back to safer methods: ";
        r10 = "getLong";
        r11 = 3;
        r12 = 2;
        r13 = 1;
        r14 = 0;
        if (r0 == 0) goto L_0x0135;
    L_0x006d:
        r0 = r0.getClass();	 Catch:{ all -> 0x0112 }
        r15 = new java.lang.Class[r13];	 Catch:{ all -> 0x0112 }
        r16 = java.lang.reflect.Field.class;
        r15[r14] = r16;	 Catch:{ all -> 0x0112 }
        r0.getMethod(r7, r15);	 Catch:{ all -> 0x0112 }
        r15 = new java.lang.Class[r12];	 Catch:{ all -> 0x0112 }
        r16 = java.lang.Object.class;
        r15[r14] = r16;	 Catch:{ all -> 0x0112 }
        r16 = java.lang.Long.TYPE;	 Catch:{ all -> 0x0112 }
        r15[r13] = r16;	 Catch:{ all -> 0x0112 }
        r0.getMethod(r10, r15);	 Catch:{ all -> 0x0112 }
        r15 = defpackage.rhv.b();	 Catch:{ all -> 0x0112 }
        if (r15 == 0) goto L_0x0135;
    L_0x008d:
        r15 = defpackage.rcv.a();	 Catch:{ all -> 0x0112 }
        if (r15 != 0) goto L_0x0110;
    L_0x0093:
        r15 = "getByte";
        r6 = new java.lang.Class[r13];	 Catch:{ all -> 0x0112 }
        r17 = java.lang.Long.TYPE;	 Catch:{ all -> 0x0112 }
        r6[r14] = r17;	 Catch:{ all -> 0x0112 }
        r0.getMethod(r15, r6);	 Catch:{ all -> 0x0112 }
        r6 = "putByte";
        r15 = new java.lang.Class[r12];	 Catch:{ all -> 0x0112 }
        r17 = java.lang.Long.TYPE;	 Catch:{ all -> 0x0112 }
        r15[r14] = r17;	 Catch:{ all -> 0x0112 }
        r17 = java.lang.Byte.TYPE;	 Catch:{ all -> 0x0112 }
        r15[r13] = r17;	 Catch:{ all -> 0x0112 }
        r0.getMethod(r6, r15);	 Catch:{ all -> 0x0112 }
        r6 = "getInt";
        r15 = new java.lang.Class[r13];	 Catch:{ all -> 0x0112 }
        r17 = java.lang.Long.TYPE;	 Catch:{ all -> 0x0112 }
        r15[r14] = r17;	 Catch:{ all -> 0x0112 }
        r0.getMethod(r6, r15);	 Catch:{ all -> 0x0112 }
        r6 = "putInt";
        r15 = new java.lang.Class[r12];	 Catch:{ all -> 0x0112 }
        r17 = java.lang.Long.TYPE;	 Catch:{ all -> 0x0112 }
        r15[r14] = r17;	 Catch:{ all -> 0x0112 }
        r17 = java.lang.Integer.TYPE;	 Catch:{ all -> 0x0112 }
        r15[r13] = r17;	 Catch:{ all -> 0x0112 }
        r0.getMethod(r6, r15);	 Catch:{ all -> 0x0112 }
        r6 = new java.lang.Class[r13];	 Catch:{ all -> 0x0112 }
        r15 = java.lang.Long.TYPE;	 Catch:{ all -> 0x0112 }
        r6[r14] = r15;	 Catch:{ all -> 0x0112 }
        r0.getMethod(r10, r6);	 Catch:{ all -> 0x0112 }
        r6 = "putLong";
        r15 = new java.lang.Class[r12];	 Catch:{ all -> 0x0112 }
        r17 = java.lang.Long.TYPE;	 Catch:{ all -> 0x0112 }
        r15[r14] = r17;	 Catch:{ all -> 0x0112 }
        r17 = java.lang.Long.TYPE;	 Catch:{ all -> 0x0112 }
        r15[r13] = r17;	 Catch:{ all -> 0x0112 }
        r0.getMethod(r6, r15);	 Catch:{ all -> 0x0112 }
        r6 = "copyMemory";
        r15 = new java.lang.Class[r11];	 Catch:{ all -> 0x0112 }
        r17 = java.lang.Long.TYPE;	 Catch:{ all -> 0x0112 }
        r15[r14] = r17;	 Catch:{ all -> 0x0112 }
        r17 = java.lang.Long.TYPE;	 Catch:{ all -> 0x0112 }
        r15[r13] = r17;	 Catch:{ all -> 0x0112 }
        r17 = java.lang.Long.TYPE;	 Catch:{ all -> 0x0112 }
        r15[r12] = r17;	 Catch:{ all -> 0x0112 }
        r0.getMethod(r6, r15);	 Catch:{ all -> 0x0112 }
        r6 = "copyMemory";
        r15 = 5;
        r15 = new java.lang.Class[r15];	 Catch:{ all -> 0x0112 }
        r17 = java.lang.Object.class;
        r15[r14] = r17;	 Catch:{ all -> 0x0112 }
        r17 = java.lang.Long.TYPE;	 Catch:{ all -> 0x0112 }
        r15[r13] = r17;	 Catch:{ all -> 0x0112 }
        r17 = java.lang.Object.class;
        r15[r12] = r17;	 Catch:{ all -> 0x0112 }
        r17 = java.lang.Long.TYPE;	 Catch:{ all -> 0x0112 }
        r15[r11] = r17;	 Catch:{ all -> 0x0112 }
        r17 = java.lang.Long.TYPE;	 Catch:{ all -> 0x0112 }
        r18 = 4;
        r15[r18] = r17;	 Catch:{ all -> 0x0112 }
        r0.getMethod(r6, r15);	 Catch:{ all -> 0x0112 }
    L_0x0110:
        r0 = 1;
        goto L_0x0136;
    L_0x0112:
        r0 = move-exception;
        r6 = f;
        r15 = java.util.logging.Level.WARNING;
        r0 = java.lang.String.valueOf(r0);
        r17 = r0.length();
        r11 = new java.lang.StringBuilder;
        r12 = r17 + 71;
        r11.<init>(r12);
        r11.append(r9);
        r11.append(r0);
        r0 = r11.toString();
        r11 = "supportsUnsafeByteBufferOperations";
        r6.logp(r15, r8, r11, r0);
    L_0x0135:
        r0 = 0;
    L_0x0136:
        b = r0;
        r0 = g;
        if (r0 == 0) goto L_0x0285;
    L_0x013c:
        r0 = r0.getClass();	 Catch:{ all -> 0x0262 }
        r6 = new java.lang.Class[r13];	 Catch:{ all -> 0x0262 }
        r11 = java.lang.reflect.Field.class;
        r6[r14] = r11;	 Catch:{ all -> 0x0262 }
        r0.getMethod(r7, r6);	 Catch:{ all -> 0x0262 }
        r6 = "arrayBaseOffset";
        r7 = new java.lang.Class[r13];	 Catch:{ all -> 0x0262 }
        r11 = java.lang.Class.class;
        r7[r14] = r11;	 Catch:{ all -> 0x0262 }
        r0.getMethod(r6, r7);	 Catch:{ all -> 0x0262 }
        r6 = "arrayIndexScale";
        r7 = new java.lang.Class[r13];	 Catch:{ all -> 0x0262 }
        r11 = java.lang.Class.class;
        r7[r14] = r11;	 Catch:{ all -> 0x0262 }
        r0.getMethod(r6, r7);	 Catch:{ all -> 0x0262 }
        r6 = "getInt";
        r7 = 2;
        r11 = new java.lang.Class[r7];	 Catch:{ all -> 0x0262 }
        r7 = java.lang.Object.class;
        r11[r14] = r7;	 Catch:{ all -> 0x0262 }
        r7 = java.lang.Long.TYPE;	 Catch:{ all -> 0x0262 }
        r11[r13] = r7;	 Catch:{ all -> 0x0262 }
        r0.getMethod(r6, r11);	 Catch:{ all -> 0x0262 }
        r6 = "putInt";
        r7 = 3;
        r11 = new java.lang.Class[r7];	 Catch:{ all -> 0x0262 }
        r7 = java.lang.Object.class;
        r11[r14] = r7;	 Catch:{ all -> 0x0262 }
        r7 = java.lang.Long.TYPE;	 Catch:{ all -> 0x0262 }
        r11[r13] = r7;	 Catch:{ all -> 0x0262 }
        r7 = java.lang.Integer.TYPE;	 Catch:{ all -> 0x0262 }
        r12 = 2;
        r11[r12] = r7;	 Catch:{ all -> 0x0262 }
        r0.getMethod(r6, r11);	 Catch:{ all -> 0x0262 }
        r6 = new java.lang.Class[r12];	 Catch:{ all -> 0x0262 }
        r7 = java.lang.Object.class;
        r6[r14] = r7;	 Catch:{ all -> 0x0262 }
        r7 = java.lang.Long.TYPE;	 Catch:{ all -> 0x0262 }
        r6[r13] = r7;	 Catch:{ all -> 0x0262 }
        r0.getMethod(r10, r6);	 Catch:{ all -> 0x0262 }
        r6 = "putLong";
        r7 = 3;
        r10 = new java.lang.Class[r7];	 Catch:{ all -> 0x0262 }
        r7 = java.lang.Object.class;
        r10[r14] = r7;	 Catch:{ all -> 0x0262 }
        r7 = java.lang.Long.TYPE;	 Catch:{ all -> 0x0262 }
        r10[r13] = r7;	 Catch:{ all -> 0x0262 }
        r7 = java.lang.Long.TYPE;	 Catch:{ all -> 0x0262 }
        r11 = 2;
        r10[r11] = r7;	 Catch:{ all -> 0x0262 }
        r0.getMethod(r6, r10);	 Catch:{ all -> 0x0262 }
        r6 = "getObject";
        r7 = new java.lang.Class[r11];	 Catch:{ all -> 0x0262 }
        r10 = java.lang.Object.class;
        r7[r14] = r10;	 Catch:{ all -> 0x0262 }
        r10 = java.lang.Long.TYPE;	 Catch:{ all -> 0x0262 }
        r7[r13] = r10;	 Catch:{ all -> 0x0262 }
        r0.getMethod(r6, r7);	 Catch:{ all -> 0x0262 }
        r6 = "putObject";
        r7 = 3;
        r10 = new java.lang.Class[r7];	 Catch:{ all -> 0x0262 }
        r7 = java.lang.Object.class;
        r10[r14] = r7;	 Catch:{ all -> 0x0262 }
        r7 = java.lang.Long.TYPE;	 Catch:{ all -> 0x0262 }
        r10[r13] = r7;	 Catch:{ all -> 0x0262 }
        r7 = java.lang.Object.class;
        r11 = 2;
        r10[r11] = r7;	 Catch:{ all -> 0x0262 }
        r0.getMethod(r6, r10);	 Catch:{ all -> 0x0262 }
        r6 = defpackage.rcv.a();	 Catch:{ all -> 0x0262 }
        if (r6 != 0) goto L_0x0260;
    L_0x01d0:
        r6 = "getByte";
        r7 = new java.lang.Class[r11];	 Catch:{ all -> 0x0262 }
        r10 = java.lang.Object.class;
        r7[r14] = r10;	 Catch:{ all -> 0x0262 }
        r10 = java.lang.Long.TYPE;	 Catch:{ all -> 0x0262 }
        r7[r13] = r10;	 Catch:{ all -> 0x0262 }
        r0.getMethod(r6, r7);	 Catch:{ all -> 0x0262 }
        r6 = "putByte";
        r7 = 3;
        r10 = new java.lang.Class[r7];	 Catch:{ all -> 0x0262 }
        r7 = java.lang.Object.class;
        r10[r14] = r7;	 Catch:{ all -> 0x0262 }
        r7 = java.lang.Long.TYPE;	 Catch:{ all -> 0x0262 }
        r10[r13] = r7;	 Catch:{ all -> 0x0262 }
        r7 = java.lang.Byte.TYPE;	 Catch:{ all -> 0x0262 }
        r11 = 2;
        r10[r11] = r7;	 Catch:{ all -> 0x0262 }
        r0.getMethod(r6, r10);	 Catch:{ all -> 0x0262 }
        r6 = "getBoolean";
        r7 = new java.lang.Class[r11];	 Catch:{ all -> 0x0262 }
        r10 = java.lang.Object.class;
        r7[r14] = r10;	 Catch:{ all -> 0x0262 }
        r10 = java.lang.Long.TYPE;	 Catch:{ all -> 0x0262 }
        r7[r13] = r10;	 Catch:{ all -> 0x0262 }
        r0.getMethod(r6, r7);	 Catch:{ all -> 0x0262 }
        r6 = "putBoolean";
        r7 = 3;
        r10 = new java.lang.Class[r7];	 Catch:{ all -> 0x0262 }
        r7 = java.lang.Object.class;
        r10[r14] = r7;	 Catch:{ all -> 0x0262 }
        r7 = java.lang.Long.TYPE;	 Catch:{ all -> 0x0262 }
        r10[r13] = r7;	 Catch:{ all -> 0x0262 }
        r7 = java.lang.Boolean.TYPE;	 Catch:{ all -> 0x0262 }
        r11 = 2;
        r10[r11] = r7;	 Catch:{ all -> 0x0262 }
        r0.getMethod(r6, r10);	 Catch:{ all -> 0x0262 }
        r6 = "getFloat";
        r7 = new java.lang.Class[r11];	 Catch:{ all -> 0x0262 }
        r10 = java.lang.Object.class;
        r7[r14] = r10;	 Catch:{ all -> 0x0262 }
        r10 = java.lang.Long.TYPE;	 Catch:{ all -> 0x0262 }
        r7[r13] = r10;	 Catch:{ all -> 0x0262 }
        r0.getMethod(r6, r7);	 Catch:{ all -> 0x0262 }
        r6 = "putFloat";
        r7 = 3;
        r10 = new java.lang.Class[r7];	 Catch:{ all -> 0x0262 }
        r7 = java.lang.Object.class;
        r10[r14] = r7;	 Catch:{ all -> 0x0262 }
        r7 = java.lang.Long.TYPE;	 Catch:{ all -> 0x0262 }
        r10[r13] = r7;	 Catch:{ all -> 0x0262 }
        r7 = java.lang.Float.TYPE;	 Catch:{ all -> 0x0262 }
        r11 = 2;
        r10[r11] = r7;	 Catch:{ all -> 0x0262 }
        r0.getMethod(r6, r10);	 Catch:{ all -> 0x0262 }
        r6 = "getDouble";
        r7 = new java.lang.Class[r11];	 Catch:{ all -> 0x0262 }
        r10 = java.lang.Object.class;
        r7[r14] = r10;	 Catch:{ all -> 0x0262 }
        r10 = java.lang.Long.TYPE;	 Catch:{ all -> 0x0262 }
        r7[r13] = r10;	 Catch:{ all -> 0x0262 }
        r0.getMethod(r6, r7);	 Catch:{ all -> 0x0262 }
        r6 = "putDouble";
        r7 = 3;
        r7 = new java.lang.Class[r7];	 Catch:{ all -> 0x0262 }
        r10 = java.lang.Object.class;
        r7[r14] = r10;	 Catch:{ all -> 0x0262 }
        r10 = java.lang.Long.TYPE;	 Catch:{ all -> 0x0262 }
        r7[r13] = r10;	 Catch:{ all -> 0x0262 }
        r10 = java.lang.Double.TYPE;	 Catch:{ all -> 0x0262 }
        r11 = 2;
        r7[r11] = r10;	 Catch:{ all -> 0x0262 }
        r0.getMethod(r6, r7);	 Catch:{ all -> 0x0262 }
    L_0x0260:
        r0 = 1;
        goto L_0x0286;
    L_0x0262:
        r0 = move-exception;
        r6 = f;
        r7 = java.util.logging.Level.WARNING;
        r0 = java.lang.String.valueOf(r0);
        r10 = r0.length();
        r11 = new java.lang.StringBuilder;
        r10 = r10 + 71;
        r11.<init>(r10);
        r11.append(r9);
        r11.append(r0);
        r0 = r11.toString();
        r9 = "supportsUnsafeArrayOperations";
        r6.logp(r7, r8, r9, r0);
    L_0x0285:
        r0 = 0;
    L_0x0286:
        c = r0;
        r0 = byte[].class;
        r0 = defpackage.rhv.a(r0);
        r6 = (long) r0;
        d = r6;
        defpackage.rhv.a(r5);
        defpackage.rhv.b(r5);
        defpackage.rhv.a(r4);
        defpackage.rhv.b(r4);
        defpackage.rhv.a(r3);
        defpackage.rhv.b(r3);
        defpackage.rhv.a(r2);
        defpackage.rhv.b(r2);
        defpackage.rhv.a(r1);
        defpackage.rhv.b(r1);
        r0 = java.lang.Object[].class;
        defpackage.rhv.a(r0);
        r0 = java.lang.Object[].class;
        defpackage.rhv.b(r0);
        r0 = defpackage.rhv.b();
        r0 = defpackage.rhv.a(r0);
        k = r0;
        r0 = java.lang.String.class;
        r1 = "value";
        r6 = defpackage.rhv.a(r0, r1);
        if (r6 == 0) goto L_0x02d8;
    L_0x02cd:
        r0 = r6.getType();
        r1 = char[].class;
        if (r0 != r1) goto L_0x02d8;
    L_0x02d5:
        r16 = r6;
        goto L_0x02da;
    L_0x02d8:
        r16 = 0;
    L_0x02da:
        defpackage.rhv.a(r16);
        r0 = java.nio.ByteOrder.nativeOrder();
        r1 = java.nio.ByteOrder.BIG_ENDIAN;
        if (r0 != r1) goto L_0x02e6;
    L_0x02e5:
        goto L_0x02e7;
    L_0x02e6:
        r13 = 0;
    L_0x02e7:
        e = r13;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rhv.<clinit>():void");
    }
}
