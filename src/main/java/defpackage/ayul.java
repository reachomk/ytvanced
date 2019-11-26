package defpackage;

/* renamed from: ayul */
public final class ayul extends anxl implements anzf {
    public static final ayul h;
    private static volatile anzq j;
    public int a;
    public ayir b;
    public awob c;
    public ayuq d;
    public aygi e;
    public azau f;
    public aysn g;
    private byte i = (byte) 2;

    private ayul() {
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
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001ẝ⩯\u0006\u0000\u0000\u0005ẝЉ\u0001隷ἭЉ\u0002⏒Љ\u0003▍\t\u0004⡷Љ\u0005⩯Љ\u0000", new Object[]{"a", "c", "d", "e", "f", "g", "b"});
            case 3:
                return new ayul();
            case 4:
                return new ayun();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (ayul.class) {
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
        ayul ayul = new ayul();
        h = ayul;
        anxl.registerDefaultInstance(ayul.class, ayul);
    }
}
