package defpackage;

/* renamed from: vkz */
final class vkz implements vdp {
    private final /* synthetic */ vsk a;
    private final /* synthetic */ vkt b;

    vkz(vkt vkt, vsk vsk) {
        this.b = vkt;
        this.a = vsk;
    }

    public final void a(vra vra) {
        vkt vkt = this.b;
        vkt.f = null;
        vsk vsk = this.a;
        int i = 1;
        switch (vra.ordinal()) {
            case 0:
            case 5:
            case 6:
            case 7:
                i = 0;
                break;
            case 3:
            case 8:
                i = 2;
                break;
            case 4:
                i = 3;
                break;
        }
        vkt.a(vsk, i, -1, -1);
    }

    public final vso a() {
        return this.a;
    }
}
