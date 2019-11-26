package defpackage;

/* renamed from: eia */
final class eia implements afsw {
    private final /* synthetic */ aali a;
    private final /* synthetic */ ehx b;

    eia(ehx ehx, aali aali) {
        this.b = ehx;
        this.a = aali;
    }

    public final void a(Object obj) {
        this.b.a();
        if (this.b.b(this.a)) {
            ehx ehx = this.b;
            ehx.c = obj;
            if (ehx.c != null) {
                ehx.d = null;
                ehx.b = ehx.a.b();
            } else {
                ehx.b = 0;
            }
            afsw afsw = this.b.e;
            if (afsw != null) {
                afsw.a(obj);
                ehx ehx2 = this.b;
                ehx2.e = null;
                ehx2.d();
            }
        }
    }

    public final void a(bqn bqn) {
        this.b.b();
        if (this.b.b(this.a)) {
            ehx ehx = this.b;
            ehx.d = bqn;
            if (ehx.e != null) {
                ehx.d();
            }
        }
    }
}
