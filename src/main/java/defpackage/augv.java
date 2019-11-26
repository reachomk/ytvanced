package defpackage;

/* renamed from: augv */
public final class augv extends anxl implements anzf {
    public static final augv k;
    private static volatile anzq m;
    public int a;
    public String b;
    public aygk c;
    public int d;
    public int e;
    public int f;
    public int g;
    public apxu h;
    public String i;
    public anyd j;
    private byte l = (byte) 2;

    private augv() {
        String str = "";
        this.b = str;
        this.i = str;
        this.j = anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.l = b;
                return null;
            case 2:
                return anxl.newMessageInfo(k, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0001\u0003\u0001\b\u0000\u0002Љ\u0001\u0003\u000b\u0002\u0004\u000b\u0003\u0005\u000b\u0004\u0006\u000b\u0005\u0007Љ\u0006\b\b\u0007\nЛ", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", aygk.class});
            case 3:
                return new augv();
            case 4:
                return new augu();
            case 5:
                return k;
            case 6:
                Object obj3 = m;
                if (obj3 == null) {
                    synchronized (augv.class) {
                        obj3 = m;
                        if (obj3 == null) {
                            obj3 = new anxn(k);
                            m = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        augv augv = new augv();
        k = augv;
        anxl.registerDefaultInstance(augv.class, augv);
    }
}
