package defpackage;

/* renamed from: angk */
public final class angk extends aoca implements Cloneable {
    private int a;
    private Long b;
    private Float c;
    private Long d;
    private andz e;
    private aneb f;
    private int g;

    public angk() {
        this.a = -1;
        this.g = 0;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    /* renamed from: a */
    public final angk clone() {
        try {
            angk angk = (angk) super.clone();
            andz andz = this.e;
            if (andz != null) {
                angk.e = andz;
            }
            aneb aneb = this.f;
            if (aneb != null) {
                angk.f = aneb;
            }
            return angk;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final void writeTo(aoby aoby) {
        int i = this.g;
        if (i != 0) {
            aoby.a(1, i - 1);
        }
        Long l = this.b;
        if (l != null) {
            aoby.b(2, l.longValue());
        }
        Float f = this.c;
        if (f != null) {
            aoby.a(3, f.floatValue());
        }
        l = this.d;
        if (l != null) {
            aoby.b(4, l.longValue());
        }
        anze anze = this.e;
        if (anze != null) {
            aoby.a(5, anze);
        }
        if (this.a == 0) {
            aoby.a(6, this.f);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.g;
        if (i != 0) {
            computeSerializedSize += aoby.c(1, i - 1);
        }
        Long l = this.b;
        if (l != null) {
            computeSerializedSize += aoby.d(2, l.longValue());
        }
        Float f = this.c;
        if (f != null) {
            f.floatValue();
            computeSerializedSize += aoby.c(3);
        }
        l = this.d;
        if (l != null) {
            computeSerializedSize += aoby.d(4, l.longValue());
        }
        anze anze = this.e;
        if (anze != null) {
            computeSerializedSize += anwm.c(5, anze);
        }
        return this.a == 0 ? computeSerializedSize + anwm.c(6, this.f) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            }
            int i = 0;
            if (a == 8) {
                int i2 = aobv.b;
                int f = aobv.f();
                switch (f) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
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
                                i = 5;
                                break;
                            case 5:
                                i = 6;
                                break;
                            case 6:
                                i = 7;
                                break;
                            case 7:
                                i = 8;
                                break;
                        }
                        this.g = i;
                        break;
                    default:
                        aobv.e(i2);
                        storeUnknownField(aobv, a);
                        break;
                }
            } else if (a == 16) {
                this.b = Long.valueOf(aobv.g());
            } else if (a == 29) {
                this.c = Float.valueOf(aobv.b());
            } else if (a == 32) {
                this.d = Long.valueOf(aobv.g());
            } else if (a == 42) {
                andz andz = (andz) aobv.a(andz.a.getParserForType());
                andz andz2 = this.e;
                if (andz2 != null) {
                    anec anec = (anec) ((anxo) andz2.toBuilder());
                    anec.mergeFrom(andz);
                    andz = (andz) ((anxl) anec.build());
                }
                this.e = andz;
            } else if (a == 50) {
                aneb aneb = (aneb) aobv.a(aneb.a.getParserForType());
                aneb aneb2 = this.f;
                if (aneb2 != null) {
                    anee anee = (anee) ((anxo) aneb2.toBuilder());
                    anee.mergeFrom(aneb);
                    aneb = (aneb) ((anxl) anee.build());
                }
                this.f = aneb;
                this.a = 0;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
