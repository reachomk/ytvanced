package defpackage;

/* renamed from: acaa */
final class acaa implements aceh {
    private final /* synthetic */ acab a;

    acaa(acab acab) {
        this.a = acab;
    }

    public final void a(Object obj) {
        if (obj instanceof auhk) {
            auhk auhk = (auhk) obj;
            if (auhk.a().d > 0 && auhk.a().c > 0) {
                long j = auhk.a().d - auhk.a().c;
                if (j > 0) {
                    int i = this.a.c;
                    auhk.copyOnWrite();
                    auhl auhl = (auhl) auhk.instance;
                    auhl.a |= 4;
                    auhl.d = ((float) (i * 1000)) / ((float) j);
                }
            }
            this.a.c = 0;
        }
    }
}
