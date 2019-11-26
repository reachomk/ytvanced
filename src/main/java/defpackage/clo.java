package defpackage;

import com.facebook.yoga.YogaEdge;

/* renamed from: clo */
public final class clo {
    public final float[] a;
    public final int[] b;
    public final int[] c;

    public static cln a(cmg cmg) {
        return new cln(cmg);
    }

    private clo() {
        this.a = new float[4];
        this.b = new int[4];
        this.c = new int[4];
    }

    static int a(int[] iArr, YogaEdge yogaEdge) {
        if (iArr.length == 4) {
            return iArr[clo.a(yogaEdge)];
        }
        throw new IllegalArgumentException("Given wrongly sized array");
    }

    public static void a(int[] r2, com.facebook.yoga.YogaEdge r3, int r4) {
        /*
        r0 = r3.ordinal();
        r1 = 0;
        switch(r0) {
            case 0: goto L_0x001e;
            case 1: goto L_0x001e;
            case 2: goto L_0x001e;
            case 3: goto L_0x001e;
            case 4: goto L_0x001e;
            case 5: goto L_0x001e;
            case 6: goto L_0x0018;
            case 7: goto L_0x0011;
            case 8: goto L_0x0009;
            default: goto L_0x0008;
        };
    L_0x0008:
        goto L_0x0024;
    L_0x0009:
        r3 = 4;
        if (r1 >= r3) goto L_0x0024;
    L_0x000c:
        r2[r1] = r4;
        r1 = r1 + 1;
        goto L_0x0009;
    L_0x0011:
        r3 = 1;
        r2[r3] = r4;
        r3 = 3;
        r2[r3] = r4;
        goto L_0x0024;
    L_0x0018:
        r2[r1] = r4;
        r3 = 2;
        r2[r3] = r4;
        return;
    L_0x001e:
        r3 = defpackage.clo.a(r3);
        r2[r3] = r4;
    L_0x0024:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clo.a(int[], com.facebook.yoga.YogaEdge, int):void");
    }

    private static int a(YogaEdge yogaEdge) {
        int ordinal = yogaEdge.ordinal();
        if (ordinal != 0) {
            int i = 1;
            if (ordinal != 1) {
                i = 2;
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return 3;
                    }
                    if (ordinal != 4) {
                        if (ordinal != 5) {
                            String valueOf = String.valueOf(yogaEdge.name());
                            String str = "Given unsupported edge ";
                            throw new IllegalArgumentException(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
                        }
                    }
                }
            }
            return i;
        }
        return 0;
    }

    /* synthetic */ clo(byte b) {
        this.a = new float[4];
        this.b = new int[4];
        this.c = new int[4];
    }
}
