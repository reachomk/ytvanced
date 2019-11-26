package defpackage;

/* renamed from: alym */
public final class alym implements anjg {
    private final /* synthetic */ alyf a;

    public alym(alyf alyf) {
        this.a = alyf;
    }

    public final void a(Throwable th) {
        String str = "Failed to add reels job.";
        this.a.h.a(str, th);
        xtl.a("UploadEngine", str, th);
    }
}
