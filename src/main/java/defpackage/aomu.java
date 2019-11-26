package defpackage;

/* renamed from: aomu */
public final class aomu extends anxl implements anzf {
    public static final aomu c;
    private static volatile anzq e;
    public int a = 0;
    public Object b;
    private byte d = (byte) 2;

    private aomu() {
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
                return anxl.newMessageInfo(c, "\u0001\u0003\u0001\u0000▻䦵\u0003\u0000\u0000\u0003▻м\u0000㉼м\u0000䦵м\u0000", new Object[]{"b", "a", aqeq.class, aomo.class, aomm.class});
            case 3:
                return new aomu();
            case 4:
                return new aomt();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (aomu.class) {
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
        aomu aomu = new aomu();
        c = aomu;
        anxl.registerDefaultInstance(aomu.class, aomu);
    }
}
