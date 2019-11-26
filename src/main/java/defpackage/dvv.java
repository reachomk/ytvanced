package defpackage;

/* renamed from: dvv */
final class dvv implements Comparable {
    public final long a;
    public final apxu b;

    public dvv(long j, apxu apxu) {
        this.a = j;
        this.b = apxu;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return Long.valueOf(this.a).compareTo(Long.valueOf(((dvv) obj).a));
    }
}
