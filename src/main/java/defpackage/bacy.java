package defpackage;

/* renamed from: bacy */
public final class bacy extends anxo implements badb {
    private bacy() {
        super(bacz.g);
    }

    public final bacy a(int i) {
        copyOnWrite();
        bacz bacz = (bacz) this.instance;
        bacz.a |= 1;
        bacz.b = i;
        return this;
    }

    public final int a() {
        return ((bacz) this.instance).c;
    }

    public final bacy b(int i) {
        copyOnWrite();
        bacz bacz = (bacz) this.instance;
        bacz.a |= 2;
        bacz.c = i;
        return this;
    }

    public final bacx b() {
        bacx bacx = ((bacz) this.instance).d;
        return bacx == null ? bacx.e : bacx;
    }

    public final bacy a(bacx bacx) {
        copyOnWrite();
        bacz bacz = (bacz) this.instance;
        if (bacx != null) {
            bacz.d = bacx;
            bacz.a |= 4;
            return this;
        }
        throw new NullPointerException();
    }

    public final bacy a(bacw bacw) {
        copyOnWrite();
        bacz bacz = (bacz) this.instance;
        bacz.d = (bacx) ((anxl) bacw.build());
        bacz.a |= 4;
        return this;
    }

    public final bacy a(aocz aocz) {
        copyOnWrite();
        bacz bacz = (bacz) this.instance;
        if (aocz != null) {
            bacz.e = aocz;
            bacz.a |= 8;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ bacy(byte b) {
        super(bacz.g);
    }
}
