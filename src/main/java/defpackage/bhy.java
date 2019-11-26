package defpackage;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: bhy */
public class bhy extends bgx {
    private static final String[] t = new String[]{"android:visibility:visibility", "android:visibility:parent"};
    public int a = 3;

    public Animator a(View view, bhn bhn) {
        return null;
    }

    public Animator b(View view, bhn bhn) {
        throw null;
    }

    public final String[] a() {
        return t;
    }

    public static void d(bhn bhn) {
        String str = "android:visibility:visibility";
        bhn.a.put(str, Integer.valueOf(bhn.b.getVisibility()));
        bhn.a.put("android:visibility:parent", bhn.b.getParent());
        int[] iArr = new int[2];
        bhn.b.getLocationOnScreen(iArr);
        bhn.a.put("android:visibility:screenLocation", iArr);
    }

    public void a(bhn bhn) {
        bhy.d(bhn);
    }

    public final void b(bhn bhn) {
        bhy.d(bhn);
    }

    private static bid b(bhn bhn, bhn bhn2) {
        bid bid = new bid();
        bid.a = false;
        bid.b = false;
        String str = "android:visibility:parent";
        String str2 = "android:visibility:visibility";
        if (bhn == null || !bhn.a.containsKey(str2)) {
            bid.c = -1;
            bid.e = null;
        } else {
            bid.c = ((Integer) bhn.a.get(str2)).intValue();
            bid.e = (ViewGroup) bhn.a.get(str);
        }
        if (bhn2 == null || !bhn2.a.containsKey(str2)) {
            bid.d = -1;
            bid.f = null;
        } else {
            bid.d = ((Integer) bhn2.a.get(str2)).intValue();
            bid.f = (ViewGroup) bhn2.a.get(str);
        }
        if (bhn != null && bhn2 != null) {
            int i = bid.c;
            int i2 = bid.d;
            if (i == i2 && bid.e == bid.f) {
                return bid;
            }
            if (i == i2) {
                if (bid.f == null) {
                    bid.b = false;
                    bid.a = true;
                } else if (bid.e == null) {
                    bid.b = true;
                    bid.a = true;
                }
            } else if (i == 0) {
                bid.b = false;
                bid.a = true;
            } else if (i2 == 0) {
                bid.b = true;
                bid.a = true;
            }
        } else if (bhn == null && bid.d == 0) {
            bid.b = true;
            bid.a = true;
        } else if (bhn2 == null && bid.c == 0) {
            bid.b = false;
            bid.a = true;
        }
        return bid;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARNING: Missing block: B:63:0x012a, code skipped:
            if (defpackage.bhy.b(b(r12, false), a(r12, false)).a == false) goto L_0x012c;
     */
    public final android.animation.Animator a(android.view.ViewGroup r12, defpackage.bhn r13, defpackage.bhn r14) {
        /*
        r11 = this;
        r0 = defpackage.bhy.b(r13, r14);
        r1 = r0.a;
        r2 = 0;
        if (r1 == 0) goto L_0x0133;
    L_0x0009:
        r1 = r0.e;
        if (r1 != 0) goto L_0x0011;
    L_0x000d:
        r1 = r0.f;
        if (r1 == 0) goto L_0x0133;
    L_0x0011:
        r1 = r0.b;
        r3 = 1;
        r4 = 0;
        if (r1 != 0) goto L_0x010b;
    L_0x0017:
        r0 = r0.d;
        r1 = r11.a;
        r5 = 2;
        r1 = r1 & r5;
        if (r1 == r5) goto L_0x0021;
    L_0x001f:
        goto L_0x010a;
    L_0x0021:
        if (r13 != 0) goto L_0x0025;
    L_0x0023:
        goto L_0x010a;
    L_0x0025:
        r1 = r13.b;
        if (r14 == 0) goto L_0x002c;
    L_0x0029:
        r14 = r14.b;
        goto L_0x002d;
    L_0x002c:
        r14 = r2;
    L_0x002d:
        r6 = 2131755155; // 0x7f100093 float:1.9141181E38 double:1.0532269874E-314;
        r7 = r1.getTag(r6);
        r7 = (android.view.View) r7;
        if (r7 == 0) goto L_0x003c;
    L_0x0038:
        r8 = r2;
        r14 = 1;
        goto L_0x0099;
    L_0x003c:
        if (r14 != 0) goto L_0x003f;
    L_0x003e:
        goto L_0x004e;
    L_0x003f:
        r7 = r14.getParent();
        if (r7 == 0) goto L_0x004e;
    L_0x0045:
        r7 = 4;
        if (r0 != r7) goto L_0x004b;
    L_0x0048:
        r8 = r14;
        r7 = r2;
        goto L_0x0056;
    L_0x004b:
        if (r1 == r14) goto L_0x0048;
    L_0x004d:
        goto L_0x0050;
    L_0x004e:
        if (r14 != 0) goto L_0x0054;
    L_0x0050:
        r7 = r2;
        r8 = r7;
        r14 = 1;
        goto L_0x0057;
    L_0x0054:
        r7 = r14;
        r8 = r2;
    L_0x0056:
        r14 = 0;
    L_0x0057:
        if (r14 != 0) goto L_0x005b;
    L_0x0059:
        r14 = 0;
        goto L_0x0099;
    L_0x005b:
        r14 = r1.getParent();
        if (r14 == 0) goto L_0x0097;
    L_0x0061:
        r14 = r1.getParent();
        r14 = r14 instanceof android.view.View;
        if (r14 == 0) goto L_0x0059;
    L_0x0069:
        r14 = r1.getParent();
        r14 = (android.view.View) r14;
        r9 = r11.a(r14, r3);
        r10 = r11.b(r14, r3);
        r9 = defpackage.bhy.b(r9, r10);
        r9 = r9.a;
        if (r9 != 0) goto L_0x0085;
    L_0x007f:
        r14 = defpackage.bhk.a(r12, r1, r14);
        r7 = r14;
        goto L_0x0059;
    L_0x0085:
        r9 = r14.getId();
        r14 = r14.getParent();
        if (r14 != 0) goto L_0x0059;
    L_0x008f:
        r14 = -1;
        if (r9 == r14) goto L_0x0059;
    L_0x0092:
        r14 = r12.findViewById(r9);
        goto L_0x0059;
    L_0x0097:
        r7 = r1;
        goto L_0x0059;
    L_0x0099:
        if (r7 == 0) goto L_0x00e9;
    L_0x009b:
        if (r14 != 0) goto L_0x00cd;
    L_0x009d:
        r0 = r13.a;
        r2 = "android:visibility:screenLocation";
        r0 = r0.get(r2);
        r0 = (int[]) r0;
        r2 = r0[r4];
        r0 = r0[r3];
        r5 = new int[r5];
        r12.getLocationOnScreen(r5);
        r4 = r5[r4];
        r2 = r2 - r4;
        r4 = r7.getLeft();
        r2 = r2 - r4;
        r7.offsetLeftAndRight(r2);
        r2 = r5[r3];
        r0 = r0 - r2;
        r2 = r7.getTop();
        r0 = r0 - r2;
        r7.offsetTopAndBottom(r0);
        r0 = defpackage.bhr.a(r12);
        r0.a(r7);
    L_0x00cd:
        r2 = r11.b(r7, r13);
        if (r14 != 0) goto L_0x010a;
    L_0x00d3:
        if (r2 != 0) goto L_0x00dd;
    L_0x00d5:
        r12 = defpackage.bhr.a(r12);
        r12.b(r7);
        goto L_0x010a;
    L_0x00dd:
        r1.setTag(r6, r7);
        r13 = new bib;
        r13.<init>(r11, r12, r7, r1);
        r11.a(r13);
        goto L_0x010a;
    L_0x00e9:
        if (r8 == 0) goto L_0x010a;
    L_0x00eb:
        r12 = r8.getVisibility();
        defpackage.bht.a(r8, r4);
        r2 = r11.b(r8, r13);
        if (r2 == 0) goto L_0x0107;
    L_0x00f8:
        r12 = new bia;
        r12.<init>(r8, r0);
        r2.addListener(r12);
        r2.addPauseListener(r12);
        r11.a(r12);
        goto L_0x010a;
    L_0x0107:
        defpackage.bht.a(r8, r12);
    L_0x010a:
        return r2;
    L_0x010b:
        r12 = r11.a;
        r12 = r12 & r3;
        if (r12 != r3) goto L_0x0133;
    L_0x0110:
        if (r14 == 0) goto L_0x0133;
    L_0x0112:
        if (r13 != 0) goto L_0x012c;
    L_0x0114:
        r12 = r14.b;
        r12 = r12.getParent();
        r12 = (android.view.View) r12;
        r0 = r11.b(r12, r4);
        r12 = r11.a(r12, r4);
        r12 = defpackage.bhy.b(r0, r12);
        r12 = r12.a;
        if (r12 != 0) goto L_0x0133;
    L_0x012c:
        r12 = r14.b;
        r12 = r11.a(r12, r13);
        return r12;
    L_0x0133:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bhy.a(android.view.ViewGroup, bhn, bhn):android.animation.Animator");
    }

    public final boolean a(bhn bhn, bhn bhn2) {
        boolean z = false;
        if (bhn == null && bhn2 == null) {
            return false;
        }
        if (!(bhn == null || bhn2 == null)) {
            String str = "android:visibility:visibility";
            if (bhn2.a.containsKey(str) != bhn.a.containsKey(str)) {
                return false;
            }
        }
        bid b = bhy.b(bhn, bhn2);
        if (b.a) {
            if (b.c != 0) {
                return b.d != 0 ? z : true;
            } else {
                z = true;
            }
        }
    }
}
