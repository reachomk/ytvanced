package defpackage;

/* renamed from: abpj */
final class abpj implements Runnable {
    public final Object a;
    public final long b;
    public final long c;
    public apxu d;
    private final String e;
    private final /* synthetic */ abpe f;

    public abpj(abpe abpe, String str, Object obj, long j, long j2) {
        this.f = abpe;
        this.e = str;
        this.a = obj;
        this.b = j;
        this.c = j2;
    }

    public final void run() {
        this.f.b.remove(this.a);
        this.f.c.remove(this.e);
    }
}
