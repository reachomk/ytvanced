package defpackage;

import android.graphics.Typeface;
import android.text.Layout;

/* renamed from: clf */
public final class clf {
    private static final zq h = new zq(100);
    public int a = 0;
    public int b = 2;
    public int c = Integer.MAX_VALUE;
    public int d = 2;
    public final cli e = new cli();
    public Layout f = null;
    public boolean g = true;

    public final clf a(Typeface typeface) {
        if (this.e.a.getTypeface() != typeface) {
            this.e.a();
            this.e.a.setTypeface(typeface);
            this.f = null;
        }
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x024b A:{Catch:{ IndexOutOfBoundsException -> 0x028c }} */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02cd  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00fe A:{LOOP_START, SYNTHETIC, PHI: r3 r6 r12 r15 , Splitter:B:50:0x00fe, LOOP:0: B:50:0x00fe->B:126:0x02ab} */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0058 A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0061 A:{SYNTHETIC, Splitter:B:23:0x0061} */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00fe A:{LOOP_START, SYNTHETIC, PHI: r3 r6 r12 r15 , Splitter:B:50:0x00fe, LOOP:0: B:50:0x00fe->B:126:0x02ab} */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02cd  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x02cc A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02ab A:{LOOP_END, LOOP:0: B:50:0x00fe->B:126:0x02ab} */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02ab A:{LOOP_END, LOOP:0: B:50:0x00fe->B:126:0x02ab} */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x02cc A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x02cc A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02ab A:{LOOP_END, LOOP:0: B:50:0x00fe->B:126:0x02ab} */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02ab A:{LOOP_END, LOOP:0: B:50:0x00fe->B:126:0x02ab} */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x02cc A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x02cc A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02ab A:{LOOP_END, LOOP:0: B:50:0x00fe->B:126:0x02ab} */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02ab A:{LOOP_END, LOOP:0: B:50:0x00fe->B:126:0x02ab} */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x02cc A:{SYNTHETIC} */
    public final android.text.Layout a() {
        /*
        r30 = this;
        r1 = r30;
        r0 = r1.g;
        if (r0 == 0) goto L_0x000c;
    L_0x0006:
        r0 = r1.f;
        if (r0 != 0) goto L_0x000b;
    L_0x000a:
        goto L_0x000c;
    L_0x000b:
        return r0;
    L_0x000c:
        r0 = r1.e;
        r0 = r0.h;
        r0 = android.text.TextUtils.isEmpty(r0);
        r2 = 0;
        if (r0 != 0) goto L_0x030f;
    L_0x0017:
        r0 = r1.g;
        r3 = -1;
        r4 = 1;
        r5 = 0;
        if (r0 == 0) goto L_0x003b;
    L_0x001e:
        r0 = r1.e;
        r0 = r0.h;
        r6 = r0 instanceof android.text.Spannable;
        if (r6 == 0) goto L_0x003b;
    L_0x0026:
        r6 = r0;
        r6 = (android.text.Spannable) r6;
        r0 = r0.length();
        r0 = r0 + r3;
        r7 = android.text.style.ClickableSpan.class;
        r0 = r6.getSpans(r5, r0, r7);
        r0 = (android.text.style.ClickableSpan[]) r0;
        r0 = r0.length;
        if (r0 <= 0) goto L_0x003b;
    L_0x0039:
        r6 = 1;
        goto L_0x003c;
    L_0x003b:
        r6 = 0;
    L_0x003c:
        r0 = r1.g;
        if (r0 != 0) goto L_0x0041;
    L_0x0040:
        goto L_0x0059;
    L_0x0041:
        if (r6 != 0) goto L_0x0059;
    L_0x0043:
        r0 = r1.e;
        r3 = r0.hashCode();
        r0 = h;
        r7 = java.lang.Integer.valueOf(r3);
        r0 = r0.a(r7);
        r0 = (android.text.Layout) r0;
        if (r0 != 0) goto L_0x0058;
    L_0x0057:
        goto L_0x0059;
    L_0x0058:
        return r0;
    L_0x0059:
        r0 = r1.e;
        r15 = r0.p;
        r14 = 23;
        if (r15 != r4) goto L_0x0073;
    L_0x0061:
        r7 = r0.h;	 Catch:{ NullPointerException -> 0x006c }
        r0 = r0.a;	 Catch:{ NullPointerException -> 0x006c }
        r0 = android.text.BoringLayout.isBoring(r7, r0);	 Catch:{ NullPointerException -> 0x006c }
        r22 = r0;
        goto L_0x0075;
    L_0x006c:
        r0 = move-exception;
        r7 = android.os.Build.VERSION.SDK_INT;
        if (r7 >= r14) goto L_0x0072;
    L_0x0071:
        goto L_0x0073;
    L_0x0072:
        throw r0;
    L_0x0073:
        r22 = r2;
    L_0x0075:
        r0 = r1.e;
        r7 = r0.g;
        r13 = 2;
        if (r7 == 0) goto L_0x00b3;
    L_0x007c:
        if (r7 == r4) goto L_0x00b0;
    L_0x007e:
        if (r7 != r13) goto L_0x0097;
    L_0x0080:
        r7 = r0.h;
        r0 = r0.a;
        r0 = android.text.Layout.getDesiredWidth(r7, r0);
        r7 = (double) r0;
        r7 = java.lang.Math.ceil(r7);
        r0 = (int) r7;
        r7 = r1.e;
        r7 = r7.f;
        r0 = java.lang.Math.min(r0, r7);
        goto L_0x00c1;
    L_0x0097:
        r0 = new java.lang.IllegalStateException;
        r2 = new java.lang.StringBuilder;
        r3 = 35;
        r2.<init>(r3);
        r3 = "Unexpected measure mode ";
        r2.append(r3);
        r2.append(r7);
        r2 = r2.toString();
        r0.<init>(r2);
        throw r0;
    L_0x00b0:
        r0 = r0.f;
        goto L_0x00c1;
    L_0x00b3:
        r7 = r0.h;
        r0 = r0.a;
        r0 = android.text.Layout.getDesiredWidth(r7, r0);
        r7 = (double) r0;
        r7 = java.lang.Math.ceil(r7);
        r0 = (int) r7;
    L_0x00c1:
        r7 = r1.e;
        r8 = r7.a;
        r8 = r8.getFontMetricsInt(r2);
        r8 = (float) r8;
        r9 = r7.j;
        r8 = r8 * r9;
        r7 = r7.k;
        r8 = r8 + r7;
        r7 = java.lang.Math.round(r8);
        r8 = r1.d;
        if (r8 != r4) goto L_0x00e2;
    L_0x00d9:
        r8 = r1.c;
        r8 = r8 * r7;
        r0 = java.lang.Math.min(r0, r8);
        goto L_0x00e8;
    L_0x00e2:
        r8 = r1.c;
        r0 = java.lang.Math.min(r0, r8);
    L_0x00e8:
        r8 = r1.b;
        if (r8 != r4) goto L_0x00f5;
    L_0x00ec:
        r8 = r1.a;
        r8 = r8 * r7;
        r0 = java.lang.Math.max(r0, r8);
        goto L_0x00fb;
    L_0x00f5:
        r7 = r1.a;
        r0 = java.lang.Math.max(r0, r7);
    L_0x00fb:
        r12 = r0;
        if (r22 != 0) goto L_0x02cd;
    L_0x00fe:
        r0 = r1.e;	 Catch:{ IndexOutOfBoundsException -> 0x0295 }
        r0 = r0.h;	 Catch:{ IndexOutOfBoundsException -> 0x0295 }
        r11 = r0.length();	 Catch:{ IndexOutOfBoundsException -> 0x0295 }
        r7 = r1.e;	 Catch:{ IndexOutOfBoundsException -> 0x0295 }
        r10 = r7.a;	 Catch:{ IndexOutOfBoundsException -> 0x0295 }
        r9 = r7.q;	 Catch:{ IndexOutOfBoundsException -> 0x0295 }
        r8 = r7.j;	 Catch:{ IndexOutOfBoundsException -> 0x0295 }
        r4 = r7.k;	 Catch:{ IndexOutOfBoundsException -> 0x0295 }
        r2 = r7.m;	 Catch:{ IndexOutOfBoundsException -> 0x0295 }
        r5 = r7.n;	 Catch:{ IndexOutOfBoundsException -> 0x0295 }
        r14 = r7.r;	 Catch:{ IndexOutOfBoundsException -> 0x0295 }
        r7 = r7.s;	 Catch:{ IndexOutOfBoundsException -> 0x0295 }
        r13 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IndexOutOfBoundsException -> 0x0295 }
        r26 = r3;
        r3 = 23;
        if (r13 < r3) goto L_0x0170;
    L_0x0120:
        r13 = 0;
        r0 = android.text.StaticLayout.Builder.obtain(r0, r13, r11, r10, r12);	 Catch:{ IndexOutOfBoundsException -> 0x0167 }
        r0 = r0.setAlignment(r9);	 Catch:{ IndexOutOfBoundsException -> 0x0164 }
        r0 = r0.setLineSpacing(r4, r8);	 Catch:{ IndexOutOfBoundsException -> 0x0164 }
        r0 = r0.setIncludePad(r2);	 Catch:{ IndexOutOfBoundsException -> 0x0164 }
        r0 = r0.setEllipsize(r5);	 Catch:{ IndexOutOfBoundsException -> 0x0164 }
        r0 = r0.setEllipsizedWidth(r12);	 Catch:{ IndexOutOfBoundsException -> 0x0164 }
        r0 = r0.setMaxLines(r15);	 Catch:{ IndexOutOfBoundsException -> 0x0164 }
        r2 = defpackage.clh.a(r14);	 Catch:{ IndexOutOfBoundsException -> 0x0164 }
        r0 = r0.setTextDirection(r2);	 Catch:{ IndexOutOfBoundsException -> 0x0164 }
        r0 = r0.setBreakStrategy(r7);	 Catch:{ IndexOutOfBoundsException -> 0x0164 }
        r2 = 0;
        r0 = r0.setHyphenationFrequency(r2);	 Catch:{ IndexOutOfBoundsException -> 0x0164 }
        r4 = 0;
        r0 = r0.setIndents(r4, r4);	 Catch:{ IndexOutOfBoundsException -> 0x0164 }
        r4 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IndexOutOfBoundsException -> 0x0164 }
        r5 = 26;
        if (r4 < r5) goto L_0x015c;
    L_0x0159:
        r0.setJustificationMode(r2);	 Catch:{ IndexOutOfBoundsException -> 0x0164 }
    L_0x015c:
        r0 = r0.build();	 Catch:{ IndexOutOfBoundsException -> 0x0164 }
        r29 = r6;
        goto L_0x02f7;
    L_0x0164:
        r0 = move-exception;
        goto L_0x0298;
    L_0x0167:
        r0 = move-exception;
        r29 = r6;
        r25 = r12;
        r24 = r15;
        goto L_0x029f;
    L_0x0170:
        r7 = r0;
        r21 = r8;
        r8 = r11;
        r22 = r9;
        r9 = r10;
        r23 = r10;
        r10 = r12;
        r24 = r11;
        r11 = r22;
        r25 = r12;
        r12 = r21;
        r27 = 2;
        r13 = r4;
        r3 = r14;
        r28 = 23;
        r14 = r2;
        r29 = r15;
        r15 = r5;
        r16 = r25;
        r17 = r29;
        r18 = r3;
        r7 = defpackage.clg.a(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18);	 Catch:{ IndexOutOfBoundsException -> 0x028e }
        r15 = r29;
        if (r15 <= 0) goto L_0x0239;
    L_0x019a:
        r8 = r24;
    L_0x019c:
        r9 = r7.getLineCount();	 Catch:{ IndexOutOfBoundsException -> 0x0231 }
        if (r9 <= r15) goto L_0x0239;
    L_0x01a2:
        r9 = r7.getLineStart(r15);	 Catch:{ IndexOutOfBoundsException -> 0x0231 }
        if (r9 < r8) goto L_0x01aa;
    L_0x01a8:
        goto L_0x0239;
    L_0x01aa:
        r14 = r9;
    L_0x01ab:
        if (r14 <= 0) goto L_0x01bc;
    L_0x01ad:
        r7 = r14 + -1;
        r8 = r0.charAt(r7);	 Catch:{ IndexOutOfBoundsException -> 0x0231 }
        r8 = java.lang.Character.isSpace(r8);	 Catch:{ IndexOutOfBoundsException -> 0x0231 }
        if (r8 != 0) goto L_0x01ba;
    L_0x01b9:
        goto L_0x01bc;
    L_0x01ba:
        r14 = r7;
        goto L_0x01ab;
    L_0x01bc:
        r7 = r0;
        r8 = r14;
        r9 = r23;
        r10 = r25;
        r11 = r22;
        r12 = r21;
        r13 = r4;
        r29 = r6;
        r6 = r14;
        r14 = r2;
        r24 = r15;
        r15 = r5;
        r16 = r25;
        r17 = r24;
        r18 = r3;
        r7 = defpackage.clg.a(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18);	 Catch:{ IndexOutOfBoundsException -> 0x022f }
        r8 = r7.getLineCount();	 Catch:{ IndexOutOfBoundsException -> 0x022f }
        r15 = r24;
        if (r8 < r15) goto L_0x0226;
    L_0x01e0:
        r8 = r15 + -1;
        r8 = r7.getEllipsisCount(r8);	 Catch:{ IndexOutOfBoundsException -> 0x0224 }
        if (r8 != 0) goto L_0x0226;
    L_0x01e8:
        r8 = 0;
        r7 = r0.subSequence(r8, r6);	 Catch:{ IndexOutOfBoundsException -> 0x0224 }
        r7 = java.lang.String.valueOf(r7);	 Catch:{ IndexOutOfBoundsException -> 0x0224 }
        r8 = r7.length();	 Catch:{ IndexOutOfBoundsException -> 0x0224 }
        r8 = r8 + 2;
        r9 = new java.lang.StringBuilder;	 Catch:{ IndexOutOfBoundsException -> 0x0224 }
        r9.<init>(r8);	 Catch:{ IndexOutOfBoundsException -> 0x0224 }
        r9.append(r7);	 Catch:{ IndexOutOfBoundsException -> 0x0224 }
        r7 = " …";
        r9.append(r7);	 Catch:{ IndexOutOfBoundsException -> 0x0224 }
        r7 = r9.toString();	 Catch:{ IndexOutOfBoundsException -> 0x0224 }
        r8 = r7.length();	 Catch:{ IndexOutOfBoundsException -> 0x0224 }
        r9 = r23;
        r10 = r25;
        r11 = r22;
        r12 = r21;
        r13 = r4;
        r14 = r2;
        r24 = r15;
        r15 = r5;
        r16 = r25;
        r17 = r24;
        r18 = r3;
        r7 = defpackage.clg.a(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18);	 Catch:{ IndexOutOfBoundsException -> 0x022f }
        goto L_0x0228;
    L_0x0224:
        r0 = move-exception;
        goto L_0x0234;
    L_0x0226:
        r24 = r15;
    L_0x0228:
        r8 = r6;
        r15 = r24;
        r6 = r29;
        goto L_0x019c;
    L_0x022f:
        r0 = move-exception;
        goto L_0x0236;
    L_0x0231:
        r0 = move-exception;
        r29 = r6;
    L_0x0234:
        r24 = r15;
    L_0x0236:
        r13 = 0;
        goto L_0x02a3;
    L_0x0239:
        r29 = r6;
        r24 = r15;
        r0 = r7;
        r13 = 0;
    L_0x023f:
        r2 = r0.getLineStart(r13);	 Catch:{ IndexOutOfBoundsException -> 0x028c }
        r3 = r0.getLineCount();	 Catch:{ IndexOutOfBoundsException -> 0x028c }
        r4 = r2;
        r2 = 0;
    L_0x0249:
        if (r2 >= r3) goto L_0x02f7;
    L_0x024b:
        r5 = r0.getLineEnd(r2);	 Catch:{ IndexOutOfBoundsException -> 0x028c }
        if (r5 < r4) goto L_0x0255;
    L_0x0251:
        r2 = r2 + 1;
        r4 = r5;
        goto L_0x0249;
    L_0x0255:
        r3 = android.text.StaticLayout.class;
        r4 = "mLines";
        r3 = r3.getDeclaredField(r4);	 Catch:{ Exception -> 0x0289 }
        r4 = 1;
        r3.setAccessible(r4);	 Catch:{ Exception -> 0x0289 }
        r5 = android.text.StaticLayout.class;
        r6 = "mColumns";
        r5 = r5.getDeclaredField(r6);	 Catch:{ Exception -> 0x0289 }
        r5.setAccessible(r4);	 Catch:{ Exception -> 0x0289 }
        r3 = r3.get(r0);	 Catch:{ Exception -> 0x0289 }
        r3 = (int[]) r3;	 Catch:{ Exception -> 0x0289 }
        r4 = r5.getInt(r0);	 Catch:{ Exception -> 0x0289 }
        r5 = 0;
    L_0x0277:
        if (r5 >= r4) goto L_0x023f;
    L_0x0279:
        r6 = r4 * r2;
        r6 = r6 + r5;
        r7 = r6 + r4;
        r8 = r3[r6];	 Catch:{ Exception -> 0x0289 }
        r9 = r3[r7];	 Catch:{ Exception -> 0x0289 }
        r3[r6] = r9;	 Catch:{ Exception -> 0x0289 }
        r3[r7] = r8;	 Catch:{ Exception -> 0x0289 }
        r5 = r5 + 1;
        goto L_0x0277;
        goto L_0x02f7;
    L_0x028c:
        r0 = move-exception;
        goto L_0x02a3;
    L_0x028e:
        r0 = move-exception;
        r24 = r29;
        r13 = 0;
        r29 = r6;
        goto L_0x02a3;
    L_0x0295:
        r0 = move-exception;
        r26 = r3;
    L_0x0298:
        r29 = r6;
        r25 = r12;
        r24 = r15;
        r13 = 0;
    L_0x029f:
        r27 = 2;
        r28 = 23;
    L_0x02a3:
        r2 = r1.e;
        r2 = r2.h;
        r2 = r2 instanceof java.lang.String;
        if (r2 != 0) goto L_0x02cc;
    L_0x02ab:
        r2 = "TextLayoutBuilder";
        r3 = "Hit bug #35412, retrying with Spannables removed";
        android.util.Log.e(r2, r3, r0);
        r0 = r1.e;
        r2 = r0.h;
        r2 = r2.toString();
        r0.h = r2;
        r15 = r24;
        r12 = r25;
        r3 = r26;
        r6 = r29;
        r2 = 0;
        r4 = 1;
        r5 = 0;
        r13 = 2;
        r14 = 23;
        goto L_0x00fe;
    L_0x02cc:
        throw r0;
    L_0x02cd:
        r26 = r3;
        r29 = r6;
        r25 = r12;
        r0 = r1.e;
        r2 = r0.h;
        r3 = r0.a;
        r4 = r0.q;
        r5 = r0.j;
        r6 = r0.k;
        r7 = r0.m;
        r0 = r0.n;
        r16 = r2;
        r17 = r3;
        r18 = r25;
        r19 = r4;
        r20 = r5;
        r21 = r6;
        r23 = r7;
        r24 = r0;
        r0 = android.text.BoringLayout.make(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25);
    L_0x02f7:
        r2 = r1.g;
        if (r2 != 0) goto L_0x02fc;
    L_0x02fb:
        goto L_0x0309;
    L_0x02fc:
        if (r29 != 0) goto L_0x0309;
    L_0x02fe:
        r1.f = r0;
        r2 = h;
        r3 = java.lang.Integer.valueOf(r26);
        r2.a(r3, r0);
    L_0x0309:
        r2 = r1.e;
        r3 = 1;
        r2.v = r3;
        return r0;
    L_0x030f:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clf.a():android.text.Layout");
    }
}
