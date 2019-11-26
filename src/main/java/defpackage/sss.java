package defpackage;

/* renamed from: sss */
public final class sss implements swd {
    private final bapu a;

    public sss(bapu bapu) {
        this.a = bapu;
    }

    public final anwy a() {
        return azvd.c;
    }

    public final /* synthetic */ bblt a(Object obj, swg swg) {
        azvd azvd = (azvd) obj;
        swf swf = (swf) this.a.get();
        if (azvd.a.size() <= 0) {
            return bblt.a();
        }
        obj = bbmc.a(azvd.a).a(new ssr(swf, swg));
        bbow.a(obj, "sources is null");
        bbow.a(Integer.MAX_VALUE, "maxConcurrency");
        return new bbqf(obj);
    }
}
