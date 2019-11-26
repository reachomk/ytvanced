package defpackage;

/* renamed from: ssu */
public final class ssu implements swd {
    private final bapu a;

    public ssu(bapu bapu) {
        this.a = bapu;
    }

    public final anwy a() {
        return azvn.c;
    }

    public final /* synthetic */ bblt a(Object obj, swg swg) {
        azvn azvn = (azvn) obj;
        swf swf = (swf) this.a.get();
        if (azvn.a.size() <= 0) {
            return bblt.a();
        }
        obj = bbmc.a(azvn.a).a(new sst(swf, swg));
        bbow.a(obj, "sources is null");
        bbow.a(2, "prefetch");
        return new bbpr(obj);
    }
}
