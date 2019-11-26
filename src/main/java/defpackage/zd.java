package defpackage;

/* renamed from: zd */
final class zd implements zc {
    public static final zd a = new zd();

    public final int a(CharSequence charSequence, int i) {
        int i2 = 2;
        for (int i3 = 0; i3 < i && i2 == 2; i3++) {
            i2 = zb.b(Character.getDirectionality(charSequence.charAt(i3)));
        }
        return i2;
    }

    private zd() {
    }
}
