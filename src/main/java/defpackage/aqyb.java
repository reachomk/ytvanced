package defpackage;

/* renamed from: aqyb */
public final class aqyb extends anxl implements anzf {
    public static final aqyb h;
    private static volatile anzq j;
    public int a;
    public axjb b;
    public axiz c;
    public aqyd d;
    public aqyf e;
    public aqyl f;
    public aqyj g;
    private byte i = (byte) 2;

    private aqyb() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.i = b;
                return null;
            case 2:
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001⇧㨞\u0006\u0000\u0000\u0006⇧Љ\u0000⇨Љ\u0002≢Љ\u0001窱┕Љ\u0003⼚Љ\u0004㨞Љ\u0005", new Object[]{"a", "b", "d", "c", "e", "f", "g"});
            case 3:
                return new aqyb();
            case 4:
                return new aqya();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (aqyb.class) {
                        obj3 = j;
                        if (obj3 == null) {
                            obj3 = new anxn(h);
                            j = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aqyb aqyb = new aqyb();
        h = aqyb;
        anxl.registerDefaultInstance(aqyb.class, aqyb);
    }
}
