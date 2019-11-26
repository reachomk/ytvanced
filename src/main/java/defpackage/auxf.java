package defpackage;

/* renamed from: auxf */
public final class auxf extends anxl implements anzf {
    private static volatile anzq A;
    public static final auxf y;
    public int a;
    public auof b;
    public auoh c;
    public apej d;
    public auph e;
    public auor f;
    public auop g;
    public aupj h;
    public auol i;
    public auoz j;
    public aunv k;
    public aupd l;
    public auoj m;
    public auob n;
    public auod o;
    public auon p;
    public aunx q;
    public aupf r;
    public auox s;
    public auot t;
    public auwl u;
    public auka v;
    public aunz w;
    public aupb x;
    private byte z = (byte) 2;

    private auxf() {
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
                return anxl.newMessageInfo(y, "\u0001\u0017\u0000\u0001ᡈ爙\u0017\u0000\u0000\u0016ᡈЉ\u0002᯦Љ\u0014ﵝῈЉ\u0006ﵾῈЉ\u0007₞Љ\bףּ₥\t\n₩Љ\u000b₯Љ\f₯Љ\u000e₯Љ\u000f₯Љ\u0010ℎЉ\u0000╛Љ\u0003⯇Љ\u0017⯌Љ\u0012ⵢЉ\u001b⽏Љ\u0013⽐Љ\t〡Љ\u0001㙁Љ\u0004㚈Љ\u0005瀞䢤Љ\u0015爙Љ\u0011", new Object[]{"a", "d", "u", "h", "i", "j", "l", "m", "n", "o", "p", "q", "b", "e", "w", "s", "x", "t", "k", "c", "f", "g", "v", "r"});
            case 3:
                return new auxf();
            case 4:
                return new auxi();
            case 5:
                return y;
            case 6:
                Object obj3 = A;
                if (obj3 == null) {
                    synchronized (auxf.class) {
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
        auxf auxf = new auxf();
        y = auxf;
        anxl.registerDefaultInstance(auxf.class, auxf);
    }
}
