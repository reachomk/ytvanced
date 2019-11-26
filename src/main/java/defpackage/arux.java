package defpackage;

/* renamed from: arux */
public final class arux extends anxl implements anzf {
    public static final arux d;
    private static volatile anzq f;
    public int a;
    public arvh b;
    public axbo c;
    private byte e = (byte) 2;

    private arux() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.e = b;
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001㕰㥚\u0002\u0000\u0000\u0002㕰Љ\u0000㥚Љ\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new arux();
            case 4:
                return new arva();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (arux.class) {
                        obj3 = f;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
                            f = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        arux arux = new arux();
        d = arux;
        anxl.registerDefaultInstance(arux.class, arux);
    }
}
