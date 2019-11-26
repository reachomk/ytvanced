package defpackage;

/* renamed from: alyo */
public final class alyo implements anjg {
    private final /* synthetic */ alyf a;

    public alyo(alyf alyf) {
        this.a = alyf;
    }

    public final void a(Throwable th) {
        String str = "Failed to update feedback only job.";
        this.a.h.a(str, th);
        xtl.a("UploadEngine", str, th);
    }
}
