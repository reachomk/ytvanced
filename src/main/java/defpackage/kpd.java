package defpackage;

/* renamed from: kpd */
abstract class kpd implements Comparable {
    kpd() {
    }

    public abstract String a();

    public abstract String b();

    public abstract int c();

    public final /* synthetic */ int compareTo(Object obj) {
        return a().compareTo(((kpd) obj).a());
    }
}
