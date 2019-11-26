package defpackage;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: bazr */
public final class bazr extends baxf {
    public int a;
    private final Queue b = new ArrayDeque();

    public final void a(bbff bbff) {
        if (bbff instanceof bazr) {
            bazr bazr = (bazr) bbff;
            while (!bazr.b.isEmpty()) {
                this.b.add((bbff) bazr.b.remove());
            }
            this.a += bazr.a;
            bazr.a = 0;
            bazr.close();
            return;
        }
        this.b.add(bbff);
        this.a += bbff.a();
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        bazu bazu = new bazu();
        a(bazu, 1);
        return bazu.a;
    }

    public final void a(byte[] bArr, int i, int i2) {
        a(new bazt(i, bArr), i2);
    }

    /* renamed from: b */
    public final bazr c(int i) {
        a(i);
        this.a -= i;
        bazr bazr = new bazr();
        while (i > 0) {
            bbff bbff = (bbff) this.b.peek();
            if (bbff.a() > i) {
                bazr.a(bbff.c(i));
                i = 0;
            } else {
                bazr.a((bbff) this.b.poll());
                i -= bbff.a();
            }
        }
        return bazr;
    }

    public final void close() {
        while (!this.b.isEmpty()) {
            ((bbff) this.b.remove()).close();
        }
    }

    private final void a(bazw bazw, int i) {
        a(i);
        if (!this.b.isEmpty()) {
            c();
        }
        while (i > 0 && !this.b.isEmpty()) {
            bbff bbff = (bbff) this.b.peek();
            int min = Math.min(i, bbff.a());
            try {
                bazw.a = bazw.a(bbff, min);
            } catch (IOException e) {
                bazw.b = e;
            }
            if (bazw.b == null) {
                i -= min;
                this.a -= min;
                c();
            } else {
                return;
            }
        }
        if (i > 0) {
            throw new AssertionError("Failed executing read operation");
        }
    }

    private final void c() {
        if (((bbff) this.b.peek()).a() == 0) {
            ((bbff) this.b.remove()).close();
        }
    }
}
