package defpackage;

/* renamed from: axat */
public final class axat extends anxl implements anzf {
    public static final axat k;
    private static volatile anzq m;
    public int a;
    public avls b;
    public avkv c;
    public auvp d;
    public auvl e;
    public apmi f;
    public aryt g;
    public auwl h;
    public arvb i;
    public asnl j;
    private byte l = (byte) 2;

    private axat() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.l = b;
                return null;
            case 2:
                return anxl.newMessageInfo(k, "\u0001\t\u0000\u0001᜸㮧\t\u0000\u0000\t᜸Љ\u0004᯦Љ\u0006ᾮЉ\u0003ᾮЉ\u0002︚⌶Љ\u0000⩫Љ\u0007㋚Љ\b㩻Љ\u0001㮧Љ\u0005", new Object[]{"a", "f", "h", "e", "d", "b", "i", "j", "c", "g"});
            case 3:
                return new axat();
            case 4:
                return new axas();
            case 5:
                return k;
            case 6:
                Object obj3 = m;
                if (obj3 == null) {
                    synchronized (axat.class) {
                        obj3 = m;
                        if (obj3 == null) {
                            obj3 = new anxn(k);
                            m = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        axat axat = new axat();
        k = axat;
        anxl.registerDefaultInstance(axat.class, axat);
    }
}
