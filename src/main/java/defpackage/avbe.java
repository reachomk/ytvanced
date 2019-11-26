package defpackage;

/* renamed from: avbe */
public final class avbe extends anxl implements anzf {
    public static final avbe c;
    private static volatile anzq e;
    public int a;
    public avba b;
    private byte d = (byte) 2;

    private avbe() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.d = b;
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001䏢䏢\u0001\u0000\u0000\u0001䏢Љ\u0000", new Object[]{"a", "b"});
            case 3:
                return new avbe();
            case 4:
                return new avbd();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (avbe.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(c);
                            e = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        avbe avbe = new avbe();
        c = avbe;
        anxl.registerDefaultInstance(avbe.class, avbe);
    }
}
