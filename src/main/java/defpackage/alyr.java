package defpackage;

/* renamed from: alyr */
public final class alyr implements anjg {
    private final /* synthetic */ alyf a;

    public alyr(alyf alyf) {
        this.a = alyf;
    }

    public final void a(Throwable th) {
        String str = "Failed to cancel upload job.";
        this.a.h.a(str, th);
        xtl.a("UploadEngine", str, th);
    }
}
