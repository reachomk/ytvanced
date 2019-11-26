package defpackage;

/* renamed from: kin */
final /* synthetic */ class kin implements xao {
    public static final xao a = new kin();

    private kin() {
    }

    public final void accept(Object obj) {
        xtl.a("Error occurred getting resumable uploads", (Throwable) obj);
    }

    public final void accept(Throwable th) {
        xtl.a("Error occurred getting resumable uploads", th);
    }
}
