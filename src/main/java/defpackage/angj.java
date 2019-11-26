package defpackage;

/* renamed from: angj */
public final class angj extends aoca implements Cloneable {
    private Integer a;
    private String b;
    private anel c;
    private int d;

    public angj() {
        this.d = 0;
        this.a = null;
        this.b = null;
        this.c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    /* renamed from: a */
    public final angj clone() {
        try {
            angj angj = (angj) super.clone();
            anel anel = this.c;
            if (anel != null) {
                angj.c = anel;
            }
            return angj;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final void writeTo(aoby aoby) {
        int i = this.d;
        if (i != 0) {
            aoby.a(1, i - 1);
        }
        Integer num = this.a;
        if (num != null) {
            aoby.a(2, num.intValue());
        }
        String str = this.b;
        if (str != null) {
            aoby.a(3, str);
        }
        anze anze = this.c;
        if (anze != null) {
            aoby.a(4, anze);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.d;
        if (i != 0) {
            computeSerializedSize += aoby.c(1, i - 1);
        }
        Integer num = this.a;
        if (num != null) {
            computeSerializedSize += aoby.c(2, num.intValue());
        }
        String str = this.b;
        if (str != null) {
            computeSerializedSize += aoby.b(3, str);
        }
        anze anze = this.c;
        return anze != null ? computeSerializedSize + anwm.c(4, anze) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 8) {
                int i = aobv.b;
                int f = aobv.f();
                int i2 = 1;
                if (!(f == 0 || f == 1)) {
                    switch (f) {
                        case 1000:
                        case 1001:
                        case 1002:
                        case 1003:
                        case 1004:
                        case 1005:
                        case 1006:
                        case 1007:
                        case 1008:
                            break;
                        default:
                            switch (f) {
                                case 2000:
                                case 2001:
                                case 2002:
                                case 2003:
                                case 2004:
                                case 2005:
                                case 2006:
                                case 2007:
                                case 2008:
                                case 2009:
                                case 2010:
                                case 2011:
                                case 2012:
                                case 2013:
                                case 2014:
                                case 2015:
                                case 2016:
                                case 2017:
                                case 2018:
                                case 2019:
                                case 2020:
                                case 2021:
                                    break;
                                default:
                                    switch (f) {
                                        case 3000:
                                        case 3001:
                                        case 3002:
                                        case 3003:
                                        case 3004:
                                        case 3005:
                                        case 3006:
                                        case 3007:
                                        case 3008:
                                        case 3009:
                                        case 3010:
                                        case 3011:
                                        case 3012:
                                        case 3013:
                                        case 3014:
                                            break;
                                        default:
                                            aobv.e(i);
                                            storeUnknownField(aobv, a);
                                            continue;
                                            continue;
                                            continue;
                                    }
                            }
                    }
                }
                if (f != 0) {
                    if (f != 1) {
                        switch (f) {
                            case 1000:
                                i2 = 1001;
                                break;
                            case 1001:
                                i2 = 1002;
                                break;
                            case 1002:
                                i2 = 1003;
                                break;
                            case 1003:
                                i2 = 1004;
                                break;
                            case 1004:
                                i2 = 1005;
                                break;
                            case 1005:
                                i2 = 1006;
                                break;
                            case 1006:
                                i2 = 1007;
                                break;
                            case 1007:
                                i2 = 1008;
                                break;
                            case 1008:
                                i2 = 1009;
                                break;
                            default:
                                switch (f) {
                                    case 2000:
                                        i2 = 2001;
                                        break;
                                    case 2001:
                                        i2 = 2002;
                                        break;
                                    case 2002:
                                        i2 = 2003;
                                        break;
                                    case 2003:
                                        i2 = 2004;
                                        break;
                                    case 2004:
                                        i2 = 2005;
                                        break;
                                    case 2005:
                                        i2 = 2006;
                                        break;
                                    case 2006:
                                        i2 = 2007;
                                        break;
                                    case 2007:
                                        i2 = 2008;
                                        break;
                                    case 2008:
                                        i2 = 2009;
                                        break;
                                    case 2009:
                                        i2 = 2010;
                                        break;
                                    case 2010:
                                        i2 = 2011;
                                        break;
                                    case 2011:
                                        i2 = 2012;
                                        break;
                                    case 2012:
                                        i2 = 2013;
                                        break;
                                    case 2013:
                                        i2 = 2014;
                                        break;
                                    case 2014:
                                        i2 = 2015;
                                        break;
                                    case 2015:
                                        i2 = 2016;
                                        break;
                                    case 2016:
                                        i2 = 2017;
                                        break;
                                    case 2017:
                                        i2 = 2018;
                                        break;
                                    case 2018:
                                        i2 = 2019;
                                        break;
                                    case 2019:
                                        i2 = 2020;
                                        break;
                                    case 2020:
                                        i2 = 2021;
                                        break;
                                    case 2021:
                                        i2 = 2022;
                                        break;
                                    default:
                                        switch (f) {
                                            case 3000:
                                                i2 = 3001;
                                                break;
                                            case 3001:
                                                i2 = 3002;
                                                break;
                                            case 3002:
                                                i2 = 3003;
                                                break;
                                            case 3003:
                                                i2 = 3004;
                                                break;
                                            case 3004:
                                                i2 = 3005;
                                                break;
                                            case 3005:
                                                i2 = 3006;
                                                break;
                                            case 3006:
                                                i2 = 3007;
                                                break;
                                            case 3007:
                                                i2 = 3008;
                                                break;
                                            case 3008:
                                                i2 = 3009;
                                                break;
                                            case 3009:
                                                i2 = 3010;
                                                break;
                                            case 3010:
                                                i2 = 3011;
                                                break;
                                            case 3011:
                                                i2 = 3012;
                                                break;
                                            case 3012:
                                                i2 = 3013;
                                                break;
                                            case 3013:
                                                i2 = 3014;
                                                break;
                                            case 3014:
                                                i2 = 3015;
                                                break;
                                            default:
                                                i2 = 0;
                                                break;
                                        }
                                }
                        }
                    }
                    i2 = 2;
                }
                this.d = i2;
            } else if (a == 16) {
                this.a = Integer.valueOf(aobv.f());
            } else if (a == 26) {
                this.b = aobv.d();
            } else if (a == 34) {
                anel anel = (anel) aobv.a(anel.a.getParserForType());
                anel anel2 = this.c;
                if (anel2 != null) {
                    aneo aneo = (aneo) ((anxo) anel2.toBuilder());
                    aneo.mergeFrom(anel);
                    anel = (anel) ((anxl) aneo.build());
                }
                this.c = anel;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
