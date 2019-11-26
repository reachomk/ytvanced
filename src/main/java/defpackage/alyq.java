package defpackage;

/* renamed from: alyq */
final class alyq implements anjg {
    private final /* synthetic */ alyf a;

    alyq(alyf alyf) {
        this.a = alyf;
    }

    public final void a(Throwable th) {
        String str = "Failed to get pending uploads.";
        this.a.h.a(str, th);
        xtl.a("UploadEngine", str, th);
    }
}
