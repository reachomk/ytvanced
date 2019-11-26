package defpackage;

/* renamed from: wme */
public final /* synthetic */ class wme implements xao {
    public static final xao a = new wme();

    private wme() {
    }

    public final void accept(Object obj) {
        xtl.a("Error occurred getting resumable uploads", (Throwable) obj);
    }

    public final void accept(Throwable th) {
        xtl.a("Error occurred getting resumable uploads", th);
    }
}
