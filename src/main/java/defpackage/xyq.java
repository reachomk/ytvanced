package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.InviteMoreEndpointOuterClass$InviteMoreEndpoint;
import com.google.protos.youtube.api.innertube.InviteToConversationEndpointOuterClass$InviteToConversationEndpoint;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: xyq */
public final class xyq implements alov, aloy, yao {
    public final xoi a;
    public final xys b;
    public boolean c;
    private final apxu d;
    private final aarh e;
    private final aaas f;
    private final xci g;
    private final acvx h;
    private final akpd i;
    private final akoh j;
    private final Set k;
    private final Set l;
    private final Map m;
    private apxu n;
    private aphv o;
    private apxu p;
    private int q;
    private CharSequence r;
    private CharSequence s;

    public xyq(aarh aarh, xoi xoi, akkq akkq, aaas aaas, xci xci, akpe akpe, bcaa bcaa, apxu apxu, Context context, xys xys, acvx acvx) {
        boolean z = false;
        if (apxu != null) {
            anxr access$000 = anxl.checkIsLite(InviteMoreEndpointOuterClass$InviteMoreEndpoint.inviteMoreEndpoint);
            apxu.a(access$000);
            if (apxu.h.a(access$000.d)) {
                z = true;
            }
        }
        amqw.a(z);
        this.d = apxu;
        this.e = (aarh) amqw.a((Object) aarh);
        this.a = (xoi) amqw.a((Object) xoi);
        this.f = (aaas) amqw.a((Object) aaas);
        this.b = (xys) amqw.a((Object) xys);
        this.g = (xci) amqw.a((Object) xci);
        this.h = (acvx) amqw.a((Object) acvx);
        this.j = new akoh();
        this.k = new HashSet();
        this.l = new HashSet();
        this.m = new HashMap();
        aknw aknw = new aknw();
        aknw.a(aqke.class, new alos(context, akkq, this));
        aknw.a(aqkg.class, new alow(context, akkq, this));
        aknw.a(aphg.class, new akpa(bcaa));
        this.i = akpe.a(aknw);
        this.i.a(this.j);
    }

    public final void a() {
        apxu apxu = this.d;
        anxr access$000 = anxl.checkIsLite(InviteMoreEndpointOuterClass$InviteMoreEndpoint.inviteMoreEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        InviteMoreEndpointOuterClass$InviteMoreEndpoint inviteMoreEndpointOuterClass$InviteMoreEndpoint = (InviteMoreEndpointOuterClass$InviteMoreEndpoint) b;
        axak axak = inviteMoreEndpointOuterClass$InviteMoreEndpoint.c;
        if (axak == null) {
            axak = axak.a;
        }
        ajzw a = ajzv.a(axak);
        if (ajzv.b(a, ajwp.class)) {
            a((ajwp) ajzv.a(a, ajwp.class));
        } else {
            String str = inviteMoreEndpointOuterClass$InviteMoreEndpoint.b;
            this.b.b(true);
            aarh aarh = this.e;
            afsw xyp = new xyp(this);
            aaml aato = new aato(aarh.c, aarh.d.c());
            aato.a = xvd.a(str);
            aarh.a(ajva.class, aarh.b, aars.a).a(aato, xyp);
        }
        if (this.d.b.b() > 0) {
            this.h.a(acwl.r, this.d, null);
        }
    }

    public final void b() {
        apxu apxu;
        if (f()) {
            apxu = this.p;
            if (apxu != null) {
                this.f.a(apxu, null);
                return;
            }
        }
        apxu = this.n;
        if (apxu != null) {
            anxr access$000 = anxl.checkIsLite(InviteToConversationEndpointOuterClass$InviteToConversationEndpoint.inviteToConversationEndpoint);
            apxu.a(access$000);
            if (apxu.h.a(access$000.d)) {
                apxu = this.n;
                access$000 = anxl.checkIsLite(InviteToConversationEndpointOuterClass$InviteToConversationEndpoint.inviteToConversationEndpoint);
                apxu.a(access$000);
                Object b = apxu.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                atuz atuz = (atuz) ((anxo) ((InviteToConversationEndpointOuterClass$InviteToConversationEndpoint) b).toBuilder());
                atuz.copyOnWrite();
                ((InviteToConversationEndpointOuterClass$InviteToConversationEndpoint) atuz.instance).c = anxl.emptyProtobufList();
                Set set = this.k;
                atuz.copyOnWrite();
                InviteToConversationEndpointOuterClass$InviteToConversationEndpoint inviteToConversationEndpointOuterClass$InviteToConversationEndpoint = (InviteToConversationEndpointOuterClass$InviteToConversationEndpoint) atuz.instance;
                if (!inviteToConversationEndpointOuterClass$InviteToConversationEndpoint.c.a()) {
                    inviteToConversationEndpointOuterClass$InviteToConversationEndpoint.c = anxl.mutableCopy(inviteToConversationEndpointOuterClass$InviteToConversationEndpoint.c);
                }
                anvf.addAll(set, inviteToConversationEndpointOuterClass$InviteToConversationEndpoint.c);
                atuz.copyOnWrite();
                ((InviteToConversationEndpointOuterClass$InviteToConversationEndpoint) atuz.instance).d = anxl.emptyProtobufList();
                set = this.l;
                atuz.copyOnWrite();
                inviteToConversationEndpointOuterClass$InviteToConversationEndpoint = (InviteToConversationEndpointOuterClass$InviteToConversationEndpoint) atuz.instance;
                if (!inviteToConversationEndpointOuterClass$InviteToConversationEndpoint.d.a()) {
                    inviteToConversationEndpointOuterClass$InviteToConversationEndpoint.d = anxl.mutableCopy(inviteToConversationEndpointOuterClass$InviteToConversationEndpoint.d);
                }
                anvf.addAll(set, inviteToConversationEndpointOuterClass$InviteToConversationEndpoint.d);
                apxx apxx = (apxx) ((anxo) this.n.toBuilder());
                apxx.a(InviteToConversationEndpointOuterClass$InviteToConversationEndpoint.inviteToConversationEndpoint, (InviteToConversationEndpointOuterClass$InviteToConversationEndpoint) ((anxl) atuz.build()));
                apxu = (apxu) ((anxl) apxx.build());
                Map hashMap = new HashMap();
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this);
                this.f.a(apxu, hashMap);
                this.b.a(false);
                this.b.b(true);
                this.b.b();
            }
        }
    }

    public final void c() {
        this.b.a(true);
        this.b.b(false);
        g();
    }

    public final void d() {
        this.b.a(true);
        this.b.b(false);
        this.g.d(new ybf());
        apxu apxu = this.p;
        if (apxu != null) {
            this.f.a(apxu, null);
        } else {
            this.b.a();
        }
    }

    public final boolean a(aqke aqke) {
        boolean f = f();
        if (b(aqke)) {
            this.k.remove(aqke.e);
        } else if (e() < this.q) {
            this.k.add(aqke.e);
        } else {
            if (!(TextUtils.isEmpty(this.r) || TextUtils.isEmpty(this.s))) {
                this.b.a(this.r, this.s);
            }
            return false;
        }
        boolean f2 = f();
        if (f != f2) {
            a(f2);
        }
        g();
        return true;
    }

    public final boolean a(aqkg aqkg) {
        boolean f = f();
        String str = aqkg.g;
        if (b(aqkg)) {
            this.l.remove(str);
        } else if (e() < this.q) {
            this.l.add(str);
        } else {
            if (!(TextUtils.isEmpty(this.r) || TextUtils.isEmpty(this.s))) {
                this.b.a(this.r, this.s);
            }
            return false;
        }
        boolean f2 = f();
        if (f != f2) {
            a(f2);
        }
        g();
        return true;
    }

    public final boolean b(aqke aqke) {
        return this.k.contains(aqke.e);
    }

    public final boolean b(aqkg aqkg) {
        return this.l.contains(aqkg.g);
    }

    private final int e() {
        return this.k.size() + this.l.size();
    }

    private final boolean f() {
        return this.k.isEmpty() && this.l.isEmpty();
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00d8  */
    public final void a(defpackage.ajwp r14) {
        /*
        r13 = this;
        r0 = r13.c;
        if (r0 != 0) goto L_0x01bf;
    L_0x0004:
        if (r14 != 0) goto L_0x0019;
    L_0x0006:
        r14 = "Invite-more panel not returned.";
        defpackage.xtl.c(r14);
        r14 = r13.a;
        r0 = 2131952119; // 0x7f1301f7 float:1.9540672E38 double:1.0533243006E-314;
        r14.a(r0);
        r14 = r13.b;
        r14.a();
        return;
    L_0x0019:
        r0 = r14.i;
        r1 = 0;
        if (r0 == 0) goto L_0x0041;
    L_0x001e:
        r0 = new akpk;
        r0.<init>();
        r2 = r13.j;
        r2.a(r0);
        r2 = r14.i;
        r3 = r2.length;
        r4 = 0;
    L_0x002c:
        if (r4 >= r3) goto L_0x0041;
    L_0x002e:
        r5 = r2[r4];
        r6 = defpackage.aphg.class;
        r5 = defpackage.ajzv.a(r5, r6);
        r5 = (defpackage.aphg) r5;
        if (r5 != 0) goto L_0x003b;
    L_0x003a:
        goto L_0x003e;
    L_0x003b:
        r0.add(r5);
    L_0x003e:
        r4 = r4 + 1;
        goto L_0x002c;
    L_0x0041:
        r0 = new android.util.SparseArray;
        r0.<init>();
        r2 = r14.b;
        r3 = 1;
        r4 = 0;
        if (r2 == 0) goto L_0x00fb;
    L_0x004c:
        r5 = r2.length;
        r6 = 0;
    L_0x004e:
        if (r6 >= r5) goto L_0x00fb;
    L_0x0050:
        r7 = r2[r6];
        r8 = r7.a;
        r8 = r8 & r3;
        if (r8 != 0) goto L_0x0059;
    L_0x0057:
        goto L_0x00f7;
    L_0x0059:
        r7 = r7.b;
        if (r7 != 0) goto L_0x005f;
    L_0x005d:
        r7 = defpackage.aqmc.f;
    L_0x005f:
        r8 = new akpk;
        r8.<init>();
        r9 = r13.j;
        r9.a(r8);
        r9 = r7.e;
        r9 = r9.iterator();
    L_0x006f:
        r10 = r9.hasNext();
        if (r10 == 0) goto L_0x00de;
    L_0x0075:
        r10 = r9.next();
        r10 = (defpackage.aqma) r10;
        r11 = r10.a;
        r12 = r11 & 1;
        if (r12 == 0) goto L_0x00a0;
    L_0x0081:
        r11 = r10.b;
        if (r11 != 0) goto L_0x0087;
    L_0x0085:
        r11 = defpackage.aqke.f;
    L_0x0087:
        r8.add(r11);
        r11 = r10.b;
        if (r11 != 0) goto L_0x0090;
    L_0x008e:
        r11 = defpackage.aqke.f;
    L_0x0090:
        r11 = r11.a;
        r11 = r11 & 8;
        if (r11 != 0) goto L_0x0097;
    L_0x0096:
        goto L_0x00c3;
    L_0x0097:
        r10 = r10.b;
        if (r10 != 0) goto L_0x009d;
    L_0x009b:
        r10 = defpackage.aqke.f;
    L_0x009d:
        r10 = r10.e;
        goto L_0x00c4;
    L_0x00a0:
        r11 = r11 & 2;
        if (r11 == 0) goto L_0x00c3;
    L_0x00a4:
        r11 = r10.c;
        if (r11 != 0) goto L_0x00aa;
    L_0x00a8:
        r11 = defpackage.aqkg.h;
    L_0x00aa:
        r8.add(r11);
        r11 = r10.c;
        if (r11 != 0) goto L_0x00b3;
    L_0x00b1:
        r11 = defpackage.aqkg.h;
    L_0x00b3:
        r11 = r11.a;
        r11 = r11 & 32;
        if (r11 != 0) goto L_0x00ba;
    L_0x00b9:
        goto L_0x00c3;
    L_0x00ba:
        r10 = r10.c;
        if (r10 != 0) goto L_0x00c0;
    L_0x00be:
        r10 = defpackage.aqkg.h;
    L_0x00c0:
        r10 = r10.g;
        goto L_0x00c4;
    L_0x00c3:
        r10 = r4;
    L_0x00c4:
        if (r10 == 0) goto L_0x006f;
    L_0x00c6:
        r11 = r7.a;
        r11 = r11 & 4;
        if (r11 == 0) goto L_0x006f;
    L_0x00cc:
        r11 = r13.m;
        r12 = r7.d;
        if (r12 != 0) goto L_0x00d4;
    L_0x00d2:
        r12 = defpackage.aqkp.c;
    L_0x00d4:
        r12 = r12.b;
        if (r12 != 0) goto L_0x00da;
    L_0x00d8:
        r12 = defpackage.aqkn.f;
    L_0x00da:
        r11.put(r10, r12);
        goto L_0x006f;
    L_0x00de:
        r7 = r7.b;
        if (r7 != 0) goto L_0x00e4;
    L_0x00e2:
        r7 = defpackage.arml.f;
    L_0x00e4:
        r7 = defpackage.ajqy.a(r7);
        r9 = android.text.TextUtils.isEmpty(r7);
        if (r9 != 0) goto L_0x00f7;
    L_0x00ee:
        r9 = r13.j;
        r8 = r9.e(r8);
        r0.put(r8, r7);
    L_0x00f7:
        r6 = r6 + 1;
        goto L_0x004e;
    L_0x00fb:
        r2 = r14.e;
        r13.q = r2;
        r2 = r14.f;
        r2 = defpackage.ajqy.a(r2);
        r13.r = r2;
        r2 = r14.g;
        r2 = defpackage.ajqy.a(r2);
        r13.s = r2;
        r2 = r14.k;
        r5 = defpackage.aphv.class;
        r2 = defpackage.ajzv.a(r2, r5);
        r2 = (defpackage.aphv) r2;
        r13.o = r2;
        r2 = r13.o;
        if (r2 != 0) goto L_0x0120;
    L_0x011f:
        goto L_0x014b;
    L_0x0120:
        r5 = r2.a;
        r5 = r5 & 16384;
        if (r5 == 0) goto L_0x014b;
    L_0x0126:
        r2 = r2.m;
        if (r2 != 0) goto L_0x012c;
    L_0x012a:
        r2 = defpackage.apxu.d;
    L_0x012c:
        r2 = r2.toByteArray();
        r2 = defpackage.aabc.a(r2);
        r13.n = r2;
        r2 = r13.o;
        r5 = r2.a;
        r5 = r5 & 64;
        if (r5 == 0) goto L_0x0145;
    L_0x013e:
        r2 = r2.e;
        if (r2 != 0) goto L_0x0146;
    L_0x0142:
        r2 = defpackage.arml.f;
        goto L_0x0146;
    L_0x0145:
        r2 = r4;
    L_0x0146:
        r2 = defpackage.ajqy.a(r2);
        goto L_0x0182;
    L_0x014b:
        r2 = r14.c;
        if (r2 != 0) goto L_0x0151;
    L_0x014f:
        r2 = r4;
        goto L_0x015c;
    L_0x0151:
        r5 = r2.a;
        r5 = r5 & r3;
        if (r5 == 0) goto L_0x014f;
    L_0x0156:
        r2 = r2.b;
        if (r2 != 0) goto L_0x015c;
    L_0x015a:
        r2 = defpackage.aphg.s;
    L_0x015c:
        if (r2 == 0) goto L_0x0181;
    L_0x015e:
        r5 = r2.l;
        if (r5 != 0) goto L_0x0164;
    L_0x0162:
        r5 = defpackage.apxu.d;
    L_0x0164:
        r5 = r5.toByteArray();
        r5 = defpackage.aabc.a(r5);
        r13.n = r5;
        r5 = r2.a;
        r5 = r5 & 128;
        if (r5 == 0) goto L_0x017b;
    L_0x0174:
        r2 = r2.g;
        if (r2 != 0) goto L_0x017c;
    L_0x0178:
        r2 = defpackage.arml.f;
        goto L_0x017c;
    L_0x017b:
        r2 = r4;
    L_0x017c:
        r2 = defpackage.ajqy.a(r2);
        goto L_0x0182;
    L_0x0181:
        r2 = r4;
    L_0x0182:
        r5 = r14.j;
        r13.p = r5;
        r5 = r13.b;
        r6 = r14.a;
        defpackage.ajqy.a(r6);
        r6 = r13.i;
        r5.a(r2, r0, r6);
        r0 = r13.b;
        r2 = r13.i;
        r2 = r2.a();
        if (r2 != 0) goto L_0x01a3;
    L_0x019c:
        r2 = r14.h;
        r2 = defpackage.ajqy.a(r2);
        goto L_0x01a4;
    L_0x01a3:
        r2 = r4;
    L_0x01a4:
        r0.c(r2);
        r0 = r13.b;
        r2 = r13.o;
        if (r2 == 0) goto L_0x01ae;
    L_0x01ad:
        r1 = 1;
    L_0x01ae:
        r0.a(r1);
        r0 = r13.h;
        r1 = r14.d;
        r0.a(r1);
        r0 = r13.h;
        r14 = r14.d;
        r0.a(r14, r4);
    L_0x01bf:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xyq.a(ajwp):void");
    }

    private final void g() {
        Set set = this.l;
        Set set2 = this.k;
        CharSequence charSequence = null;
        if (!set.isEmpty()) {
            aqkn aqkn;
            Iterator it = set.iterator();
            if (it.hasNext()) {
                aqkn = (aqkn) this.m.get((String) it.next());
            } else {
                aqkn = null;
            }
            if (aqkn != null) {
                arml arml;
                if (!set2.isEmpty()) {
                    arml = aqkn.e;
                    if (arml == null) {
                        arml = arml.f;
                    }
                    charSequence = ajqy.a(arml);
                } else if (set.size() == 1) {
                    arml = aqkn.c;
                    if (arml == null) {
                        arml = arml.f;
                    }
                    charSequence = ajqy.a(arml);
                } else {
                    arml = aqkn.d;
                    if (arml == null) {
                        arml = arml.f;
                    }
                    charSequence = ajqy.a(arml);
                }
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.b.b();
        } else {
            this.b.b(charSequence);
        }
    }

    private final void a(boolean z) {
        aphv aphv = this.o;
        if (aphv != null) {
            CharSequence a;
            xys xys = this.b;
            arml arml = null;
            if (z) {
                if ((aphv.a & 64) != 0) {
                    arml = aphv.e;
                    if (arml == null) {
                        arml = arml.f;
                    }
                }
                a = ajqy.a(arml);
            } else {
                if ((aphv.a & 4096) != 0) {
                    arml = aphv.k;
                    if (arml == null) {
                        arml = arml.f;
                    }
                }
                a = ajqy.a(arml);
            }
            xys.a(a);
            return;
        }
        this.b.a(z ^ 1);
    }
}
