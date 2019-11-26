package defpackage;

/* renamed from: jki */
final /* synthetic */ class jki implements xao {
    public static final xao a = new jki();

    private jki() {
    }

    public final void accept(Object obj) {
        xtl.a("Error occurred getting resumable uploads", (Throwable) obj);
    }

    public final void accept(Throwable th) {
        xtl.a("Error occurred getting resumable uploads", th);
    }
}
