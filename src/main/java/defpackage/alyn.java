package defpackage;

/* renamed from: alyn */
public final class alyn implements anjg {
    private final /* synthetic */ alyf a;

    public alyn(alyf alyf) {
        this.a = alyf;
    }

    public final void a(Throwable th) {
        String str = "Failed to add normal job.";
        this.a.h.a(str, th);
        xtl.a("UploadEngine", str, th);
    }
}
