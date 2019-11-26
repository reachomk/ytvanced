package defpackage;

import android.util.Log;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: amyz */
public final class amyz extends anaa implements amzw {
    public static final Locale a = Locale.ROOT;
    public final Object[] b;
    public final StringBuilder c = new StringBuilder();
    public int d = 0;

    public static String a(Object obj) {
        String str;
        if (obj == null) {
            try {
                str = "null";
            } catch (RuntimeException e) {
                return amyz.a(obj, e);
            }
        } else if (!obj.getClass().isArray()) {
            str = String.valueOf(obj);
        } else if (obj instanceof int[]) {
            str = Arrays.toString((int[]) obj);
        } else if (obj instanceof long[]) {
            str = Arrays.toString((long[]) obj);
        } else if (obj instanceof byte[]) {
            str = Arrays.toString((byte[]) obj);
        } else if (obj instanceof char[]) {
            str = Arrays.toString((char[]) obj);
        } else if (obj instanceof short[]) {
            str = Arrays.toString((short[]) obj);
        } else if (obj instanceof float[]) {
            str = Arrays.toString((float[]) obj);
        } else if (obj instanceof double[]) {
            str = Arrays.toString((double[]) obj);
        } else if (obj instanceof boolean[]) {
            str = Arrays.toString((boolean[]) obj);
        } else {
            str = Arrays.toString((Object[]) obj);
        }
        return str;
    }

    private static String a(Object obj, RuntimeException runtimeException) {
        Object runtimeException2;
        try {
            runtimeException2 = runtimeException.toString();
        } catch (RuntimeException runtimeException3) {
            runtimeException2 = runtimeException3.getClass().getSimpleName();
        }
        String name = obj.getClass().getName();
        int identityHashCode = System.identityHashCode(obj);
        StringBuilder stringBuilder = new StringBuilder((name.length() + 16) + String.valueOf(runtimeException2).length());
        stringBuilder.append("{");
        stringBuilder.append(name);
        stringBuilder.append("@");
        stringBuilder.append(identityHashCode);
        stringBuilder.append(": ");
        stringBuilder.append(runtimeException2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    private static void a(StringBuilder stringBuilder, amyt amyt) {
        amyq amyq = new amyq("[CONTEXT ", " ]", stringBuilder);
        amzb amzb = null;
        for (int i = 0; i < amyt.a(); i++) {
            amyj a = amyt.a(i);
            if (!a.equals(amxx.a)) {
                if (a.equals(amxx.f)) {
                    amzb = (amzb) amxx.f.a(amyt.b(i));
                } else {
                    amyq.a(a.a, amyt.b(i));
                }
            }
        }
        if (amzb != null) {
            amzb.a(amyq);
        }
        amyq.a();
    }

    private amyz(amzg amzg, Object[] objArr) {
        super(amzg);
        this.b = (Object[]) anad.a(objArr, "log arguments");
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARNING: Missing block: B:11:0x001e, code skipped:
            if ((r8 instanceof java.math.BigDecimal) == false) goto L_0x0059;
     */
    /* JADX WARNING: Missing block: B:23:0x0035, code skipped:
            if ((r8 instanceof java.math.BigInteger) == false) goto L_0x0059;
     */
    /* JADX WARNING: Missing block: B:34:0x0056, code skipped:
            if (r0 != false) goto L_0x0061;
     */
    public final void a(java.lang.Object r8, defpackage.amyl r9, defpackage.amyo r10) {
        /*
        r7 = this;
        r0 = r9.d;
        r0 = r0.ordinal();
        r1 = 4;
        r2 = 3;
        r3 = 2;
        r4 = 1;
        if (r0 == 0) goto L_0x0061;
    L_0x000c:
        if (r0 == r4) goto L_0x0054;
    L_0x000e:
        if (r0 == r3) goto L_0x0038;
    L_0x0010:
        if (r0 == r2) goto L_0x0023;
    L_0x0012:
        if (r0 != r1) goto L_0x0021;
    L_0x0014:
        r0 = r8 instanceof java.lang.Double;
        if (r0 != 0) goto L_0x0061;
    L_0x0018:
        r0 = r8 instanceof java.lang.Float;
        if (r0 != 0) goto L_0x0061;
    L_0x001c:
        r0 = r8 instanceof java.math.BigDecimal;
        if (r0 == 0) goto L_0x0059;
    L_0x0020:
        goto L_0x0061;
    L_0x0021:
        r8 = 0;
        throw r8;
    L_0x0023:
        r0 = r8 instanceof java.lang.Integer;
        if (r0 != 0) goto L_0x0061;
    L_0x0027:
        r0 = r8 instanceof java.lang.Long;
        if (r0 != 0) goto L_0x0061;
    L_0x002b:
        r0 = r8 instanceof java.lang.Byte;
        if (r0 != 0) goto L_0x0061;
    L_0x002f:
        r0 = r8 instanceof java.lang.Short;
        if (r0 != 0) goto L_0x0061;
    L_0x0033:
        r0 = r8 instanceof java.math.BigInteger;
        if (r0 == 0) goto L_0x0059;
    L_0x0037:
        goto L_0x0061;
    L_0x0038:
        r0 = r8 instanceof java.lang.Character;
        if (r0 != 0) goto L_0x0061;
    L_0x003c:
        r0 = r8 instanceof java.lang.Integer;
        if (r0 != 0) goto L_0x0048;
    L_0x0040:
        r0 = r8 instanceof java.lang.Byte;
        if (r0 != 0) goto L_0x0048;
    L_0x0044:
        r0 = r8 instanceof java.lang.Short;
        if (r0 == 0) goto L_0x0059;
    L_0x0048:
        r0 = r8;
        r0 = (java.lang.Number) r0;
        r0 = r0.intValue();
        r0 = java.lang.Character.isValidCodePoint(r0);
        goto L_0x0056;
    L_0x0054:
        r0 = r8 instanceof java.lang.Boolean;
    L_0x0056:
        if (r0 == 0) goto L_0x0059;
    L_0x0058:
        goto L_0x0061;
    L_0x0059:
        r10 = r7.c;
        r9 = r9.f;
        defpackage.amyz.a(r10, r8, r9);
        return;
    L_0x0061:
        r0 = r7.c;
        r5 = r9.ordinal();
        r6 = 0;
        if (r5 == 0) goto L_0x0143;
    L_0x006a:
        if (r5 == r4) goto L_0x0139;
    L_0x006c:
        if (r5 == r3) goto L_0x0112;
    L_0x006e:
        if (r5 == r2) goto L_0x0139;
    L_0x0070:
        r1 = 5;
        if (r5 == r1) goto L_0x0075;
    L_0x0073:
        goto L_0x0155;
    L_0x0075:
        r1 = r10.a();
        if (r1 != 0) goto L_0x0097;
    L_0x007b:
        r1 = r10.b;
        r2 = r1 & 128;
        if (r2 != 0) goto L_0x0084;
    L_0x0081:
        r1 = defpackage.amyo.a;
        goto L_0x0098;
    L_0x0084:
        r3 = -1;
        if (r2 == r1) goto L_0x0088;
    L_0x0087:
        goto L_0x0091;
    L_0x0088:
        r1 = r10.c;
        if (r1 != r3) goto L_0x0091;
    L_0x008c:
        r1 = r10.d;
        if (r1 != r3) goto L_0x0091;
    L_0x0090:
        goto L_0x0097;
    L_0x0091:
        r1 = new amyo;
        r1.<init>(r2, r3, r3);
        goto L_0x0098;
    L_0x0097:
        r1 = r10;
    L_0x0098:
        r1 = r1.equals(r10);
        if (r1 == 0) goto L_0x0155;
    L_0x009e:
        r8 = (java.lang.Number) r8;
        r9 = r10.b();
        r1 = r8.longValue();
        r10 = r8 instanceof java.lang.Long;
        if (r10 == 0) goto L_0x00b0;
    L_0x00ac:
        defpackage.amyz.a(r0, r1, r9);
        return;
    L_0x00b0:
        r10 = r8 instanceof java.lang.Integer;
        if (r10 == 0) goto L_0x00be;
    L_0x00b4:
        r3 = 4294967295; // 0xffffffff float:NaN double:2.1219957905E-314;
        r1 = r1 & r3;
        defpackage.amyz.a(r0, r1, r9);
        return;
    L_0x00be:
        r10 = r8 instanceof java.lang.Byte;
        if (r10 == 0) goto L_0x00c9;
    L_0x00c2:
        r3 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r1 = r1 & r3;
        defpackage.amyz.a(r0, r1, r9);
        return;
    L_0x00c9:
        r10 = r8 instanceof java.lang.Short;
        if (r10 == 0) goto L_0x00d5;
    L_0x00cd:
        r3 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        r1 = r1 & r3;
        defpackage.amyz.a(r0, r1, r9);
        return;
    L_0x00d5:
        r10 = r8 instanceof java.math.BigInteger;
        if (r10 == 0) goto L_0x00ed;
    L_0x00d9:
        r8 = (java.math.BigInteger) r8;
        r10 = 16;
        r8 = r8.toString(r10);
        if (r9 == 0) goto L_0x00e9;
    L_0x00e3:
        r9 = a;
        r8 = r8.toUpperCase(r9);
    L_0x00e9:
        r0.append(r8);
        return;
    L_0x00ed:
        r9 = new java.lang.RuntimeException;
        r8 = r8.getClass();
        r8 = java.lang.String.valueOf(r8);
        r10 = r8.length();
        r0 = new java.lang.StringBuilder;
        r10 = r10 + 25;
        r0.<init>(r10);
        r10 = "unsupported number type: ";
        r0.append(r10);
        r0.append(r8);
        r8 = r0.toString();
        r9.<init>(r8);
        throw r9;
    L_0x0112:
        r1 = r10.a();
        if (r1 == 0) goto L_0x0155;
    L_0x0118:
        r9 = r8 instanceof java.lang.Character;
        if (r9 == 0) goto L_0x0120;
    L_0x011c:
        r0.append(r8);
        return;
    L_0x0120:
        r8 = (java.lang.Number) r8;
        r8 = r8.intValue();
        r9 = java.lang.Character.isBmpCodePoint(r8);
        if (r9 == 0) goto L_0x0131;
    L_0x012c:
        r8 = (char) r8;
        r0.append(r8);
        return;
    L_0x0131:
        r8 = java.lang.Character.toChars(r8);
        r0.append(r8);
        return;
    L_0x0139:
        r1 = r10.a();
        if (r1 == 0) goto L_0x0155;
    L_0x013f:
        r0.append(r8);
        return;
    L_0x0143:
        r2 = r8 instanceof java.util.Formattable;
        if (r2 != 0) goto L_0x018b;
    L_0x0147:
        r1 = r10.a();
        if (r1 == 0) goto L_0x0155;
    L_0x014d:
        r8 = defpackage.amyz.a(r8);
        r0.append(r8);
        return;
    L_0x0155:
        r1 = r9.f;
        r2 = r10.a();
        if (r2 == 0) goto L_0x015e;
    L_0x015d:
        goto L_0x017d;
    L_0x015e:
        r9 = r9.c;
        r1 = r10.b();
        if (r1 == 0) goto L_0x016a;
    L_0x0166:
        r1 = 65503; // 0xffdf float:9.1789E-41 double:3.2363E-319;
        r9 = r9 & r1;
    L_0x016a:
        r1 = new java.lang.StringBuilder;
        r2 = "%";
        r1.<init>(r2);
        r10 = r10.a(r1);
        r9 = (char) r9;
        r10.append(r9);
        r1 = r10.toString();
    L_0x017d:
        r9 = a;
        r10 = new java.lang.Object[r4];
        r10[r6] = r8;
        r8 = java.lang.String.format(r9, r1, r10);
        r0.append(r8);
        return;
    L_0x018b:
        r8 = (java.util.Formattable) r8;
        r9 = r10.b;
        r9 = r9 & 162;
        if (r9 == 0) goto L_0x01a9;
    L_0x0193:
        r2 = r9 & 32;
        if (r2 == 0) goto L_0x0198;
    L_0x0197:
        goto L_0x0199;
    L_0x0198:
        r4 = 0;
    L_0x0199:
        r2 = r9 & 128;
        if (r2 == 0) goto L_0x019e;
    L_0x019d:
        goto L_0x019f;
    L_0x019e:
        r3 = 0;
    L_0x019f:
        r2 = r4 | r3;
        r9 = r9 & 2;
        if (r9 == 0) goto L_0x01a6;
    L_0x01a5:
        goto L_0x01a7;
    L_0x01a6:
        r1 = 0;
    L_0x01a7:
        r9 = r2 | r1;
    L_0x01a9:
        r1 = r0.length();
        r2 = new java.util.Formatter;
        r3 = a;
        r2.<init>(r0, r3);
        r3 = r10.c;	 Catch:{ RuntimeException -> 0x01bc }
        r10 = r10.d;	 Catch:{ RuntimeException -> 0x01bc }
        r8.formatTo(r2, r9, r3, r10);	 Catch:{ RuntimeException -> 0x01bc }
        return;
    L_0x01bc:
        r9 = move-exception;
        r0.setLength(r1);
        r10 = r2.out();	 Catch:{ IOException -> 0x01cb }
        r8 = defpackage.amyz.a(r8, r9);	 Catch:{ IOException -> 0x01cb }
        r10.append(r8);	 Catch:{ IOException -> 0x01cb }
    L_0x01cb:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amyz.a(java.lang.Object, amyl, amyo):void");
    }

    private static void a(StringBuilder stringBuilder, long j, boolean z) {
        if (j == 0) {
            stringBuilder.append("0");
            return;
        }
        String str = !z ? "0123456789abcdef" : "0123456789ABCDEF";
        for (int numberOfLeadingZeros = (63 - Long.numberOfLeadingZeros(j)) & -4; numberOfLeadingZeros >= 0; numberOfLeadingZeros -= 4) {
            stringBuilder.append(str.charAt((int) ((j >>> numberOfLeadingZeros) & 15)));
        }
    }

    public static void a(StringBuilder stringBuilder, Object obj, String str) {
        stringBuilder.append("[INVALID: format=");
        stringBuilder.append(str);
        stringBuilder.append(", type=");
        stringBuilder.append(obj.getClass().getCanonicalName());
        stringBuilder.append(", value=");
        stringBuilder.append(amyz.a(obj));
        stringBuilder.append("]");
    }

    private static void a(StringBuilder stringBuilder, amyc amyc) {
        if (amyc != amyc.a) {
            int length = stringBuilder.length();
            stringBuilder.insert(0, amyc.a());
            stringBuilder.insert(stringBuilder.length() - length, '.');
            stringBuilder.insert(stringBuilder.length() - length, amyc.b());
            stringBuilder.insert(stringBuilder.length() - length, ':');
            stringBuilder.insert(stringBuilder.length() - length, amyc.c());
            stringBuilder.insert(stringBuilder.length() - length, ' ');
        }
    }

    public static void a(amys amys, amzc amzc, int i) {
        String stringBuilder;
        amyt k = amys.k();
        Throwable th = (Throwable) k.b(amxx.a);
        Object obj = (k.a() == 0 || (k.a() == 1 && th != null)) ? 1 : null;
        if (amys.g() != null) {
            amyz amyz = new amyz(amys.g(), amys.h());
            amyz.a().a(amyz);
            int i2 = amyz.e;
            if (((i2 + 1) & i2) != 0 || (amyz.f > 31 && i2 != -1)) {
                throw new anac(String.format("unreferenced arguments [first missing index=%d]", new Object[]{Integer.valueOf(Integer.numberOfTrailingZeros(i2 ^ -1))}));
            }
            amyz.a().a(amyz.c, amyz.b(), amyz.d, amyz.b().length());
            StringBuilder stringBuilder2 = amyz.c;
            if (amys.h().length > amyz.f + 1) {
                stringBuilder2.append(" [ERROR: UNUSED LOG ARGUMENTS]");
            }
            if (i == 2) {
                amyz.a(stringBuilder2, amys.f());
            }
            if (obj == null) {
                amyz.a(stringBuilder2, k);
            }
            stringBuilder = stringBuilder2.toString();
        } else {
            String a = amyz.a(amys.i());
            if (i == 1 && obj != null) {
                stringBuilder = a;
            } else {
                StringBuilder stringBuilder3 = new StringBuilder(a);
                if (i == 2) {
                    amyz.a(stringBuilder3, amys.f());
                }
                if (obj == null) {
                    amyz.a(stringBuilder3, amys.k());
                }
                stringBuilder = stringBuilder3.toString();
            }
        }
        int b = amzs.b(amys.d());
        if (!(b == 2 || b == 3 || b == 4)) {
            if (b == 5) {
                Log.w(((amzs) amzc).b, stringBuilder, th);
            } else if (b != 6) {
                Log.wtf(((amzs) amzc).b, String.format("Level \"%d\" is not a valid level", new Object[]{Integer.valueOf(r12.intValue())}));
            } else {
                Log.e(((amzs) amzc).b, stringBuilder, th);
            }
        }
    }
}
