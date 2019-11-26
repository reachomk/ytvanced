package defpackage;

/* renamed from: audn */
public final class audn extends anxl implements anzf {
    public static final audn j;
    private static volatile anzq l;
    public int a;
    public String b = "";
    public arml c;
    public axak d;
    public arml e;
    public axak f;
    public axak g;
    public axak h;
    public anyd i = anxl.emptyProtobufList();
    private byte k = (byte) 2;

    private audn() {
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.k = b;
                return null;
            case 2:
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001\u0001\r\b\u0000\u0001\u0007\u0001\b\u0000\u0003Љ\u0003\u0004Љ\u0004\u0005Љ\u0005\u0006Љ\u0006\u0007Љ\u0007\bЛ\rЉ\u0002", new Object[]{"a", "b", "d", "e", "f", "g", "h", "i", axak.class, "c"});
            case 3:
                return new audn();
            case 4:
                return new audm();
            case 5:
                return j;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (audn.class) {
                        obj3 = l;
                        if (obj3 == null) {
                            obj3 = new anxn(j);
                            l = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        audn audn = new audn();
        j = audn;
        anxl.registerDefaultInstance(audn.class, audn);
    }
}
