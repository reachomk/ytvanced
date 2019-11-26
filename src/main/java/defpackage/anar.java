package defpackage;

import java.io.IOException;

/* renamed from: anar */
public abstract class anar {
    public static final anar a;
    public static final anar b;
    public static final anar c = new anat("base16()", "0123456789ABCDEF");

    anar() {
    }

    public abstract int a(int i);

    public abstract int a(byte[] bArr, CharSequence charSequence);

    public abstract anar a();

    public abstract void a(Appendable appendable, byte[] bArr, int i);

    public abstract int b(int i);

    public abstract anar b();

    /* Access modifiers changed, original: 0000 */
    public CharSequence b(CharSequence charSequence) {
        throw null;
    }

    public final String a(byte[] bArr) {
        int length = bArr.length;
        amqw.a(0, length, length);
        StringBuilder stringBuilder = new StringBuilder(a(length));
        try {
            a(stringBuilder, bArr, length);
            return stringBuilder.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final byte[] a(CharSequence charSequence) {
        try {
            charSequence = b(charSequence);
            byte[] bArr = new byte[b(charSequence.length())];
            int a = a(bArr, charSequence);
            if (a == bArr.length) {
                return bArr;
            }
            byte[] bArr2 = new byte[a];
            System.arraycopy(bArr, 0, bArr2, 0, a);
            return bArr2;
        } catch (anav e) {
            throw new IllegalArgumentException(e);
        }
    }

    static {
        Character valueOf = Character.valueOf('=');
        a = new anaw("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", valueOf);
        b = new anaw("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", valueOf);
        anay anay = new anay("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", valueOf);
        anay = new anay("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", valueOf);
    }
}
