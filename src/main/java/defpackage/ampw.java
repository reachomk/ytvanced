package defpackage;

/* renamed from: ampw */
final class ampw extends ampu {
    public static final ampw a = new ampw();
    private static final int b = Integer.numberOfLeadingZeros(31);

    ampw() {
        super("CharMatcher.whitespace()");
    }

    public final boolean a(char c) {
        return " 　\r   　 \u000b　   　 \t     \f 　 　　 \n 　".charAt((1682554634 * c) >>> b) == c;
    }
}
