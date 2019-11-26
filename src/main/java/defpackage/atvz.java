package defpackage;

/* renamed from: atvz */
public final class atvz extends anxl implements anzf {
    public static final atvz f;
    private static volatile anzq h;
    public int a;
    public avkc b;
    public awnh c;
    public awzv d;
    public ayhc e;
    private byte g = (byte) 2;

    private atvz() {
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001ᣑ↊\u0004\u0000\u0000\u0002ᣑЉ\u0000ᣑ\t\u0001᳗Љ\u0002↊\t\u0003", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new atvz();
            case 4:
                return new atvy();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (atvz.class) {
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
        atvz atvz = new atvz();
        f = atvz;
        anxl.registerDefaultInstance(atvz.class, atvz);
    }
}
