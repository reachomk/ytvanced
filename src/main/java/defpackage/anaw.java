package defpackage;

/* renamed from: anaw */
final class anaw extends anay {
    anaw(String str, String str2, Character ch) {
        this(new anau(str, str2.toCharArray()), ch);
    }

    private anaw(anau anau, Character ch) {
        super(anau, ch);
        amqw.a(anau.b.length == 64);
    }

    /* Access modifiers changed, original: final */
    public final void a(Appendable appendable, byte[] bArr, int i) {
        amqw.a((Object) appendable);
        int i2 = 0;
        amqw.a(0, i, bArr.length);
        int i3 = i;
        while (i3 >= 3) {
            int i4 = i2 + 1;
            int i5 = i4 + 1;
            int i6 = i5 + 1;
            i2 = (((bArr[i2] & 255) << 16) | ((bArr[i4] & 255) << 8)) | (bArr[i5] & 255);
            appendable.append(this.d.a(i2 >>> 18));
            appendable.append(this.d.a((i2 >>> 12) & 63));
            appendable.append(this.d.a((i2 >>> 6) & 63));
            appendable.append(this.d.a(i2 & 63));
            i3 -= 3;
            i2 = i6;
        }
        if (i2 < i) {
            a(appendable, bArr, i2, i - i2);
        }
    }

    /* Access modifiers changed, original: final */
    public final int a(byte[] bArr, CharSequence charSequence) {
        amqw.a((Object) bArr);
        charSequence = b(charSequence);
        if (this.d.b(charSequence.length())) {
            int i = 0;
            int i2 = 0;
            while (i < charSequence.length()) {
                int i3 = i + 1;
                int i4 = i3 + 1;
                i = (this.d.a(charSequence.charAt(i)) << 18) | (this.d.a(charSequence.charAt(i3)) << 12);
                i3 = i2 + 1;
                bArr[i2] = (byte) (i >>> 16);
                if (i4 < charSequence.length()) {
                    i2 = i4 + 1;
                    i |= this.d.a(charSequence.charAt(i4)) << 6;
                    i4 = i3 + 1;
                    bArr[i3] = (byte) (i >>> 8);
                    if (i2 < charSequence.length()) {
                        i3 = i2 + 1;
                        int i5 = i4 + 1;
                        bArr[i4] = (byte) (i | this.d.a(charSequence.charAt(i2)));
                        i = i3;
                        i2 = i5;
                    } else {
                        i = i2;
                        i2 = i4;
                    }
                } else {
                    i2 = i3;
                    i = i4;
                }
            }
            return i2;
        }
        int length = charSequence.length();
        StringBuilder stringBuilder = new StringBuilder(32);
        stringBuilder.append("Invalid input length ");
        stringBuilder.append(length);
        throw new anav(stringBuilder.toString());
    }

    /* Access modifiers changed, original: final */
    public final anar a(anau anau, Character ch) {
        return new anaw(anau, ch);
    }
}
