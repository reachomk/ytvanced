package defpackage;

/* renamed from: aqnn */
public final class aqnn extends anxl implements anzf {
    public static final aqnn i;
    private static volatile anzq k;
    public int a;
    public aqoj b;
    public aqnr c;
    public aqon d;
    public aqnx e;
    public aqmx f;
    public aqnt g;
    public aqof h;
    private byte j = (byte) 2;

    private aqnn() {
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
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001﯐⏝搜\u0007\u0000\u0000\u0007﯐⏝Љ\u0005␆Љ\u0000␆Љ\u0002⻊Љ\u0006䃲Љ\u0001拿Љ\u0003搜Љ\u0004", new Object[]{"a", "g", "b", "d", "h", "c", "e", "f"});
            case 3:
                return new aqnn();
            case 4:
                return new aqnm();
            case 5:
                return i;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (aqnn.class) {
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
        aqnn aqnn = new aqnn();
        i = aqnn;
        anxl.registerDefaultInstance(aqnn.class, aqnn);
    }
}
