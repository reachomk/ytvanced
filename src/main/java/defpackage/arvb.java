package defpackage;

/* renamed from: arvb */
public final class arvb extends anxp implements anzf {
    public static final arvb i;
    private static volatile anzq k;
    public int a;
    public arux b;
    public aruz c;
    public aruv d;
    public axak e;
    public axak f;
    public axak g;
    private byte j = (byte) 2;

    private arvb() {
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.j = b;
                return null;
            case 2:
                return anxl.newMessageInfo(i, "\u0001\u0006\u0000\u0001\u0004\f\u0006\u0000\u0000\u0006\u0004Љ\u0000\u0005Љ\u0001\tЉ\u0005\nЉ\u0007\u000bЉ\b\fЉ\u0006", new Object[]{"a", "b", "c", "d", "f", "g", "e"});
            case 3:
                return new arvb();
            case 4:
                return new arve();
            case 5:
                return i;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (arvb.class) {
                        obj3 = k;
                        if (obj3 == null) {
                            obj3 = new anxn(i);
                            k = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        arvb arvb = new arvb();
        i = arvb;
        anxl.registerDefaultInstance(arvb.class, arvb);
    }
}
