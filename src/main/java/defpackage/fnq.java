package defpackage;

/* renamed from: fnq */
final class fnq implements xcp {
    private final /* synthetic */ fnr a;

    fnq(fnr fnr) {
        this.a = fnr;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        fnr fnr;
        switch (i) {
            case -1:
                return new Class[]{zjm.class, zjl.class, zjo.class, zjn.class, aced.class, acec.class};
            case 0:
                synchronized (this.a) {
                    fnr = this.a;
                    fnr.d = true;
                    fnr.a(true, "camera", false);
                }
                return null;
            case 1:
                synchronized (this.a) {
                    this.a.d = false;
                }
                return null;
            case 2:
                synchronized (this.a) {
                    fnr = this.a;
                    fnr.b = true;
                    fnr.a(true, "edit", false);
                }
                return null;
            case 3:
                synchronized (this.a) {
                    this.a.b = false;
                }
                return null;
            case 4:
                synchronized (this.a) {
                    fnr = this.a;
                    fnr.c = true;
                    fnr.a(true, "livecapture", false);
                }
                return null;
            case 5:
                synchronized (this.a) {
                    this.a.c = false;
                }
                return null;
            default:
                StringBuilder stringBuilder = new StringBuilder(32);
                stringBuilder.append("unsupported op code: ");
                stringBuilder.append(i);
                throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
