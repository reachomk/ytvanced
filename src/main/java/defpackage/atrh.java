package defpackage;

/* renamed from: atrh */
public final class atrh extends anxl implements anzf {
    public static final atrh j;
    private static volatile anzq l;
    public int a;
    public axak b;
    public axak c;
    public axak d;
    public axak e;
    public axak f;
    public axak g;
    public axak h;
    public axak i;
    private byte k = (byte) 2;

    private atrh() {
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
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001\u0001\u000b\b\u0000\u0000\b\u0001Љ\u0000\u0004Љ\u0001\u0006Љ\u0003\u0007Љ\u0004\bЉ\u0005\tЉ\u0002\nЉ\u0007\u000bЉ\b", new Object[]{"a", "b", "c", "e", "f", "g", "d", "h", "i"});
            case 3:
                return new atrh();
            case 4:
                return new atrg();
            case 5:
                return j;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (atrh.class) {
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
        atrh atrh = new atrh();
        j = atrh;
        anxl.registerDefaultInstance(atrh.class, atrh);
    }
}
