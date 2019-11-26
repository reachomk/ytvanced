package defpackage;

/* renamed from: amrh */
abstract class amrh extends ampn {
    public final CharSequence b;
    private final ampp c;
    private final boolean d;
    private int e = 0;
    private int f;

    protected amrh(amqz amqz, CharSequence charSequence) {
        this.c = amqz.a;
        this.d = amqz.b;
        this.f = amqz.d;
        this.b = charSequence;
    }

    public abstract int a(int i);

    public abstract int b(int i);

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object a() {
        int i;
        int i2;
        int i3 = this.e;
        while (true) {
            i = this.e;
            if (i != -1) {
                i = a(i);
                if (i == -1) {
                    i = this.b.length();
                    this.e = -1;
                    i2 = -1;
                } else {
                    i2 = b(i);
                    this.e = i2;
                }
                if (i2 == i3) {
                    i2++;
                    this.e = i2;
                    if (i2 > this.b.length()) {
                        this.e = -1;
                    }
                } else {
                    while (i3 < i && this.c.a(this.b.charAt(i3))) {
                        i3++;
                    }
                    while (i > i3) {
                        i2 = i - 1;
                        if (!this.c.a(this.b.charAt(i2))) {
                            break;
                        }
                        i = i2;
                    }
                    if (this.d && i3 == i) {
                        i3 = this.e;
                    }
                }
            } else {
                this.a = 3;
                return null;
            }
        }
        i2 = this.f;
        if (i2 == 1) {
            i = this.b.length();
            this.e = -1;
            while (i > i3) {
                int i4 = i - 1;
                if (!this.c.a(this.b.charAt(i4))) {
                    break;
                }
                i = i4;
            }
        } else {
            this.f = i2 - 1;
        }
        return this.b.subSequence(i3, i).toString();
    }
}
