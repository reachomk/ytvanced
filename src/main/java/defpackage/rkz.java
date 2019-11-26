package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.DisplayMetrics;

@qlp
/* renamed from: rkz */
public final class rkz extends qou {
    public static final Creator CREATOR = new rlc();
    public final String a;
    public final int b;
    public final int c;
    public boolean d;
    private final int e;
    private final boolean f;
    private final int g;
    private final rkz[] h;
    private final boolean i;
    private final boolean j;

    public static int a(DisplayMetrics displayMetrics) {
        return displayMetrics.widthPixels;
    }

    public static int b(DisplayMetrics displayMetrics) {
        int i = (int) (((float) displayMetrics.heightPixels) / displayMetrics.density);
        if (i > 400) {
            return i > 720 ? 90 : 50;
        } else {
            return 32;
        }
    }

    public rkz() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0074  */
    public rkz(android.content.Context r14, defpackage.pbi[] r15) {
        /*
        r13 = this;
        r13.<init>();
        r0 = 0;
        r1 = r15[r0];
        r13.f = r0;
        r2 = r1.b;
        r3 = 1;
        r4 = -3;
        if (r2 != r4) goto L_0x0015;
    L_0x000e:
        r4 = r1.c;
        r5 = -4;
        if (r4 != r5) goto L_0x0015;
    L_0x0013:
        r4 = 1;
        goto L_0x0016;
    L_0x0015:
        r4 = 0;
    L_0x0016:
        r13.j = r4;
        if (r4 == 0) goto L_0x0027;
    L_0x001a:
        r2 = defpackage.pbi.a;
        r2 = r2.b;
        r13.c = r2;
        r2 = defpackage.pbi.a;
        r2 = r2.c;
        r13.b = r2;
        goto L_0x002d;
    L_0x0027:
        r13.c = r2;
        r2 = r1.c;
        r13.b = r2;
    L_0x002d:
        r4 = r13.c;
        r5 = r14.getResources();
        r5 = r5.getDisplayMetrics();
        r6 = -1;
        if (r4 != r6) goto L_0x0077;
    L_0x003a:
        defpackage.rlj.a();
        r7 = defpackage.qmh.c(r14);
        if (r7 == 0) goto L_0x0059;
    L_0x0043:
        defpackage.rlj.a();
        r7 = defpackage.qmh.d(r14);
        if (r7 == 0) goto L_0x0059;
    L_0x004c:
        r7 = r5.widthPixels;
        defpackage.rlj.a();
        r8 = defpackage.qmh.e(r14);
        r7 = r7 - r8;
        r13.g = r7;
        goto L_0x005d;
    L_0x0059:
        r7 = r5.widthPixels;
        r13.g = r7;
    L_0x005d:
        r7 = (float) r7;
        r8 = r5.density;
        r7 = r7 / r8;
        r7 = (double) r7;
        r9 = (int) r7;
        r10 = (double) r9;
        java.lang.Double.isNaN(r7);
        java.lang.Double.isNaN(r10);
        r7 = r7 - r10;
        r10 = 4576918229304087675; // 0x3f847ae147ae147b float:89128.96 double:0.01;
        r12 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1));
        if (r12 < 0) goto L_0x0084;
    L_0x0074:
        r9 = r9 + 1;
        goto L_0x0084;
    L_0x0077:
        r9 = r13.c;
        defpackage.rlj.a();
        r7 = r13.c;
        r7 = defpackage.qmh.a(r5, r7);
        r13.g = r7;
    L_0x0084:
        r7 = -2;
        if (r2 != r7) goto L_0x008c;
    L_0x0087:
        r8 = defpackage.rkz.b(r5);
        goto L_0x008e;
    L_0x008c:
        r8 = r13.b;
    L_0x008e:
        defpackage.rlj.a();
        r5 = defpackage.qmh.a(r5, r8);
        r13.e = r5;
        if (r4 != r6) goto L_0x009a;
    L_0x0099:
        goto L_0x00aa;
    L_0x009a:
        if (r2 == r7) goto L_0x00aa;
    L_0x009c:
        r2 = r13.j;
        if (r2 == 0) goto L_0x00a5;
    L_0x00a0:
        r1 = "320x50_mb";
        r13.a = r1;
        goto L_0x00c7;
    L_0x00a5:
        r1 = r1.d;
        r13.a = r1;
        goto L_0x00c7;
    L_0x00aa:
        r1 = new java.lang.StringBuilder;
        r2 = 26;
        r1.<init>(r2);
        r1.append(r9);
        r2 = "x";
        r1.append(r2);
        r1.append(r8);
        r2 = "_as";
        r1.append(r2);
        r1 = r1.toString();
        r13.a = r1;
    L_0x00c7:
        r1 = r15.length;
        if (r1 <= r3) goto L_0x00e4;
    L_0x00ca:
        r1 = new defpackage.rkz[r1];
        r13.h = r1;
        r1 = 0;
    L_0x00cf:
        r2 = r15.length;
        if (r1 >= r2) goto L_0x00e7;
    L_0x00d2:
        r2 = r13.h;
        r4 = new rkz;
        r5 = r15[r1];
        r6 = new defpackage.pbi[r3];
        r6[r0] = r5;
        r4.<init>(r14, r6);
        r2[r1] = r4;
        r1 = r1 + 1;
        goto L_0x00cf;
    L_0x00e4:
        r14 = 0;
        r13.h = r14;
    L_0x00e7:
        r13.i = r0;
        r13.d = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rkz.<init>(android.content.Context, pbi[]):void");
    }

    public rkz(String str, int i, int i2, boolean z, int i3, int i4, rkz[] rkzArr, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = i;
        this.e = i2;
        this.f = z;
        this.c = i3;
        this.g = i4;
        this.h = rkzArr;
        this.i = z2;
        this.j = z3;
        this.d = z4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = qov.a(parcel);
        qov.a(parcel, 2, this.a);
        qov.b(parcel, 3, this.b);
        qov.b(parcel, 4, this.e);
        qov.a(parcel, 5, this.f);
        qov.b(parcel, 6, this.c);
        qov.b(parcel, 7, this.g);
        qov.a(parcel, 8, this.h, i);
        qov.a(parcel, 9, this.i);
        qov.a(parcel, 10, this.j);
        qov.a(parcel, 11, this.d);
        qov.a(parcel, a);
    }
}
