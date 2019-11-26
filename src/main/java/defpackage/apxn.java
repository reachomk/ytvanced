package defpackage;

/* renamed from: apxn */
public final class apxn extends anxl implements anzf {
    public static final apxn w;
    private static volatile anzq y;
    public int a;
    public int b;
    public String c = "";
    public aosl d;
    public aulu e;
    public aoot f;
    public aorv g;
    public aoeg h;
    public auya i;
    public aoqn j;
    public axam k;
    public avnm l;
    public auqv m;
    public avam n;
    public aukm o;
    public ayuw p;
    public aukc q;
    public aycu r;
    public awde s;
    public avlu t;
    public awuo u;
    public aqdh v;
    private byte x = (byte) 2;

    private apxn() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.x);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.x = b;
                return null;
            case 2:
                return anxl.newMessageInfo(w, "\u0001\u0014\u0000\u0002\u0001損\u0014\u0000\u0000\u0001\u0001\b\u0000㖈\t\u0003㻒\t\u0004祉㼞\t\b㾐\t\t䀼\t\u0005䁟Љ\n䂞\t\u000b䕮\t\u000e䠑\t\u0013䡟\t\u0014䯔\t\u0015䵲\t\u0018为\t\u0019ﱷ亀\t\u001aﲘ兪\t\u001d劎\t\u001eﾦ塍\t!帧\t#損\t$", new Object[]{"a", "b", "c", "d", "e", "g", "h", "f", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v"});
            case 3:
                return new apxn();
            case 4:
                return new apxm();
            case 5:
                return w;
            case 6:
                Object obj3 = y;
                if (obj3 == null) {
                    synchronized (apxn.class) {
                        obj3 = y;
                        if (obj3 == null) {
                            obj3 = new anxn(w);
                            y = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        apxn apxn = new apxn();
        w = apxn;
        anxl.registerDefaultInstance(apxn.class, apxn);
    }
}
