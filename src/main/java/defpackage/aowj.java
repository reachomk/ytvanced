package defpackage;

/* renamed from: aowj */
public final class aowj extends anxl implements anzf {
    public static final aowj h;
    private static volatile anzq j;
    public int a;
    public String b = "";
    public boolean c;
    public boolean d;
    public apxu e;
    public apxu f;
    public apxu g;
    private byte i = (byte) 2;

    private aowj() {
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
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0003\u0001\b\u0000\u0002\u0007\u0001\u0003Љ\u0003\u0004Љ\u0004\u0005Љ\u0005\u0006\u0007\u0002", new Object[]{"a", "b", "c", "e", "f", "g", "d"});
            case 3:
                return new aowj();
            case 4:
                return new aowk();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (aowj.class) {
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
        aowj aowj = new aowj();
        h = aowj;
        anxl.registerDefaultInstance(aowj.class, aowj);
    }
}
