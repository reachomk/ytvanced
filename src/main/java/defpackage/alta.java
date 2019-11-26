package defpackage;

/* renamed from: alta */
public final class alta {
    private final axrk a = ((axrk) axrl.i.createBuilder());

    public final alta a(alte alte) {
        boolean z = alte.d;
        axrk axrk = this.a;
        axrk.copyOnWrite();
        axrl axrl = (axrl) axrk.instance;
        axrl.a |= 8;
        axrl.e = z;
        String str = alte.b;
        axrk = this.a;
        axrk.copyOnWrite();
        axrl = (axrl) axrk.instance;
        if (str != null) {
            axrl.a |= 16;
            axrl.f = str;
            String str2 = alte.c;
            axrk axrk2 = this.a;
            axrk2.copyOnWrite();
            axrl axrl2 = (axrl) axrk2.instance;
            if (str2 != null) {
                axrl2.a |= 32;
                axrl2.g = str2;
                return this;
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }

    public final alta a(bqn bqn) {
        String a = altc.a(bqn);
        axrk axrk = this.a;
        axrk.copyOnWrite();
        axrl axrl = (axrl) axrk.instance;
        if (a != null) {
            axrl.a |= 2;
            axrl.c = a;
            return this;
        }
        throw new NullPointerException();
    }

    public final alta a(String str) {
        int i = !"hint".equals(str) ? !"mdns".equals(str) ? 4 : 2 : 3;
        axrk axrk = this.a;
        axrk.copyOnWrite();
        axrl axrl = (axrl) axrk.instance;
        axrl.a = 4 | axrl.a;
        axrl.d = i - 1;
        return this;
    }

    public final alta a(int i) {
        axrk axrk = this.a;
        axrk.copyOnWrite();
        axrl axrl = (axrl) axrk.instance;
        axrl.a |= 64;
        axrl.h = i;
        return this;
    }

    public final asmw a() {
        asmz asmz = (asmz) asmw.f.createBuilder();
        axrl axrl = (axrl) ((anxl) this.a.build());
        asmz.copyOnWrite();
        asmw asmw = (asmw) asmz.instance;
        if (axrl != null) {
            asmw.c = axrl;
            asmw.b = 90;
            return (asmw) ((anxl) asmz.build());
        }
        throw new NullPointerException();
    }

    public final alta b(int i) {
        axrk axrk = this.a;
        axrk.copyOnWrite();
        axrl axrl = (axrl) axrk.instance;
        axrl.a |= 1;
        axrl.b = i - 1;
        return this;
    }
}
