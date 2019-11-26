package defpackage;

/* renamed from: jmc */
public final class jmc extends jip implements xcp {
    public jmc(akvz akvz, xci xci, xoi xoi, akdk akdk, xsc xsc, hap hap, amqp amqp, aana aana, acvx acvx, akyd akyd) {
        super(akvz, xci, xoi, akdk, xsc, hap, amqp, aana, acvx, akyd);
        f();
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (cls != jmc.class) {
            return super.a(cls, obj, i);
        }
        Class[] clsArr = null;
        switch (i) {
            case -1:
                clsArr = new Class[]{gzx.class, zyg.class, zyp.class, aaxd.class, aaxc.class, akwd.class};
                break;
            case 0:
                a((gzx) obj);
                break;
            case 1:
                a((zyg) obj);
                break;
            case 2:
                a((zyp) obj);
                break;
            case 3:
                a((aaxd) obj);
                break;
            case 4:
                a((aaxc) obj);
                break;
            case 5:
                a((akwd) obj);
                break;
            default:
                StringBuilder stringBuilder = new StringBuilder(32);
                stringBuilder.append("unsupported op code: ");
                stringBuilder.append(i);
                throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }
}
