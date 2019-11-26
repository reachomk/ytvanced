package defpackage;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.List;

/* renamed from: aocc */
final class aocc extends aobz {
    public aocc(int i, Class cls, int i2) {
        super(i, cls, i2);
    }

    /* Access modifiers changed, original: protected|final */
    public final Object a(aobv aobv) {
        try {
            int i = this.a;
            switch (i) {
                case 1:
                    return Double.valueOf(Double.longBitsToDouble(aobv.i()));
                case 2:
                    return Float.valueOf(aobv.b());
                case 3:
                    return Long.valueOf(aobv.g());
                case 4:
                    return Long.valueOf(aobv.g());
                case 5:
                    return Integer.valueOf(aobv.f());
                case 6:
                    return Long.valueOf(aobv.i());
                case 7:
                    return Integer.valueOf(aobv.h());
                case 8:
                    return Boolean.valueOf(aobv.c());
                case 9:
                    return aobv.d();
                case 12:
                    return aobv.e();
                case 13:
                    return Integer.valueOf(aobv.f());
                case 14:
                    return Integer.valueOf(aobv.f());
                case 15:
                    return Integer.valueOf(aobv.h());
                case 16:
                    return Long.valueOf(aobv.i());
                case 17:
                    int f = aobv.f();
                    return Integer.valueOf((-(f & 1)) ^ (f >>> 1));
                case 18:
                    long g = aobv.g();
                    return Long.valueOf((g >>> 1) ^ (-(g & 1)));
                default:
                    StringBuilder stringBuilder = new StringBuilder(24);
                    stringBuilder.append("Unknown type ");
                    stringBuilder.append(i);
                    throw new IllegalArgumentException(stringBuilder.toString());
            }
        } catch (IOException e) {
            throw new IllegalArgumentException("Error reading extension field", e);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(aoch aoch, List list) {
        if (aoch.a == 0) {
            list.add(a(aobv.a(aoch.b)));
            return;
        }
        aobv a = aobv.a(aoch.b);
        try {
            a.c(a.f());
            while (!a.l()) {
                list.add(a(a));
            }
        } catch (IOException e) {
            throw new IllegalArgumentException("Error reading extension field", e);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(Object obj, aoby aoby) {
        try {
            aoby.i(this.c);
            int i = this.a;
            switch (i) {
                case 1:
                    aoby.a(((Double) obj).doubleValue());
                    return;
                case 2:
                    aoby.a(((Float) obj).floatValue());
                    return;
                case 3:
                    aoby.c(((Long) obj).longValue());
                    return;
                case 4:
                    aoby.c(((Long) obj).longValue());
                    return;
                case 5:
                    aoby.a(((Integer) obj).intValue());
                    return;
                case 6:
                    aoby.e(((Long) obj).longValue());
                    return;
                case 7:
                    aoby.k(((Integer) obj).intValue());
                    return;
                case 8:
                    aoby.g(((Boolean) obj).booleanValue());
                    return;
                case 9:
                    aoby.a((String) obj);
                    return;
                case 12:
                    aoby.a((byte[]) obj);
                    return;
                case 13:
                    aoby.i(((Integer) obj).intValue());
                    return;
                case 14:
                    aoby.i(((Integer) obj).intValue());
                    return;
                case 15:
                    aoby.k(((Integer) obj).intValue());
                    return;
                case 16:
                    aoby.e(((Long) obj).longValue());
                    return;
                case 17:
                    aoby.b(((Integer) obj).intValue());
                    return;
                case 18:
                    aoby.a(((Long) obj).longValue());
                    return;
                default:
                    StringBuilder stringBuilder = new StringBuilder(24);
                    stringBuilder.append("Unknown type ");
                    stringBuilder.append(i);
                    throw new IllegalArgumentException(stringBuilder.toString());
            }
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Missing block: B:9:0x0025, code skipped:
            if (r2 >= r0) goto L_0x00cd;
     */
    /* JADX WARNING: Missing block: B:10:0x0027, code skipped:
            r7.a(java.lang.reflect.Array.getLong(r6, r2));
            r2 = r2 + 1;
     */
    /* JADX WARNING: Missing block: B:11:0x0031, code skipped:
            if (r2 >= r0) goto L_0x00cd;
     */
    /* JADX WARNING: Missing block: B:12:0x0033, code skipped:
            r7.b(java.lang.reflect.Array.getInt(r6, r2));
            r2 = r2 + 1;
     */
    /* JADX WARNING: Missing block: B:13:0x003d, code skipped:
            if (r2 >= r0) goto L_0x00cd;
     */
    /* JADX WARNING: Missing block: B:14:0x003f, code skipped:
            r7.e(java.lang.reflect.Array.getLong(r6, r2));
            r2 = r2 + 1;
     */
    /* JADX WARNING: Missing block: B:15:0x0049, code skipped:
            if (r2 >= r0) goto L_0x00cd;
     */
    /* JADX WARNING: Missing block: B:16:0x004b, code skipped:
            r7.k(java.lang.reflect.Array.getInt(r6, r2));
            r2 = r2 + 1;
     */
    /* JADX WARNING: Missing block: B:17:0x0055, code skipped:
            if (r2 >= r0) goto L_0x00cd;
     */
    /* JADX WARNING: Missing block: B:18:0x0057, code skipped:
            r7.i(java.lang.reflect.Array.getInt(r6, r2));
            r2 = r2 + 1;
     */
    /* JADX WARNING: Missing block: B:19:0x0061, code skipped:
            if (r2 >= r0) goto L_0x00cd;
     */
    /* JADX WARNING: Missing block: B:20:0x0063, code skipped:
            r7.i(java.lang.reflect.Array.getInt(r6, r2));
            r2 = r2 + 1;
     */
    /* JADX WARNING: Missing block: B:21:0x006d, code skipped:
            if (r2 >= r0) goto L_0x00cd;
     */
    /* JADX WARNING: Missing block: B:22:0x006f, code skipped:
            r7.g(java.lang.reflect.Array.getBoolean(r6, r2));
            r2 = r2 + 1;
     */
    /* JADX WARNING: Missing block: B:23:0x0079, code skipped:
            if (r2 >= r0) goto L_0x00cd;
     */
    /* JADX WARNING: Missing block: B:24:0x007b, code skipped:
            r7.k(java.lang.reflect.Array.getInt(r6, r2));
            r2 = r2 + 1;
     */
    /* JADX WARNING: Missing block: B:25:0x0085, code skipped:
            if (r2 >= r0) goto L_0x00cd;
     */
    /* JADX WARNING: Missing block: B:26:0x0087, code skipped:
            r7.e(java.lang.reflect.Array.getLong(r6, r2));
            r2 = r2 + 1;
     */
    /* JADX WARNING: Missing block: B:27:0x0091, code skipped:
            if (r2 >= r0) goto L_0x00cd;
     */
    /* JADX WARNING: Missing block: B:28:0x0093, code skipped:
            r7.a(java.lang.reflect.Array.getInt(r6, r2));
            r2 = r2 + 1;
     */
    /* JADX WARNING: Missing block: B:29:0x009d, code skipped:
            if (r2 >= r0) goto L_0x00cd;
     */
    /* JADX WARNING: Missing block: B:30:0x009f, code skipped:
            r7.c(java.lang.reflect.Array.getLong(r6, r2));
            r2 = r2 + 1;
     */
    /* JADX WARNING: Missing block: B:31:0x00a9, code skipped:
            if (r2 >= r0) goto L_0x00cd;
     */
    /* JADX WARNING: Missing block: B:32:0x00ab, code skipped:
            r7.c(java.lang.reflect.Array.getLong(r6, r2));
            r2 = r2 + 1;
     */
    /* JADX WARNING: Missing block: B:33:0x00b5, code skipped:
            if (r2 >= r0) goto L_0x00cd;
     */
    /* JADX WARNING: Missing block: B:34:0x00b7, code skipped:
            r7.a(java.lang.reflect.Array.getFloat(r6, r2));
            r2 = r2 + 1;
     */
    /* JADX WARNING: Missing block: B:35:0x00c1, code skipped:
            if (r2 >= r0) goto L_0x00cd;
     */
    /* JADX WARNING: Missing block: B:36:0x00c3, code skipped:
            r7.a(java.lang.reflect.Array.getDouble(r6, r2));
            r2 = r2 + 1;
     */
    /* JADX WARNING: Missing block: B:59:?, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:60:?, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:61:?, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:62:?, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:63:?, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:64:?, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:65:?, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:66:?, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:67:?, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:68:?, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:69:?, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:70:?, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:71:?, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:72:?, code skipped:
            return;
     */
    public final void b(java.lang.Object r6, defpackage.aoby r7) {
        /*
        r5 = this;
        r0 = r5.c;
        if (r0 != 0) goto L_0x0009;
    L_0x0004:
        super.b(r6, r7);
        goto L_0x00cd;
    L_0x0009:
        if (r0 != 0) goto L_0x00ec;
    L_0x000b:
        r0 = java.lang.reflect.Array.getLength(r6);
        r1 = r5.c(r6);
        r2 = r5.c;	 Catch:{ IOException -> 0x00e5 }
        r7.i(r2);	 Catch:{ IOException -> 0x00e5 }
        r7.i(r1);	 Catch:{ IOException -> 0x00e5 }
        r1 = r5.a;	 Catch:{ IOException -> 0x00e5 }
        r2 = 0;
        switch(r1) {
            case 1: goto L_0x00c1;
            case 2: goto L_0x00b5;
            case 3: goto L_0x00a9;
            case 4: goto L_0x009d;
            case 5: goto L_0x0091;
            case 6: goto L_0x0085;
            case 7: goto L_0x0079;
            case 8: goto L_0x006d;
            case 9: goto L_0x0021;
            case 10: goto L_0x0021;
            case 11: goto L_0x0021;
            case 12: goto L_0x0021;
            case 13: goto L_0x0061;
            case 14: goto L_0x0055;
            case 15: goto L_0x0049;
            case 16: goto L_0x003d;
            case 17: goto L_0x0031;
            case 18: goto L_0x0025;
            default: goto L_0x0021;
        };	 Catch:{ IOException -> 0x00e5 }
    L_0x0021:
        r6 = new java.lang.IllegalArgumentException;	 Catch:{ IOException -> 0x00e5 }
        goto L_0x00ce;
    L_0x0025:
        if (r2 >= r0) goto L_0x00cd;
    L_0x0027:
        r3 = java.lang.reflect.Array.getLong(r6, r2);	 Catch:{ IOException -> 0x00e5 }
        r7.a(r3);	 Catch:{ IOException -> 0x00e5 }
        r2 = r2 + 1;
        goto L_0x0025;
    L_0x0031:
        if (r2 >= r0) goto L_0x00cd;
    L_0x0033:
        r1 = java.lang.reflect.Array.getInt(r6, r2);	 Catch:{ IOException -> 0x00e5 }
        r7.b(r1);	 Catch:{ IOException -> 0x00e5 }
        r2 = r2 + 1;
        goto L_0x0031;
    L_0x003d:
        if (r2 >= r0) goto L_0x00cd;
    L_0x003f:
        r3 = java.lang.reflect.Array.getLong(r6, r2);	 Catch:{ IOException -> 0x00e5 }
        r7.e(r3);	 Catch:{ IOException -> 0x00e5 }
        r2 = r2 + 1;
        goto L_0x003d;
    L_0x0049:
        if (r2 >= r0) goto L_0x00cd;
    L_0x004b:
        r1 = java.lang.reflect.Array.getInt(r6, r2);	 Catch:{ IOException -> 0x00e5 }
        r7.k(r1);	 Catch:{ IOException -> 0x00e5 }
        r2 = r2 + 1;
        goto L_0x0049;
    L_0x0055:
        if (r2 >= r0) goto L_0x00cd;
    L_0x0057:
        r1 = java.lang.reflect.Array.getInt(r6, r2);	 Catch:{ IOException -> 0x00e5 }
        r7.i(r1);	 Catch:{ IOException -> 0x00e5 }
        r2 = r2 + 1;
        goto L_0x0055;
    L_0x0061:
        if (r2 >= r0) goto L_0x00cd;
    L_0x0063:
        r1 = java.lang.reflect.Array.getInt(r6, r2);	 Catch:{ IOException -> 0x00e5 }
        r7.i(r1);	 Catch:{ IOException -> 0x00e5 }
        r2 = r2 + 1;
        goto L_0x0061;
    L_0x006d:
        if (r2 >= r0) goto L_0x00cd;
    L_0x006f:
        r1 = java.lang.reflect.Array.getBoolean(r6, r2);	 Catch:{ IOException -> 0x00e5 }
        r7.g(r1);	 Catch:{ IOException -> 0x00e5 }
        r2 = r2 + 1;
        goto L_0x006d;
    L_0x0079:
        if (r2 >= r0) goto L_0x00cd;
    L_0x007b:
        r1 = java.lang.reflect.Array.getInt(r6, r2);	 Catch:{ IOException -> 0x00e5 }
        r7.k(r1);	 Catch:{ IOException -> 0x00e5 }
        r2 = r2 + 1;
        goto L_0x0079;
    L_0x0085:
        if (r2 >= r0) goto L_0x00cd;
    L_0x0087:
        r3 = java.lang.reflect.Array.getLong(r6, r2);	 Catch:{ IOException -> 0x00e5 }
        r7.e(r3);	 Catch:{ IOException -> 0x00e5 }
        r2 = r2 + 1;
        goto L_0x0085;
    L_0x0091:
        if (r2 >= r0) goto L_0x00cd;
    L_0x0093:
        r1 = java.lang.reflect.Array.getInt(r6, r2);	 Catch:{ IOException -> 0x00e5 }
        r7.a(r1);	 Catch:{ IOException -> 0x00e5 }
        r2 = r2 + 1;
        goto L_0x0091;
    L_0x009d:
        if (r2 >= r0) goto L_0x00cd;
    L_0x009f:
        r3 = java.lang.reflect.Array.getLong(r6, r2);	 Catch:{ IOException -> 0x00e5 }
        r7.c(r3);	 Catch:{ IOException -> 0x00e5 }
        r2 = r2 + 1;
        goto L_0x009d;
    L_0x00a9:
        if (r2 >= r0) goto L_0x00cd;
    L_0x00ab:
        r3 = java.lang.reflect.Array.getLong(r6, r2);	 Catch:{ IOException -> 0x00e5 }
        r7.c(r3);	 Catch:{ IOException -> 0x00e5 }
        r2 = r2 + 1;
        goto L_0x00a9;
    L_0x00b5:
        if (r2 >= r0) goto L_0x00cd;
    L_0x00b7:
        r1 = java.lang.reflect.Array.getFloat(r6, r2);	 Catch:{ IOException -> 0x00e5 }
        r7.a(r1);	 Catch:{ IOException -> 0x00e5 }
        r2 = r2 + 1;
        goto L_0x00b5;
    L_0x00c1:
        if (r2 >= r0) goto L_0x00cd;
    L_0x00c3:
        r3 = java.lang.reflect.Array.getDouble(r6, r2);	 Catch:{ IOException -> 0x00e5 }
        r7.a(r3);	 Catch:{ IOException -> 0x00e5 }
        r2 = r2 + 1;
        goto L_0x00c1;
    L_0x00cd:
        return;
    L_0x00ce:
        r7 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x00e5 }
        r0 = 27;
        r7.<init>(r0);	 Catch:{ IOException -> 0x00e5 }
        r0 = "Unpackable type ";
        r7.append(r0);	 Catch:{ IOException -> 0x00e5 }
        r7.append(r1);	 Catch:{ IOException -> 0x00e5 }
        r7 = r7.toString();	 Catch:{ IOException -> 0x00e5 }
        r6.<init>(r7);	 Catch:{ IOException -> 0x00e5 }
        throw r6;	 Catch:{ IOException -> 0x00e5 }
    L_0x00e5:
        r6 = move-exception;
        r7 = new java.lang.IllegalStateException;
        r7.<init>(r6);
        throw r7;
    L_0x00ec:
        r6 = new java.lang.IllegalArgumentException;
        r7 = new java.lang.StringBuilder;
        r1 = 124; // 0x7c float:1.74E-43 double:6.13E-322;
        r7.<init>(r1);
        r1 = "Unexpected repeated extension tag ";
        r7.append(r1);
        r7.append(r0);
        r0 = ", unequal to both non-packed variant 0 and packed variant 0";
        r7.append(r0);
        r7 = r7.toString();
        r6.<init>(r7);
        goto L_0x010b;
    L_0x010a:
        throw r6;
    L_0x010b:
        goto L_0x010a;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aocc.b(java.lang.Object, aoby):void");
    }

    private final int c(Object obj) {
        int length = Array.getLength(obj);
        int i = this.a;
        int i2 = 0;
        switch (i) {
            case 1:
            case 6:
            case 16:
                return length << 3;
            case 2:
            case 7:
            case 15:
                return length << 2;
            case 3:
                i = 0;
                while (i2 < length) {
                    i += aoby.d(Array.getLong(obj, i2));
                    i2++;
                }
                break;
            case 4:
                i = 0;
                while (i2 < length) {
                    i += aoby.d(Array.getLong(obj, i2));
                    i2++;
                }
                break;
            case 5:
                i = 0;
                while (i2 < length) {
                    i += aoby.e(Array.getInt(obj, i2));
                    i2++;
                }
                break;
            case 8:
                i = length;
                break;
            case 13:
                i = 0;
                while (i2 < length) {
                    i += aoby.j(Array.getInt(obj, i2));
                    i2++;
                }
                break;
            case 14:
                i = 0;
                while (i2 < length) {
                    i += aoby.j(Array.getInt(obj, i2));
                    i2++;
                }
                break;
            case 17:
                i = 0;
                while (i2 < length) {
                    i += aoby.f(Array.getInt(obj, i2));
                    i2++;
                }
                break;
            case 18:
                i = 0;
                while (i2 < length) {
                    i += aoby.b(Array.getLong(obj, i2));
                    i2++;
                }
                break;
            default:
                StringBuilder stringBuilder = new StringBuilder(40);
                stringBuilder.append("Unexpected non-packable type ");
                stringBuilder.append(i);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
        return i;
    }

    /* Access modifiers changed, original: protected|final */
    public final int a(Object obj) {
        int i = this.c;
        if (i == 0) {
            return super.a(obj);
        }
        if (i == 0) {
            int c = c(obj);
            return (c + aoby.j(c)) + aoby.j(this.c);
        }
        StringBuilder stringBuilder = new StringBuilder(124);
        stringBuilder.append("Unexpected repeated extension tag ");
        stringBuilder.append(i);
        stringBuilder.append(", unequal to both non-packed variant 0 and packed variant 0");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* Access modifiers changed, original: protected|final */
    public final int b(Object obj) {
        int intValue;
        int b = aock.b(this.c);
        int i = this.a;
        switch (i) {
            case 1:
                ((Double) obj).doubleValue();
                return aoby.h(b) + 8;
            case 2:
                ((Float) obj).floatValue();
                return aoby.c(b);
            case 3:
                return aoby.d(b, ((Long) obj).longValue());
            case 4:
                return aoby.c(b, ((Long) obj).longValue());
            case 5:
                return aoby.c(b, ((Integer) obj).intValue());
            case 6:
                ((Long) obj).longValue();
                return aoby.h(b) + 8;
            case 7:
                ((Integer) obj).intValue();
                return aoby.h(b) + 4;
            case 8:
                ((Boolean) obj).booleanValue();
                return aoby.d(b);
            case 9:
                return aoby.b(b, (String) obj);
            case 12:
                return aoby.b(b, (byte[]) obj);
            case 13:
                return aoby.d(b, ((Integer) obj).intValue());
            case 14:
                Integer valueOf;
                if (obj instanceof anxv) {
                    valueOf = Integer.valueOf(((anxv) obj).getNumber());
                } else {
                    valueOf = (Integer) obj;
                }
                intValue = valueOf.intValue();
                b = aoby.h(b);
                intValue = aoby.j(intValue);
                break;
            case 15:
                ((Integer) obj).intValue();
                return aoby.h(b) + 4;
            case 16:
                ((Long) obj).longValue();
                return aoby.h(b) + 8;
            case 17:
                intValue = ((Integer) obj).intValue();
                b = aoby.h(b);
                intValue = aoby.f(intValue);
                break;
            case 18:
                return aoby.h(b) + aoby.b(((Long) obj).longValue());
            default:
                StringBuilder stringBuilder = new StringBuilder(24);
                stringBuilder.append("Unknown type ");
                stringBuilder.append(i);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
        return b + intValue;
    }
}
