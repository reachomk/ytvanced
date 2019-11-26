package defpackage;

/* renamed from: xil */
public final class xil implements baqa {
    private final bcaa a;

    private xil(bcaa bcaa) {
        this.a = bcaa;
    }

    public static xil a(bcaa bcaa) {
        return new xil(bcaa);
    }

    public static aosr a(xax xax) {
        anxo anxo;
        if ((xax.f().a & 256) == 0) {
            anxo = null;
        } else {
            aost aost = xax.f().i;
            if (aost == null) {
                aost = aost.c;
            }
            anxl anxl = aost.b;
            if (anxl == null) {
                anxl = aosr.j;
            }
            anxo = (aosu) ((anxo) anxl.toBuilder());
        }
        if (anxo != null) {
            try {
                xjx.a((aosr) ((anxl) anxo.build()));
            } catch (Exception e) {
                xtl.a("Invalid AndroidCrolleyConfig from server", e);
            }
            return (aosr) baqd.a((aosr) ((anxl) anxo.build()), "Cannot return null from a non-@Nullable @Provides method");
        }
        anxo = (aosu) aosr.j.createBuilder();
        anxo.copyOnWrite();
        aosr aosr = (aosr) anxo.instance;
        aosr.a |= 1;
        aosr.b = true;
        anxo.copyOnWrite();
        aosr = (aosr) anxo.instance;
        aosr.a |= 2;
        aosr.c = true;
        anxo.copyOnWrite();
        aosr = (aosr) anxo.instance;
        aosr.a |= 4;
        aosr.d = 0;
        anxo.copyOnWrite();
        aosr = (aosr) anxo.instance;
        aosr.a |= 8;
        aosr.e = 1;
        anxo.copyOnWrite();
        aosr = (aosr) anxo.instance;
        aosr.a |= 16;
        aosr.f = 4;
        anxo.copyOnWrite();
        aosr = (aosr) anxo.instance;
        aosr.a |= 32;
        aosr.g = 4;
        anxo.copyOnWrite();
        aosr = (aosr) anxo.instance;
        aosr.a |= 64;
        aosr.h = 4;
        return (aosr) baqd.a((aosr) ((anxl) anxo.build()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return xil.a((xax) this.a.get());
    }
}
