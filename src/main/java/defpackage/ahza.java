package defpackage;

/* renamed from: ahza */
public final class ahza implements xcp {
    private final /* synthetic */ ahys a;

    public ahza(ahys ahys) {
        this.a = ahys;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        boolean z = false;
        if (i == -1) {
            return new Class[]{ahkk.class};
        } else if (i == 0) {
            ahkk ahkk = (ahkk) obj;
            ahys ahys = this.a;
            ahyo ahyo = ahys.h;
            if (!ahys.m && ahkk.a) {
                z = true;
            }
            ahyo.a(z);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
