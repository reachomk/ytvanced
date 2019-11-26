package defpackage;

/* renamed from: auvj */
public final class auvj extends anxl implements anzf {
    public static final auvj j;
    private static volatile anzq l;
    public int a;
    public auvl b;
    public auvp c;
    public auwb d;
    public auvd e;
    public auvf f;
    public ayqf g;
    public ayqh h;
    public auvt i;
    private byte k = (byte) 2;

    private auvj() {
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
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001ᾮﺥ瓧\b\u0000\u0000\bᾮЉ\u0000ᾮЉ\u0001ﶃⓖЉ\u0004ⓗЉ\u0003▚Љ\u0002櫀Љ\u0006﹉淹Љ\u0007ﺥ瓧Љ\b", new Object[]{"a", "b", "c", "f", "e", "d", "g", "h", "i"});
            case 3:
                return new auvj();
            case 4:
                return new auvm();
            case 5:
                return j;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (auvj.class) {
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
        auvj auvj = new auvj();
        j = auvj;
        anxl.registerDefaultInstance(auvj.class, auvj);
    }
}
