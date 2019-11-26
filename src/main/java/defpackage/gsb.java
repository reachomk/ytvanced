package defpackage;

/* renamed from: gsb */
public class gsb implements akmw {
    private final long a;
    public final Object c;

    public gsb(Object obj, long j) {
        this.c = obj;
        this.a = j;
    }

    public final akmw a(akmw akmw) {
        if (akmw instanceof gsb) {
            gsb gsb = (gsb) akmw;
            if (this.a < gsb.a) {
                return gsb;
            }
        }
        return this;
    }
}
