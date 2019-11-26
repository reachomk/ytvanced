package defpackage;

import java.math.RoundingMode;
import java.util.Arrays;

/* renamed from: anay */
class anay extends anar {
    public final anau d;
    private final Character e;
    private transient anar f;

    anay(String str, String str2, Character ch) {
        this(new anau(str, str2.toCharArray()), ch);
    }

    anay(anau anau, Character ch) {
        this.d = (anau) amqw.a((Object) anau);
        boolean z = true;
        if (ch != null) {
            char charValue = ch.charValue();
            byte[] bArr = anau.g;
            if (charValue < bArr.length && bArr[charValue] != (byte) -1) {
                z = false;
            }
        }
        amqw.a(z, "Padding character %s was already in alphabet", (Object) ch);
        this.e = ch;
    }

    /* Access modifiers changed, original: final */
    public final int a(int i) {
        anau anau = this.d;
        return anau.e * angv.a(i, anau.f, RoundingMode.CEILING);
    }

    /* Access modifiers changed, original: 0000 */
    public void a(Appendable appendable, byte[] bArr, int i) {
        amqw.a((Object) appendable);
        int i2 = 0;
        amqw.a(0, i, bArr.length);
        while (i2 < i) {
            a(appendable, bArr, i2, Math.min(this.d.f, i - i2));
            i2 += this.d.f;
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(Appendable appendable, byte[] bArr, int i, int i2) {
        amqw.a((Object) appendable);
        amqw.a(i, i + i2, bArr.length);
        int i3 = 0;
        amqw.a(i2 <= this.d.f);
        long j = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            j = (j | ((long) (bArr[i + i4] & 255))) << 8;
        }
        int i5 = ((i2 + 1) << 3) - this.d.d;
        while (i3 < (i2 << 3)) {
            anau anau = this.d;
            appendable.append(anau.a(((int) (j >>> (i5 - i3))) & anau.c));
            i3 += this.d.d;
        }
        if (this.e != null) {
            while (i3 < (this.d.f << 3)) {
                appendable.append(this.e.charValue());
                i3 += this.d.d;
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final int b(int i) {
        return (int) (((((long) this.d.d) * ((long) i)) + 7) / 8);
    }

    /* Access modifiers changed, original: final */
    public final CharSequence b(CharSequence charSequence) {
        amqw.a((Object) charSequence);
        Character ch = this.e;
        if (ch == null) {
            return charSequence;
        }
        char charValue = ch.charValue();
        int length = charSequence.length();
        while (true) {
            length--;
            if (length >= 0 && charSequence.charAt(length) == charValue) {
            }
        }
        return charSequence.subSequence(0, length + 1);
    }

    /* Access modifiers changed, original: 0000 */
    public int a(byte[] bArr, CharSequence charSequence) {
        amqw.a((Object) bArr);
        charSequence = b(charSequence);
        if (this.d.b(charSequence.length())) {
            int i = 0;
            int i2 = 0;
            while (i < charSequence.length()) {
                anau anau;
                long j = 0;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    anau = this.d;
                    if (i3 >= anau.e) {
                        break;
                    }
                    j <<= anau.d;
                    if (i + i3 < charSequence.length()) {
                        j |= (long) this.d.a(charSequence.charAt(i4 + i));
                        i4++;
                    }
                    i3++;
                }
                i3 = anau.f;
                int i5 = (i3 << 3) - (i4 * anau.d);
                i3 = (i3 - 1) << 3;
                while (i3 >= i5) {
                    i4 = i2 + 1;
                    bArr[i2] = (byte) ((int) ((j >>> i3) & 255));
                    i3 -= 8;
                    i2 = i4;
                }
                i += this.d.e;
            }
            return i2;
        }
        int length = charSequence.length();
        StringBuilder stringBuilder = new StringBuilder(32);
        stringBuilder.append("Invalid input length ");
        stringBuilder.append(length);
        throw new anav(stringBuilder.toString());
    }

    public final anar a() {
        return this.e != null ? a(this.d, null) : this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0067  */
    public final defpackage.anar b() {
        /*
        r8 = this;
        r0 = r8.f;
        if (r0 != 0) goto L_0x0071;
    L_0x0004:
        r0 = r8.d;
        r1 = r0.b;
        r2 = r1.length;
        r3 = 0;
        r4 = 0;
    L_0x000b:
        if (r4 >= r2) goto L_0x0063;
    L_0x000d:
        r5 = r1[r4];
        r5 = defpackage.ampq.a(r5);
        if (r5 == 0) goto L_0x0060;
    L_0x0015:
        r1 = r0.b;
        r2 = r1.length;
        r4 = 0;
    L_0x0019:
        r5 = 1;
        if (r4 >= r2) goto L_0x002c;
    L_0x001c:
        r6 = r1[r4];
        r7 = 97;
        if (r6 >= r7) goto L_0x0023;
    L_0x0022:
        goto L_0x0029;
    L_0x0023:
        r7 = 122; // 0x7a float:1.71E-43 double:6.03E-322;
        if (r6 > r7) goto L_0x0029;
    L_0x0027:
        r1 = 1;
        goto L_0x002d;
    L_0x0029:
        r4 = r4 + 1;
        goto L_0x0019;
    L_0x002c:
        r1 = 0;
    L_0x002d:
        r1 = r1 ^ r5;
        r2 = "Cannot call lowerCase() on a mixed-case alphabet";
        defpackage.amqw.b(r1, r2);
        r1 = r0.b;
        r1 = r1.length;
        r1 = new char[r1];
    L_0x0038:
        r2 = r0.b;
        r4 = r2.length;
        if (r3 >= r4) goto L_0x004d;
    L_0x003d:
        r2 = r2[r3];
        r4 = defpackage.ampq.a(r2);
        if (r4 == 0) goto L_0x0047;
    L_0x0045:
        r2 = r2 ^ 32;
    L_0x0047:
        r2 = (char) r2;
        r1[r3] = r2;
        r3 = r3 + 1;
        goto L_0x0038;
    L_0x004d:
        r2 = new anau;
        r0 = r0.a;
        r0 = java.lang.String.valueOf(r0);
        r3 = ".lowerCase()";
        r0 = r0.concat(r3);
        r2.<init>(r0, r1);
        r0 = r2;
        goto L_0x0063;
    L_0x0060:
        r4 = r4 + 1;
        goto L_0x000b;
    L_0x0063:
        r1 = r8.d;
        if (r0 == r1) goto L_0x006e;
    L_0x0067:
        r1 = r8.e;
        r0 = r8.a(r0, r1);
        goto L_0x006f;
    L_0x006e:
        r0 = r8;
    L_0x006f:
        r8.f = r0;
    L_0x0071:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anay.b():anar");
    }

    /* Access modifiers changed, original: 0000 */
    public anar a(anau anau, Character ch) {
        return new anay(anau, ch);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("BaseEncoding.");
        stringBuilder.append(this.d.a);
        if (8 % this.d.d != 0) {
            if (this.e == null) {
                stringBuilder.append(".omitPadding()");
            } else {
                stringBuilder.append(".withPadChar('");
                stringBuilder.append(this.e);
                stringBuilder.append("')");
            }
        }
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof anay) {
            anay anay = (anay) obj;
            if (this.d.equals(anay.d) && amqq.a(this.e, anay.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() ^ Arrays.hashCode(new Object[]{this.e});
    }
}
