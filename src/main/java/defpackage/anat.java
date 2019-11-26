package defpackage;

/* renamed from: anat */
final class anat extends anay {
    private final char[] e;

    anat(String str, String str2) {
        this(new anau(str, str2.toCharArray()));
    }

    private anat(anau anau) {
        super(anau, null);
        this.e = new char[512];
        amqw.a(anau.b.length == 16);
        for (int i = 0; i < 256; i++) {
            this.e[i] = anau.a(i >>> 4);
            this.e[i | 256] = anau.a(i & 15);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(Appendable appendable, byte[] bArr, int i) {
        amqw.a((Object) appendable);
        int i2 = 0;
        amqw.a(0, i, bArr.length);
        while (i2 < i) {
            int i3 = bArr[i2] & 255;
            appendable.append(this.e[i3]);
            appendable.append(this.e[i3 | 256]);
            i2++;
        }
    }

    /* Access modifiers changed, original: final */
    public final int a(byte[] bArr, CharSequence charSequence) {
        amqw.a((Object) bArr);
        if (charSequence.length() % 2 != 1) {
            int i = 0;
            int i2 = 0;
            while (i < charSequence.length()) {
                int i3 = i2 + 1;
                bArr[i2] = (byte) ((this.d.a(charSequence.charAt(i)) << 4) | this.d.a(charSequence.charAt(i + 1)));
                i += 2;
                i2 = i3;
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
        return new anat(anau);
    }
}
