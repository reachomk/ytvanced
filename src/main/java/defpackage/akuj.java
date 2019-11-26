package defpackage;

/* renamed from: akuj */
public final class akuj {
    public static final Class[] a(akty akty, Object obj, int i) {
        if (i == -1) {
            return new Class[]{zyg.class, aaxd.class};
        } else if (i == 0) {
            akty.a(((zyg) obj).d);
            return null;
        } else if (i == 1) {
            akty.a(((aaxd) obj).b);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public static final Class[] a(akuz akuz, Object obj, int i) {
        if (i == -1) {
            return new Class[]{akuq.class, akuv.class, akuu.class, akvf.class};
        } else if (i == 0) {
            akuq akuq = (akuq) obj;
            akuz.l = true;
            akuz.a(akuz.j.a(akuq));
            return null;
        } else if (i == 1) {
            akuv akuv = (akuv) obj;
            akuz.l = false;
            akuz.a(akuz.j.a(akuv));
            return null;
        } else if (i == 2) {
            akuu akuu = (akuu) obj;
            akuz.l = false;
            akuz.a(akuz.j.a(akuu));
            return null;
        } else if (i == 3) {
            akuz.a((akvf) obj);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
