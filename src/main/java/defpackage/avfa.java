package defpackage;

/* renamed from: avfa */
public final class avfa extends anxl implements anzf {
    public static final avfa e;
    private static volatile anzq g;
    public int a;
    public avey b;
    public auvr c;
    public axjz d;
    private byte f = (byte) 2;

    private avfa() {
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.f = b;
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0004\b\u0003\u0000\u0000\u0003\u0004Љ\u0002\u0007Љ\u0003\bЉ\u0004", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new avfa();
            case 4:
                return new avez();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (avfa.class) {
                        obj3 = g;
                        if (obj3 == null) {
                            obj3 = new anxn(e);
                            g = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        avfa avfa = new avfa();
        e = avfa;
        anxl.registerDefaultInstance(avfa.class, avfa);
    }
}
