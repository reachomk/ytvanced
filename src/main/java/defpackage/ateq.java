package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: ateq */
public final class ateq extends anxo implements anzf {
    private ateq() {
        super(aten.j);
    }

    public final ateq a(long j) {
        copyOnWrite();
        aten aten = (aten) this.instance;
        aten.a |= 1;
        aten.b = j;
        return this;
    }

    public final List a() {
        return Collections.unmodifiableList(((aten) this.instance).c);
    }

    public final int b() {
        return ((aten) this.instance).c.size();
    }

    public final ateq a(arlv arlv) {
        copyOnWrite();
        aten aten = (aten) this.instance;
        if (arlv != null) {
            aten.a();
            aten.c.add(arlv);
            return this;
        }
        throw new NullPointerException();
    }

    public final ateq a(Iterable iterable) {
        copyOnWrite();
        aten aten = (aten) this.instance;
        aten.a();
        anvf.addAll(iterable, aten.c);
        return this;
    }

    public final ateq c() {
        copyOnWrite();
        ((aten) this.instance).c = anxl.emptyProtobufList();
        return this;
    }

    public final int d() {
        return ((aten) this.instance).d.size();
    }

    public final arlv a(int i) {
        return (arlv) ((aten) this.instance).d.get(i);
    }

    public final ateq b(arlv arlv) {
        copyOnWrite();
        aten aten = (aten) this.instance;
        if (arlv != null) {
            aten.b();
            aten.d.add(arlv);
            return this;
        }
        throw new NullPointerException();
    }

    public final ateq b(Iterable iterable) {
        copyOnWrite();
        aten aten = (aten) this.instance;
        aten.b();
        anvf.addAll(iterable, aten.d);
        return this;
    }

    public final ateq e() {
        copyOnWrite();
        ((aten) this.instance).d = anxl.emptyProtobufList();
        return this;
    }

    public final ateq a(String str) {
        copyOnWrite();
        aten aten = (aten) this.instance;
        aten.a |= 2;
        aten.e = str;
        return this;
    }

    /* synthetic */ ateq(byte b) {
        super(aten.j);
    }
}
