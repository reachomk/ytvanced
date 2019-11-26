package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.GetConversationAttachmentEndpointOuterClass$GetConversationAttachmentEndpoint;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: xxp */
public class xxp extends akun implements akmz, xcp, yen, yfi, ygr, yhi {
    public static final acwl c = acwl.ao;
    public final xyv A;
    public final afve B;
    public boolean C;
    private afxe N;
    private int O;
    private final ycu P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private Object T;
    private akwl U;
    private final xci V;
    private final xwr W;
    private final Handler X;
    private yfe Y;
    private final Runnable Z = new xxw(this);
    private final yhh a;
    private yfh b;
    public final Context d;
    public zcj e;
    public boolean f;
    public final akoh g;
    public final akpk h;
    public final akpk i;
    public final akpd j;
    public final zax k;
    public ajts l;
    public xyb m;
    public final aarh n;
    public final xzm o;
    public String p;
    public apxu q;
    public final aaas r;
    public final acvx s;
    public final akmx t;
    public int u;
    public final apxu v;
    public boolean w;
    public final xzk x;
    public final xzn y;
    public final zcq z;

    public xxp(Context context, xsc xsc, xzm xzm, afxb afxb, xci xci, xoi xoi, akpe akpe, yfg yfg, aaas aaas, ycu ycu, xwr xwr, akmx akmx, allb allb, xzn xzn, Handler handler, afve afve, zaz zaz, acvx acvx, apxu apxu, yhh yhh, xyb xyb, zcq zcq, xyv xyv) {
        afxb afxb2 = afxb;
        xci xci2 = xci;
        yfg yfg2 = yfg;
        zaz zaz2 = zaz;
        yhh yhh2 = yhh;
        aknh akpk = new akpk();
        super((aana) xzm, xci, xci.a(), xoi, acvx, new wzu());
        this.d = (Context) amqw.a((Object) context);
        amqw.a((Object) xsc);
        this.v = apxu;
        this.s = (acvx) amqw.a((Object) acvx);
        this.a = (yhh) amqw.a((Object) yhh);
        if (yhh2 instanceof yfh) {
            this.b = (yfh) yhh2;
        }
        this.r = (aaas) amqw.a((Object) aaas);
        this.n = (aarh) amqw.a((Object) xzm);
        xzm xzm2 = xzm;
        if (!(xzm2 instanceof xzm)) {
            xzm2 = null;
        }
        this.o = xzm2;
        this.m = (xyb) amqw.a((Object) xyb);
        if (afxb2 != null) {
            this.N = new afxe(this, afxb2, xyb);
        }
        this.P = ycu;
        if (yfg2 instanceof zcj) {
            this.e = (zcj) yfg2;
        } else {
            yfg2.a(ajts.class);
        }
        this.g = new akoh();
        this.h = akpk;
        this.i = new akpk();
        this.g.a(akpk);
        this.g.a(this.i);
        this.j = akpe.a((akpb) yfg.get());
        this.j.a(this.g);
        this.j.a(new ygz());
        this.j.a(new xxx(this));
        this.j.a(new akod(acvx));
        this.j.a(new ydb(xsc));
        this.j.a(new yeq(this));
        this.j.a(new xyd(this));
        this.j.a(new yhq(xzn));
        this.j.a(new xye(new zcr(aaas)));
        yfh yfh = this.b;
        if (yfh != null) {
            this.j.a(new yfs(yfh.f));
            this.j.a(new zcn(this.b));
        }
        this.j.a(new yhb(allb));
        RecyclerView recyclerView = (RecyclerView) this.m.z();
        this.X = (Handler) amqw.a((Object) handler);
        recyclerView.a(new xxz(this, handler));
        recyclerView.a(this.j);
        Context context2 = (Context) zaz.a((Context) zaz2.a.get(), 1);
        zaz.a((zcc) zaz2.b.get(), 2);
        this.k = new zax(context2, (zcd) zaz.a((zcd) zaz2.c.get(), 3));
        recyclerView.a(this.k);
        recyclerView.a(new xxy(this));
        this.V = xci2;
        xci2.a((Object) this);
        this.W = xwr;
        this.t = akmx;
        this.u = 2;
        Context context3 = context;
        this.x = new xzk(context, akpk);
        this.y = (xzn) amqw.a((Object) xzn);
        this.z = (zcq) amqw.a((Object) zcq);
        this.A = (xyv) amqw.a((Object) xyv);
        this.B = (afve) amqw.a((Object) afve);
    }

    public Class[] a(Class cls, Object obj, int i) {
        return xwu.a(this, obj, i);
    }

    /* Access modifiers changed, original: protected */
    public boolean b() {
        return false;
    }

    /* Access modifiers changed, original: protected */
    public void d() {
    }

    public void a() {
        akmx akmx = this.t;
        if (akmx != null) {
            akmx.a((akmz) this);
        }
        this.V.b(this);
        xyb xyb = this.m;
        aqnz aqnz = null;
        if (xyb != null) {
            xyb.z().removeCallbacks(this.Z);
            this.m = null;
        }
        e();
        afxe afxe = this.N;
        if (afxe != null) {
            afxe.a();
            this.N = null;
        }
        yfh yfh = this.b;
        aqnz aqnz2 = yfh.j;
        aqny aqny = aqnz2 != null ? (aqny) ((anxo) aqnz2.toBuilder()) : null;
        yfh.l.a(aqny, false);
        if (aqny != null) {
            aqnz = (aqnz) ((anxl) aqny.build());
        }
        yfh.j = aqnz;
    }

    public final void e() {
        this.h.clear();
        this.i.clear();
    }

    public final String f() {
        return this.p;
    }

    public final void a(String str, String str2, aqnz aqnz, aqpp aqpp, String str3) {
        Object a;
        Object obj = null;
        if (aqpp != null) {
            a = zcz.a(aqpp, str, str3);
            if ((a instanceof ajtu) && (TextUtils.isEmpty(ajqy.a(a.j)) ^ 1) != 0) {
                aqoj aqoj;
                aqoi aqoi = (aqoi) aqoj.s.createBuilder();
                aqoi.a(a.a);
                long j = a.l;
                aqoi.copyOnWrite();
                aqoj aqoj2 = (aqoj) aqoi.instance;
                aqoj2.a |= 2;
                aqoj2.c = j;
                arml arml = a.j;
                if (arml != null) {
                    aqoi.a(arml);
                }
                String str4 = a.p;
                if (str4 != null) {
                    aqoi.copyOnWrite();
                    aqoj = (aqoj) aqoi.instance;
                    aqoj.a |= 524288;
                    aqoj.p = str4;
                }
                arml = a.b;
                if (arml != null) {
                    aqoi.copyOnWrite();
                    aqoj = (aqoj) aqoi.instance;
                    aqoj.f = arml;
                    aqoj.a |= 16;
                }
                aqnl aqnl = a.o;
                if (aqnl != null) {
                    aqoi.copyOnWrite();
                    aqoj = (aqoj) aqoi.instance;
                    aqoj.o = aqnl;
                    aqoj.a |= 262144;
                }
                if (str2 != null) {
                    aqoi.a(str2);
                }
                obj = (aqoj) ((anxl) aqoi.build());
            }
        } else {
            a = aqnz == null ? null : zcz.a(aqnz, str, str2);
        }
        this.x.a();
        if (this.h.size() > 0) {
            this.j.c(this.h.size() - 1);
        }
        if (a != null) {
            a(this.h.size(), Collections.singletonList(a), -1);
        }
        if (obj != null) {
            a(this.h.size(), Collections.singletonList(obj), -1);
        }
        if (obj != null) {
            this.x.a(a);
            this.x.a(obj);
            this.x.b();
            return;
        }
        this.x.a(a);
        this.x.b();
    }

    public final void a(String str, int i, aqny aqny, yaj yaj) {
        if (i > 10 && aqny != null) {
            aqnz aqnz = (aqnz) aqny.instance;
            if ((aqnz.a & 2048) != 0) {
                aqor aqor = aqnz.l;
                if (aqor == null) {
                    aqor = aqor.c;
                }
                if (i >= aqor.b && !TextUtils.isEmpty(str) && (((aqnz) aqny.instance).a & 4096) != 0) {
                    apxu d = aqny.d();
                    apxx apxx = (apxx) ((anxo) d.toBuilder());
                    anxr anxr = GetConversationAttachmentEndpointOuterClass$GetConversationAttachmentEndpoint.getConversationAttachmentEndpoint;
                    anxr access$000 = anxl.checkIsLite(GetConversationAttachmentEndpointOuterClass$GetConversationAttachmentEndpoint.getConversationAttachmentEndpoint);
                    d.a(access$000);
                    Object b = d.h.b(access$000.d);
                    if (b == null) {
                        b = access$000.b;
                    } else {
                        b = access$000.a(b);
                    }
                    arqx arqx = (arqx) ((anxo) ((GetConversationAttachmentEndpointOuterClass$GetConversationAttachmentEndpoint) b).toBuilder());
                    arqx.a(str);
                    apxx.a(anxr, (GetConversationAttachmentEndpointOuterClass$GetConversationAttachmentEndpoint) ((anxl) arqx.build()));
                    apxu apxu = (apxu) ((anxl) apxx.build());
                    aqny.copyOnWrite();
                    aqnz aqnz2 = (aqnz) aqny.instance;
                    if (apxu != null) {
                        aqnz2.m = apxu;
                        aqnz2.a |= 4096;
                        Map a = amvr.a();
                        a.put("get_conversation_attachment_listener", yaj);
                        this.r.a(aqny.d(), a);
                        return;
                    }
                    throw new NullPointerException();
                }
            }
        }
    }

    public final void g() {
        n();
        r();
        afxe afxe = this.N;
        if (afxe != null) {
            afxe.a();
        }
        this.l = null;
        this.Q = false;
    }

    public final void a(zyg zyg) {
        int size = this.h.size();
        for (int i = 0; i < size; i++) {
            if (zyg.d.equals(this.h.get(i))) {
                this.h.remove(i);
                return;
            }
        }
    }

    public final void a(Uri uri, Uri uri2) {
        if (!TextUtils.isEmpty(this.p)) {
            Object obj = null;
            for (int i = 0; i < this.h.size(); i++) {
                String b = zcz.b(ycp.a(this.h.get(i)));
                if (!TextUtils.isEmpty(b)) {
                    ycm ycm = (ycm) this.t.a(ycq.a(this.p, b));
                    if (ycm != null && ycm.i) {
                        this.h.remove(i);
                        obj = 1;
                    }
                }
            }
            if (obj != null) {
                this.x.b();
            }
            if (this.h.isEmpty()) {
                j();
            }
        }
    }

    public final void a(List list) {
        for (Object obj : list) {
            if (ajti.TIMED.a(obj)) {
                a(obj, (ajtf) obj);
            } else if (ajti.INVALIDATION.a(obj)) {
                afxe afxe = this.N;
                if (afxe != null) {
                    if (!afxe.a((ajtf) obj)) {
                        this.N.a();
                    }
                    this.N.b(obj);
                }
            }
        }
    }

    public final void a(ajtf ajtf) {
        xak.a();
        if (!ajti.INVALIDATION.a(ajtf) || !this.Q) {
            if (!ajti.NEXT.a(ajtf) || !this.R) {
                this.Q = ajti.INVALIDATION.a(ajtf);
                this.R = ajti.NEXT.a(ajtf);
                super.a(ajtf);
            }
        }
    }

    public final void h() {
        d();
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(bqn bqn, ajtf ajtf) {
        super.a(bqn, ajtf);
        int ordinal = ajtf.c().ordinal();
        if (ordinal == 1) {
            this.R = false;
        } else if (ordinal == 5) {
            this.Q = false;
        }
        if (!this.S) {
            this.O = 1;
            this.S = true;
        }
        if (this.O > 0) {
            a(ajtf);
            this.O--;
            return;
        }
        this.S = false;
    }

    public void a(ajtu ajtu) {
        for (int i = 0; i < this.h.size(); i++) {
            if (TextUtils.equals(zcz.b(this.h.get(i)), zcz.b(ajtu))) {
                this.h.a(i, new ycp(ajtu, null));
                return;
            }
        }
    }

    public final void a(ycp ycp) {
        a(ycp, new ycs(ycp.a, ycp.b));
    }

    public final void a(ycs ycs, boolean z) {
        Object ycp;
        if (z) {
            ycp = new ycp(ycs.a, ycs.b);
            ycp.a();
        } else {
            ycp = ycs.a;
        }
        this.X.post(new xxs(this, ycs, ycp));
    }

    public final void b(ycp ycp) {
        a(ycp, ycp.a);
    }

    public final boolean a(Object obj) {
        auvn h = zcz.h(obj);
        if (h == null || !(this.d instanceof nn)) {
            return false;
        }
        this.W.a(h, null, obj).a((nn) this.d);
        return true;
    }

    public final boolean b(Object obj) {
        return (zcz.h(obj) == null || !(this.d instanceof nn) || this.W == null) ? false : true;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(List list) {
        super.b(list);
        if (c(ajti.NEXT) != null) {
            if (this.U == null) {
                akwk a = akwl.a();
                a.b = q();
                a.c = xxr.a;
                a.d = xxu.a;
                this.U = a.a();
            }
            this.h.add(0, this.U);
        }
    }

    private final void a(ycp ycp, Object obj) {
        if (this.m != null) {
            this.X.post(new xxt(this, ycp, obj));
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(ajts ajts, boolean z) {
        aqob aqob = ajts.e;
        yfh yfh;
        if (aqob == null || (aqob.a & 1) == 0) {
            yfh = this.b;
            if (yfh != null) {
                yfh.c.setVisibility(8);
            }
        } else {
            yhh yhh = this.a;
            aqnz aqnz = aqob.b;
            if (aqnz == null) {
                aqnz = aqnz.p;
            }
            yhh.a(aqnz);
            yfh = this.b;
            if (yfh != null && yfh.a() && z) {
                yfh = this.b;
                if (yfh.e.getVisibility() == 0) {
                    yfh.e.addOnLayoutChangeListener(new yfm(yfh));
                }
            }
        }
    }

    public final yfe i() {
        if (this.Y == null) {
            this.Y = new xxg(this.r, this.t, this.p, this.j, this.h, this.x, this.b);
        }
        return this.Y;
    }

    public final void a(int i, Collection collection, int i2) {
        boolean k = k();
        this.h.addAll(i, collection);
        if (!(this.T == null || collection.isEmpty())) {
            this.h.remove(this.T);
            this.T = null;
        }
        if ((i2 == -1 || k) && this.m != null) {
            l();
        }
        if (i2 == -1 || k) {
            this.k.b = Math.max(this.g.d() - 1, 0);
        }
    }

    public final void j() {
        ajts ajts = this.l;
        if (ajts != null) {
            ajtp ajtp = ajts.i;
            if (ajtp != null) {
                aqnt aqnt = ajtp.b;
                if (aqnt != null) {
                    this.T = aqnt;
                    this.h.add(this.T);
                }
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(aali aali) {
        if (aali instanceof xyn) {
            xyb xyb = this.m;
            if (xyb != null) {
                xyn xyn = (xyn) aali;
                aqje W = xyb.W();
                if (W != null) {
                    xyn.c = W;
                }
            }
        }
    }

    public final boolean k() {
        return this.k.r() == this.g.d() + -1 && this.g.d() > 0;
    }

    public final void l() {
        xyb xyb = this.m;
        if (xyb != null && xyb.z() != null) {
            abe.a(this.m.z(), this.Z, 16);
        }
    }

    private final Set m() {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.h.size(); i++) {
            Object obj = this.h.get(i);
            if (zcz.a(obj)) {
                String b = zcz.b(obj);
                if (!TextUtils.isEmpty(b)) {
                    hashSet.add(b);
                }
            }
        }
        return hashSet;
    }

    public static String c(Object obj) {
        if (obj instanceof ycp) {
            obj = ((ycp) obj).a;
        } else if (obj instanceof ycs) {
            obj = ((ycs) obj).a;
        }
        return zcz.b(obj);
    }
}
