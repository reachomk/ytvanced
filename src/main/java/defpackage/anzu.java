package defpackage;

/* renamed from: anzu */
final class anzu implements anzc {
    public final anze a;
    public final String b;
    public final Object[] c;
    private final int d;

    anzu(anze anze, String str, Object[] objArr) {
        this.a = anze;
        this.b = str;
        this.c = objArr;
        char charAt = str.charAt(0);
        if (charAt >= 55296) {
            int i = charAt & 8191;
            int i2 = 13;
            int i3 = 1;
            while (true) {
                int i4 = i3 + 1;
                char charAt2 = str.charAt(i3);
                if (charAt2 >= 55296) {
                    i |= (charAt2 & 8191) << i2;
                    i2 += 13;
                    i3 = i4;
                } else {
                    this.d = i | (charAt2 << i2);
                    return;
                }
            }
        }
        this.d = charAt;
    }

    public final anze b() {
        return this.a;
    }

    public final boolean a() {
        return (this.d & 2) == 2;
    }

    public final int c() {
        return (this.d & 1) != 1 ? 2 : 1;
    }
}
