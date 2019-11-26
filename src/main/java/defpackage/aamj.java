package defpackage;

import android.os.Parcel;
import java.lang.reflect.InvocationTargetException;

/* renamed from: aamj */
public final class aamj {
    private static aamj a;
    private final aalx b;

    public aamj(aalx aalx) {
        this.b = aalx;
        a = this;
    }

    public static aoca a(Parcel parcel, aoca aoca) {
        byte[] createByteArray = parcel.createByteArray();
        if (createByteArray == null) {
            return null;
        }
        aamj aamj = a;
        if (aamj != null) {
            return aamj.a(createByteArray, aoca.getClass());
        }
        return (aoca) aocf.mergeFrom(aoca, createByteArray);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0047 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x007c */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0079 A:{Catch:{ anyg -> 0x007c }} */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0070 A:{Catch:{ anyg -> 0x007c }} */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:22|23) */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:17|18) */
    /* JADX WARNING: Missing block: B:18:?, code skipped:
            r1 = java.lang.String.valueOf(r1);
            r4 = new java.lang.StringBuilder(r1.length() + 43);
            r4.append("Error while getting field ");
            r4.append(1);
            r4.append(" from ");
            r4.append(r1);
            defpackage.xtl.d(r4.toString());
     */
    /* JADX WARNING: Missing block: B:23:?, code skipped:
            r1 = defpackage.asic.k;
     */
    public final defpackage.anze a(byte[] r8, defpackage.anze r9) {
        /*
        r7 = this;
        defpackage.amqw.a(r8);
        defpackage.amqw.a(r9);
        r0 = 0;
        r9 = r9.getParserForType();	 Catch:{ anyg -> 0x0082 }
        r8 = r9.a(r8);	 Catch:{ anyg -> 0x0082 }
        r8 = (defpackage.anze) r8;	 Catch:{ anyg -> 0x0082 }
        r9 = r7.b;	 Catch:{ anyg -> 0x0082 }
        r1 = r8.toByteString();	 Catch:{ anyg -> 0x007c }
        defpackage.amqw.a(r1);	 Catch:{ anyg -> 0x007c }
        r2 = "fieldNumber must be > 0";
        r3 = 1;
        defpackage.amqw.a(r3, r2);	 Catch:{ anyg -> 0x007c }
        r2 = r1.g();	 Catch:{ anyg -> 0x007c }
    L_0x0024:
        r4 = r2.u();	 Catch:{ IOException -> 0x0047 }
        if (r4 != 0) goto L_0x0045;
    L_0x002a:
        r4 = r2.a();	 Catch:{ IOException -> 0x0047 }
        r5 = defpackage.aobj.b(r4);	 Catch:{ IOException -> 0x0047 }
        r6 = defpackage.aobj.a(r4);	 Catch:{ IOException -> 0x0047 }
        if (r5 != r3) goto L_0x0041;
    L_0x0038:
        r5 = 2;
        if (r6 == r5) goto L_0x003c;
    L_0x003b:
        goto L_0x0041;
    L_0x003c:
        r1 = r2.l();	 Catch:{ IOException -> 0x0047 }
        goto L_0x006e;
    L_0x0041:
        r2.b(r4);	 Catch:{ IOException -> 0x0047 }
        goto L_0x0024;
    L_0x0045:
        r1 = r0;
        goto L_0x006e;
    L_0x0047:
        r1 = java.lang.String.valueOf(r1);	 Catch:{ anyg -> 0x007c }
        r2 = r1.length();	 Catch:{ anyg -> 0x007c }
        r2 = r2 + 43;
        r4 = new java.lang.StringBuilder;	 Catch:{ anyg -> 0x007c }
        r4.<init>(r2);	 Catch:{ anyg -> 0x007c }
        r2 = "Error while getting field ";
        r4.append(r2);	 Catch:{ anyg -> 0x007c }
        r4.append(r3);	 Catch:{ anyg -> 0x007c }
        r2 = " from ";
        r4.append(r2);	 Catch:{ anyg -> 0x007c }
        r4.append(r1);	 Catch:{ anyg -> 0x007c }
        r1 = r4.toString();	 Catch:{ anyg -> 0x007c }
        defpackage.xtl.d(r1);	 Catch:{ anyg -> 0x007c }
        goto L_0x0045;
    L_0x006e:
        if (r1 == 0) goto L_0x0079;
    L_0x0070:
        r2 = defpackage.asic.k;	 Catch:{ anyg -> 0x007c }
        r1 = defpackage.anxl.parseFrom(r2, r1);	 Catch:{ anyg -> 0x007c }
        r1 = (defpackage.asic) r1;	 Catch:{ anyg -> 0x007c }
        goto L_0x007e;
    L_0x0079:
        r1 = defpackage.asic.k;	 Catch:{ anyg -> 0x007c }
        goto L_0x007e;
    L_0x007c:
        r1 = defpackage.asic.k;	 Catch:{ anyg -> 0x0082 }
    L_0x007e:
        r9.a(r8, r1);	 Catch:{ anyg -> 0x0082 }
        return r8;
    L_0x0082:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aamj.a(byte[], anze):anze");
    }

    public final aoca a(byte[] bArr, Class cls) {
        amqw.a((Object) cls);
        amqw.a((Object) bArr);
        aoca b = aamj.b(bArr, cls);
        if (b != null) {
            this.b.a(b, akcm.a(b));
        }
        return b;
    }

    private static aoca b(byte[] bArr, Class cls) {
        try {
            return (aoca) aocf.mergeFrom((aocf) cls.getConstructor(new Class[0]).newInstance(new Object[0]), bArr);
        } catch (aocg | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }
}
