package defpackage;

/* renamed from: aoqo */
public final class aoqo extends anxl implements anzf {
    public static final aoqo f;
    private static volatile anzq h;
    public int a;
    public String b;
    public String c;
    public anyd d;
    public apxu e;
    private byte g = (byte) 2;

    private aoqo() {
        String str = "";
        this.b = str;
        this.c = str;
        this.d = anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001\b\u0000\u0002\b\u0001\u0003Л\u0004Љ\u0002", new Object[]{"a", "b", "c", "d", atwo.class, "e"});
            case 3:
                return new aoqo();
            case 4:
                return new aoqq();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (aoqo.class) {
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
        aoqo aoqo = new aoqo();
        f = aoqo;
        anxl.registerDefaultInstance(aoqo.class, aoqo);
    }
}
