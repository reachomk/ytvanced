package defpackage;

/* renamed from: anuj */
public final class anuj extends anxl implements anzf {
    public static final anuj e;
    private static volatile anzq g;
    public int a;
    public boolean b;
    public anub c;
    public anul d;
    private byte f = (byte) 2;

    private anuj() {
        anxl.emptyProtobufList();
        anxl.emptyLongList();
        anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0003\u001e\u0003\u0000\u0000\u0001\u0003\u0007\u0002\u001c\t\u0013\u001eЉ\u0015", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new anuj();
            case 4:
                return new anui();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (anuj.class) {
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
        anuj anuj = new anuj();
        e = anuj;
        anxl.registerDefaultInstance(anuj.class, anuj);
    }
}
