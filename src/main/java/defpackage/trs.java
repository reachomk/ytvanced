package defpackage;

import java.util.HashSet;
import java.util.Set;

/* renamed from: trs */
public final class trs {
    public static final int e = 1;
    public final int a;
    public trx b;
    public final int c = -1;
    public final int d = -1;
    private final Set f;

    public trs(int i) {
        this.a = i;
        this.b = null;
        this.f = new HashSet();
    }

    public final trs a() {
        this.f.add(Integer.valueOf(4));
        return this;
    }

    public final boolean a(int i) {
        return this.f.contains(Integer.valueOf(4));
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ba  */
    @java.lang.Deprecated
    public static defpackage.trs a(java.lang.String r12) {
        /*
        r0 = "ve=";
        r0 = r12.startsWith(r0);
        r1 = 0;
        if (r0 == 0) goto L_0x00e4;
    L_0x0009:
        r0 = 3;
        r12 = r12.substring(r0);
        r0 = ";visibility:hidden";
        r2 = r12.indexOf(r0);
        r3 = 0;
        r4 = 1;
        if (r2 < 0) goto L_0x0020;
    L_0x0018:
        r2 = "";
        r12 = r12.replace(r0, r2);
        r0 = 1;
        goto L_0x0021;
    L_0x0020:
        r0 = 0;
    L_0x0021:
        r2 = ";track:";
        r2 = r12.indexOf(r2);
        r5 = -1;
        if (r2 != r5) goto L_0x002e;
    L_0x002a:
        r2 = r12.length();
    L_0x002e:
        r6 = r12.substring(r3, r2);	 Catch:{ NumberFormatException -> 0x00e4 }
        r6 = java.lang.Integer.parseInt(r6);	 Catch:{ NumberFormatException -> 0x00e4 }
        r7 = new trs;
        r7.<init>(r6);
        r6 = 4;
        if (r0 != 0) goto L_0x003f;
    L_0x003e:
        goto L_0x006c;
    L_0x003f:
        r0 = r7.b;
        if (r0 == 0) goto L_0x004c;
    L_0x0043:
        r0 = r0.toBuilder();
        r0 = (defpackage.anxo) r0;
        r0 = (defpackage.trw) r0;
        goto L_0x0054;
    L_0x004c:
        r0 = defpackage.trx.e;
        r0 = r0.createBuilder();
        r0 = (defpackage.trw) r0;
    L_0x0054:
        r0.copyOnWrite();
        r8 = r0.instance;
        r8 = (defpackage.trx) r8;
        r9 = r8.a;
        r9 = r9 | r6;
        r8.a = r9;
        r8.d = r4;
        r0 = r0.build();
        r0 = (defpackage.anxl) r0;
        r0 = (defpackage.trx) r0;
        r7.b = r0;
    L_0x006c:
        r2 = r2 + 7;
        r0 = r12.length();
        if (r2 >= r0) goto L_0x00e3;
    L_0x0074:
        r12 = r12.substring(r2);
        r0 = ",";
        r12 = r12.split(r0);
        r0 = r12.length;
        r2 = 0;
    L_0x0080:
        if (r2 >= r0) goto L_0x00e3;
    L_0x0082:
        r8 = r12[r2];
        r9 = r8.hashCode();
        r10 = 3091764; // 0x2f2d34 float:4.332484E-39 double:1.5275344E-317;
        r11 = 2;
        if (r9 == r10) goto L_0x00ad;
    L_0x008e:
        r10 = 3092207; // 0x2f2eef float:4.333105E-39 double:1.5277532E-317;
        if (r9 == r10) goto L_0x00a3;
    L_0x0093:
        r10 = 94750088; // 0x5a5c588 float:1.5589087E-35 double:4.68127634E-316;
        if (r9 == r10) goto L_0x0099;
    L_0x0098:
        goto L_0x00b7;
    L_0x0099:
        r9 = "click";
        r8 = r8.equals(r9);
        if (r8 == 0) goto L_0x00b7;
    L_0x00a1:
        r8 = 0;
        goto L_0x00b8;
    L_0x00a3:
        r9 = "drop";
        r8 = r8.equals(r9);
        if (r8 == 0) goto L_0x00b7;
    L_0x00ab:
        r8 = 2;
        goto L_0x00b8;
    L_0x00ad:
        r9 = "drag";
        r8 = r8.equals(r9);
        if (r8 == 0) goto L_0x00b7;
    L_0x00b5:
        r8 = 1;
        goto L_0x00b8;
    L_0x00b7:
        r8 = -1;
    L_0x00b8:
        if (r8 == 0) goto L_0x00d7;
    L_0x00ba:
        if (r8 == r4) goto L_0x00cb;
    L_0x00bc:
        if (r8 == r11) goto L_0x00bf;
    L_0x00be:
        return r1;
    L_0x00bf:
        r8 = r7.f;
        r9 = 37;
        r9 = java.lang.Integer.valueOf(r9);
        r8.add(r9);
        goto L_0x00e0;
    L_0x00cb:
        r8 = r7.f;
        r9 = 30;
        r9 = java.lang.Integer.valueOf(r9);
        r8.add(r9);
        goto L_0x00e0;
    L_0x00d7:
        r8 = r7.f;
        r9 = java.lang.Integer.valueOf(r6);
        r8.add(r9);
    L_0x00e0:
        r2 = r2 + 1;
        goto L_0x0080;
    L_0x00e3:
        return r7;
    L_0x00e4:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.trs.a(java.lang.String):trs");
    }

    public final String toString() {
        StringBuilder stringBuilder;
        Object stringBuilder2;
        Object stringBuilder3;
        int i = this.a;
        String valueOf = String.valueOf(this.f);
        trx trx = this.b;
        String str = "";
        if (trx != null) {
            String valueOf2 = String.valueOf(trx);
            stringBuilder = new StringBuilder(valueOf2.length() + 14);
            stringBuilder.append(", runtimeInfo=");
            stringBuilder.append(valueOf2);
            stringBuilder2 = stringBuilder.toString();
        } else {
            stringBuilder2 = str;
        }
        int i2 = this.c;
        if (i2 != -1) {
            stringBuilder = new StringBuilder(25);
            stringBuilder.append(", resultIndex=");
            stringBuilder.append(i2);
            stringBuilder3 = stringBuilder.toString();
        } else {
            stringBuilder3 = str;
        }
        int length = valueOf.length();
        int length2 = String.valueOf(stringBuilder2).length();
        StringBuilder stringBuilder4 = new StringBuilder((((length + 36) + length2) + String.valueOf(stringBuilder3).length()) + str.length());
        stringBuilder4.append("Ve[id=");
        stringBuilder4.append(i);
        stringBuilder4.append(", userInteractions=");
        stringBuilder4.append(valueOf);
        stringBuilder4.append(stringBuilder2);
        stringBuilder4.append(stringBuilder3);
        stringBuilder4.append(str);
        return stringBuilder4.toString();
    }

    public final int b() {
        trx trx = this.b;
        if (trx == null) {
            return 1;
        }
        int a = anby.a(trx.d);
        if (a == 0) {
            return 1;
        }
        return a;
    }
}
