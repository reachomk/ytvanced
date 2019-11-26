package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.UUID;
import java.util.concurrent.Executor;

/* renamed from: afqk */
public final class afqk implements afre {
    public final xbr a;
    public final Executor b;
    public final xsc c;
    private final afmr e;
    private final xhf f;
    private final afpu g;
    private final List h;

    public afqk(xbr xbr, Executor executor, afmr afmr, xsc xsc, xhf xhf, afpu afpu, List list) {
        this.a = (xbr) amqw.a((Object) xbr);
        this.b = (Executor) amqw.a((Object) executor);
        this.e = (afmr) amqw.a((Object) afmr);
        this.c = (xsc) amqw.a((Object) xsc);
        this.f = (xhf) amqw.a((Object) xhf);
        this.g = (afpu) amqw.a((Object) afpu);
        this.h = (List) amqw.a((Object) list);
    }

    public final synchronized void a(afrg afrg) {
        String str;
        xak.b();
        nkf nkf = (nkf) nkg.q.createBuilder();
        String uuid = UUID.randomUUID().toString();
        nkf.copyOnWrite();
        nkg nkg = (nkg) nkf.instance;
        if (uuid != null) {
            nkg.a |= 1;
            nkg.b = uuid;
            uuid = ((afqs) afrg).k;
            nkf.copyOnWrite();
            nkg = (nkg) nkf.instance;
            if (uuid != null) {
                nkg.a |= 64;
                nkg.i = uuid;
                long j = ((afqs) afrg).l;
                nkf.copyOnWrite();
                nkg nkg2 = (nkg) nkf.instance;
                nkg2.a |= 128;
                nkg2.j = j;
                j = ((afqs) afrg).m;
                nkf.copyOnWrite();
                nkg2 = (nkg) nkf.instance;
                nkg2.a |= 2048;
                nkg2.n = j;
                j = ((afqs) afrg).b.a();
                nkf.copyOnWrite();
                nkg2 = (nkg) nkf.instance;
                nkg2.a |= 32;
                nkg2.h = j;
                uuid = ((xle) afrg).d;
                nkf.copyOnWrite();
                nkg = (nkg) nkf.instance;
                if (uuid != null) {
                    nkg.a |= 8;
                    nkg.d = uuid;
                    int i = ((xle) afrg).c;
                    nkf.copyOnWrite();
                    nkg = (nkg) nkf.instance;
                    nkg.a |= 4;
                    nkg.c = i;
                    uuid = ((afqs) afrg).a.a();
                    nkf.copyOnWrite();
                    nkg = (nkg) nkf.instance;
                    if (uuid != null) {
                        nkg.a |= 4096;
                        nkg.p = uuid;
                        List list = ((afqs) afrg).n;
                        nkf.copyOnWrite();
                        nkg = (nkg) nkf.instance;
                        if (!nkg.o.a()) {
                            nkg.o = anxl.mutableCopy(nkg.o);
                        }
                        anvf.addAll(list, nkg.o);
                        try {
                            byte[] a = ((xle) afrg).a();
                            if (a != null) {
                                anvu a2 = anvu.a(a);
                                nkf.copyOnWrite();
                                nkg = (nkg) nkf.instance;
                                if (a2 != null) {
                                    nkg.a |= 16;
                                    nkg.g = a2;
                                } else {
                                    throw new NullPointerException();
                                }
                            }
                        } catch (bpx e) {
                            uuid = String.valueOf(e.getLocalizedMessage());
                            str = "Auth failure: ";
                            if (uuid.length() == 0) {
                                uuid = new String(str);
                            } else {
                                uuid = str.concat(uuid);
                            }
                            xtl.c(uuid);
                        }
                        for (Entry entry : ((xle) afrg).c().entrySet()) {
                            nkb nkb = (nkb) nkc.d.createBuilder();
                            String str2 = (String) entry.getKey();
                            nkb.copyOnWrite();
                            nkc nkc = (nkc) nkb.instance;
                            if (str2 != null) {
                                nkc.a |= 1;
                                nkc.b = str2;
                                str = (String) entry.getValue();
                                nkb.copyOnWrite();
                                nkc nkc2 = (nkc) nkb.instance;
                                if (str != null) {
                                    nkc2.a |= 2;
                                    nkc2.c = str;
                                    nkf.copyOnWrite();
                                    nkg = (nkg) nkf.instance;
                                    if (!nkg.e.a()) {
                                        nkg.e = anxl.mutableCopy(nkg.e);
                                    }
                                    nkg.e.add((nkc) ((anxl) nkb.build()));
                                } else {
                                    throw new NullPointerException();
                                }
                            }
                            throw new NullPointerException();
                        }
                        for (aulc aulc : ((afqs) afrg).o) {
                            i = aulc.e;
                            nkf.copyOnWrite();
                            nkg = (nkg) nkf.instance;
                            if (!nkg.f.a()) {
                                nkg.f = anxl.mutableCopy(nkg.f);
                            }
                            nkg.f.d(i);
                        }
                        nkg nkg3 = (nkg) ((anxl) nkf.build());
                        this.a.a(nkg3.b, nkg3);
                    } else {
                        throw new NullPointerException();
                    }
                }
                throw new NullPointerException();
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }

    public final synchronized void a() {
        nkg nkg;
        int size;
        int i;
        xak.b();
        long a = this.c.a();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        xbu d = this.a.d();
        while (d.hasNext()) {
            nkg = (nkg) d.next();
            if (nkg.j > a) {
                if (nkg.k <= 0 || nkg.m + nkg.n > a) {
                    arrayList.add(new afqr(nkg.b, nkg.i));
                }
            }
            arrayList2.add(nkg.b);
        }
        d.a();
        if (arrayList.size() > this.e.a()) {
            size = arrayList.size() - this.e.a();
            for (i = 0; i < size; i++) {
                arrayList2.add(((afqr) arrayList.get(i)).a);
            }
        }
        if (!arrayList2.isEmpty()) {
            this.a.a();
            int size2 = arrayList2.size();
            for (size = 0; size < size2; size++) {
                this.a.a((String) arrayList2.get(size));
            }
            this.a.c();
            this.a.b();
        }
        ArrayList<nkf> arrayList3 = new ArrayList();
        xbu d2 = this.a.d();
        size = 0;
        while (d2.hasNext()) {
            nkg = (nkg) d2.next();
            if (size < this.e.c()) {
                arrayList3.add((nkf) ((anxo) nkg.toBuilder()));
            }
            size++;
        }
        d2.a();
        this.a.a();
        try {
            nkf nkf;
            for (nkf nkf2 : arrayList3) {
                this.a.a(nkf2.a());
            }
            this.a.c();
            int size3 = arrayList3.size();
            for (int i2 = 0; i2 < size3; i2++) {
                nkf2 = (nkf) arrayList3.get(i2);
                i = nkf2.b();
                if (i > 0) {
                    if (i <= nkf2.c()) {
                        nkg nkg2 = (nkg) nkf2.instance;
                        if (a >= nkg2.l + nkg2.o.b(i - 1)) {
                        }
                    }
                    a(nkf2);
                }
                afsw a2 = afsy.a(afqn.a, new afqm(this, nkf2));
                if (((nkg) nkf2.instance).m == 0) {
                    nkf2.copyOnWrite();
                    nkg = (nkg) nkf2.instance;
                    nkg.a |= 1024;
                    nkg.m = a;
                }
                if ((((nkg) nkf2.instance).a & 8) != 0) {
                    this.f.b(new afqt((nkg) ((anxl) nkf2.build()), a2, this.c, this.e, this.g, this.h));
                } else {
                    a2.a(new afqi("malformed request proto"));
                }
            }
        } finally {
            this.a.b();
        }
    }

    public final boolean b() {
        return this.a.d().hasNext() ^ 1;
    }

    public final void a(nkf nkf) {
        this.b.execute(new afqp(this, nkf));
    }
}
