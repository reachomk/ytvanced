package defpackage;

/* renamed from: oya */
final class oya {
    public static long a(String str) {
        long j = 0;
        if (str != null) {
            for (int i = 0; i < str.length(); i++) {
                j ^= (long) str.charAt(i);
                j += (((((j + j) + (j << 4)) + (j << 5)) + (j << 7)) + (j << 8)) + (j << 40);
            }
        }
        return j;
    }
}
