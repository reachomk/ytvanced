package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.AccessController;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: aoax */
final class aoax {
    public static final aobe a;
    public static final boolean b;
    public static final boolean c;
    public static final long d = ((long) aoax.b(byte[].class));
    public static final boolean e;
    private static final Logger f = Logger.getLogger(aoax.class.getName());
    private static final Unsafe g = aoax.a();
    private static final Class h = anvm.a;
    private static final boolean i = aoax.d(Long.TYPE);
    private static final boolean j = aoax.d(Integer.TYPE);
    private static final long k;

    private aoax() {
    }

    static Object a(Class cls) {
        try {
            return g.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    static long a(Field field) {
        return a.a(field);
    }

    private static int b(Class cls) {
        return c ? a.a(cls) : -1;
    }

    private static int c(Class cls) {
        return c ? a.b(cls) : -1;
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
        return a.g(obj, j);
    }

    static void a(Object obj, long j, Object obj2) {
        a.a(obj, j, obj2);
    }

    static byte a(byte[] bArr, long j) {
        return a.a((Object) bArr, d + j);
    }

    static void a(byte[] bArr, long j, byte b) {
        a.a((Object) bArr, d + j, b);
    }

    static void a(long j, byte[] bArr, long j2) {
        a.a(j, bArr, j2);
    }

    static byte a(long j) {
        return a.a(j);
    }

    static void a(long j, byte b) {
        a.a(j, b);
    }

    static long a(ByteBuffer byteBuffer) {
        return a.f(byteBuffer, k);
    }

    static Unsafe a() {
        try {
            return (Unsafe) AccessController.doPrivileged(new aoba());
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean d(Class cls) {
        Class cls2 = byte[].class;
        if (anvm.a()) {
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
        if (anvm.a()) {
            a = aoax.a(Buffer.class, "effectiveDirectAddress");
            if (a != null) {
                return a;
            }
        }
        a = aoax.a(Buffer.class, "address");
        return (a == null || a.getType() != Long.TYPE) ? null : a;
    }

    private static Field a(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static byte g(Object obj, long j) {
        return (byte) (aoax.a(obj, -4 & j) >>> ((int) (((j ^ -1) & 3) << 3)));
    }

    public static byte h(Object obj, long j) {
        return (byte) (aoax.a(obj, -4 & j) >>> ((int) ((j & 3) << 3)));
    }

    public static void a(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = ((((int) j) ^ -1) & 3) << 3;
        aoax.a(obj, j2, ((b & 255) << i) | (aoax.a(obj, j2) & ((255 << i) ^ -1)));
    }

    public static void b(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        aoax.a(obj, j2, ((b & 255) << i) | (aoax.a(obj, j2) & ((255 << i) ^ -1)));
    }

    public static boolean i(Object obj, long j) {
        return aoax.g(obj, j) != (byte) 0;
    }

    public static boolean j(Object obj, long j) {
        return aoax.h(obj, j) != (byte) 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x02d4  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x02be  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x02d4  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x013b A:{SYNTHETIC, Splitter:B:25:0x013b} */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x02be  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x02d4  */
    static {
        /*
        r1 = double[].class;
        r2 = float[].class;
        r3 = long[].class;
        r4 = int[].class;
        r5 = boolean[].class;
        r0 = defpackage.aoax.class;
        r0 = r0.getName();
        r0 = java.util.logging.Logger.getLogger(r0);
        f = r0;
        r0 = defpackage.aoax.a();
        g = r0;
        r0 = defpackage.anvm.a;
        h = r0;
        r0 = java.lang.Long.TYPE;
        r0 = defpackage.aoax.d(r0);
        i = r0;
        r0 = java.lang.Integer.TYPE;
        r0 = defpackage.aoax.d(r0);
        j = r0;
        r0 = g;
        r6 = 0;
        if (r0 == 0) goto L_0x005a;
    L_0x0035:
        r0 = defpackage.anvm.a();
        if (r0 == 0) goto L_0x0053;
    L_0x003b:
        r0 = i;
        if (r0 == 0) goto L_0x0047;
    L_0x003f:
        r6 = new aobc;
        r0 = g;
        r6.<init>(r0);
        goto L_0x005a;
    L_0x0047:
        r0 = j;
        if (r0 == 0) goto L_0x005a;
    L_0x004b:
        r6 = new aoaz;
        r0 = g;
        r6.<init>(r0);
        goto L_0x005a;
    L_0x0053:
        r6 = new aobb;
        r0 = g;
        r6.<init>(r0);
    L_0x005a:
        a = r6;
        r0 = g;
        r6 = "objectFieldOffset";
        r7 = "com.google.protobuf.UnsafeUtil";
        r8 = "platform method missing - proto runtime falling back to safer methods: ";
        r9 = "getLong";
        r10 = 3;
        r11 = 2;
        r12 = 1;
        r13 = 0;
        if (r0 == 0) goto L_0x0134;
    L_0x006c:
        r0 = r0.getClass();	 Catch:{ all -> 0x0111 }
        r14 = new java.lang.Class[r12];	 Catch:{ all -> 0x0111 }
        r15 = java.lang.reflect.Field.class;
        r14[r13] = r15;	 Catch:{ all -> 0x0111 }
        r0.getMethod(r6, r14);	 Catch:{ all -> 0x0111 }
        r14 = new java.lang.Class[r11];	 Catch:{ all -> 0x0111 }
        r15 = java.lang.Object.class;
        r14[r13] = r15;	 Catch:{ all -> 0x0111 }
        r15 = java.lang.Long.TYPE;	 Catch:{ all -> 0x0111 }
        r14[r12] = r15;	 Catch:{ all -> 0x0111 }
        r0.getMethod(r9, r14);	 Catch:{ all -> 0x0111 }
        r14 = defpackage.aoax.b();	 Catch:{ all -> 0x0111 }
        if (r14 == 0) goto L_0x0134;
    L_0x008c:
        r14 = defpackage.anvm.a();	 Catch:{ all -> 0x0111 }
        if (r14 != 0) goto L_0x010f;
    L_0x0092:
        r14 = "getByte";
        r15 = new java.lang.Class[r12];	 Catch:{ all -> 0x0111 }
        r16 = java.lang.Long.TYPE;	 Catch:{ all -> 0x0111 }
        r15[r13] = r16;	 Catch:{ all -> 0x0111 }
        r0.getMethod(r14, r15);	 Catch:{ all -> 0x0111 }
        r14 = "putByte";
        r15 = new java.lang.Class[r11];	 Catch:{ all -> 0x0111 }
        r16 = java.lang.Long.TYPE;	 Catch:{ all -> 0x0111 }
        r15[r13] = r16;	 Catch:{ all -> 0x0111 }
        r16 = java.lang.Byte.TYPE;	 Catch:{ all -> 0x0111 }
        r15[r12] = r16;	 Catch:{ all -> 0x0111 }
        r0.getMethod(r14, r15);	 Catch:{ all -> 0x0111 }
        r14 = "getInt";
        r15 = new java.lang.Class[r12];	 Catch:{ all -> 0x0111 }
        r16 = java.lang.Long.TYPE;	 Catch:{ all -> 0x0111 }
        r15[r13] = r16;	 Catch:{ all -> 0x0111 }
        r0.getMethod(r14, r15);	 Catch:{ all -> 0x0111 }
        r14 = "putInt";
        r15 = new java.lang.Class[r11];	 Catch:{ all -> 0x0111 }
        r16 = java.lang.Long.TYPE;	 Catch:{ all -> 0x0111 }
        r15[r13] = r16;	 Catch:{ all -> 0x0111 }
        r16 = java.lang.Integer.TYPE;	 Catch:{ all -> 0x0111 }
        r15[r12] = r16;	 Catch:{ all -> 0x0111 }
        r0.getMethod(r14, r15);	 Catch:{ all -> 0x0111 }
        r14 = new java.lang.Class[r12];	 Catch:{ all -> 0x0111 }
        r15 = java.lang.Long.TYPE;	 Catch:{ all -> 0x0111 }
        r14[r13] = r15;	 Catch:{ all -> 0x0111 }
        r0.getMethod(r9, r14);	 Catch:{ all -> 0x0111 }
        r14 = "putLong";
        r15 = new java.lang.Class[r11];	 Catch:{ all -> 0x0111 }
        r16 = java.lang.Long.TYPE;	 Catch:{ all -> 0x0111 }
        r15[r13] = r16;	 Catch:{ all -> 0x0111 }
        r16 = java.lang.Long.TYPE;	 Catch:{ all -> 0x0111 }
        r15[r12] = r16;	 Catch:{ all -> 0x0111 }
        r0.getMethod(r14, r15);	 Catch:{ all -> 0x0111 }
        r14 = "copyMemory";
        r15 = new java.lang.Class[r10];	 Catch:{ all -> 0x0111 }
        r16 = java.lang.Long.TYPE;	 Catch:{ all -> 0x0111 }
        r15[r13] = r16;	 Catch:{ all -> 0x0111 }
        r16 = java.lang.Long.TYPE;	 Catch:{ all -> 0x0111 }
        r15[r12] = r16;	 Catch:{ all -> 0x0111 }
        r16 = java.lang.Long.TYPE;	 Catch:{ all -> 0x0111 }
        r15[r11] = r16;	 Catch:{ all -> 0x0111 }
        r0.getMethod(r14, r15);	 Catch:{ all -> 0x0111 }
        r14 = "copyMemory";
        r15 = 5;
        r15 = new java.lang.Class[r15];	 Catch:{ all -> 0x0111 }
        r16 = java.lang.Object.class;
        r15[r13] = r16;	 Catch:{ all -> 0x0111 }
        r16 = java.lang.Long.TYPE;	 Catch:{ all -> 0x0111 }
        r15[r12] = r16;	 Catch:{ all -> 0x0111 }
        r16 = java.lang.Object.class;
        r15[r11] = r16;	 Catch:{ all -> 0x0111 }
        r16 = java.lang.Long.TYPE;	 Catch:{ all -> 0x0111 }
        r15[r10] = r16;	 Catch:{ all -> 0x0111 }
        r16 = java.lang.Long.TYPE;	 Catch:{ all -> 0x0111 }
        r17 = 4;
        r15[r17] = r16;	 Catch:{ all -> 0x0111 }
        r0.getMethod(r14, r15);	 Catch:{ all -> 0x0111 }
    L_0x010f:
        r0 = 1;
        goto L_0x0135;
    L_0x0111:
        r0 = move-exception;
        r14 = f;
        r15 = java.util.logging.Level.WARNING;
        r0 = java.lang.String.valueOf(r0);
        r16 = r0.length();
        r10 = new java.lang.StringBuilder;
        r11 = r16 + 71;
        r10.<init>(r11);
        r10.append(r8);
        r10.append(r0);
        r0 = r10.toString();
        r10 = "supportsUnsafeByteBufferOperations";
        r14.logp(r15, r7, r10, r0);
    L_0x0134:
        r0 = 0;
    L_0x0135:
        b = r0;
        r0 = g;
        if (r0 == 0) goto L_0x0284;
    L_0x013b:
        r0 = r0.getClass();	 Catch:{ all -> 0x0261 }
        r10 = new java.lang.Class[r12];	 Catch:{ all -> 0x0261 }
        r11 = java.lang.reflect.Field.class;
        r10[r13] = r11;	 Catch:{ all -> 0x0261 }
        r0.getMethod(r6, r10);	 Catch:{ all -> 0x0261 }
        r6 = "arrayBaseOffset";
        r10 = new java.lang.Class[r12];	 Catch:{ all -> 0x0261 }
        r11 = java.lang.Class.class;
        r10[r13] = r11;	 Catch:{ all -> 0x0261 }
        r0.getMethod(r6, r10);	 Catch:{ all -> 0x0261 }
        r6 = "arrayIndexScale";
        r10 = new java.lang.Class[r12];	 Catch:{ all -> 0x0261 }
        r11 = java.lang.Class.class;
        r10[r13] = r11;	 Catch:{ all -> 0x0261 }
        r0.getMethod(r6, r10);	 Catch:{ all -> 0x0261 }
        r6 = "getInt";
        r10 = 2;
        r11 = new java.lang.Class[r10];	 Catch:{ all -> 0x0261 }
        r10 = java.lang.Object.class;
        r11[r13] = r10;	 Catch:{ all -> 0x0261 }
        r10 = java.lang.Long.TYPE;	 Catch:{ all -> 0x0261 }
        r11[r12] = r10;	 Catch:{ all -> 0x0261 }
        r0.getMethod(r6, r11);	 Catch:{ all -> 0x0261 }
        r6 = "putInt";
        r10 = 3;
        r11 = new java.lang.Class[r10];	 Catch:{ all -> 0x0261 }
        r10 = java.lang.Object.class;
        r11[r13] = r10;	 Catch:{ all -> 0x0261 }
        r10 = java.lang.Long.TYPE;	 Catch:{ all -> 0x0261 }
        r11[r12] = r10;	 Catch:{ all -> 0x0261 }
        r10 = java.lang.Integer.TYPE;	 Catch:{ all -> 0x0261 }
        r14 = 2;
        r11[r14] = r10;	 Catch:{ all -> 0x0261 }
        r0.getMethod(r6, r11);	 Catch:{ all -> 0x0261 }
        r6 = new java.lang.Class[r14];	 Catch:{ all -> 0x0261 }
        r10 = java.lang.Object.class;
        r6[r13] = r10;	 Catch:{ all -> 0x0261 }
        r10 = java.lang.Long.TYPE;	 Catch:{ all -> 0x0261 }
        r6[r12] = r10;	 Catch:{ all -> 0x0261 }
        r0.getMethod(r9, r6);	 Catch:{ all -> 0x0261 }
        r6 = "putLong";
        r9 = 3;
        r10 = new java.lang.Class[r9];	 Catch:{ all -> 0x0261 }
        r9 = java.lang.Object.class;
        r10[r13] = r9;	 Catch:{ all -> 0x0261 }
        r9 = java.lang.Long.TYPE;	 Catch:{ all -> 0x0261 }
        r10[r12] = r9;	 Catch:{ all -> 0x0261 }
        r9 = java.lang.Long.TYPE;	 Catch:{ all -> 0x0261 }
        r11 = 2;
        r10[r11] = r9;	 Catch:{ all -> 0x0261 }
        r0.getMethod(r6, r10);	 Catch:{ all -> 0x0261 }
        r6 = "getObject";
        r9 = new java.lang.Class[r11];	 Catch:{ all -> 0x0261 }
        r10 = java.lang.Object.class;
        r9[r13] = r10;	 Catch:{ all -> 0x0261 }
        r10 = java.lang.Long.TYPE;	 Catch:{ all -> 0x0261 }
        r9[r12] = r10;	 Catch:{ all -> 0x0261 }
        r0.getMethod(r6, r9);	 Catch:{ all -> 0x0261 }
        r6 = "putObject";
        r9 = 3;
        r10 = new java.lang.Class[r9];	 Catch:{ all -> 0x0261 }
        r9 = java.lang.Object.class;
        r10[r13] = r9;	 Catch:{ all -> 0x0261 }
        r9 = java.lang.Long.TYPE;	 Catch:{ all -> 0x0261 }
        r10[r12] = r9;	 Catch:{ all -> 0x0261 }
        r9 = java.lang.Object.class;
        r11 = 2;
        r10[r11] = r9;	 Catch:{ all -> 0x0261 }
        r0.getMethod(r6, r10);	 Catch:{ all -> 0x0261 }
        r6 = defpackage.anvm.a();	 Catch:{ all -> 0x0261 }
        if (r6 != 0) goto L_0x025f;
    L_0x01cf:
        r6 = "getByte";
        r9 = new java.lang.Class[r11];	 Catch:{ all -> 0x0261 }
        r10 = java.lang.Object.class;
        r9[r13] = r10;	 Catch:{ all -> 0x0261 }
        r10 = java.lang.Long.TYPE;	 Catch:{ all -> 0x0261 }
        r9[r12] = r10;	 Catch:{ all -> 0x0261 }
        r0.getMethod(r6, r9);	 Catch:{ all -> 0x0261 }
        r6 = "putByte";
        r9 = 3;
        r10 = new java.lang.Class[r9];	 Catch:{ all -> 0x0261 }
        r9 = java.lang.Object.class;
        r10[r13] = r9;	 Catch:{ all -> 0x0261 }
        r9 = java.lang.Long.TYPE;	 Catch:{ all -> 0x0261 }
        r10[r12] = r9;	 Catch:{ all -> 0x0261 }
        r9 = java.lang.Byte.TYPE;	 Catch:{ all -> 0x0261 }
        r11 = 2;
        r10[r11] = r9;	 Catch:{ all -> 0x0261 }
        r0.getMethod(r6, r10);	 Catch:{ all -> 0x0261 }
        r6 = "getBoolean";
        r9 = new java.lang.Class[r11];	 Catch:{ all -> 0x0261 }
        r10 = java.lang.Object.class;
        r9[r13] = r10;	 Catch:{ all -> 0x0261 }
        r10 = java.lang.Long.TYPE;	 Catch:{ all -> 0x0261 }
        r9[r12] = r10;	 Catch:{ all -> 0x0261 }
        r0.getMethod(r6, r9);	 Catch:{ all -> 0x0261 }
        r6 = "putBoolean";
        r9 = 3;
        r10 = new java.lang.Class[r9];	 Catch:{ all -> 0x0261 }
        r9 = java.lang.Object.class;
        r10[r13] = r9;	 Catch:{ all -> 0x0261 }
        r9 = java.lang.Long.TYPE;	 Catch:{ all -> 0x0261 }
        r10[r12] = r9;	 Catch:{ all -> 0x0261 }
        r9 = java.lang.Boolean.TYPE;	 Catch:{ all -> 0x0261 }
        r11 = 2;
        r10[r11] = r9;	 Catch:{ all -> 0x0261 }
        r0.getMethod(r6, r10);	 Catch:{ all -> 0x0261 }
        r6 = "getFloat";
        r9 = new java.lang.Class[r11];	 Catch:{ all -> 0x0261 }
        r10 = java.lang.Object.class;
        r9[r13] = r10;	 Catch:{ all -> 0x0261 }
        r10 = java.lang.Long.TYPE;	 Catch:{ all -> 0x0261 }
        r9[r12] = r10;	 Catch:{ all -> 0x0261 }
        r0.getMethod(r6, r9);	 Catch:{ all -> 0x0261 }
        r6 = "putFloat";
        r9 = 3;
        r10 = new java.lang.Class[r9];	 Catch:{ all -> 0x0261 }
        r9 = java.lang.Object.class;
        r10[r13] = r9;	 Catch:{ all -> 0x0261 }
        r9 = java.lang.Long.TYPE;	 Catch:{ all -> 0x0261 }
        r10[r12] = r9;	 Catch:{ all -> 0x0261 }
        r9 = java.lang.Float.TYPE;	 Catch:{ all -> 0x0261 }
        r11 = 2;
        r10[r11] = r9;	 Catch:{ all -> 0x0261 }
        r0.getMethod(r6, r10);	 Catch:{ all -> 0x0261 }
        r6 = "getDouble";
        r9 = new java.lang.Class[r11];	 Catch:{ all -> 0x0261 }
        r10 = java.lang.Object.class;
        r9[r13] = r10;	 Catch:{ all -> 0x0261 }
        r10 = java.lang.Long.TYPE;	 Catch:{ all -> 0x0261 }
        r9[r12] = r10;	 Catch:{ all -> 0x0261 }
        r0.getMethod(r6, r9);	 Catch:{ all -> 0x0261 }
        r6 = "putDouble";
        r9 = 3;
        r9 = new java.lang.Class[r9];	 Catch:{ all -> 0x0261 }
        r10 = java.lang.Object.class;
        r9[r13] = r10;	 Catch:{ all -> 0x0261 }
        r10 = java.lang.Long.TYPE;	 Catch:{ all -> 0x0261 }
        r9[r12] = r10;	 Catch:{ all -> 0x0261 }
        r10 = java.lang.Double.TYPE;	 Catch:{ all -> 0x0261 }
        r11 = 2;
        r9[r11] = r10;	 Catch:{ all -> 0x0261 }
        r0.getMethod(r6, r9);	 Catch:{ all -> 0x0261 }
    L_0x025f:
        r0 = 1;
        goto L_0x0285;
    L_0x0261:
        r0 = move-exception;
        r6 = f;
        r9 = java.util.logging.Level.WARNING;
        r0 = java.lang.String.valueOf(r0);
        r10 = r0.length();
        r11 = new java.lang.StringBuilder;
        r10 = r10 + 71;
        r11.<init>(r10);
        r11.append(r8);
        r11.append(r0);
        r0 = r11.toString();
        r8 = "supportsUnsafeArrayOperations";
        r6.logp(r9, r7, r8, r0);
    L_0x0284:
        r0 = 0;
    L_0x0285:
        c = r0;
        r0 = byte[].class;
        r0 = defpackage.aoax.b(r0);
        r6 = (long) r0;
        d = r6;
        defpackage.aoax.b(r5);
        defpackage.aoax.c(r5);
        defpackage.aoax.b(r4);
        defpackage.aoax.c(r4);
        defpackage.aoax.b(r3);
        defpackage.aoax.c(r3);
        defpackage.aoax.b(r2);
        defpackage.aoax.c(r2);
        defpackage.aoax.b(r1);
        defpackage.aoax.c(r1);
        r0 = java.lang.Object[].class;
        defpackage.aoax.b(r0);
        r0 = java.lang.Object[].class;
        defpackage.aoax.c(r0);
        r0 = defpackage.aoax.b();
        if (r0 == 0) goto L_0x02c7;
    L_0x02be:
        r1 = a;
        if (r1 == 0) goto L_0x02c7;
    L_0x02c2:
        r0 = r1.a(r0);
        goto L_0x02c9;
    L_0x02c7:
        r0 = -1;
    L_0x02c9:
        k = r0;
        r0 = java.nio.ByteOrder.nativeOrder();
        r1 = java.nio.ByteOrder.BIG_ENDIAN;
        if (r0 != r1) goto L_0x02d4;
    L_0x02d3:
        goto L_0x02d5;
    L_0x02d4:
        r12 = 0;
    L_0x02d5:
        e = r12;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoax.<clinit>():void");
    }
}
