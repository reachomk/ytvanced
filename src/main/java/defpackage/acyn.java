package defpackage;

/* renamed from: acyn */
final class acyn implements xcn {
    private final acye a;
    private final /* synthetic */ acyi b;

    public final /* synthetic */ void a(Object obj) {
        xbb a = this.a.a((xbb) obj);
        if (a != null) {
            if (!this.b.d.isEmpty()) {
                for (acxv a2 : this.b.d) {
                    a2.a(a);
                }
            }
            if (!this.b.e.isEmpty()) {
                for (acxv a22 : this.b.e) {
                    a22.a(a);
                }
            }
        }
    }

    /* synthetic */ acyn(acyi acyi, acye acye) {
        this.b = acyi;
        this.a = (acye) amqw.a((Object) acye);
    }
}
