package defpackage;

import android.os.Bundle;
import android.view.inputmethod.EditorInfo;

/* renamed from: aws */
final class aws extends awt {
    public volatile axd a;
    public volatile axq b;

    aws(awq awq) {
        super(awq);
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        try {
            this.c.d.a(new awv(this));
        } catch (Throwable th) {
            this.c.a(th);
        }
    }

    public final boolean a(CharSequence charSequence) {
        axa axa;
        axd axd = this.a;
        axf axf = new axf(axd.a.c, axd.b, axd.c);
        int length = charSequence.length();
        int i = 0;
        while (true) {
            axa = null;
            if (i < length) {
                int codePointAt = Character.codePointAt(charSequence, i);
                if (axf.a(codePointAt) != 2) {
                    break;
                }
                i += Character.charCount(codePointAt);
            } else if (axf.c()) {
                axa = axf.b();
            }
        }
        if (axa != null) {
            return true;
        }
        return false;
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0033 A:{Catch:{ all -> 0x011b }} */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0114  */
    public final java.lang.CharSequence a(java.lang.CharSequence r11, int r12, int r13, int r14, boolean r15) {
        /*
        r10 = this;
        r0 = r10.a;
        r1 = r11 instanceof defpackage.ayk;
        if (r1 == 0) goto L_0x000c;
    L_0x0006:
        r2 = r11;
        r2 = (defpackage.ayk) r2;
        r2.b();
    L_0x000c:
        r2 = 0;
        if (r1 != 0) goto L_0x002d;
    L_0x000f:
        r3 = r11 instanceof android.text.Spannable;	 Catch:{ all -> 0x011b }
        if (r3 == 0) goto L_0x0014;
    L_0x0013:
        goto L_0x002d;
    L_0x0014:
        r3 = r11 instanceof android.text.Spanned;	 Catch:{ all -> 0x011b }
        if (r3 == 0) goto L_0x0030;
    L_0x0018:
        r3 = r11;
        r3 = (android.text.Spanned) r3;	 Catch:{ all -> 0x011b }
        r4 = r12 + -1;
        r5 = r13 + 1;
        r6 = defpackage.axe.class;
        r3 = r3.nextSpanTransition(r4, r5, r6);	 Catch:{ all -> 0x011b }
        if (r3 > r13) goto L_0x0030;
    L_0x0027:
        r2 = new android.text.SpannableString;	 Catch:{ all -> 0x011b }
        r2.<init>(r11);	 Catch:{ all -> 0x011b }
        goto L_0x0030;
    L_0x002d:
        r2 = r11;
        r2 = (android.text.Spannable) r2;	 Catch:{ all -> 0x011b }
    L_0x0030:
        r3 = 0;
        if (r2 == 0) goto L_0x005f;
    L_0x0033:
        r4 = defpackage.axe.class;
        r4 = r2.getSpans(r12, r13, r4);	 Catch:{ all -> 0x011b }
        r4 = (defpackage.axe[]) r4;	 Catch:{ all -> 0x011b }
        if (r4 == 0) goto L_0x005f;
    L_0x003d:
        r5 = r4.length;	 Catch:{ all -> 0x011b }
        if (r5 <= 0) goto L_0x005f;
    L_0x0040:
        r6 = r12;
        r12 = 0;
    L_0x0042:
        if (r12 >= r5) goto L_0x005e;
    L_0x0044:
        r7 = r4[r12];	 Catch:{ all -> 0x011b }
        r8 = r2.getSpanStart(r7);	 Catch:{ all -> 0x011b }
        r9 = r2.getSpanEnd(r7);	 Catch:{ all -> 0x011b }
        if (r8 == r13) goto L_0x0053;
    L_0x0050:
        r2.removeSpan(r7);	 Catch:{ all -> 0x011b }
    L_0x0053:
        r6 = java.lang.Math.min(r8, r6);	 Catch:{ all -> 0x011b }
        r13 = java.lang.Math.max(r9, r13);	 Catch:{ all -> 0x011b }
        r12 = r12 + 1;
        goto L_0x0042;
    L_0x005e:
        r12 = r6;
    L_0x005f:
        if (r12 == r13) goto L_0x0111;
    L_0x0061:
        r4 = r11.length();	 Catch:{ all -> 0x011b }
        if (r12 >= r4) goto L_0x0111;
    L_0x0067:
        r4 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        if (r14 != r4) goto L_0x006d;
    L_0x006c:
        goto L_0x007e;
    L_0x006d:
        if (r2 != 0) goto L_0x0070;
    L_0x006f:
        goto L_0x007e;
    L_0x0070:
        r4 = r2.length();	 Catch:{ all -> 0x011b }
        r5 = defpackage.axe.class;
        r4 = r2.getSpans(r3, r4, r5);	 Catch:{ all -> 0x011b }
        r4 = (defpackage.axe[]) r4;	 Catch:{ all -> 0x011b }
        r4 = r4.length;	 Catch:{ all -> 0x011b }
        r14 = r14 - r4;
    L_0x007e:
        r4 = new axf;	 Catch:{ all -> 0x011b }
        r5 = r0.a;	 Catch:{ all -> 0x011b }
        r5 = r5.c;	 Catch:{ all -> 0x011b }
        r6 = r0.b;	 Catch:{ all -> 0x011b }
        r7 = r0.c;	 Catch:{ all -> 0x011b }
        r4.<init>(r5, r6, r7);	 Catch:{ all -> 0x011b }
        r5 = java.lang.Character.codePointAt(r11, r12);	 Catch:{ all -> 0x011b }
    L_0x008f:
        r6 = r12;
    L_0x0090:
        if (r12 < r13) goto L_0x0093;
    L_0x0092:
        goto L_0x00e0;
    L_0x0093:
        if (r3 >= r14) goto L_0x00e0;
    L_0x0095:
        r7 = r4.a(r5);	 Catch:{ all -> 0x011b }
        r8 = 1;
        if (r7 == r8) goto L_0x00ce;
    L_0x009c:
        r8 = 2;
        if (r7 == r8) goto L_0x00c2;
    L_0x009f:
        r8 = 3;
        if (r7 == r8) goto L_0x00a3;
    L_0x00a2:
        goto L_0x0090;
    L_0x00a3:
        if (r15 == 0) goto L_0x00a6;
    L_0x00a5:
        goto L_0x00b1;
    L_0x00a6:
        r7 = r4.a();	 Catch:{ all -> 0x011b }
        r7 = r0.a(r11, r6, r12, r7);	 Catch:{ all -> 0x011b }
        if (r7 == 0) goto L_0x00b1;
    L_0x00b0:
        goto L_0x008f;
    L_0x00b1:
        if (r2 != 0) goto L_0x00b8;
    L_0x00b3:
        r2 = new android.text.SpannableString;	 Catch:{ all -> 0x011b }
        r2.<init>(r11);	 Catch:{ all -> 0x011b }
    L_0x00b8:
        r7 = r4.a();	 Catch:{ all -> 0x011b }
        defpackage.axd.a(r2, r7, r6, r12);	 Catch:{ all -> 0x011b }
        r3 = r3 + 1;
        goto L_0x008f;
    L_0x00c2:
        r7 = java.lang.Character.charCount(r5);	 Catch:{ all -> 0x011b }
        r12 = r12 + r7;
        if (r12 >= r13) goto L_0x0090;
    L_0x00c9:
        r5 = java.lang.Character.codePointAt(r11, r12);	 Catch:{ all -> 0x011b }
        goto L_0x0090;
    L_0x00ce:
        r12 = java.lang.Character.codePointAt(r11, r6);	 Catch:{ all -> 0x011b }
        r12 = java.lang.Character.charCount(r12);	 Catch:{ all -> 0x011b }
        r6 = r6 + r12;
        if (r6 >= r13) goto L_0x00de;
    L_0x00d9:
        r12 = java.lang.Character.codePointAt(r11, r6);	 Catch:{ all -> 0x011b }
        r5 = r12;
    L_0x00de:
        r12 = r6;
        goto L_0x0090;
    L_0x00e0:
        r13 = r4.c();	 Catch:{ all -> 0x011b }
        if (r13 != 0) goto L_0x00e7;
    L_0x00e6:
        goto L_0x0104;
    L_0x00e7:
        if (r3 >= r14) goto L_0x0104;
    L_0x00e9:
        if (r15 != 0) goto L_0x00f5;
    L_0x00eb:
        r13 = r4.b();	 Catch:{ all -> 0x011b }
        r13 = r0.a(r11, r6, r12, r13);	 Catch:{ all -> 0x011b }
        if (r13 != 0) goto L_0x0104;
    L_0x00f5:
        if (r2 != 0) goto L_0x00fd;
    L_0x00f7:
        r13 = new android.text.SpannableString;	 Catch:{ all -> 0x011b }
        r13.<init>(r11);	 Catch:{ all -> 0x011b }
        r2 = r13;
    L_0x00fd:
        r13 = r4.b();	 Catch:{ all -> 0x011b }
        defpackage.axd.a(r2, r13, r6, r12);	 Catch:{ all -> 0x011b }
    L_0x0104:
        if (r2 != 0) goto L_0x0107;
    L_0x0106:
        r2 = r11;
    L_0x0107:
        if (r1 != 0) goto L_0x010b;
    L_0x0109:
        r11 = r2;
        goto L_0x0113;
    L_0x010b:
        r11 = (defpackage.ayk) r11;
        r11.a();
        return r2;
    L_0x0111:
        if (r1 != 0) goto L_0x0114;
    L_0x0113:
        return r11;
    L_0x0114:
        r12 = r11;
        r12 = (defpackage.ayk) r12;
        r12.a();
        return r11;
    L_0x011b:
        r12 = move-exception;
        if (r1 != 0) goto L_0x011f;
    L_0x011e:
        goto L_0x0124;
    L_0x011f:
        r11 = (defpackage.ayk) r11;
        r11.a();
    L_0x0124:
        goto L_0x0126;
    L_0x0125:
        throw r12;
    L_0x0126:
        goto L_0x0125;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aws.a(java.lang.CharSequence, int, int, int, boolean):java.lang.CharSequence");
    }

    public final void a(EditorInfo editorInfo) {
        Bundle bundle = editorInfo.extras;
        bff bff = this.b.a;
        int a = bff.a(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", a != 0 ? bff.b.getInt(a + bff.a) : 0);
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.c.e);
    }
}
