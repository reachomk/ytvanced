package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ReelItemRendererOuterClass$ReelItemRenderer;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: kjf */
public final class kjf extends akpl implements xcp {
    public final Context a;
    public final nn b;
    public final xci c;
    public final RecyclerView d;
    public final akpk e;
    public final aknc f;
    public final Map g = new HashMap();
    public final List h = new ArrayList();
    public int i;
    private final akvp j;
    private final akvo k;
    private final flu l;
    private final ggc m;
    private final gax n;
    private final gau o;
    private final View p;
    private final TextView q;
    private final ImageButton r;
    private final View s;
    private final akpd t;
    private int u;
    private awyk v;

    public kjf(Context context, nn nnVar, akvp akvp, akvo akvo, flu flu, akvz akvz, akpe akpe, xci xci, ggc ggc, gax gax) {
        this.a = context;
        this.b = nnVar;
        this.j = akvp;
        this.k = akvo;
        this.l = flu;
        this.c = xci;
        this.m = ggc;
        this.n = gax;
        this.p = LayoutInflater.from(context).inflate(R.layout.reel_multiple_items_shelf, null);
        this.q = (TextView) this.p.findViewById(R.id.reel_multiple_items_shelf_title);
        this.s = this.p.findViewById(R.id.reel_shelf_contextual_menu_anchor);
        this.d = (RecyclerView) this.p.findViewById(R.id.reel_multiple_items_view);
        this.d.a(new ans(0, false));
        RecyclerView recyclerView = this.d;
        recyclerView.a(new xpi(recyclerView));
        this.r = (ImageButton) this.p.findViewById(R.id.reel_shelf_expand_button);
        this.e = new akpk();
        this.f = new aknc(this.e);
        this.t = akpe.a((akpb) akvz.get());
        this.t.a(this.f);
        this.d.a(this.t);
        this.o = new gau();
        this.t.a(this.o);
        flu.a(this.p);
    }

    private static boolean b(awyk awyk) {
        if (awyk.d.size() != 0) {
            ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer;
            axak axak = (axak) awyk.d.get(0);
            anxr access$000 = anxl.checkIsLite(ReelItemRendererOuterClass$ReelItemRenderer.reelItemRenderer);
            axak.a(access$000);
            if (axak.h.a(access$000.d)) {
                axak axak2 = (axak) awyk.d.get(0);
                anxr access$0002 = anxl.checkIsLite(ReelItemRendererOuterClass$ReelItemRenderer.reelItemRenderer);
                axak2.a(access$0002);
                Object b = axak2.h.b(access$0002.d);
                if (b == null) {
                    b = access$0002.b;
                } else {
                    b = access$0002.a(b);
                }
                reelItemRendererOuterClass$ReelItemRenderer = (ReelItemRendererOuterClass$ReelItemRenderer) b;
            } else {
                reelItemRendererOuterClass$ReelItemRenderer = null;
            }
            if (reelItemRendererOuterClass$ReelItemRenderer != null) {
                int a = awwp.a(reelItemRendererOuterClass$ReelItemRenderer.o);
                if (a != 0 && a == 9) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void b() {
        ArrayList arrayList = new ArrayList();
        for (axak axak : this.v.d) {
            Object b;
            ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer;
            anxr access$000 = anxl.checkIsLite(ReelItemRendererOuterClass$ReelItemRenderer.reelItemRenderer);
            axak.a(access$000);
            if (axak.h.a(access$000.d)) {
                access$000 = anxl.checkIsLite(ReelItemRendererOuterClass$ReelItemRenderer.reelItemRenderer);
                axak.a(access$000);
                b = axak.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                reelItemRendererOuterClass$ReelItemRenderer = (ReelItemRendererOuterClass$ReelItemRenderer) b;
            } else {
                reelItemRendererOuterClass$ReelItemRenderer = null;
            }
            if (reelItemRendererOuterClass$ReelItemRenderer != null) {
                List list = this.h;
                Object obj = reelItemRendererOuterClass$ReelItemRenderer.p;
                if (obj == null) {
                    obj = awxn.c;
                }
                if (!list.contains(obj)) {
                    anxp anxp = reelItemRendererOuterClass$ReelItemRenderer.j;
                    if (anxp == null) {
                        anxp = apxu.d;
                    }
                    anxr access$0002 = anxl.checkIsLite(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
                    anxp.a(access$0002);
                    if (anxp.h.a(access$0002.d)) {
                        anxp anxp2 = reelItemRendererOuterClass$ReelItemRenderer.j;
                        if (anxp2 == null) {
                            anxp2 = apxu.d;
                        }
                        access$000 = anxl.checkIsLite(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
                        anxp2.a(access$000);
                        b = anxp2.h.b(access$000.d);
                        if (b == null) {
                            b = access$000.b;
                        } else {
                            b = access$000.a(b);
                        }
                        arrayList.add((ReelWatchEndpointOuterClass$ReelWatchEndpoint) b);
                    }
                }
            }
        }
        this.o.a = new gas(Collections.unmodifiableList(arrayList));
    }

    public final View K_() {
        return this.l.b;
    }

    public final void a(akpb akpb) {
        this.e.clear();
        this.o.a();
        this.c.b(this);
        this.v = null;
    }

    public static int a(awyk awyk) {
        return !kjf.b(awyk) ? 4 : 3;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01d3  */
    public final /* synthetic */ void a(defpackage.akor r14, java.lang.Object r15) {
        /*
        r13 = this;
        r15 = (defpackage.awyk) r15;
        r13.v = r15;
        r0 = r14.a;
        r1 = r15.f;
        r1 = r1.d();
        r2 = 0;
        r0.a(r1, r2);
        r0 = r15.a;
        r1 = 1;
        r0 = r0 & r1;
        r3 = 0;
        if (r0 != 0) goto L_0x001d;
    L_0x0017:
        r0 = r13.q;
        defpackage.xpr.a(r0, r3);
        goto L_0x0031;
    L_0x001d:
        r0 = r13.q;
        r4 = r15.b;
        if (r4 != 0) goto L_0x0025;
    L_0x0023:
        r4 = defpackage.arml.f;
    L_0x0025:
        r4 = defpackage.ajqy.a(r4);
        r0.setText(r4);
        r0 = r13.q;
        defpackage.xpr.a(r0, r1);
    L_0x0031:
        r0 = r15.g;
        if (r0 == 0) goto L_0x0036;
    L_0x0035:
        goto L_0x0038;
    L_0x0036:
        r0 = defpackage.axak.a;
    L_0x0038:
        r4 = com.google.protos.youtube.api.innertube.ButtonRendererOuterClass.buttonRenderer;
        r4 = defpackage.anxl.checkIsLite(r4);
        r0.a(r4);
        r0 = r0.h;
        r4 = r4.d;
        r0 = r0.a(r4);
        if (r0 != 0) goto L_0x004d;
    L_0x004b:
        r0 = r2;
        goto L_0x0070;
    L_0x004d:
        r0 = r15.g;
        if (r0 == 0) goto L_0x0052;
    L_0x0051:
        goto L_0x0054;
    L_0x0052:
        r0 = defpackage.axak.a;
    L_0x0054:
        r4 = com.google.protos.youtube.api.innertube.ButtonRendererOuterClass.buttonRenderer;
        r4 = defpackage.anxl.checkIsLite(r4);
        r0.a(r4);
        r0 = r0.h;
        r5 = r4.d;
        r0 = r0.b(r5);
        if (r0 != 0) goto L_0x006a;
    L_0x0067:
        r0 = r4.b;
        goto L_0x006e;
    L_0x006a:
        r0 = r4.a(r0);
    L_0x006e:
        r0 = (defpackage.aphg) r0;
    L_0x0070:
        r4 = defpackage.kjf.a(r15);
        r5 = r15.d;
        r5 = r5.size();
        if (r0 == 0) goto L_0x009d;
    L_0x007c:
        r0 = r0.e;
        if (r0 != 0) goto L_0x0082;
    L_0x0080:
        r0 = defpackage.arwf.c;
    L_0x0082:
        r0 = r0.a;
        r0 = r0 & r1;
        if (r0 != 0) goto L_0x0088;
    L_0x0087:
        goto L_0x009d;
    L_0x0088:
        if (r5 <= r4) goto L_0x009d;
    L_0x008a:
        r0 = r13.i;
        r5 = r13.v;
        r5 = r5.g;
        if (r5 != 0) goto L_0x0094;
    L_0x0092:
        r5 = defpackage.axak.a;
    L_0x0094:
        r5 = r5.hashCode();
        if (r0 != r5) goto L_0x009b;
    L_0x009a:
        goto L_0x009d;
    L_0x009b:
        r0 = 1;
        goto L_0x009e;
    L_0x009d:
        r0 = 0;
    L_0x009e:
        r5 = r13.f;
        if (r0 != 0) goto L_0x00a5;
    L_0x00a2:
        r4 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
    L_0x00a5:
        r5.b(r4);
        r4 = 2;
        if (r0 != 0) goto L_0x00b2;
    L_0x00ab:
        r0 = r13.r;
        defpackage.xpr.a(r0, r3);
        goto L_0x013a;
    L_0x00b2:
        r0 = r15.g;
        if (r0 != 0) goto L_0x00b8;
    L_0x00b6:
        r0 = defpackage.axak.a;
    L_0x00b8:
        r5 = com.google.protos.youtube.api.innertube.ButtonRendererOuterClass.buttonRenderer;
        r5 = defpackage.anxl.checkIsLite(r5);
        r0.a(r5);
        r0 = r0.h;
        r6 = r5.d;
        r0 = r0.b(r6);
        if (r0 != 0) goto L_0x00ce;
    L_0x00cb:
        r0 = r5.b;
        goto L_0x00d2;
    L_0x00ce:
        r0 = r5.a(r0);
    L_0x00d2:
        r0 = (defpackage.aphg) r0;
        r5 = r13.j;
        r6 = r0.e;
        if (r6 != 0) goto L_0x00dc;
    L_0x00da:
        r6 = defpackage.arwf.c;
    L_0x00dc:
        r6 = r6.b;
        r6 = defpackage.arwh.a(r6);
        if (r6 != 0) goto L_0x00e6;
    L_0x00e4:
        r6 = defpackage.arwh.UNKNOWN;
    L_0x00e6:
        r5 = r5.a(r6);
        r6 = r13.r;
        r6.setImageResource(r5);
        r5 = r13.r;
        defpackage.xpr.a(r5, r1);
        r5 = r14.a;
        r6 = r0.r;
        r6 = r6.d();
        r5.a(r6);
        r5 = r14.a;
        r6 = r0.r;
        r6 = r6.d();
        r5.a(r6, r2);
        r5 = r13.r;
        r6 = r0.q;
        if (r6 != 0) goto L_0x0112;
    L_0x0110:
        r6 = defpackage.aodx.c;
    L_0x0112:
        r6 = r6.b;
        if (r6 != 0) goto L_0x0118;
    L_0x0116:
        r6 = defpackage.aodv.c;
    L_0x0118:
        r6 = r6.a;
        r6 = r6 & r4;
        if (r6 != 0) goto L_0x011f;
    L_0x011d:
        r6 = r2;
        goto L_0x012d;
    L_0x011f:
        r6 = r0.q;
        if (r6 != 0) goto L_0x0125;
    L_0x0123:
        r6 = defpackage.aodx.c;
    L_0x0125:
        r6 = r6.b;
        if (r6 != 0) goto L_0x012b;
    L_0x0129:
        r6 = defpackage.aodv.c;
    L_0x012b:
        r6 = r6.b;
    L_0x012d:
        r5.setContentDescription(r6);
        r5 = r13.r;
        r6 = new kje;
        r6.<init>(r13, r0, r14, r15);
        r5.setOnClickListener(r6);
    L_0x013a:
        r11 = new java.util.HashMap;
        r11.<init>();
        r0 = new kjh;
        r0.<init>(r13, r15);
        r5 = "multiReelDismissalCallback";
        r11.put(r5, r0);
        r0 = r15.d;
        r5 = new defpackage.axak[r3];
        r0 = r0.toArray(r5);
        r5 = "reelItemRenderers";
        r11.put(r5, r0);
        r0 = r13.h;
        r5 = "reelDismissalInfo";
        r11.put(r5, r0);
        r7 = r13.k;
        r8 = r13.p;
        r9 = r13.s;
        r0 = r15.c;
        if (r0 == 0) goto L_0x0168;
    L_0x0167:
        goto L_0x016a;
    L_0x0168:
        r0 = defpackage.axak.a;
    L_0x016a:
        r5 = com.google.protos.youtube.api.innertube.MenuRendererOuterClass.menuRenderer;
        r5 = defpackage.anxl.checkIsLite(r5);
        r0.a(r5);
        r0 = r0.h;
        r5 = r5.d;
        r0 = r0.a(r5);
        if (r0 == 0) goto L_0x01a2;
    L_0x017d:
        r0 = r15.c;
        if (r0 == 0) goto L_0x0182;
    L_0x0181:
        goto L_0x0184;
    L_0x0182:
        r0 = defpackage.axak.a;
    L_0x0184:
        r5 = com.google.protos.youtube.api.innertube.MenuRendererOuterClass.menuRenderer;
        r5 = defpackage.anxl.checkIsLite(r5);
        r0.a(r5);
        r0 = r0.h;
        r6 = r5.d;
        r0 = r0.b(r6);
        if (r0 != 0) goto L_0x019a;
    L_0x0197:
        r0 = r5.b;
        goto L_0x019e;
    L_0x019a:
        r0 = r5.a(r0);
    L_0x019e:
        r0 = (defpackage.auvn) r0;
        r10 = r0;
        goto L_0x01a3;
    L_0x01a2:
        r10 = r2;
    L_0x01a3:
        r12 = r14.a;
        r7.a(r8, r9, r10, r11, r12);
        r0 = r13.t;
        r5 = new akod;
        r6 = r14.a;
        r5.<init>(r6);
        r0.a(r5);
        r0 = defpackage.kjf.b(r15);
        r5 = r13.t;
        r6 = new kjg;
        r6.<init>(r13, r15, r0);
        r5.a(r6);
        r0 = r13.e;
        r0.clear();
        r15 = r15.d;
        r15 = r15.iterator();
    L_0x01cd:
        r0 = r15.hasNext();
        if (r0 == 0) goto L_0x0280;
    L_0x01d3:
        r0 = r15.next();
        r0 = (defpackage.axak) r0;
        r5 = com.google.protos.youtube.api.innertube.ReelItemRendererOuterClass$ReelItemRenderer.reelItemRenderer;
        r5 = defpackage.anxl.checkIsLite(r5);
        r0.a(r5);
        r6 = r0.h;
        r5 = r5.d;
        r5 = r6.a(r5);
        if (r5 == 0) goto L_0x0209;
    L_0x01ec:
        r5 = com.google.protos.youtube.api.innertube.ReelItemRendererOuterClass$ReelItemRenderer.reelItemRenderer;
        r5 = defpackage.anxl.checkIsLite(r5);
        r0.a(r5);
        r6 = r0.h;
        r7 = r5.d;
        r6 = r6.b(r7);
        if (r6 != 0) goto L_0x0202;
    L_0x01ff:
        r5 = r5.b;
        goto L_0x0206;
    L_0x0202:
        r5 = r5.a(r6);
    L_0x0206:
        r5 = (com.google.protos.youtube.api.innertube.ReelItemRendererOuterClass$ReelItemRenderer) r5;
        goto L_0x020a;
    L_0x0209:
        r5 = r2;
    L_0x020a:
        if (r5 == 0) goto L_0x024c;
    L_0x020c:
        r6 = r13.h;
        r7 = r5.p;
        if (r7 != 0) goto L_0x0214;
    L_0x0212:
        r7 = defpackage.awxn.c;
    L_0x0214:
        r6 = r6.contains(r7);
        if (r6 != 0) goto L_0x024c;
    L_0x021a:
        r0 = r13.e;
        r0.add(r5);
        r0 = r13.g;
        r6 = r5.p;
        if (r6 != 0) goto L_0x0227;
    L_0x0225:
        r6 = defpackage.awxn.c;
    L_0x0227:
        r0.put(r6, r5);
        r0 = r13.n;
        r6 = r5.a;
        r6 = r6 & 512;
        if (r6 == 0) goto L_0x0239;
    L_0x0232:
        r6 = r5.j;
        if (r6 != 0) goto L_0x023a;
    L_0x0236:
        r6 = defpackage.apxu.d;
        goto L_0x023a;
    L_0x0239:
        r6 = r2;
    L_0x023a:
        r5 = r5.l;
        r5 = defpackage.awwn.a(r5);
        if (r5 != 0) goto L_0x0244;
    L_0x0242:
        r5 = 0;
        goto L_0x0248;
    L_0x0244:
        if (r5 == r4) goto L_0x0247;
    L_0x0246:
        goto L_0x0242;
    L_0x0247:
        r5 = 1;
    L_0x0248:
        r0.a(r1, r6, r5);
        goto L_0x01cd;
    L_0x024c:
        r5 = com.google.protos.youtube.api.innertube.ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer.reelShelfCreationRenderer;
        r5 = defpackage.anxl.checkIsLite(r5);
        r0.a(r5);
        r6 = r0.h;
        r5 = r5.d;
        r5 = r6.a(r5);
        if (r5 == 0) goto L_0x01cd;
    L_0x025f:
        r5 = r13.e;
        r6 = com.google.protos.youtube.api.innertube.ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer.reelShelfCreationRenderer;
        r6 = defpackage.anxl.checkIsLite(r6);
        r0.a(r6);
        r0 = r0.h;
        r7 = r6.d;
        r0 = r0.b(r7);
        if (r0 != 0) goto L_0x0277;
    L_0x0274:
        r0 = r6.b;
        goto L_0x027b;
    L_0x0277:
        r0 = r6.a(r0);
    L_0x027b:
        r5.add(r0);
        goto L_0x01cd;
    L_0x0280:
        r13.b();
        r15 = r13.l;
        r15.a(r14);
        r14 = r13.c;
        r14.a(r13);
        r13.u = r3;
        r14 = r13.m;
        r14.a = r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kjf.a(akor, java.lang.Object):void");
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Object obj2;
        ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer;
        List list;
        if (i == -1) {
            return new Class[]{zyg.class, aaxc.class};
        } else if (i == 0) {
            obj2 = ((zyg) obj).d;
            if (!(obj2 instanceof ReelItemRendererOuterClass$ReelItemRenderer)) {
                return null;
            }
            reelItemRendererOuterClass$ReelItemRenderer = (ReelItemRendererOuterClass$ReelItemRenderer) obj2;
            if (!this.e.contains(reelItemRendererOuterClass$ReelItemRenderer)) {
                return null;
            }
            this.u = this.e.indexOf(reelItemRendererOuterClass$ReelItemRenderer);
            this.e.remove(reelItemRendererOuterClass$ReelItemRenderer);
            this.e.a();
            list = this.h;
            obj2 = reelItemRendererOuterClass$ReelItemRenderer.p;
            if (obj2 == null) {
                obj2 = awxn.c;
            }
            list.add(obj2);
            b();
            return null;
        } else if (i == 1) {
            obj2 = ((aaxc) obj).c;
            if (!(obj2 instanceof ReelItemRendererOuterClass$ReelItemRenderer)) {
                return null;
            }
            reelItemRendererOuterClass$ReelItemRenderer = (ReelItemRendererOuterClass$ReelItemRenderer) obj2;
            int size = this.e.size();
            if (this.e.contains(reelItemRendererOuterClass$ReelItemRenderer)) {
                return null;
            }
            i = this.u;
            if (i < 0 || i > size) {
                return null;
            }
            this.e.add(i, reelItemRendererOuterClass$ReelItemRenderer);
            this.e.a();
            list = this.h;
            Object obj3 = reelItemRendererOuterClass$ReelItemRenderer.p;
            if (obj3 == null) {
                obj3 = awxn.c;
            }
            if (!list.contains(obj3)) {
                return null;
            }
            list = this.h;
            obj2 = reelItemRendererOuterClass$ReelItemRenderer.p;
            if (obj2 == null) {
                obj2 = awxn.c;
            }
            list.remove(obj2);
            b();
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
