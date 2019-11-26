package defpackage;

/* renamed from: arvt */
public final class arvt extends anxl implements anzf {
    private static volatile anzq A;
    public static final arvt y;
    public int a;
    public int b;
    public aujp c;
    public aude d;
    public aume e;
    public avao f;
    public avga g;
    public avoa h;
    public avpu i;
    public ayva j;
    public auuo k;
    public awdw l;
    public aysl m;
    public aukv n;
    public axdg o;
    public aopb p;
    public avmc q;
    public aqdj r;
    public azaa s;
    public awus t;
    public awwh u;
    public awxk v;
    public arcm w;
    public aydo x;
    private byte z = (byte) 2;

    private arvt() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.z);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.z = b;
                return null;
            case 2:
                return anxl.newMessageInfo(y, "\u0001\u0016\u0000\u0002︿Ḗ疺\u0016\u0000\u0000\u0003︿ḖЉ\u0012㧯\t\n㻝\t\u0007㻱\t\t㼮\t\u0006㽲Љ\b㿓\t\f䃘\t\u0004䈏Љ\u000e䈱\t\u000f䘱\t\u0013䝠\t\u0014䪉\t\u0015䴰\t\u0016侷\t\u0018俫\t\u0005君\t\u001c妬\t\u001d弐\t\u001e摧\t\u001f撄\t 疺\t%", new Object[]{"a", "b", "m", "i", "f", "h", "e", "g", "j", "c", "k", "l", "n", "o", "p", "q", "r", "d", "s", "t", "u", "v", "w", "x"});
            case 3:
                return new arvt();
            case 4:
                return new arvw();
            case 5:
                return y;
            case 6:
                Object obj3 = A;
                if (obj3 == null) {
                    synchronized (arvt.class) {
                        obj3 = A;
                        if (obj3 == null) {
                            obj3 = new anxn(y);
                            A = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        arvt arvt = new arvt();
        y = arvt;
        anxl.registerDefaultInstance(arvt.class, arvt);
    }
}
