package defpackage;

/* renamed from: za */
final class za implements zc {
    public static final za a = new za();
    private final boolean b = true;

    public final int a(CharSequence charSequence, int i) {
        Object obj = null;
        for (int i2 = 0; i2 < i; i2++) {
            int a = zb.a(Character.getDirectionality(charSequence.charAt(i2)));
            if (a != 0) {
                if (a != 1) {
                    continue;
                } else if (!this.b) {
                    return 1;
                }
            } else if (this.b) {
                return 0;
            }
            obj = 1;
        }
        if (obj == null) {
            return 2;
        }
        return this.b;
    }

    private za() {
    }
}
