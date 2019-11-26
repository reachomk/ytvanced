package defpackage;

/* renamed from: attr */
public final class attr extends anxl implements anzf {
    public static final attr l;
    private static volatile anzq n;
    public int a;
    public int b = 0;
    public Object c;
    public arml d;
    public arml e;
    public arml f;
    public anyd g = anxl.emptyProtobufList();
    public aygk h;
    public anyd i = anxl.emptyProtobufList();
    public arml j;
    public axak k;
    private byte m = (byte) 2;

    private attr() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.m = b;
                return null;
            case 2:
                return anxl.newMessageInfo(l, "\u0001\t\u0001\u0001\u0002\n\t\u0000\u0002\t\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0003\u0005Л\u0006м\u0000\u0007Љ\u0005\bЛ\tЉ\u0006\nЉ\u0007", new Object[]{"c", "b", "a", "d", "e", "f", "g", axak.class, aygk.class, "h", "i", axak.class, "j", "k"});
            case 3:
                return new attr();
            case 4:
                return new attq();
            case 5:
                return l;
            case 6:
                Object obj3 = n;
                if (obj3 == null) {
                    synchronized (attr.class) {
                        obj3 = n;
                        if (obj3 == null) {
                            obj3 = new anxn(l);
                            n = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        attr attr = new attr();
        l = attr;
        anxl.registerDefaultInstance(attr.class, attr);
    }
}
