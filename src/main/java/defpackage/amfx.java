package defpackage;

/* renamed from: amfx */
final /* synthetic */ class amfx implements anij {
    private final amfw a;
    private final String b;
    private final alyz c;

    amfx(amfw amfw, String str, alyz alyz) {
        this.a = amfw;
        this.b = str;
        this.c = alyz;
    }

    public final anjv a() {
        amfw amfw = this.a;
        amea a = amfw.a(this.b, this.c, false);
        if ((a.a & 536870912) != 0) {
            abjv a2 = amfw.a.a(a.c);
            a2.g();
            a2.a = a.G;
            if (amfw.a.a(a2).c) {
                return anjf.a(amfw.a(amjq.a(), false));
            }
            throw new aanq("Video deletion failed");
        }
        throw new amgm();
    }
}
