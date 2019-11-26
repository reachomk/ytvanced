package defpackage;

/* renamed from: amrd */
final class amrd extends amrh {
    private final /* synthetic */ amre c;

    amrd(amre amre, amqz amqz, CharSequence charSequence) {
        this.c = amre;
        super(amqz, charSequence);
    }

    public final int a(int i) {
        int length = this.c.a.length();
        int length2 = this.b.length() - length;
        while (i <= length2) {
            int i2 = 0;
            while (i2 < length) {
                if (this.b.charAt(i2 + i) == this.c.a.charAt(i2)) {
                    i2++;
                } else {
                    i++;
                }
            }
            return i;
        }
        return -1;
    }

    public final int b(int i) {
        return i + this.c.a.length();
    }
}
