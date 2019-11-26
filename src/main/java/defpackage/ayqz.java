package defpackage;

/* renamed from: ayqz */
public final class ayqz extends anxl implements anzf {
    public static final ayqz t;
    private static volatile anzq v;
    public int a;
    public arml b;
    public arml c;
    public arml d;
    public arml e;
    public arml f;
    public arml g;
    public arml h;
    public auvr i;
    public apxu j;
    public apxu k;
    public apdh l;
    public apdh m;
    public apdh n;
    public axak o;
    public arml p;
    public arml q;
    public arml r;
    public arml s;
    private byte u = (byte) 2;

    private ayqz() {
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.u);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.u = b;
                return null;
            case 2:
                return anxl.newMessageInfo(t, "\u0001\u0012\u0000\u0001\u00036\u0012\u0000\u0000\u0012\u0003Љ\u0016\u000bЉ\r\u001dЉ\u0017\u001eЉ\u0018\u001fЉ\u0019\"Љ\t&Љ\u0010'Љ\u0000(Љ\u0001)Љ\u0002*Љ\u0003,Љ\u0004-Љ\u0005.Љ\u000e1Љ\f2Љ\u00135Љ\u00126Љ\u0011", new Object[]{"a", "p", "j", "q", "r", "s", "h", "l", "b", "c", "d", "e", "f", "g", "k", "i", "o", "n", "m"});
            case 3:
                return new ayqz();
            case 4:
                return new ayqy();
            case 5:
                return t;
            case 6:
                Object obj3 = v;
                if (obj3 == null) {
                    synchronized (ayqz.class) {
                        obj3 = v;
                        if (obj3 == null) {
                            obj3 = new anxn(t);
                            v = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        ayqz ayqz = new ayqz();
        t = ayqz;
        anxl.registerDefaultInstance(ayqz.class, ayqz);
    }
}
