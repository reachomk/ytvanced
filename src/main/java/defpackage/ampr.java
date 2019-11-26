package defpackage;

/* renamed from: ampr */
final class ampr extends amps {
    private final char a;

    ampr(char c) {
        this.a = c;
    }

    public final boolean a(char c) {
        return c == this.a;
    }

    public final String toString() {
        int i = this.a;
        char[] cArr = new char[]{'\\', 'u', 0, 0, 0, 0};
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(i & 15);
            i >>= 4;
        }
        String copyValueOf = String.copyValueOf(cArr);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(copyValueOf).length() + 18);
        stringBuilder.append("CharMatcher.is('");
        stringBuilder.append(copyValueOf);
        stringBuilder.append("')");
        return stringBuilder.toString();
    }
}
