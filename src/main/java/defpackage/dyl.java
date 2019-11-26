package defpackage;

import com.google.protos.youtube.api.innertube.LikeEndpointOuterClass$LikeEndpoint;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: dyl */
public final class dyl implements aaap {
    public final xoi a;
    public final zzl b;
    public final aadw c;
    private final nn d;
    private final xci e;
    private final aazk f;
    private final afqe g;
    private final afpu h;
    private final aaas i;
    private final Executor j;

    public dyl(nn nnVar, xci xci, aazk aazk, xoi xoi, afqe afqe, afpu afpu, aaas aaas, zzl zzl, aadw aadw, Executor executor) {
        this.d = (nn) amqw.a((Object) nnVar);
        this.e = (xci) amqw.a((Object) xci);
        this.f = (aazk) amqw.a((Object) aazk);
        this.a = (xoi) amqw.a((Object) xoi);
        this.g = (afqe) amqw.a((Object) afqe);
        this.h = (afpu) amqw.a((Object) afpu);
        this.i = (aaas) amqw.a((Object) aaas);
        this.b = (zzl) amqw.a((Object) zzl);
        this.c = aadw;
        this.j = executor;
    }

    public final void a(apxu apxu, Map map) {
        Object c = xsb.c(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
        if (this.h.a()) {
            a(apxu, c, false);
        } else {
            this.g.a(this.d, null, new dyw(this, apxu, c));
        }
    }

    public final void a(apxu apxu, Object obj, boolean z) {
        Object obj2;
        apxu apxu2 = apxu;
        Object obj3 = obj;
        boolean z2 = z;
        anxr access$000 = anxl.checkIsLite(LikeEndpointOuterClass$LikeEndpoint.likeEndpoint);
        apxu2.a(access$000);
        Object b = apxu2.h.b(access$000.d);
        if (b == null) {
            obj2 = access$000.b;
        } else {
            obj2 = access$000.a(b);
        }
        LikeEndpointOuterClass$LikeEndpoint likeEndpointOuterClass$LikeEndpoint = (LikeEndpointOuterClass$LikeEndpoint) obj2;
        if (likeEndpointOuterClass$LikeEndpoint.d.size() != 0) {
            this.i.a(likeEndpointOuterClass$LikeEndpoint.d, obj3);
        }
        if (foh.q(this.b)) {
            auad auad = likeEndpointOuterClass$LikeEndpoint.c;
            if (auad == null) {
                auad = auad.d;
            }
            if ((auad.a & 1) != 0) {
                auad = likeEndpointOuterClass$LikeEndpoint.c;
                if (auad == null) {
                    auad = auad.d;
                }
                String a = aaer.a(62, auad.b);
                bbme a2 = this.c.b(a).a(bbmt.a());
                apxu apxu3 = apxu;
                Object obj4 = obj;
                boolean z3 = z;
                LikeEndpointOuterClass$LikeEndpoint likeEndpointOuterClass$LikeEndpoint2 = likeEndpointOuterClass$LikeEndpoint;
                String str = a;
                dyo dyo = new dyo(this, apxu3, obj4, z3, likeEndpointOuterClass$LikeEndpoint2, str);
                dyn dyn = new dyn(this, apxu3, obj4, z3, likeEndpointOuterClass$LikeEndpoint2, str);
                dyq dyq = r0;
                dyq dyq2 = new dyq(this, apxu3, obj4, z3, likeEndpointOuterClass$LikeEndpoint2, a);
                a2.a(dyo, dyn, dyq).a();
                return;
            }
        }
        dyp dyp = new dyp(this);
        Runnable runnable = ankh.a;
        auac a3 = auac.a(likeEndpointOuterClass$LikeEndpoint.b);
        if (a3 == null) {
            a3 = auac.LIKE;
        }
        int ordinal = a3.ordinal();
        if (ordinal == 0) {
            xan.a(a(likeEndpointOuterClass$LikeEndpoint, apxu2), aniv.a, dyp, a(likeEndpointOuterClass$LikeEndpoint, apxu2, obj3, z2), runnable);
        } else if (ordinal == 1) {
            xan.a(b(likeEndpointOuterClass$LikeEndpoint, apxu2), aniv.a, dyp, a(likeEndpointOuterClass$LikeEndpoint, apxu2, obj3, z2), runnable);
        } else if (ordinal == 2) {
            xan.a(c(likeEndpointOuterClass$LikeEndpoint, apxu2), aniv.a, dyp, a(likeEndpointOuterClass$LikeEndpoint, apxu2, obj3, z2), runnable);
        }
    }

    public final bbme a(apxu apxu, Object obj, boolean z, LikeEndpointOuterClass$LikeEndpoint likeEndpointOuterClass$LikeEndpoint, String str, aadq aadq) {
        aaea b = this.c.b();
        aadt aadt = (atzv) atzw.a.a(str);
        auac a = auac.a(likeEndpointOuterClass$LikeEndpoint.b);
        if (a == null) {
            a = auac.LIKE;
        }
        atzz atzz = aadt.a;
        atzz.copyOnWrite();
        auaa auaa = (auaa) atzz.instance;
        if (a != null) {
            bbme a2;
            auaa.a |= 2;
            auaa.c = a.e;
            bblt a3 = b.a(aadt).a();
            auac a4 = auac.a(likeEndpointOuterClass$LikeEndpoint.b);
            if (a4 == null) {
                a4 = auac.LIKE;
            }
            int ordinal = a4.ordinal();
            if (ordinal == 0) {
                a2 = wzw.a(a(likeEndpointOuterClass$LikeEndpoint, apxu)).a(a(likeEndpointOuterClass$LikeEndpoint, apxu, obj, z));
            } else if (ordinal != 1) {
                a2 = wzw.a(c(likeEndpointOuterClass$LikeEndpoint, apxu)).a(a(likeEndpointOuterClass$LikeEndpoint, apxu, obj, z));
            } else {
                a2 = wzw.a(b(likeEndpointOuterClass$LikeEndpoint, apxu)).a(a(likeEndpointOuterClass$LikeEndpoint, apxu, obj, z));
            }
            Object b2 = a2.b(new dys(this, aadq, str));
            bbow.a(b2, "next is null");
            return new bbrj(b2, a3);
        }
        throw new NullPointerException();
    }

    private final xar a(LikeEndpointOuterClass$LikeEndpoint likeEndpointOuterClass$LikeEndpoint, apxu apxu, Object obj, boolean z) {
        auac a = auac.a(likeEndpointOuterClass$LikeEndpoint.b);
        if (a == null) {
            a = auac.LIKE;
        }
        int ordinal = a.ordinal();
        if (ordinal == 0) {
            return new dyr(this, apxu, obj, z);
        }
        if (ordinal != 1) {
            return new dyt(this, apxu, obj, z);
        }
        return new dyu(this, apxu, obj, z);
    }

    private final anjv a(LikeEndpointOuterClass$LikeEndpoint likeEndpointOuterClass$LikeEndpoint, apxu apxu) {
        aaml a = this.f.a();
        a.a(apxu.b);
        auad auad = likeEndpointOuterClass$LikeEndpoint.c;
        if (auad == null) {
            auad = auad.d;
        }
        a.a(auad);
        aazk aazk = this.f;
        return aazk.a.a(a, this.j);
    }

    private final anjv b(LikeEndpointOuterClass$LikeEndpoint likeEndpointOuterClass$LikeEndpoint, apxu apxu) {
        aaml b = this.f.b();
        b.a(apxu.b);
        auad auad = likeEndpointOuterClass$LikeEndpoint.c;
        if (auad == null) {
            auad = auad.d;
        }
        b.a(auad);
        aazk aazk = this.f;
        return aazk.b.a(b, this.j);
    }

    private final anjv c(LikeEndpointOuterClass$LikeEndpoint likeEndpointOuterClass$LikeEndpoint, apxu apxu) {
        aaml c = this.f.c();
        c.a(apxu.b);
        auad auad = likeEndpointOuterClass$LikeEndpoint.c;
        if (auad == null) {
            auad = auad.d;
        }
        c.a(auad);
        aazk aazk = this.f;
        return aazk.g.a(c, this.j);
    }

    public final void a(apxu apxu, Object obj, List list, apxu apxu2, auac auac, boolean z) {
        if (list != null) {
            this.i.a(list, obj);
        }
        if (apxu2 != null) {
            this.i.a(apxu2, null);
        }
        anxr access$000 = anxl.checkIsLite(LikeEndpointOuterClass$LikeEndpoint.likeEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        LikeEndpointOuterClass$LikeEndpoint likeEndpointOuterClass$LikeEndpoint = (LikeEndpointOuterClass$LikeEndpoint) b;
        auad auad = likeEndpointOuterClass$LikeEndpoint.c;
        if (auad == null) {
            auad = auad.d;
        }
        xci xci;
        auad auad2;
        if (auad.b.isEmpty()) {
            auad = likeEndpointOuterClass$LikeEndpoint.c;
            if (auad == null) {
                auad = auad.d;
            }
            if (!auad.c.isEmpty()) {
                xci = this.e;
                auad2 = likeEndpointOuterClass$LikeEndpoint.c;
                if (auad2 == null) {
                    auad2 = auad.d;
                }
                xci.c(new fie(auad2.c, auac));
                return;
            }
            return;
        }
        xci = this.e;
        auad2 = likeEndpointOuterClass$LikeEndpoint.c;
        if (auad2 == null) {
            auad2 = auad.d;
        }
        xci.c(new fid(auad2.b, auac, z));
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ void a(Throwable th) {
        xtl.a("Error rating", th);
        this.a.c(th);
    }
}
