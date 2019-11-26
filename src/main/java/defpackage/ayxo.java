package defpackage;

/* renamed from: ayxo */
public final class ayxo extends anxl implements anzf {
    public static final ayxo h;
    private static volatile anzq j;
    public int a;
    public aygk b;
    public aygo c;
    public aygo d;
    public anyd e = anxl.emptyProtobufList();
    public String f = "";
    public int g;
    private byte i = (byte) 2;

    private ayxo() {
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
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0003\u0001Љ\u0000\u0002\u001b\u0004\b\u0004\u0005Љ\u0001\u0006Љ\u0002\u0007\u0004\u0005", new Object[]{"a", "b", "e", ayxq.class, "f", "c", "d", "g"});
            case 3:
                return new ayxo();
            case 4:
                return new ayxr();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (ayxo.class) {
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
        ayxo ayxo = new ayxo();
        h = ayxo;
        anxl.registerDefaultInstance(ayxo.class, ayxo);
    }
}
