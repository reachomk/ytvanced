package defpackage;

/* renamed from: bddg */
public final class bddg {
    public static int a(int i) {
        return 1 << (32 - Integer.numberOfLeadingZeros(i - 1));
    }
}
