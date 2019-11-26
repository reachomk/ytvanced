package defpackage;

/* renamed from: angi */
public final class angi extends aoca implements Cloneable {
    private ancg a;
    private ancm b;
    private anci c;
    private anck d;

    public angi() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    /* renamed from: a */
    public final angi clone() {
        try {
            angi angi = (angi) super.clone();
            ancg ancg = this.a;
            if (ancg != null) {
                angi.a = ancg;
            }
            ancm ancm = this.b;
            if (ancm != null) {
                angi.b = ancm;
            }
            anci anci = this.c;
            if (anci != null) {
                angi.c = anci;
            }
            anck anck = this.d;
            if (anck != null) {
                angi.d = anck;
            }
            return angi;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final void writeTo(aoby aoby) {
        anze anze = this.a;
        if (anze != null) {
            aoby.a(1, anze);
        }
        anze = this.b;
        if (anze != null) {
            aoby.a(2, anze);
        }
        anze = this.c;
        if (anze != null) {
            aoby.a(3, anze);
        }
        anze = this.d;
        if (anze != null) {
            aoby.a(4, anze);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.a;
        if (anze != null) {
            computeSerializedSize += anwm.c(1, anze);
        }
        anze = this.b;
        if (anze != null) {
            computeSerializedSize += anwm.c(2, anze);
        }
        anze = this.c;
        if (anze != null) {
            computeSerializedSize += anwm.c(3, anze);
        }
        anze = this.d;
        return anze != null ? computeSerializedSize + anwm.c(4, anze) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 10) {
                ancg ancg = (ancg) aobv.a(ancg.a.getParserForType());
                ancg ancg2 = this.a;
                if (ancg2 != null) {
                    ancf ancf = (ancf) ((anxo) ancg2.toBuilder());
                    ancf.mergeFrom(ancg);
                    ancg = (ancg) ((anxl) ancf.build());
                }
                this.a = ancg;
            } else if (a == 18) {
                ancm ancm = (ancm) aobv.a(ancm.a.getParserForType());
                ancm ancm2 = this.b;
                if (ancm2 != null) {
                    ancl ancl = (ancl) ((anxo) ancm2.toBuilder());
                    ancl.mergeFrom(ancm);
                    ancm = (ancm) ((anxl) ancl.build());
                }
                this.b = ancm;
            } else if (a == 26) {
                anci anci = (anci) aobv.a(anci.a.getParserForType());
                anci anci2 = this.c;
                if (anci2 != null) {
                    anch anch = (anch) ((anxo) anci2.toBuilder());
                    anch.mergeFrom(anci);
                    anci = (anci) ((anxl) anch.build());
                }
                this.c = anci;
            } else if (a == 34) {
                anck anck = (anck) aobv.a(anck.a.getParserForType());
                anck anck2 = this.d;
                if (anck2 != null) {
                    ancj ancj = (ancj) ((anxo) anck2.toBuilder());
                    ancj.mergeFrom(anck);
                    anck = (anck) ((anxl) ancj.build());
                }
                this.d = anck;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
