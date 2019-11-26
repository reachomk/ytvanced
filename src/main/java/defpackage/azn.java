package defpackage;

/* renamed from: azn */
final class azn implements baj {
    private final /* synthetic */ bbs a;
    private final /* synthetic */ azl b;

    azn(azl azl, bbs bbs) {
        this.b = azl;
        this.a = bbs;
    }

    public final void a() {
        this.b.r.remove(this.a);
        this.b.n.notifyDataSetChanged();
    }
}
