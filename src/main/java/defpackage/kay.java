package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: kay */
public final class kay implements akot {
    private final Context a;
    private final View b = this.r.findViewById(R.id.thumbnail_layout);
    private final akkq c;
    private final akvo d;
    private final ImageView e = ((ImageView) this.r.findViewById(R.id.thumbnail));
    private final akoj f;
    private final akou g;
    private final TextView h = ((TextView) this.r.findViewById(R.id.bottom_metadata));
    private final TextView i = ((TextView) this.r.findViewById(R.id.description));
    private final TextView j = ((TextView) this.r.findViewById(R.id.thumbnail_overlay_bottom_panel));
    private final TextView k = ((TextView) this.r.findViewById(R.id.thumbnail_bottom_panel));
    private final TextView l = ((TextView) this.r.findViewById(R.id.subtitle));
    private final TextView m = ((TextView) this.r.findViewById(R.id.title));
    private final TextView n = ((TextView) this.r.findViewById(R.id.top_metadata));
    private final ViewGroup o = ((ViewGroup) this.r.findViewById(R.id.bottom_standalone_badges_container));
    private final ViewGroup p = ((ViewGroup) this.r.findViewById(R.id.top_standalone_badges_container));
    private final View q = this.r.findViewById(R.id.contextual_menu_anchor);
    private final View r;

    public kay(Context context, akkq akkq, akvp akvp, akop akop, akvo akvo, flu flu) {
        this.a = (Context) amqw.a((Object) context);
        this.c = (akkq) amqw.a((Object) akkq);
        amqw.a((Object) akvp);
        this.d = (akvo) amqw.a((Object) akvo);
        this.g = (akou) amqw.a((Object) flu);
        this.f = akop.a(flu);
        this.r = LayoutInflater.from(context).inflate(R.layout.compact_premium_show_item, null);
        this.g.a(this.r);
    }

    public final View K_() {
        return this.g.a();
    }

    public final void a(akpb akpb) {
        this.f.a();
    }

    private static CharSequence a(List list) {
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (arml a : list) {
            arrayList.add(ajqy.a(a));
        }
        return TextUtils.join(System.getProperty("line.separator"), arrayList);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x016c  */
    public final /* synthetic */ void a_(defpackage.akor r9, java.lang.Object r10) {
        /*
        r8 = this;
        r4 = r10;
        r4 = (defpackage.aqfw) r4;
        r10 = r8.f;
        r0 = r9.a;
        r1 = r4.a;
        r1 = r1 & 32;
        r2 = 0;
        if (r1 == 0) goto L_0x0015;
    L_0x000e:
        r1 = r4.l;
        if (r1 != 0) goto L_0x0016;
    L_0x0012:
        r1 = defpackage.apxu.d;
        goto L_0x0016;
    L_0x0015:
        r1 = r2;
    L_0x0016:
        r3 = r9.b();
        r10.a(r0, r1, r3);
        r10 = r9.a;
        r0 = r4.n;
        r0 = r0.d();
        r10.a(r0, r2);
        r10 = r8.c;
        r0 = r8.e;
        r1 = r4.b;
        if (r1 != 0) goto L_0x0032;
    L_0x0030:
        r1 = defpackage.aygk.f;
    L_0x0032:
        r10.a(r0, r1);
        r10 = r8.j;
        r0 = r4.c;
        r1 = r0.isEmpty();
        r3 = 1;
        if (r1 != 0) goto L_0x0085;
    L_0x0040:
        r1 = new java.util.ArrayList;
        r1.<init>();
        r0 = r0.iterator();
    L_0x0049:
        r5 = r0.hasNext();
        if (r5 == 0) goto L_0x0074;
    L_0x004f:
        r5 = r0.next();
        r5 = (defpackage.ayfu) r5;
        r6 = r5.c;
        if (r6 != 0) goto L_0x005b;
    L_0x0059:
        r6 = defpackage.ayfe.c;
    L_0x005b:
        r6 = r6.a;
        r6 = r6 & r3;
        if (r6 == 0) goto L_0x0049;
    L_0x0060:
        r5 = r5.c;
        if (r5 != 0) goto L_0x0066;
    L_0x0064:
        r5 = defpackage.ayfe.c;
    L_0x0066:
        r5 = r5.b;
        if (r5 != 0) goto L_0x006c;
    L_0x006a:
        r5 = defpackage.arml.f;
    L_0x006c:
        r5 = defpackage.ajqy.a(r5);
        r1.add(r5);
        goto L_0x0049;
    L_0x0074:
        r0 = r1.size();
        if (r0 <= 0) goto L_0x0085;
    L_0x007a:
        r0 = "line.separator";
        r0 = java.lang.System.getProperty(r0);
        r0 = android.text.TextUtils.join(r0, r1);
        goto L_0x0086;
    L_0x0085:
        r0 = r2;
    L_0x0086:
        defpackage.xpr.a(r10, r0);
        r10 = r8.k;
        r0 = r4.a;
        r0 = r0 & 2;
        if (r0 == 0) goto L_0x0098;
    L_0x0091:
        r0 = r4.d;
        if (r0 != 0) goto L_0x0099;
    L_0x0095:
        r0 = defpackage.arml.f;
        goto L_0x0099;
    L_0x0098:
        r0 = r2;
    L_0x0099:
        r0 = defpackage.ajqy.a(r0);
        defpackage.xpr.a(r10, r0);
        r10 = r8.m;
        r0 = r4.a;
        r0 = r0 & 4;
        if (r0 == 0) goto L_0x00af;
    L_0x00a8:
        r0 = r4.e;
        if (r0 != 0) goto L_0x00b0;
    L_0x00ac:
        r0 = defpackage.arml.f;
        goto L_0x00b0;
    L_0x00af:
        r0 = r2;
    L_0x00b0:
        r0 = defpackage.ajqy.a(r0);
        r10.setText(r0);
        r10 = r8.a;
        r0 = r8.p;
        r1 = r4.f;
        r5 = 0;
        r6 = new defpackage.apdx[r5];
        r1 = r1.toArray(r6);
        r1 = (defpackage.apdx[]) r1;
        defpackage.fan.a(r10, r0, r1);
        r10 = r8.p;
        r0 = r10.getChildCount();
        if (r0 <= 0) goto L_0x00d3;
    L_0x00d1:
        r0 = 1;
        goto L_0x00d4;
    L_0x00d3:
        r0 = 0;
    L_0x00d4:
        defpackage.xpr.a(r10, r0);
        r10 = r8.l;
        r0 = r4.g;
        if (r0 != 0) goto L_0x00df;
    L_0x00dd:
        r0 = defpackage.arml.f;
    L_0x00df:
        r0 = defpackage.ajqy.a(r0);
        defpackage.xpr.a(r10, r0);
        r10 = r8.n;
        r0 = r4.h;
        r0 = defpackage.kay.a(r0);
        defpackage.xpr.a(r10, r0);
        r10 = r8.i;
        r0 = r4.a;
        r0 = r0 & 16;
        if (r0 == 0) goto L_0x0100;
    L_0x00f9:
        r0 = r4.i;
        if (r0 != 0) goto L_0x0101;
    L_0x00fd:
        r0 = defpackage.arml.f;
        goto L_0x0101;
    L_0x0100:
        r0 = r2;
    L_0x0101:
        r0 = defpackage.ajqy.a(r0);
        defpackage.xpr.a(r10, r0);
        r10 = r8.h;
        r0 = r4.j;
        r0 = defpackage.kay.a(r0);
        defpackage.xpr.a(r10, r0);
        r10 = r8.a;
        r0 = r8.o;
        r1 = r4.k;
        r6 = new defpackage.apdx[r5];
        r1 = r1.toArray(r6);
        r1 = (defpackage.apdx[]) r1;
        defpackage.fan.a(r10, r0, r1);
        r10 = r8.o;
        r0 = r10.getChildCount();
        if (r0 <= 0) goto L_0x012d;
    L_0x012c:
        r5 = 1;
    L_0x012d:
        defpackage.xpr.a(r10, r5);
        r10 = r8.b;
        r10 = r10.getLayoutParams();
        if (r10 == 0) goto L_0x0148;
    L_0x0138:
        r0 = r8.a;
        r0 = r0.getResources();
        r1 = 2131625503; // 0x7f0e061f float:1.8878216E38 double:1.053162931E-314;
        r0 = r0.getDimension(r1);
        r0 = (int) r0;
        r10.width = r0;
    L_0x0148:
        r10 = r8.g;
        r1 = r10.a();
        r10 = r4.m;
        if (r10 != 0) goto L_0x0154;
    L_0x0152:
        r10 = defpackage.auvr.c;
    L_0x0154:
        r5 = r9.a;
        r0 = r8.q;
        defpackage.xpr.a(r0, r3);
        r0 = r8.d;
        r6 = r8.q;
        if (r10 != 0) goto L_0x0163;
    L_0x0161:
        r3 = r2;
        goto L_0x016f;
    L_0x0163:
        r7 = r10.a;
        r3 = r3 & r7;
        if (r3 == 0) goto L_0x0161;
    L_0x0168:
        r10 = r10.b;
        if (r10 != 0) goto L_0x016e;
    L_0x016c:
        r10 = defpackage.auvn.l;
    L_0x016e:
        r3 = r10;
    L_0x016f:
        r2 = r6;
        r0.a(r1, r2, r3, r4, r5);
        r10 = r8.g;
        r10.a(r9);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kay.a_(akor, java.lang.Object):void");
    }
}
