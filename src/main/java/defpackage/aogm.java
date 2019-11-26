package defpackage;

/* renamed from: aogm */
public final class aogm extends anxl implements anzf {
    public static final aogm i;
    private static volatile anzq k;
    public int a;
    public ayxm b;
    public arku c;
    public axzh d;
    public atrj e;
    public atux f;
    public axbs g;
    public aolc h;
    private byte j = (byte) 2;

    private aogm() {
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
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001ﵡᵙ堂\u0007\u0000\u0000\u0006ﵡᵙЉ\u0000諾⡱\t\u0001⢠Љ\u0002⪂Љ\u0006㋶Љ\u0003䔡Љ\u0004堂Љ\u0005", new Object[]{"a", "b", "c", "d", "h", "e", "f", "g"});
            case 3:
                return new aogm();
            case 4:
                return new aogl();
            case 5:
                return i;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (aogm.class) {
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
        aogm aogm = new aogm();
        i = aogm;
        anxl.registerDefaultInstance(aogm.class, aogm);
    }
}
