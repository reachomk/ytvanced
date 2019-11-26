package defpackage;

/* renamed from: aemj */
final class aemj implements aemu {
    private final /* synthetic */ aema a;

    public final void a(aemr aemr) {
        synchronized (this.a) {
            this.a.f.add(aemr);
        }
    }

    public final void b(aemr aemr) {
        synchronized (this.a) {
            if (this.a.f.contains(aemr)) {
                aema aema = this.a;
                if (aema.g != null) {
                    aeow aeow = aema.d;
                    if (aeow != null) {
                        aeow.d();
                        this.a.d = null;
                    }
                    aeow = this.a.e;
                    if (aeow != null) {
                        aeow.d();
                        this.a.e = null;
                    }
                    this.a.f.clear();
                    this.a.a.a();
                }
            }
        }
    }

    /* synthetic */ aemj(aema aema) {
        this.a = aema;
    }
}
