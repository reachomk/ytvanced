package defpackage;

/* renamed from: artp */
public final class artp extends anxl implements anzf {
    public static final artp i;
    private static volatile anzq k;
    public int a;
    public boolean b;
    public arml c;
    public arml d;
    public anvu e = anvu.a;
    public float f;
    public arto g;
    public arto h;
    private byte j = (byte) 2;

    private artp() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.j = b;
                return null;
            case 2:
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0004\u0001Љ\u0001\u0003\n\u0005\u0005Љ\u0002\u0006\u0001\u0007\u0007Љ\b\bЉ\t\t\u0007\u0000", new Object[]{"a", "c", "e", "d", "f", "g", "h", "b"});
            case 3:
                return new artp();
            case 4:
                return new arts();
            case 5:
                return i;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (artp.class) {
                        obj3 = k;
                        if (obj3 == null) {
                            obj3 = new anxn(i);
                            k = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        artp artp = new artp();
        i = artp;
        anxl.registerDefaultInstance(artp.class, artp);
    }
}
