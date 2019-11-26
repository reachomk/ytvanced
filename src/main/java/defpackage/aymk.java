package defpackage;

/* renamed from: aymk */
public final class aymk extends anxl implements anzf {
    public static final aymk h;
    private static volatile anzq j;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public axij c;
    public anyd d = anxl.emptyProtobufList();
    public axak e;
    public axak f;
    public axak g;
    private byte i = (byte) 2;

    private aymk() {
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
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\r\u0006\u0000\u0002\u0005\u0001Л\u0004Љ\u0001\u0007\u001b\u000bЉ\u0002\fЉ\u0003\rЉ\u0004", new Object[]{"a", "b", axih.class, "c", "d", axhs.class, "e", "f", "g"});
            case 3:
                return new aymk();
            case 4:
                return new aymm();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (aymk.class) {
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
        aymk aymk = new aymk();
        h = aymk;
        anxl.registerDefaultInstance(aymk.class, aymk);
    }
}
