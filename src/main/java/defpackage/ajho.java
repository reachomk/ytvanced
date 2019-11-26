package defpackage;

/* renamed from: ajho */
public final class ajho implements Comparable {
    private final int a;

    public ajho(int i) {
        this.a = i;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.a - ((ajho) obj).a;
    }
}
