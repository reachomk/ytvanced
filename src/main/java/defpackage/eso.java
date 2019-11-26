package defpackage;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SubscribeEndpointOuterClass$SubscribeEndpoint;
import com.google.protos.youtube.api.innertube.UnsubscribeEndpointOuterClass$UnsubscribeEndpoint;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: eso */
public final class eso implements akmz, OnClickListener, evs, xcp {
    public static final esr a = new esr(R.drawable.subscribed_paid_mark, R.color.subscribe_button_subscribed_font_color, R.drawable.subscribed_mark, R.color.subscribe_button_subscribed_font_color, R.string.subscribed, R.string.accessibility_channel_unsubscribe_action, false);
    public static final esr b = new esr(R.drawable.subscribe_paid_mark, R.color.subscribe_button_paid_subscribe_font_color, R.drawable.subscribe_mark, R.color.subscribe_button_subscribe_font_color, R.string.subscribe, R.string.accessibility_channel_subscribe_action, true);
    private static final Set i = Collections.emptySet();
    private boolean A;
    private boolean B;
    private bbnc C;
    private final aaep D;
    public final xoi c;
    public final eus d;
    public final Set e;
    public final fmx f;
    public axwa g;
    public acvx h;
    private boolean j;
    private final nn k;
    private final afpu l;
    private final afqe m;
    private final aaas n;
    private final xci o;
    private final TextView p;
    private final evm q;
    private final xhv r;
    private final xpa s;
    private final akpi t;
    private final akmx u;
    private final aadw v;
    private esr w = a;
    private esr x = b;
    private AlertDialog y;
    private Map z;

    public eso(nn nnVar, afpu afpu, afqe afqe, xoi xoi, aaas aaas, fmx fmx, xci xci, evm evm, xhv xhv, xpa xpa, akpi akpi, akmx akmx, aadw aadw, aaep aaep, TextView textView, eus eus) {
        TextView textView2 = textView;
        this.p = textView2;
        this.k = nnVar;
        this.l = afpu;
        this.m = afqe;
        this.c = xoi;
        this.n = aaas;
        this.f = fmx;
        this.o = xci;
        this.e = Collections.newSetFromMap(new WeakHashMap());
        this.d = eus;
        this.q = evm;
        this.r = xhv;
        this.s = xpa;
        this.t = akpi;
        this.u = akmx;
        this.v = aadw;
        this.D = aaep;
        textView2.setOnClickListener(this);
    }

    public final void a(esr esr, esr esr2) {
        this.w = (esr) amqw.a((Object) esr);
        this.x = (esr) amqw.a((Object) esr2);
    }

    public final void a(axwa axwa, acvx acvx) {
        a(axwa, acvx, null);
    }

    public final void a(axwa axwa, acvx acvx, Map map) {
        a();
        if (axwa != null) {
            this.g = axwa;
            this.h = acvx;
            this.z = map;
            boolean a = a(axwa);
            this.B = a;
            this.A = a;
            b();
            if (e()) {
                axwa axwa2 = this.g;
                if (axwa2 != null) {
                    acvx acvx2 = this.h;
                    if (acvx2 != null) {
                        acvx2.a(axwa2.H.d(), null);
                    }
                }
                axwa2 = this.g;
                if (axwa2 != null) {
                    arup arup = axwa2.x;
                    if (arup == null) {
                        arup = arup.c;
                    }
                    if (arup.a == 102716411) {
                        if ((this.g.a & 1048576) == 0) {
                            f();
                        } else if (c()) {
                            evm evm = this.q;
                            String d = d();
                            axvv axvv = this.g.y;
                            if (axvv == null) {
                                axvv = axvv.c;
                            }
                            long j = (axvv.a == 136390057 ? (axwo) axvv.b : axwo.e).c;
                            if (!TextUtils.isEmpty(d) && j >= 0) {
                                String str = evm.c;
                                if (str == null || str.equals(d)) {
                                    evr evr = new evr(this, j);
                                    evm.a.remove(evr);
                                    if (!d.equals(evm.b)) {
                                        evm.d();
                                    }
                                    evm.b = d;
                                    if (evm.c() < j || !evm.g()) {
                                        evm.a.offer(evr);
                                        evm.f();
                                    } else {
                                        a(d);
                                    }
                                }
                            }
                        }
                    }
                }
                this.o.a((Object) this);
                if (!axwa.e.isEmpty()) {
                    Uri a2 = grw.a(axwa.e);
                    grw grw = (grw) this.u.a(a2);
                    grw c = grw.a(axwa).c();
                    if (axwa.K > 0) {
                        if (grw != null && grw.c() >= axwa.K) {
                            this.u.a(a2, (akmz) this);
                            this.u.b(a2, c);
                        } else {
                            this.u.b(a2, c);
                            this.u.a(a2, (akmz) this);
                        }
                    } else if (grw == null || grw.d() <= axwa.J) {
                        this.u.b(a2, c);
                        this.u.a(a2, (akmz) this);
                    } else {
                        this.u.a(a2, (akmz) this);
                        this.u.b(a2, c);
                    }
                }
                String str2 = axwa.p;
                if (!TextUtils.isEmpty(str2)) {
                    bbmi a3 = this.v.a(str2, false).a(bbmt.a());
                    Object a4 = bbmt.a();
                    bbow.a(a4, "scheduler is null");
                    this.C = new bbvw(a3, a4).c(new esn(this));
                }
            }
            this.t.a(axwa, this.p);
        }
    }

    private final boolean a(axwa axwa) {
        if (axwa != null) {
            try {
                String str = axwa.p;
                if (!str.isEmpty()) {
                    axyd axyd = (axyd) this.v.a(str);
                    if (axyd != null) {
                        this.D.a("ACCESS", String.format("Entity with key %s was accessed. Subscribed=%s", new Object[]{str, Boolean.valueOf(axyd.getSubscribed().booleanValue())}));
                        return axyd.getSubscribed().booleanValue();
                    }
                    throw new IllegalStateException(String.format("Entity with key %s was not filled on the server.", new Object[]{str}));
                }
            } catch (IllegalStateException e) {
                Object format;
                afpu afpu = this.l;
                String str2 = null;
                if (afpu != null && afpu.a() && axwa.L) {
                    str2 = ((ust) this.l.c()).f();
                }
                if (str2 != null) {
                    format = String.format("User DataSyncId: %s; ", new Object[]{str2});
                } else {
                    format = "";
                }
                afpf afpf = afpf.entities;
                String valueOf = String.valueOf(format);
                String str3 = "Message: %s; Transaction Logs: %s";
                if (str3.length() == 0) {
                    str3 = new String(valueOf);
                } else {
                    str3 = valueOf.concat(str3);
                }
                afpc.a(2, afpf, String.format(str3, new Object[]{e.getMessage(), this.D.a()}), e);
            }
            return axwa.o;
        }
        throw new IllegalStateException("Active model not set on the server.");
    }

    private final void b() {
        axwa axwa = this.g;
        if (axwa != null) {
            a(a(axwa));
        }
    }

    public final void a(boolean z) {
        axwa axwa = this.g;
        if (axwa != null) {
            this.j = a(axwa) != z;
            arml arml = null;
            esr esr;
            TextView textView;
            axwa axwa2;
            if (z) {
                esr = this.w;
                textView = this.p;
                axwa2 = this.g;
                if ((axwa2.a & 4) != 0) {
                    arml = axwa2.g;
                    if (arml == null) {
                        arml = arml.f;
                    }
                }
                esr.a(textView, axwa2, ajqy.a(arml));
            } else {
                esr = this.x;
                textView = this.p;
                axwa2 = this.g;
                if ((axwa2.a & 8) != 0) {
                    arml = axwa2.h;
                    if (arml == null) {
                        arml = arml.f;
                    }
                }
                esr.a(textView, axwa2, ajqy.a(arml));
            }
            this.p.setVisibility(0);
            eus eus = this.d;
            if (eus != null) {
                eus.a(this.g, this.h);
                if (e() && a(this.g) && !this.j) {
                    eus = this.d;
                    etb etb = eus.b;
                    if (etb != null) {
                        etb.c();
                    }
                    euu euu = eus.c;
                    if (euu != null) {
                        euu.b();
                    }
                    eux eux = eus.d;
                    if (!(eux == null || eux.c == null)) {
                        eux.b.setVisibility(0);
                    }
                    View b = eus.b();
                    if (b != null) {
                        eus.a.setVisibility(b.getVisibility());
                    } else {
                        eus.a.setVisibility(8);
                    }
                } else {
                    this.d.a();
                }
            }
            if (this.A != z || this.B != a(this.g)) {
                this.A = z;
                this.B = a(this.g);
                for (esu a : this.e) {
                    a.a(z, this.B);
                }
            }
        }
    }

    private final boolean c() {
        axwa axwa = this.g;
        if (axwa != null) {
            axwo axwo;
            axvv axvv = axwa.y;
            if (axvv == null) {
                axvv = axvv.c;
            }
            if (axvv.a == 136390057) {
                axwo = (axwo) axvv.b;
            } else {
                axwo = axwo.e;
            }
            if (!axwo.b.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    private final String d() {
        if (!c()) {
            return null;
        }
        axwo axwo;
        axvv axvv = this.g.y;
        if (axvv == null) {
            axvv = axvv.c;
        }
        if (axvv.a == 136390057) {
            axwo = (axwo) axvv.b;
        } else {
            axwo = axwo.e;
        }
        return axwo.b;
    }

    public final void a() {
        this.o.b(this);
        this.u.a((akmz) this);
        this.q.a.remove(new evr(this, 0));
        bbnc bbnc = this.C;
        if (bbnc != null) {
            bbnc.bK_();
            this.C = null;
        }
        eus eus = this.d;
        if (eus != null) {
            eus.a(null, null);
        }
        this.h = null;
        this.y = null;
        this.z = null;
        this.j = false;
        this.A = false;
        this.B = false;
        this.g = null;
        this.p.setVisibility(8);
    }

    public final void onClick(View view) {
        if (!this.j) {
            axwa axwa = this.g;
            if (axwa != null) {
                if (!axwa.C.isEmpty()) {
                    this.n.a(this.g.C, null);
                } else if (this.r.c()) {
                    axwa = this.g;
                    if (!(axwa == null || (axwa.a & 536870912) == 0 || this.h == null)) {
                        atss atss = (atss) atst.q.createBuilder();
                        atsg atsg = (atsg) atsh.c.createBuilder();
                        atsg.a(!a(this.g) ? 3 : 2);
                        atss.a(atsg);
                        this.h.a(3, new acvs(this.g.H.d()), (atst) ((anxl) atss.build()));
                    }
                    axwa = this.g;
                    if (this.l.a()) {
                        a(axwa, false);
                        return;
                    }
                    afqd esp = new esp(this, axwa);
                    if ((axwa.b & 1) != 0) {
                        Map hashMap = new HashMap();
                        hashMap.put("sign_in_callback", esp);
                        aaas aaas = this.n;
                        apxu apxu = axwa.I;
                        if (apxu == null) {
                            apxu = apxu.d;
                        }
                        aaas.a(apxu, hashMap);
                        return;
                    }
                    this.m.a(this.k, null, esp);
                } else {
                    this.s.a();
                }
            }
        }
    }

    private final boolean e() {
        axwa axwa = this.g;
        if (axwa == null) {
            return false;
        }
        if (axwa.q) {
            return true;
        }
        if (a(axwa)) {
            if (evj.a(this.g) != null) {
                return true;
            }
        } else if ((this.g.a & 65536) != 0) {
            return true;
        }
        return false;
    }

    private static apxu b(axwa axwa) {
        axwm axwm = axwa.u;
        if (axwm == null) {
            axwm = axwm.f;
        }
        axwk axwk = axwm.e;
        if (axwk == null) {
            axwk = axwk.c;
        }
        if ((axwk.a & 1) == 0) {
            return null;
        }
        axwm axwm2 = axwa.u;
        if (axwm2 == null) {
            axwm2 = axwm.f;
        }
        axwk axwk2 = axwm2.e;
        if (axwk2 == null) {
            axwk2 = axwk.c;
        }
        apxu apxu = axwk2.b;
        if (apxu == null) {
            apxu = apxu.d;
        }
        return apxu;
    }

    public final void a(axwa axwa, boolean z) {
        boolean a = a(axwa);
        arml arml = null;
        if (a) {
            if (evj.a(axwa) != null) {
                arml arml2;
                avur a2 = evj.a(axwa);
                Builder builder = new Builder(this.k);
                if ((a2.a & 1) != 0) {
                    arml2 = a2.b;
                    if (arml2 == null) {
                        arml2 = arml.f;
                    }
                } else {
                    arml2 = null;
                }
                builder = builder.setTitle(ajqy.a(arml2));
                if ((a2.a & 2) != 0) {
                    arml2 = a2.c;
                    if (arml2 == null) {
                        arml2 = arml.f;
                    }
                } else {
                    arml2 = null;
                }
                builder = builder.setMessage(ajqy.a(arml2));
                if ((a2.a & 4) != 0) {
                    arml2 = a2.d;
                    if (arml2 == null) {
                        arml2 = arml.f;
                    }
                } else {
                    arml2 = null;
                }
                AlertDialog create = builder.setNegativeButton(ajqy.a(arml2), null).create();
                if (a2.e) {
                    if ((a2.a & 16) != 0) {
                        arml = a2.f;
                        if (arml == null) {
                            arml = arml.f;
                        }
                    }
                    create.setButton(-1, ajqy.a(arml), new esq(this, axwa));
                }
                create.show();
                return;
            }
        } else if ((axwa.a & 65536) != 0) {
            if (eso.b(axwa) == null) {
                axwm axwm = axwa.u;
                if (axwm == null) {
                    axwm = axwm.f;
                }
                if ((axwm.a & 4) != 0) {
                    axwm = axwa.u;
                    if (axwm == null) {
                        axwm = axwm.f;
                    }
                    aqwx aqwx = axwm.d;
                    if (aqwx == null) {
                        aqwx = aqwx.g;
                    }
                    if (this.y == null) {
                        this.y = new Builder(this.k).setPositiveButton(this.k.getResources().getString(R.string.ok), null).create();
                    }
                    this.y.setTitle(aqwx.c);
                    this.y.setMessage(aqwx.d);
                    this.y.show();
                }
            } else {
                this.n.a(eso.b(axwa), null);
                return;
            }
        }
        if (axwa.q) {
            a(axwa, z, a ^ 1);
        }
    }

    public final void a(axwa axwa, boolean z, boolean z2) {
        evg evg = new evg(z, new ess(this, axwa, z2));
        Map hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", evg);
        acvx acvx = this.h;
        if (acvx != null) {
            hashMap.put("com.google.android.libraries.youtube.logging.interaction_logger", acvx);
        }
        Map map = this.z;
        if (map != null) {
            hashMap.putAll(map);
        }
        aaas aaas = this.n;
        List list = null;
        anxr access$000;
        if (!z2) {
            if (axwa.E.size() <= 0) {
                for (Object obj : axwa.B) {
                    access$000 = anxl.checkIsLite(UnsubscribeEndpointOuterClass$UnsubscribeEndpoint.unsubscribeEndpoint);
                    obj.a(access$000);
                    if (obj.h.a(access$000.d)) {
                        list = amul.a(obj);
                        break;
                    }
                }
            }
            list = axwa.E;
        } else if (axwa.D.size() <= 0) {
            for (Object obj2 : axwa.B) {
                access$000 = anxl.checkIsLite(SubscribeEndpointOuterClass$SubscribeEndpoint.subscribeEndpoint);
                obj2.a(access$000);
                if (obj2.h.a(access$000.d)) {
                    list = amul.a(obj2);
                    break;
                }
            }
        } else {
            list = axwa.D;
        }
        aaas.a(list, hashMap);
    }

    public final void a(esu esu) {
        this.e.add(esu);
    }

    public final void a(Uri uri, Uri uri2) {
        akmw a = this.u.a(uri);
        if (a instanceof grw) {
            grw grw = (grw) a;
            axwa axwa = this.g;
            if ((axwa.a & 1) != 0 && axwa.e.equals(grw.b())) {
                axwd axwd = (axwd) ((anxo) this.g.toBuilder());
                long d = grw.d();
                axwd.copyOnWrite();
                axwa axwa2 = (axwa) axwd.instance;
                axwa2.b |= 2;
                axwa2.J = d;
                if (grw.g() != null) {
                    axwd.a(grw.g().booleanValue());
                }
                aphv a2 = eus.a(this.g);
                aphv j = grw.j();
                axxl b = eus.b(this.g);
                axxl i = grw.i();
                axxd c = eus.c(this.g);
                axxd h = grw.h();
                if (a2 != null && j != null) {
                    aphm aphm = (aphm) aphj.d.createBuilder();
                    aphm.a(j);
                    aphj aphj = (aphj) ((anxl) aphm.build());
                    axwd.copyOnWrite();
                    axwa axwa3 = (axwa) axwd.instance;
                    if (aphj != null) {
                        axwa3.r = aphj;
                        axwa3.a |= 8192;
                    } else {
                        throw new NullPointerException();
                    }
                } else if (b != null && i != null) {
                    axvz axvz = (axvz) axvw.c.createBuilder();
                    axvz.copyOnWrite();
                    axvw axvw = (axvw) axvz.instance;
                    axvw.b = i;
                    axvw.a = 119226798;
                    axwd.a((axvw) ((anxl) axvz.build()));
                } else if (!(c == null || h == null)) {
                    axvz axvz2 = (axvz) axvw.c.createBuilder();
                    axvz2.copyOnWrite();
                    axvw axvw2 = (axvw) axvz2.instance;
                    axvw2.b = h;
                    axvw2.a = 136076983;
                    axwd.a((axvw) ((anxl) axvz2.build()));
                }
                this.g = (axwa) ((anxl) axwd.build());
                b();
            }
        }
    }

    public final void a(String str) {
        if (!TextUtils.isEmpty(str) && str.equals(d())) {
            f();
        }
    }

    private final void f() {
        if (e() && !this.j && !a(this.g)) {
            arup arup = this.g.x;
            if (arup == null) {
                arup = arup.c;
            }
            if (arup.a == 102716411) {
                aruh aruh;
                fmx fmx = this.f;
                arup arup2 = this.g.x;
                if (arup2 == null) {
                    arup2 = arup.c;
                }
                if (arup2.a == 102716411) {
                    aruh = (aruh) arup2.b;
                } else {
                    aruh = aruh.j;
                }
                fmx.a(aruh, this.p, this.g, this.h);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0047  */
    public final java.lang.Class[] a(java.lang.Class r3, java.lang.Object r4, int r5) {
        /*
        r2 = this;
        r3 = -1;
        r0 = 0;
        if (r5 == r3) goto L_0x0064;
    L_0x0004:
        if (r5 != 0) goto L_0x004b;
    L_0x0006:
        r4 = (com.google.protos.youtube.api.innertube.ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction) r4;
        r3 = r4.b;
        r3 = r3.isEmpty();
        if (r3 != 0) goto L_0x006c;
    L_0x0010:
        r3 = r2.g;
        if (r3 != 0) goto L_0x0015;
    L_0x0014:
        goto L_0x003c;
    L_0x0015:
        r3 = r3.y;
        if (r3 != 0) goto L_0x001b;
    L_0x0019:
        r3 = defpackage.axvv.c;
    L_0x001b:
        r3 = r3.a;
        r5 = 136390057; // 0x82125a9 float:4.8493444E-34 double:6.73856416E-316;
        if (r3 != r5) goto L_0x003c;
    L_0x0022:
        r3 = r2.g;
        r3 = r3.y;
        if (r3 != 0) goto L_0x002a;
    L_0x0028:
        r3 = defpackage.axvv.c;
    L_0x002a:
        r1 = r3.a;
        if (r1 != r5) goto L_0x0033;
    L_0x002e:
        r3 = r3.b;
        r3 = (defpackage.axwo) r3;
        goto L_0x0035;
    L_0x0033:
        r3 = defpackage.axwo.e;
    L_0x0035:
        r3 = r3.d;
        r3 = defpackage.amuw.a(r3);
        goto L_0x003e;
    L_0x003c:
        r3 = i;
    L_0x003e:
        r4 = r4.b;
        r3 = r3.contains(r4);
        if (r3 != 0) goto L_0x0047;
    L_0x0046:
        goto L_0x006c;
    L_0x0047:
        r2.f();
        return r0;
    L_0x004b:
        r3 = new java.lang.IllegalStateException;
        r4 = new java.lang.StringBuilder;
        r0 = 32;
        r4.<init>(r0);
        r0 = "unsupported op code: ";
        r4.append(r0);
        r4.append(r5);
        r4 = r4.toString();
        r3.<init>(r4);
        throw r3;
    L_0x0064:
        r3 = 1;
        r0 = new java.lang.Class[r3];
        r3 = 0;
        r4 = com.google.protos.youtube.api.innertube.ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction.class;
        r0[r3] = r4;
    L_0x006c:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eso.a(java.lang.Class, java.lang.Object, int):java.lang.Class[]");
    }
}
