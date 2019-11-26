package defpackage;

/* renamed from: ldx */
final class ldx extends akyh {
    private final aana c;
    private final /* synthetic */ ldt d;

    ldx(ldt ldt, aana aana, xci xci, akvz akvz, xoi xoi, acvx acvx) {
        this.d = ldt;
        super(aana, xci, akvz, xoi, acvx);
        this.c = aana;
    }

    public final akvy a(Object obj, akyd akyd, akxv akxv) {
        if (!(obj instanceof ajst)) {
            return super.a(obj, akyd, akxv);
        }
        web a = this.d.e.a((ajst) obj, this.c, this.b);
        ldt ldt = this.d;
        a.b = ldt;
        lei lei = ldt.h;
        lei.getClass();
        a.c = new ldw(lei);
        wei wei = this.d.i;
        if (wei != null) {
            a.a.a.add(wei);
        }
        return a;
    }
}
