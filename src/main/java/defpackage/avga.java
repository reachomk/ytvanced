package defpackage;

/* renamed from: avga */
public final class avga extends anxl implements anzf {
    public static final avga e;
    private static volatile anzq g;
    public int a;
    public int b;
    public avfy c;
    public apxu d;
    private byte f = (byte) 2;

    private avga() {
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
                return anxl.newMessageInfo(e, "\u0001\u0002\u0000\u0002\u001di\u0002\u0000\u0000\u0002\u001dЉ\u0011iЉ6", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new avga();
            case 4:
                return new avfz();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (avga.class) {
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
        avga avga = new avga();
        e = avga;
        anxl.registerDefaultInstance(avga.class, avga);
    }
}
