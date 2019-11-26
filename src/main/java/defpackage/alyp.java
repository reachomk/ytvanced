package defpackage;

/* renamed from: alyp */
public final class alyp implements anjg {
    private final /* synthetic */ alyf a;

    public alyp(alyf alyf) {
        this.a = alyf;
    }

    public final void a(Throwable th) {
        String str = "Failed to add feedback only job.";
        this.a.h.a(str, th);
        xtl.a("UploadEngine", str, th);
    }
}
