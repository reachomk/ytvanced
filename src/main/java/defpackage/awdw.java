package defpackage;

/* renamed from: awdw */
public final class awdw extends anxl implements anzf {
    public static final awdw E;
    private static volatile anzq F;
    public boolean A;
    public int B;
    public boolean C;
    public boolean D;
    public int a;
    public int b;
    public int c;
    public aoum d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public int z;

    private awdw() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(E, "\u0001\u001b\u0000\u0003\f威\u001b\u0000\u0000\u0000\f\u0007,\r\u0007-\u0010\u00070\u001b\u00077\u001e\u00049 \u0007;\"\u0004='\u0007B)\u0007D୍\u0007\u001aﮀ䈿\t\u0000䎣\u0007\u0007ﱥ䔘\u0007\n請䔳\u0007\u000b䔴\u0007\b䢒\u0007\u0014䢒\u0004\u0015精䷙\u0007\u0016伍\u0007\u0011厙\u0004\u0005咡\u0007\u001d唀\u0007\u001e囫\u0007!墶\u0007%墷\u0007&夃\u0007)威\u0007'", new Object[]{"a", "b", "c", "v", "w", "x", "y", "z", "A", "B", "C", "D", "n", "d", "f", "h", "i", "g", "k", "l", "m", "j", "e", "o", "p", "q", "r", "s", "u", "t"});
            case 3:
                return new awdw();
            case 4:
                return new awdv();
            case 5:
                return E;
            case 6:
                Object obj3 = F;
                if (obj3 == null) {
                    synchronized (awdw.class) {
                        obj3 = F;
                        if (obj3 == null) {
                            obj3 = new anxn(E);
                            F = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        awdw awdw = new awdw();
        E = awdw;
        anxl.registerDefaultInstance(awdw.class, awdw);
    }
}
