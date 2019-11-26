package defpackage;

/* renamed from: bbzc */
public final class bbzc {
    public static int a(int i) {
        return 1 << (32 - Integer.numberOfLeadingZeros(i - 1));
    }
}
