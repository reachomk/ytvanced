package defpackage;

/* renamed from: exk */
final class exk implements xcp {
    private final /* synthetic */ exh a;

    exk(exh exh) {
        this.a = exh;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        boolean z = true;
        exh exh;
        if (i == -1) {
            return new Class[]{adqk.class, ahkk.class};
        } else if (i == 0) {
            adqk adqk = (adqk) obj;
            exh = this.a;
            if (adqk.a == null) {
                z = false;
            }
            exh.j = z;
            return null;
        } else if (i == 1) {
            ahkk ahkk = (ahkk) obj;
            exh = this.a;
            if (exh.j) {
                exh.i.a(true);
                exh = this.a;
                exs exs = exh.i;
                boolean z2 = ahkk.a;
                exs.setPadding(z2 ? exh.g : 0, 0, 0, z2 ? exh.f : 0);
                return null;
            }
            exh.i.a(ahkk.a ^ 1);
            this.a.i.setPadding(0, 0, 0, 0);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
