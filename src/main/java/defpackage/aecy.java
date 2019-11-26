package defpackage;

/* renamed from: aecy */
final class aecy implements amro {
    private final /* synthetic */ zzl a;
    private final /* synthetic */ aecx b;

    aecy(zzl zzl, aecx aecx) {
        this.a = zzl;
        this.b = aecx;
    }

    private final synchronized oww a() {
        auuo auuo = this.a.b().k;
        if (auuo == null) {
            auuo = auuo.k;
        }
        arhf arhf = auuo.b;
        if (arhf == null) {
            arhf = arhf.d;
        }
        if (arhf.c) {
            return null;
        }
        return (oww) this.b.get();
    }

    public final /* synthetic */ Object get() {
        return a();
    }
}
