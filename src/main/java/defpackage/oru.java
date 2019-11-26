package defpackage;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.List;

/* renamed from: oru */
final class oru {
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public final StringBuilder c = new StringBuilder();
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    public oru(int i, int i2) {
        a(i);
        this.h = i2;
    }

    public final void a(int i) {
        this.g = i;
        this.a.clear();
        this.b.clear();
        this.c.setLength(0);
        this.d = 15;
        this.e = 0;
        this.f = 0;
    }

    public final boolean a() {
        return this.a.isEmpty() && this.b.isEmpty() && this.c.length() == 0;
    }

    public final void a(int i, boolean z) {
        this.a.add(new ort(i, z, this.c.length()));
    }

    public final void b() {
        int length = this.c.length();
        if (length > 0) {
            this.c.delete(length - 1, length);
            int size = this.a.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ort ort = (ort) this.a.get(size);
                    int i = ort.c;
                    if (i == length) {
                        ort.c = i - 1;
                    } else {
                        return;
                    }
                }
                return;
            }
        }
    }

    public final void a(char c) {
        this.c.append(c);
    }

    /* JADX WARNING: Missing block: B:28:0x007a, code skipped:
            if (r9 > 7) goto L_0x007c;
     */
    public final defpackage.orf b(int r9) {
        /*
        r8 = this;
        r0 = new android.text.SpannableStringBuilder;
        r0.<init>();
        r1 = 0;
        r2 = 0;
    L_0x0007:
        r3 = r8.b;
        r3 = r3.size();
        if (r2 >= r3) goto L_0x0022;
    L_0x000f:
        r3 = r8.b;
        r3 = r3.get(r2);
        r3 = (java.lang.CharSequence) r3;
        r0.append(r3);
        r3 = 10;
        r0.append(r3);
        r2 = r2 + 1;
        goto L_0x0007;
    L_0x0022:
        r2 = r8.c();
        r0.append(r2);
        r2 = r0.length();
        if (r2 == 0) goto L_0x0087;
    L_0x002f:
        r2 = r8.e;
        r3 = r8.f;
        r2 = r2 + r3;
        r3 = 32 - r2;
        r4 = r0.length();
        r3 = r3 - r4;
        r4 = r2 - r3;
        r5 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r6 = 2;
        r7 = 1;
        if (r9 != r5) goto L_0x005b;
    L_0x0043:
        r9 = r8.g;
        if (r9 != r6) goto L_0x0052;
    L_0x0047:
        r9 = java.lang.Math.abs(r4);
        r5 = 3;
        if (r9 >= r5) goto L_0x0050;
    L_0x004e:
        r1 = 1;
        goto L_0x005c;
    L_0x0050:
        if (r3 < 0) goto L_0x004e;
    L_0x0052:
        r9 = r8.g;
        if (r9 != r6) goto L_0x005c;
    L_0x0056:
        if (r4 > 0) goto L_0x0059;
    L_0x0058:
        goto L_0x005c;
    L_0x0059:
        r1 = 2;
        goto L_0x005c;
    L_0x005b:
        r1 = r9;
    L_0x005c:
        if (r1 == r7) goto L_0x0071;
    L_0x005e:
        r9 = 1036831949; // 0x3dcccccd float:0.1 double:5.122630465E-315;
        r4 = 1061997773; // 0x3f4ccccd float:0.8 double:5.246966156E-315;
        r5 = 1107296256; // 0x42000000 float:32.0 double:5.4707704E-315;
        if (r1 == r6) goto L_0x006e;
    L_0x0068:
        r2 = (float) r2;
        r2 = r2 / r5;
        r2 = r2 * r4;
        r2 = r2 + r9;
        goto L_0x0073;
    L_0x006e:
        r2 = 32 - r3;
        goto L_0x0068;
    L_0x0071:
        r2 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
    L_0x0073:
        r9 = r8.g;
        if (r9 == r7) goto L_0x007c;
    L_0x0077:
        r9 = r8.d;
        r3 = 7;
        if (r9 <= r3) goto L_0x0080;
    L_0x007c:
        r9 = r8.d;
        r9 = r9 + -17;
    L_0x0080:
        r3 = new orf;
        r9 = (float) r9;
        r3.<init>(r0, r9, r2, r1);
        return r3;
    L_0x0087:
        r9 = 0;
        return r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oru.b(int):orf");
    }

    public final SpannableString c() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.c);
        int length = spannableStringBuilder.length();
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = 0;
        int i6 = -1;
        Object obj = null;
        while (i < this.a.size()) {
            ort ort = (ort) this.a.get(i);
            boolean z = ort.b;
            int i7 = ort.a;
            if (i7 != 8) {
                Object obj2 = i7 == 7 ? 1 : null;
                if (i7 != 7) {
                    i3 = orr.a[i7];
                }
                obj = obj2;
            }
            int i8 = ort.c;
            i++;
            if (i8 != (i < this.a.size() ? ((ort) this.a.get(i)).c : length)) {
                if (i2 != -1 && !z) {
                    oru.a(spannableStringBuilder, i2, i8);
                    i2 = -1;
                } else if (i2 == -1 && z) {
                    i2 = i8;
                }
                if (i4 != -1 && obj == null) {
                    oru.b(spannableStringBuilder, i4, i8);
                    i4 = -1;
                } else if (i4 == -1 && obj != null) {
                    i4 = i8;
                }
                if (i3 != i6) {
                    oru.a(spannableStringBuilder, i5, i8, i6);
                    i6 = i3;
                    i5 = i8;
                }
            }
        }
        if (!(i2 == -1 || i2 == length)) {
            oru.a(spannableStringBuilder, i2, length);
        }
        if (!(i4 == -1 || i4 == length)) {
            oru.b(spannableStringBuilder, i4, length);
        }
        if (i5 != length) {
            oru.a(spannableStringBuilder, i5, length, i6);
        }
        return new SpannableString(spannableStringBuilder);
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
    }

    private static void b(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        spannableStringBuilder.setSpan(new StyleSpan(2), i, i2, 33);
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
        if (i3 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i, i2, 33);
        }
    }
}
