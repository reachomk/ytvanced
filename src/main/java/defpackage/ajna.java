package defpackage;

/* renamed from: ajna */
public final class ajna {
    public final long a;
    public final /* synthetic */ ajmx b;
    public final int c;

    public final String toString() {
        int i = this.c;
        String str = i != 1 ? i != 2 ? "null" : "EXIT" : "ENTER";
        if (i != 0) {
            long j = this.a;
            StringBuilder stringBuilder = new StringBuilder(str.length() + 21);
            stringBuilder.append(str);
            stringBuilder.append("@");
            stringBuilder.append(j);
            return stringBuilder.toString();
        }
        throw null;
    }

    /* Access modifiers changed, original: final */
    public final int a() {
        return this.b.o;
    }

    /* Access modifiers changed, original: final */
    public final String b() {
        return this.b.n;
    }

    /* synthetic */ ajna(ajmx ajmx, int i, long j) {
        this.b = ajmx;
        this.c = i;
        this.a = j;
    }
}
