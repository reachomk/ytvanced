package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: agor */
final class agor implements agpa {
    private final agnl a;
    private final String b;
    private long c = 0;

    public agor(agnl agnl) {
        this.a = agnl;
        amqw.a((Object) agnl, (Object) "Must supply a non-null EntryProgress.");
        azpz azpz = agnl.b;
        amqw.b((azpz.a & 1) != 0, (Object) "EntryProgress must have an mp4 path.");
        this.b = agos.b(azpz.b);
        amqw.a(this.b.length() == 4);
        if (agnl.b.e == 0) {
            agnl.d = true;
        }
        Collection collection = agnl.e;
        if (collection.size() >= 2) {
            ArrayList arrayList = new ArrayList(collection);
            collection = new ArrayList();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                collection = agpe.a((azpz) arrayList.get(i), collection);
            }
        }
        agnl.e = amul.a(collection);
    }

    public final agnl a() {
        return this.a;
    }

    public final azpz b() {
        return this.a.b;
    }

    public final long c() {
        return this.a.b.e;
    }

    public final void a(long j) {
        agnl agnl = this.a;
        azpy azpy = (azpy) ((anxo) agnl.b.toBuilder());
        azpy.b(j);
        agnl.b = (azpz) ((anxl) azpy.build());
    }

    public final void a(byte[] bArr) {
        j();
        a((long) bArr.length);
        this.a.f = amqp.b(anvu.a(bArr));
    }

    private final void j() {
        agnl agnl = this.a;
        boolean z = false;
        agnl.c = false;
        agnl.e = amul.g();
        agnl = this.a;
        if (b().e == 0) {
            z = true;
        }
        agnl.d = z;
    }

    public final void b(long j) {
        if (this.a.b.d != j) {
            j();
        }
        agnl agnl = this.a;
        azpy azpy = (azpy) ((anxo) agnl.b.toBuilder());
        azpy.a(j);
        agnl.b = (azpz) ((anxl) azpy.build());
    }

    public final long d() {
        return this.a.b.d;
    }

    public final long e() {
        long j = this.a.b.d;
        return j >= 0 ? j + ((long) i()) : -1;
    }

    public final long f() {
        return this.c;
    }

    public final void c(long j) {
        if (j == 0 && this.a.b.e == 0) {
            this.c = j;
        } else if (j >= this.a.b.e) {
            throw new agml("Cannot seek past end of entry!");
        } else if (j >= 0) {
            this.c = j;
        } else {
            throw new agml("Cannot seek to negative offset!");
        }
    }

    public final void a(int i) {
        long j = this.a.b.e;
        if (j == 0 && i == 0) {
            l();
        } else if (i >= 0) {
            long j2 = this.c;
            long j3 = (long) i;
            if (j2 + j3 <= j) {
                azpy azpy = (azpy) azpz.g.createBuilder();
                azpy.a(j2);
                azpy.b(j3);
                azpz azpz = (azpz) ((anxl) azpy.build());
                this.c += j3;
                agnl agnl = this.a;
                agnl.e = amul.a(agpe.a(azpz, agnl.e));
                l();
                return;
            }
            throw new agml("Wrote past end of entry?!?!?");
        } else {
            throw new agml("Wrote negative bytes?!?!?");
        }
    }

    public final void g() {
        this.a.c = true;
    }

    public final byte[] h() {
        int i = i();
        ByteBuffer allocate = ByteBuffer.allocate(i);
        boolean k = k();
        if (k) {
            allocate.putInt(1);
        } else {
            allocate.putInt((int) (this.a.b.e + ((long) i)));
        }
        allocate.put(this.b.getBytes(ampv.c));
        if (k) {
            allocate.putLong(this.a.b.e + ((long) i));
        }
        i = azqn.a(this.a.b.c);
        if (i == 0) {
            i = 1;
        }
        amqp a = agos.a(i);
        if (a.a()) {
            allocate.put((byte[]) a.b());
        }
        return allocate.array();
    }

    public final int i() {
        int i = !k() ? 8 : 16;
        return "uuid".equals(this.b) ? i + 16 : i;
    }

    private final boolean k() {
        return "uuid".equals(this.b) ? this.a.b.e + 24 > 4294967295L : this.a.b.e + 8 > 4294967295L;
    }

    private final void l() {
        agnl agnl = this.a;
        if (agnl.b.e != 0) {
            amul amul = agnl.e;
            if (!amul.isEmpty()) {
                azpz azpz = (azpz) amul.get(0);
                if (!(azpz.d == 0 && azpz.e == this.a.b.e)) {
                    return;
                }
            }
            return;
        }
        this.a.d = true;
    }
}
