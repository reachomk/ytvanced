package defpackage;

/* renamed from: angf */
public final class angf extends aoca implements Cloneable {
    private andv A;
    private angk B;
    private anfm C;
    private angh D;
    private anfs E;
    private int F;
    private int G;
    public anep a;
    private anej b;
    private anga c;
    private ancc d;
    private Long e;
    private ancc[] f;
    private angi g;
    private anet h;
    private String i;
    private anen j;
    private anfk k;
    private ance l;
    private ancq m;
    private anfu n;
    private anco o;
    private aneh p;
    private anef q;
    private anev r;
    private angj s;
    private anfo t;
    private aner u;
    private anfw v;
    private anex w;
    private andx x;
    private aned y;
    private anfy z;

    public angf() {
        this.F = 0;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = new ancc[0];
        this.g = null;
        this.h = null;
        this.i = null;
        this.G = 0;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = null;
        this.a = null;
        this.z = null;
        this.A = null;
        this.B = null;
        this.C = null;
        this.D = null;
        this.E = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    private final angf a() {
        try {
            angf angf = (angf) super.clone();
            anej anej = this.b;
            if (anej != null) {
                angf.b = anej;
            }
            anga anga = this.c;
            if (anga != null) {
                angf.c = anga;
            }
            ancc ancc = this.d;
            if (ancc != null) {
                angf.d = ancc;
            }
            ancc[] anccArr = this.f;
            if (anccArr != null) {
                int length = anccArr.length;
                if (length > 0) {
                    angf.f = new ancc[length];
                    length = 0;
                    while (true) {
                        ancc[] anccArr2 = this.f;
                        if (length >= anccArr2.length) {
                            break;
                        }
                        ancc ancc2 = anccArr2[length];
                        if (ancc2 != null) {
                            angf.f[length] = ancc2;
                        }
                        length++;
                    }
                }
            }
            angi angi = this.g;
            if (angi != null) {
                angf.g = (angi) angi.clone();
            }
            anet anet = this.h;
            if (anet != null) {
                angf.h = anet;
            }
            anen anen = this.j;
            if (anen != null) {
                angf.j = anen;
            }
            anfk anfk = this.k;
            if (anfk != null) {
                angf.k = anfk;
            }
            ance ance = this.l;
            if (ance != null) {
                angf.l = ance;
            }
            ancq ancq = this.m;
            if (ancq != null) {
                angf.m = ancq;
            }
            anfu anfu = this.n;
            if (anfu != null) {
                angf.n = anfu;
            }
            anco anco = this.o;
            if (anco != null) {
                angf.o = anco;
            }
            aneh aneh = this.p;
            if (aneh != null) {
                angf.p = aneh;
            }
            anef anef = this.q;
            if (anef != null) {
                angf.q = anef;
            }
            anev anev = this.r;
            if (anev != null) {
                angf.r = anev;
            }
            angj angj = this.s;
            if (angj != null) {
                angf.s = (angj) angj.clone();
            }
            anfo anfo = this.t;
            if (anfo != null) {
                angf.t = anfo;
            }
            aner aner = this.u;
            if (aner != null) {
                angf.u = aner;
            }
            anfw anfw = this.v;
            if (anfw != null) {
                angf.v = anfw;
            }
            anex anex = this.w;
            if (anex != null) {
                angf.w = anex;
            }
            andx andx = this.x;
            if (andx != null) {
                angf.x = andx;
            }
            aned aned = this.y;
            if (aned != null) {
                angf.y = aned;
            }
            anep anep = this.a;
            if (anep != null) {
                angf.a = anep;
            }
            anfy anfy = this.z;
            if (anfy != null) {
                angf.z = anfy;
            }
            andv andv = this.A;
            if (andv != null) {
                angf.A = andv;
            }
            angk angk = this.B;
            if (angk != null) {
                angf.B = (angk) angk.clone();
            }
            anfm anfm = this.C;
            if (anfm != null) {
                angf.C = anfm;
            }
            angh angh = this.D;
            if (angh != null) {
                angf.D = (angh) angh.clone();
            }
            anfs anfs = this.E;
            if (anfs != null) {
                angf.E = anfs;
            }
            return angf;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final void writeTo(aoby aoby) {
        int i;
        anze anze = this.c;
        if (anze != null) {
            aoby.a(1, anze);
        }
        anze = this.d;
        if (anze != null) {
            aoby.a(2, anze);
        }
        Long l = this.e;
        if (l != null) {
            aoby.b(3, l.longValue());
        }
        ancc[] anccArr = this.f;
        if (anccArr != null && anccArr.length > 0) {
            i = 0;
            while (true) {
                ancc[] anccArr2 = this.f;
                if (i >= anccArr2.length) {
                    break;
                }
                anze anze2 = anccArr2[i];
                if (anze2 != null) {
                    aoby.a(4, anze2);
                }
                i++;
            }
        }
        aocf aocf = this.g;
        if (aocf != null) {
            aoby.a(5, aocf);
        }
        anze = this.h;
        if (anze != null) {
            aoby.a(6, anze);
        }
        String str = this.i;
        if (str != null) {
            aoby.a(7, str);
        }
        i = this.G;
        if (i != 0) {
            aoby.a(8, i - 1);
        }
        anze = this.j;
        if (anze != null) {
            aoby.a(9, anze);
        }
        anze = this.k;
        if (anze != null) {
            aoby.a(10, anze);
        }
        anze = this.l;
        if (anze != null) {
            aoby.a(11, anze);
        }
        anze = this.m;
        if (anze != null) {
            aoby.a(12, anze);
        }
        anze = this.n;
        if (anze != null) {
            aoby.a(13, anze);
        }
        anze = this.o;
        if (anze != null) {
            aoby.a(14, anze);
        }
        anze = this.p;
        if (anze != null) {
            aoby.a(15, anze);
        }
        anze = this.q;
        if (anze != null) {
            aoby.a(16, anze);
        }
        anze = this.r;
        if (anze != null) {
            aoby.a(17, anze);
        }
        aocf = this.s;
        if (aocf != null) {
            aoby.a(18, aocf);
        }
        anze = this.t;
        if (anze != null) {
            aoby.a(19, anze);
        }
        anze = this.u;
        if (anze != null) {
            aoby.a(20, anze);
        }
        anze = this.v;
        if (anze != null) {
            aoby.a(21, anze);
        }
        anze = this.w;
        if (anze != null) {
            aoby.a(22, anze);
        }
        anze = this.x;
        if (anze != null) {
            aoby.a(23, anze);
        }
        anze = this.y;
        if (anze != null) {
            aoby.a(24, anze);
        }
        anze = this.a;
        if (anze != null) {
            aoby.a(25, anze);
        }
        anze = this.z;
        if (anze != null) {
            aoby.a(26, anze);
        }
        anze = this.A;
        if (anze != null) {
            aoby.a(27, anze);
        }
        aocf = this.B;
        if (aocf != null) {
            aoby.a(28, aocf);
        }
        anze = this.C;
        if (anze != null) {
            aoby.a(29, anze);
        }
        i = this.F;
        if (i != 0) {
            aoby.a(30, i - 1);
        }
        aocf = this.D;
        if (aocf != null) {
            aoby.a(31, aocf);
        }
        anze = this.b;
        if (anze != null) {
            aoby.a(32, anze);
        }
        anze = this.E;
        if (anze != null) {
            aoby.a(33, anze);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int i;
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.c;
        if (anze != null) {
            computeSerializedSize += anwm.c(1, anze);
        }
        anze = this.d;
        if (anze != null) {
            computeSerializedSize += anwm.c(2, anze);
        }
        Long l = this.e;
        if (l != null) {
            computeSerializedSize += aoby.d(3, l.longValue());
        }
        ancc[] anccArr = this.f;
        if (anccArr != null && anccArr.length > 0) {
            i = 0;
            while (true) {
                ancc[] anccArr2 = this.f;
                if (i >= anccArr2.length) {
                    break;
                }
                anze anze2 = anccArr2[i];
                if (anze2 != null) {
                    computeSerializedSize += anwm.c(4, anze2);
                }
                i++;
            }
        }
        aocf aocf = this.g;
        if (aocf != null) {
            computeSerializedSize += aoby.b(5, aocf);
        }
        anze = this.h;
        if (anze != null) {
            computeSerializedSize += anwm.c(6, anze);
        }
        String str = this.i;
        if (str != null) {
            computeSerializedSize += aoby.b(7, str);
        }
        i = this.G;
        if (i != 0) {
            computeSerializedSize += aoby.c(8, i - 1);
        }
        anze = this.j;
        if (anze != null) {
            computeSerializedSize += anwm.c(9, anze);
        }
        anze = this.k;
        if (anze != null) {
            computeSerializedSize += anwm.c(10, anze);
        }
        anze = this.l;
        if (anze != null) {
            computeSerializedSize += anwm.c(11, anze);
        }
        anze = this.m;
        if (anze != null) {
            computeSerializedSize += anwm.c(12, anze);
        }
        anze = this.n;
        if (anze != null) {
            computeSerializedSize += anwm.c(13, anze);
        }
        anze = this.o;
        if (anze != null) {
            computeSerializedSize += anwm.c(14, anze);
        }
        anze = this.p;
        if (anze != null) {
            computeSerializedSize += anwm.c(15, anze);
        }
        anze = this.q;
        if (anze != null) {
            computeSerializedSize += anwm.c(16, anze);
        }
        anze = this.r;
        if (anze != null) {
            computeSerializedSize += anwm.c(17, anze);
        }
        aocf = this.s;
        if (aocf != null) {
            computeSerializedSize += aoby.b(18, aocf);
        }
        anze = this.t;
        if (anze != null) {
            computeSerializedSize += anwm.c(19, anze);
        }
        anze = this.u;
        if (anze != null) {
            computeSerializedSize += anwm.c(20, anze);
        }
        anze = this.v;
        if (anze != null) {
            computeSerializedSize += anwm.c(21, anze);
        }
        anze = this.w;
        if (anze != null) {
            computeSerializedSize += anwm.c(22, anze);
        }
        anze = this.x;
        if (anze != null) {
            computeSerializedSize += anwm.c(23, anze);
        }
        anze = this.y;
        if (anze != null) {
            computeSerializedSize += anwm.c(24, anze);
        }
        anze = this.a;
        if (anze != null) {
            computeSerializedSize += anwm.c(25, anze);
        }
        anze = this.z;
        if (anze != null) {
            computeSerializedSize += anwm.c(26, anze);
        }
        anze = this.A;
        if (anze != null) {
            computeSerializedSize += anwm.c(27, anze);
        }
        aocf = this.B;
        if (aocf != null) {
            computeSerializedSize += aoby.b(28, aocf);
        }
        anze = this.C;
        if (anze != null) {
            computeSerializedSize += anwm.c(29, anze);
        }
        i = this.F;
        if (i != 0) {
            computeSerializedSize += aoby.c(30, i - 1);
        }
        aocf = this.D;
        if (aocf != null) {
            computeSerializedSize += aoby.b(31, aocf);
        }
        anze = this.b;
        if (anze != null) {
            computeSerializedSize += anwm.c(32, anze);
        }
        anze = this.E;
        return anze != null ? computeSerializedSize + anwm.c(33, anze) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            int i = 5;
            int i2;
            int f;
            switch (a) {
                case 0:
                    break;
                case 10:
                    anga anga = (anga) aobv.a(anga.a.getParserForType());
                    anga anga2 = this.c;
                    if (anga2 != null) {
                        anfz anfz = (anfz) ((anxo) anga2.toBuilder());
                        anfz.mergeFrom(anga);
                        anga = (anga) ((anxl) anfz.build());
                    }
                    this.c = anga;
                    continue;
                case 18:
                    ancc ancc = (ancc) aobv.a(ancc.a.getParserForType());
                    ancc ancc2 = this.d;
                    if (ancc2 != null) {
                        ancb ancb = (ancb) ((anxo) ancc2.toBuilder());
                        ancb.mergeFrom(ancc);
                        ancc = (ancc) ((anxl) ancb.build());
                    }
                    this.d = ancc;
                    continue;
                case 24:
                    this.e = Long.valueOf(aobv.g());
                    continue;
                case 34:
                    a = aock.a(aobv, 34);
                    ancc[] anccArr = this.f;
                    int length = anccArr != null ? anccArr.length : 0;
                    ancc[] anccArr2 = new ancc[(a + length)];
                    if (length != 0) {
                        System.arraycopy(anccArr, 0, anccArr2, 0, length);
                    }
                    while (length < anccArr2.length - 1) {
                        anccArr2[length] = (ancc) aobv.a(ancc.a.getParserForType());
                        aobv.a();
                        length++;
                    }
                    anccArr2[length] = (ancc) aobv.a(ancc.a.getParserForType());
                    this.f = anccArr2;
                    continue;
                case 42:
                    if (this.g == null) {
                        this.g = new angi();
                    }
                    aobv.a(this.g);
                    continue;
                case cv.aU /*50*/:
                    anet anet = (anet) aobv.a(anet.a.getParserForType());
                    anet anet2 = this.h;
                    if (anet2 != null) {
                        anew anew = (anew) ((anxo) anet2.toBuilder());
                        anew.mergeFrom(anet);
                        anet = (anet) ((anxl) anew.build());
                    }
                    this.h = anet;
                    continue;
                case 58:
                    this.i = aobv.d();
                    continue;
                case 64:
                    i2 = aobv.b;
                    f = aobv.f();
                    if (!(f == 11 || f == 21)) {
                        switch (f) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                break;
                            default:
                                aobv.e(i2);
                                storeUnknownField(aobv, a);
                                continue;
                                continue;
                        }
                    }
                    if (f == 11) {
                        i = 12;
                    } else if (f != 21) {
                        switch (f) {
                            case 0:
                                i = 1;
                                break;
                            case 1:
                                i = 2;
                                break;
                            case 2:
                                i = 3;
                                break;
                            case 3:
                                i = 4;
                                break;
                            case 4:
                                break;
                            case 5:
                                i = 6;
                                break;
                            case 6:
                                i = 7;
                                break;
                            default:
                                i = 0;
                                break;
                        }
                    } else {
                        i = 22;
                    }
                    this.G = i;
                    break;
                case 74:
                    anen anen = (anen) aobv.a(anen.a.getParserForType());
                    anen anen2 = this.j;
                    if (anen2 != null) {
                        aneq aneq = (aneq) ((anxo) anen2.toBuilder());
                        aneq.mergeFrom(anen);
                        anen = (anen) ((anxl) aneq.build());
                    }
                    this.j = anen;
                    continue;
                case 82:
                    anfk anfk = (anfk) aobv.a(anfk.a.getParserForType());
                    anfk anfk2 = this.k;
                    if (anfk2 != null) {
                        anfj anfj = (anfj) ((anxo) anfk2.toBuilder());
                        anfj.mergeFrom(anfk);
                        anfk = (anfk) ((anxl) anfj.build());
                    }
                    this.k = anfk;
                    continue;
                case 90:
                    ance ance = (ance) aobv.a(ance.a.getParserForType());
                    ance ance2 = this.l;
                    if (ance2 != null) {
                        ancd ancd = (ancd) ((anxo) ance2.toBuilder());
                        ancd.mergeFrom(ance);
                        ance = (ance) ((anxl) ancd.build());
                    }
                    this.l = ance;
                    continue;
                case 98:
                    ancq ancq = (ancq) aobv.a(ancq.a.getParserForType());
                    ancq ancq2 = this.m;
                    if (ancq2 != null) {
                        ancp ancp = (ancp) ((anxo) ancq2.toBuilder());
                        ancp.mergeFrom(ancq);
                        ancq = (ancq) ((anxl) ancp.build());
                    }
                    this.m = ancq;
                    continue;
                case 106:
                    anfu anfu = (anfu) aobv.a(anfu.a.getParserForType());
                    anfu anfu2 = this.n;
                    if (anfu2 != null) {
                        anft anft = (anft) ((anxo) anfu2.toBuilder());
                        anft.mergeFrom(anfu);
                        anfu = (anfu) ((anxl) anft.build());
                    }
                    this.n = anfu;
                    continue;
                case 114:
                    anco anco = (anco) aobv.a(anco.a.getParserForType());
                    anco anco2 = this.o;
                    if (anco2 != null) {
                        ancn ancn = (ancn) ((anxo) anco2.toBuilder());
                        ancn.mergeFrom(anco);
                        anco = (anco) ((anxl) ancn.build());
                    }
                    this.o = anco;
                    continue;
                case afy.av /*122*/:
                    aneh aneh = (aneh) aobv.a(aneh.a.getParserForType());
                    aneh aneh2 = this.p;
                    if (aneh2 != null) {
                        anek anek = (anek) ((anxo) aneh2.toBuilder());
                        anek.mergeFrom(aneh);
                        aneh = (aneh) ((anxl) anek.build());
                    }
                    this.p = aneh;
                    continue;
                case 130:
                    anef anef = (anef) aobv.a(anef.a.getParserForType());
                    anef anef2 = this.q;
                    if (anef2 != null) {
                        anei anei = (anei) ((anxo) anef2.toBuilder());
                        anei.mergeFrom(anef);
                        anef = (anef) ((anxl) anei.build());
                    }
                    this.q = anef;
                    continue;
                case 138:
                    anev anev = (anev) aobv.a(anev.a.getParserForType());
                    anev anev2 = this.r;
                    if (anev2 != null) {
                        aney aney = (aney) ((anxo) anev2.toBuilder());
                        aney.mergeFrom(anev);
                        anev = (anev) ((anxl) aney.build());
                    }
                    this.r = anev;
                    continue;
                case 146:
                    if (this.s == null) {
                        this.s = new angj();
                    }
                    aobv.a(this.s);
                    continue;
                case 154:
                    anfo anfo = (anfo) aobv.a(anfo.a.getParserForType());
                    anfo anfo2 = this.t;
                    if (anfo2 != null) {
                        anfn anfn = (anfn) ((anxo) anfo2.toBuilder());
                        anfn.mergeFrom(anfo);
                        anfo = (anfo) ((anxl) anfn.build());
                    }
                    this.t = anfo;
                    continue;
                case 162:
                    aner aner = (aner) aobv.a(aner.a.getParserForType());
                    aner aner2 = this.u;
                    if (aner2 != null) {
                        aneu aneu = (aneu) ((anxo) aner2.toBuilder());
                        aneu.mergeFrom(aner);
                        aner = (aner) ((anxl) aneu.build());
                    }
                    this.u = aner;
                    continue;
                case 170:
                    anfw anfw = (anfw) aobv.a(anfw.a.getParserForType());
                    anfw anfw2 = this.v;
                    if (anfw2 != null) {
                        anfv anfv = (anfv) ((anxo) anfw2.toBuilder());
                        anfv.mergeFrom(anfw);
                        anfw = (anfw) ((anxl) anfv.build());
                    }
                    this.v = anfw;
                    continue;
                case 178:
                    anex anex = (anex) aobv.a(anex.DEFAULT_INSTANCE.getParserForType());
                    anex anex2 = this.w;
                    if (anex2 != null) {
                        anfc anfc = (anfc) ((anxo) anex2.toBuilder());
                        anfc.mergeFrom(anex);
                        anex = (anex) ((anxl) anfc.build());
                    }
                    this.w = anex;
                    continue;
                case 186:
                    andx andx = (andx) aobv.a(andx.a.getParserForType());
                    andx andx2 = this.x;
                    if (andx2 != null) {
                        anea anea = (anea) ((anxo) andx2.toBuilder());
                        anea.mergeFrom(andx);
                        andx = (andx) ((anxl) anea.build());
                    }
                    this.x = andx;
                    continue;
                case 194:
                    aned aned = (aned) aobv.a(aned.a.getParserForType());
                    aned aned2 = this.y;
                    if (aned2 != null) {
                        aneg aneg = (aneg) ((anxo) aned2.toBuilder());
                        aneg.mergeFrom(aned);
                        aned = (aned) ((anxl) aneg.build());
                    }
                    this.y = aned;
                    continue;
                case 202:
                    anep anep = (anep) aobv.a(anep.e.getParserForType());
                    anep anep2 = this.a;
                    if (anep2 != null) {
                        anes anes = (anes) ((anxo) anep2.toBuilder());
                        anes.mergeFrom(anep);
                        anep = (anep) ((anxl) anes.build());
                    }
                    this.a = anep;
                    continue;
                case 210:
                    anfy anfy = (anfy) aobv.a(anfy.a.getParserForType());
                    anfy anfy2 = this.z;
                    if (anfy2 != null) {
                        anfx anfx = (anfx) ((anxo) anfy2.toBuilder());
                        anfx.mergeFrom(anfy);
                        anfy = (anfy) ((anxl) anfx.build());
                    }
                    this.z = anfy;
                    continue;
                case 218:
                    andv andv = (andv) aobv.a(andv.a.getParserForType());
                    andv andv2 = this.A;
                    if (andv2 != null) {
                        andy andy = (andy) ((anxo) andv2.toBuilder());
                        andy.mergeFrom(andv);
                        andv = (andv) ((anxl) andy.build());
                    }
                    this.A = andv;
                    continue;
                case 226:
                    if (this.B == null) {
                        this.B = new angk();
                    }
                    aobv.a(this.B);
                    continue;
                case 234:
                    anfm anfm = (anfm) aobv.a(anfm.a.getParserForType());
                    anfm anfm2 = this.C;
                    if (anfm2 != null) {
                        anfl anfl = (anfl) ((anxo) anfm2.toBuilder());
                        anfl.mergeFrom(anfm);
                        anfm = (anfm) ((anxl) anfl.build());
                    }
                    this.C = anfm;
                    continue;
                case 240:
                    i2 = aobv.b;
                    f = aobv.f();
                    if (f == 0 || f == 1 || f == 2 || f == 3 || f == 4) {
                        if (f == 0) {
                            i = 1;
                        } else if (f == 1) {
                            i = 2;
                        } else if (f == 2) {
                            i = 3;
                        } else if (f == 3) {
                            i = 4;
                        } else if (f != 4) {
                            i = 0;
                        }
                        this.F = i;
                        break;
                    }
                    aobv.e(i2);
                    storeUnknownField(aobv, a);
                    continue;
                case 250:
                    if (this.D == null) {
                        this.D = new angh();
                    }
                    aobv.a(this.D);
                    continue;
                case 258:
                    anej anej = (anej) aobv.a(anej.a.getParserForType());
                    anej anej2 = this.b;
                    if (anej2 != null) {
                        anem anem = (anem) ((anxo) anej2.toBuilder());
                        anem.mergeFrom(anej);
                        anej = (anej) ((anxl) anem.build());
                    }
                    this.b = anej;
                    continue;
                case 266:
                    anfs anfs = (anfs) aobv.a(anfs.a.getParserForType());
                    anfs anfs2 = this.E;
                    if (anfs2 != null) {
                        anfr anfr = (anfr) ((anxo) anfs2.toBuilder());
                        anfr.mergeFrom(anfs);
                        anfs = (anfs) ((anxl) anfr.build());
                    }
                    this.E = anfs;
                    continue;
                default:
                    if (!super.storeUnknownField(aobv, a)) {
                        break;
                    }
                    continue;
            }
        }
        return this;
    }
}
