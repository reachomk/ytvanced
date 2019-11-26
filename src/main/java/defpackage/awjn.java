package defpackage;

/* renamed from: awjn */
public final class awjn extends anxl implements anzf {
    public static final awjn f;
    private static volatile anzq h;
    public int a;
    public avkc b;
    public avkg c;
    public awnh d;
    public awzv e;
    private byte g = (byte) 2;

    private awjn() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.g = b;
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001ᣑﰖ㯒\u0004\u0000\u0000\u0003ᣑЉ\u0000ᣑ\t\u0002᳗Љ\u0003ﰖ㯒Љ\u0001", new Object[]{"a", "b", "d", "e", "c"});
            case 3:
                return new awjn();
            case 4:
                return new awjm();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (awjn.class) {
                        obj3 = h;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
                            h = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        awjn awjn = new awjn();
        f = awjn;
        anxl.registerDefaultInstance(awjn.class, awjn);
    }
}
