package defpackage;

/* renamed from: bawc */
final class bawc implements baut {
    private static final byte[] a = new byte[]{(byte) 48, (byte) 49, (byte) 50, (byte) 51, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 65, (byte) 66, (byte) 67, (byte) 68, (byte) 69, (byte) 70};

    private bawc() {
    }

    private static boolean a(byte b) {
        return b < (byte) 32 || b >= (byte) 126 || b == (byte) 37;
    }

    /* synthetic */ bawc(byte b) {
    }
}
