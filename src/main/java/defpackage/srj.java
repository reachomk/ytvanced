package defpackage;

import com.facebook.yoga.YogaAlign;

/* renamed from: srj */
final class srj implements sxm {
    private static final amur a = amur.e().b(Integer.valueOf(1), YogaAlign.AUTO).b(Integer.valueOf(2), YogaAlign.FLEX_START).b(Integer.valueOf(3), YogaAlign.FLEX_END).b(Integer.valueOf(4), YogaAlign.CENTER).b(Integer.valueOf(5), YogaAlign.STRETCH).b();

    srj() {
    }

    public final aobz a() {
        return bdhp.a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:113:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x016e  */
    public final /* synthetic */ void a(defpackage.cmg r10, java.lang.Object r11, defpackage.swn r12) {
        /*
        r9 = this;
        r11 = (defpackage.bdhp) r11;
        r10 = r12.a();
        r12 = r11.s;
        r0 = 0;
        r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1));
        if (r0 == 0) goto L_0x0010;
    L_0x000d:
        r10.q(r12);
    L_0x0010:
        r12 = r11.p;
        r0 = 1120403456; // 0x42c80000 float:100.0 double:5.53552857E-315;
        r1 = 1;
        r2 = 2;
        if (r12 == 0) goto L_0x002e;
    L_0x0018:
        r3 = r12.b;
        if (r3 == 0) goto L_0x0029;
    L_0x001c:
        if (r3 == r1) goto L_0x0029;
    L_0x001e:
        if (r3 == r2) goto L_0x0021;
    L_0x0020:
        goto L_0x002e;
    L_0x0021:
        r12 = r12.a;
        r12 = r12 * r0;
        r10.c(r12);
        goto L_0x002e;
    L_0x0029:
        r12 = r12.a;
        r10.d(r12);
    L_0x002e:
        r12 = r11.n;
        r10.a(r12);
        r12 = r11.o;
        r10.b(r12);
        r12 = r11.r;
        if (r12 == 0) goto L_0x0047;
    L_0x003c:
        if (r12 == r1) goto L_0x0047;
    L_0x003e:
        if (r12 == r2) goto L_0x0041;
    L_0x0040:
        goto L_0x004c;
    L_0x0041:
        r12 = com.facebook.yoga.YogaPositionType.ABSOLUTE;
        r10.a(r12);
        goto L_0x004c;
    L_0x0047:
        r12 = com.facebook.yoga.YogaPositionType.RELATIVE;
        r10.a(r12);
    L_0x004c:
        r12 = r11.d;
        if (r12 == 0) goto L_0x0066;
    L_0x0050:
        r3 = r12.b;
        if (r3 == 0) goto L_0x0061;
    L_0x0054:
        if (r3 == r1) goto L_0x0061;
    L_0x0056:
        if (r3 == r2) goto L_0x0059;
    L_0x0058:
        goto L_0x0066;
    L_0x0059:
        r12 = r12.a;
        r12 = r12 * r0;
        r10.e(r12);
        goto L_0x0066;
    L_0x0061:
        r12 = r12.a;
        r10.f(r12);
    L_0x0066:
        r12 = r11.c;
        if (r12 == 0) goto L_0x0080;
    L_0x006a:
        r3 = r12.b;
        if (r3 == 0) goto L_0x007b;
    L_0x006e:
        if (r3 == r1) goto L_0x007b;
    L_0x0070:
        if (r3 == r2) goto L_0x0073;
    L_0x0072:
        goto L_0x0080;
    L_0x0073:
        r12 = r12.a;
        r12 = r12 * r0;
        r10.k(r12);
        goto L_0x0080;
    L_0x007b:
        r12 = r12.a;
        r10.l(r12);
    L_0x0080:
        r12 = r11.g;
        if (r12 == 0) goto L_0x009a;
    L_0x0084:
        r3 = r12.b;
        if (r3 == 0) goto L_0x0095;
    L_0x0088:
        if (r3 == r1) goto L_0x0095;
    L_0x008a:
        if (r3 == r2) goto L_0x008d;
    L_0x008c:
        goto L_0x009a;
    L_0x008d:
        r12 = r12.a;
        r12 = r12 * r0;
        r10.i(r12);
        goto L_0x009a;
    L_0x0095:
        r12 = r12.a;
        r10.j(r12);
    L_0x009a:
        r12 = r11.h;
        if (r12 == 0) goto L_0x00b4;
    L_0x009e:
        r3 = r12.b;
        if (r3 == 0) goto L_0x00af;
    L_0x00a2:
        if (r3 == r1) goto L_0x00af;
    L_0x00a4:
        if (r3 == r2) goto L_0x00a7;
    L_0x00a6:
        goto L_0x00b4;
    L_0x00a7:
        r12 = r12.a;
        r12 = r12 * r0;
        r10.o(r12);
        goto L_0x00b4;
    L_0x00af:
        r12 = r12.a;
        r10.p(r12);
    L_0x00b4:
        r12 = r11.f;
        if (r12 == 0) goto L_0x00c9;
    L_0x00b8:
        r3 = r12.b;
        if (r3 == r2) goto L_0x00c2;
    L_0x00bc:
        r12 = r12.a;
        r10.n(r12);
        goto L_0x00c9;
    L_0x00c2:
        r12 = r12.a;
        r12 = r12 * r0;
        r10.m(r12);
    L_0x00c9:
        r12 = r11.e;
        if (r12 == 0) goto L_0x00de;
    L_0x00cd:
        r3 = r12.b;
        if (r3 == r2) goto L_0x00d7;
    L_0x00d1:
        r12 = r12.a;
        r10.h(r12);
        goto L_0x00de;
    L_0x00d7:
        r12 = r12.a;
        r12 = r12 * r0;
        r10.g(r12);
    L_0x00de:
        r12 = r11.i;
        if (r12 == 0) goto L_0x00ea;
    L_0x00e2:
        r0 = new srm;
        r0.<init>(r10);
        defpackage.syo.a(r12, r0);
    L_0x00ea:
        r12 = r11.b;
        if (r12 == 0) goto L_0x00f6;
    L_0x00ee:
        r0 = new srl;
        r0.<init>(r10);
        defpackage.syo.a(r12, r0);
    L_0x00f6:
        r12 = r11.q;
        if (r12 == 0) goto L_0x010b;
    L_0x00fa:
        r12 = a;
        r0 = r11.q;
        r0 = java.lang.Integer.valueOf(r0);
        r12 = r12.get(r0);
        r12 = (com.facebook.yoga.YogaAlign) r12;
        r10.b(r12);
    L_0x010b:
        r12 = r10 instanceof defpackage.snd;
        r0 = 4;
        r3 = 3;
        r4 = 0;
        if (r12 != 0) goto L_0x0116;
    L_0x0112:
        r5 = r10 instanceof defpackage.spk;
        if (r5 == 0) goto L_0x019a;
    L_0x0116:
        r5 = r11.m;
        if (r5 == 0) goto L_0x0129;
    L_0x011a:
        r5 = a;
        r6 = r11.m;
        r6 = java.lang.Integer.valueOf(r6);
        r5 = r5.get(r6);
        r5 = (com.facebook.yoga.YogaAlign) r5;
        goto L_0x012a;
    L_0x0129:
        r5 = r4;
    L_0x012a:
        r6 = r11.j;
        if (r6 == 0) goto L_0x0136;
    L_0x012e:
        r7 = new sro;
        r7.<init>(r10);
        defpackage.syo.a(r6, r7);
    L_0x0136:
        r6 = r11.t;
        if (r6 != 0) goto L_0x013c;
    L_0x013a:
        r6 = r4;
        goto L_0x014d;
    L_0x013c:
        if (r6 == 0) goto L_0x013a;
    L_0x013e:
        if (r6 == r1) goto L_0x014b;
    L_0x0140:
        if (r6 == r2) goto L_0x0148;
    L_0x0142:
        if (r6 == r3) goto L_0x0145;
    L_0x0144:
        goto L_0x013a;
    L_0x0145:
        r6 = com.facebook.yoga.YogaWrap.WRAP_REVERSE;
        goto L_0x014d;
    L_0x0148:
        r6 = com.facebook.yoga.YogaWrap.WRAP;
        goto L_0x014d;
    L_0x014b:
        r6 = com.facebook.yoga.YogaWrap.NO_WRAP;
    L_0x014d:
        r7 = r11.l;
        if (r7 == 0) goto L_0x016a;
    L_0x0151:
        if (r7 == r1) goto L_0x016a;
    L_0x0153:
        if (r7 == r2) goto L_0x0167;
    L_0x0155:
        if (r7 == r3) goto L_0x0164;
    L_0x0157:
        if (r7 == r0) goto L_0x0161;
    L_0x0159:
        r8 = 5;
        if (r7 == r8) goto L_0x015e;
    L_0x015c:
        r7 = r4;
        goto L_0x016c;
    L_0x015e:
        r7 = com.facebook.yoga.YogaJustify.SPACE_AROUND;
        goto L_0x016c;
    L_0x0161:
        r7 = com.facebook.yoga.YogaJustify.SPACE_BETWEEN;
        goto L_0x016c;
    L_0x0164:
        r7 = com.facebook.yoga.YogaJustify.CENTER;
        goto L_0x016c;
    L_0x0167:
        r7 = com.facebook.yoga.YogaJustify.FLEX_END;
        goto L_0x016c;
    L_0x016a:
        r7 = com.facebook.yoga.YogaJustify.FLEX_START;
    L_0x016c:
        if (r12 == 0) goto L_0x0181;
    L_0x016e:
        r12 = r10;
        r12 = (defpackage.snd) r12;
        if (r5 == 0) goto L_0x0176;
    L_0x0173:
        r12.a(r5);
    L_0x0176:
        if (r6 == 0) goto L_0x017b;
    L_0x0178:
        r12.a(r6);
    L_0x017b:
        if (r7 == 0) goto L_0x019a;
    L_0x017d:
        r12.a(r7);
        goto L_0x019a;
    L_0x0181:
        r12 = r10 instanceof defpackage.spk;
        if (r12 == 0) goto L_0x019a;
    L_0x0185:
        r12 = r10;
        r12 = (defpackage.spk) r12;
        if (r5 == 0) goto L_0x018e;
    L_0x018a:
        r8 = r12.a;
        r8.a = r5;
    L_0x018e:
        if (r6 == 0) goto L_0x0194;
    L_0x0190:
        r5 = r12.a;
        r5.v = r6;
    L_0x0194:
        if (r7 == 0) goto L_0x019a;
    L_0x0196:
        r12 = r12.a;
        r12.f = r7;
    L_0x019a:
        r11 = r11.u;
        r12 = r11 + -1;
        if (r11 == 0) goto L_0x01ba;
    L_0x01a0:
        if (r12 == r1) goto L_0x01b4;
    L_0x01a2:
        if (r12 == r2) goto L_0x01ae;
    L_0x01a4:
        if (r12 == r3) goto L_0x01b4;
    L_0x01a6:
        if (r12 == r0) goto L_0x01b4;
    L_0x01a8:
        r11 = com.facebook.yoga.YogaDirection.INHERIT;
        r10.a(r11);
        return;
    L_0x01ae:
        r11 = com.facebook.yoga.YogaDirection.RTL;
        r10.a(r11);
        return;
    L_0x01b4:
        r11 = com.facebook.yoga.YogaDirection.LTR;
        r10.a(r11);
        return;
    L_0x01ba:
        goto L_0x01bc;
    L_0x01bb:
        throw r4;
    L_0x01bc:
        goto L_0x01bb;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.srj.a(cmg, java.lang.Object, swn):void");
    }
}
