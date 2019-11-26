package defpackage;

/* renamed from: ayhz */
public final class ayhz extends anxl implements anzf {
    public static final ayhz n;
    private static volatile anzq p;
    public int a;
    public awok b;
    public String c = "";
    public arml d;
    public arml e;
    public axak f;
    public axak g;
    public float h;
    public ayhp i;
    public ayht j;
    public ayhl k;
    public long l;
    public apxu m;
    private byte o = (byte) 2;

    private ayhz() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.o = b;
                return null;
            case 2:
                return anxl.newMessageInfo(n, "\u0001\f\u0000\u0001\u0001\u000f\f\u0000\u0000\u0006\u0001Љ\u0000\u0002\b\u0001\u0003Љ\u0002\u0004Љ\u0003\u0005Љ\u0004\u0006Љ\u0005\u0007\u0001\u0006\b\t\u0007\t\t\b\n\t\t\u000b\u0002\n\u000fЉ\r", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"});
            case 3:
                return new ayhz();
            case 4:
                return new ayhy();
            case 5:
                return n;
            case 6:
                Object obj3 = p;
                if (obj3 == null) {
                    synchronized (ayhz.class) {
                        obj3 = p;
                        if (obj3 == null) {
                            obj3 = new anxn(n);
                            p = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        ayhz ayhz = new ayhz();
        n = ayhz;
        anxl.registerDefaultInstance(ayhz.class, ayhz);
    }
}
