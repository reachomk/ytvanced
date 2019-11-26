package defpackage;

/* renamed from: arjq */
public final class arjq extends anxl implements anzf {
    public static final arjq g;
    private static volatile anzq i;
    public int a;
    public String b;
    public anyd c;
    public String d;
    public apxu e;
    public arjs f;
    private byte h = (byte) 2;

    private arjq() {
        String str = "";
        this.b = str;
        this.c = anxl.emptyProtobufList();
        this.d = str;
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.h = b;
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\n\u0005\u0000\u0001\u0002\u0001\b\u0000\u0002\t\u0006\u0004Л\u0005\b\u0002\nЉ\u0005", new Object[]{"a", "b", "f", "c", apxu.class, "d", "e"});
            case 3:
                return new arjq();
            case 4:
                return new arjp();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (arjq.class) {
                        obj3 = i;
                        if (obj3 == null) {
                            obj3 = new anxn(g);
                            i = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        arjq arjq = new arjq();
        g = arjq;
        anxl.registerDefaultInstance(arjq.class, arjq);
    }
}
