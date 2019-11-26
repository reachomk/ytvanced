package defpackage;

/* renamed from: azyf */
public final class azyf {
    public final int a;
    public final int b;

    public azyf(byte[] bArr) {
        StringBuilder stringBuilder;
        byte b = bArr[0];
        byte b2 = bArr[1];
        if (b == (byte) 3) {
            this.a = 3;
        } else if (b == (byte) 4) {
            this.a = 4;
        } else {
            stringBuilder = new StringBuilder(46);
            stringBuilder.append("The address type is illegal. Value:");
            stringBuilder.append(b);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        if (b2 == (byte) 2) {
            this.b = 2;
        } else if (b2 == (byte) 3) {
            this.b = 3;
        } else if (b2 == (byte) 4) {
            this.b = 4;
        } else {
            stringBuilder = new StringBuilder(44);
            stringBuilder.append("The score type is illegal. Value:");
            stringBuilder.append(b2);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}
