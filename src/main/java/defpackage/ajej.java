package defpackage;

/* renamed from: ajej */
final class ajej implements afid {
    private final String a;
    private final int b;
    private long c;
    private int d;
    private final /* synthetic */ ajee e;

    ajej(ajee ajee, String str, int i) {
        this.e = ajee;
        this.a = str;
        this.b = i;
    }

    public final void a(int i) {
    }

    public final void a(long j, long j2) {
    }

    public final void a(afin afin) {
        if (afin.a == this.b) {
            this.c += afin.c;
            this.d += afin.b;
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(String str) {
        long j = this.c;
        if (j > 0) {
            ajet ajet = this.e.i;
            String str2 = this.a;
            String b = ajee.b((long) this.d);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 22) + String.valueOf(b).length());
            stringBuilder.append(str);
            str = ":";
            stringBuilder.append(str);
            stringBuilder.append(j);
            stringBuilder.append(str);
            stringBuilder.append(b);
            ajet.a(str2, stringBuilder.toString());
            this.c = 0;
            this.d = 0;
        }
    }
}
