package defpackage;

/* renamed from: gzi */
final /* synthetic */ class gzi implements xao {
    public static final xao a = new gzi();

    private gzi() {
    }

    public final void accept(Object obj) {
        xtl.a("There was an error prefetching the BrowseResponse", (Throwable) obj);
    }

    public final void accept(Throwable th) {
        xtl.a("There was an error prefetching the BrowseResponse", th);
    }
}
