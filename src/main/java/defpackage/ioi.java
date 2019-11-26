package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.apps.youtube.app.red.presenter.NavigationDropdownView;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ioi */
public final class ioi implements akot, iot {
    public final fjg a;
    private final Context b;
    private final Resources c;
    private final aaas d;
    private final View e;
    private final NavigationDropdownView f;
    private final View g;
    private final View h;
    private final View i;
    private boolean j;
    private akxv k;

    public ioi(Context context, Context context2, aaas aaas, fjg fjg, zyw zyw) {
        if (!wvl.a(zyw)) {
            context = context2;
        }
        this.b = context;
        this.d = aaas;
        this.a = fjg;
        this.c = this.b.getResources();
        this.e = LayoutInflater.from(this.b).inflate(R.layout.episodes_section_header_layout, null);
        this.f = (NavigationDropdownView) this.e.findViewById(R.id.season_picker);
        NavigationDropdownView navigationDropdownView = this.f;
        navigationDropdownView.d = this;
        this.g = navigationDropdownView.findViewById(R.id.dropdown_header);
        this.h = this.f.findViewById(R.id.dropdown_items);
        this.i = this.f.findViewById(R.id.bottom_divider);
        this.j = false;
    }

    public final View K_() {
        return this.e;
    }

    public final void a(akpb akpb) {
        this.f.b(false);
    }

    public final void a(aqyj aqyj) {
        anxp anxp = aqyj.b == 6 ? (aqll) aqyj.c : aqll.a;
        anxr access$000 = anxl.checkIsLite(awzv.e);
        anxp.a(access$000);
        if (anxp.h.a(access$000.d)) {
            akxv akxv = this.k;
            if (akxv != null) {
                anxp anxp2;
                anxr access$0002;
                Object b;
                if (akxv instanceof aktq) {
                    this.f.a(false);
                    aktq aktq = (aktq) this.k;
                    anxp2 = aqyj.b == 6 ? (aqll) aqyj.c : aqll.a;
                    access$0002 = anxl.checkIsLite(awzv.e);
                    anxp2.a(access$0002);
                    b = anxp2.h.b(access$0002.d);
                    if (b == null) {
                        b = access$0002.b;
                    } else {
                        b = access$0002.a(b);
                    }
                    awzv awzv = (awzv) b;
                    aktq.k();
                    aktq.h.b();
                    aktq.a(ajtj.a(awzv));
                    aktq.l();
                }
                if (aqyj.b == 6) {
                    anxp2 = (aqll) aqyj.c;
                } else {
                    anxp2 = aqll.a;
                }
                access$0002 = anxl.checkIsLite(awzv.e);
                anxp2.a(access$0002);
                b = anxp2.h.b(access$0002.d);
                if (b == null) {
                    b = access$0002.b;
                } else {
                    b = access$0002.a(b);
                }
                akxv.a((awzv) b);
                return;
            }
        }
        if (aqyj.b == 5) {
            apxu apxu;
            ioh ioh = new ioh(this);
            Map hashMap = new HashMap();
            hashMap.put("replace_pane_predicate", ioh);
            aaas aaas = this.d;
            if (aqyj.b == 5) {
                apxu = (apxu) aqyj.c;
            } else {
                apxu = apxu.d;
            }
            aaas.a(apxu, hashMap);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:63:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:63:? A:{SYNTHETIC, RETURN} */
    public final /* synthetic */ void a_(defpackage.akor r8, java.lang.Object r9) {
        /*
        r7 = this;
        r9 = (defpackage.argn) r9;
        r0 = r7.b;
        r0 = defpackage.xss.f(r0);
        r1 = r7.c;
        r2 = 2131626842; // 0x7f0e0b5a float:1.8880932E38 double:1.0531635924E-314;
        r1 = r1.getDimensionPixelSize(r2);
        r2 = r7.c;
        r3 = 2131624884; // 0x7f0e03b4 float:1.887696E38 double:1.053162625E-314;
        r2 = r2.getDimensionPixelSize(r3);
        r2 = r2 + r1;
        r2 = r2 + r1;
        r3 = 1;
        r4 = 0;
        if (r0 <= r2) goto L_0x0022;
    L_0x0020:
        r0 = 1;
        goto L_0x0023;
    L_0x0022:
        r0 = 0;
    L_0x0023:
        r2 = r7.j;
        if (r2 == r0) goto L_0x0062;
    L_0x0027:
        r7.j = r0;
        r0 = r7.h;
        r0 = r0.getPaddingTop();
        r2 = r7.h;
        r2 = r2.getPaddingBottom();
        r5 = r7.j;
        if (r5 != 0) goto L_0x0043;
    L_0x0039:
        r5 = r7.c;
        r6 = 2131625919; // 0x7f0e07bf float:1.887906E38 double:1.0531631364E-314;
        r5 = r5.getDimensionPixelSize(r6);
        goto L_0x0045;
    L_0x0043:
        r1 = 0;
        r5 = 0;
    L_0x0045:
        r6 = r7.g;
        defpackage.abe.a(r6, r1, r4, r5, r4);
        r5 = r7.h;
        r5.setPadding(r1, r0, r1, r2);
        r0 = r7.i;
        r0 = r0.getLayoutParams();
        r0 = (android.widget.FrameLayout.LayoutParams) r0;
        r0.setMarginStart(r1);
        r0.setMarginEnd(r1);
        r0 = r7.i;
        r0.invalidate();
    L_0x0062:
        r0 = "sectionListController";
        r8 = r8.a(r0);
        r8 = (defpackage.akxv) r8;
        r7.k = r8;
        r8 = 0;
        if (r9 != 0) goto L_0x0071;
    L_0x006f:
        r9 = r8;
        goto L_0x00af;
    L_0x0071:
        r0 = r9.b;
        if (r0 == 0) goto L_0x0076;
    L_0x0075:
        goto L_0x0078;
    L_0x0076:
        r0 = defpackage.axak.a;
    L_0x0078:
        r1 = com.google.protos.youtube.api.innertube.DropdownRendererOuterClass.dropdownRenderer;
        r1 = defpackage.anxl.checkIsLite(r1);
        r0.a(r1);
        r0 = r0.h;
        r1 = r1.d;
        r0 = r0.a(r1);
        if (r0 != 0) goto L_0x008c;
    L_0x008b:
        goto L_0x006f;
    L_0x008c:
        r9 = r9.b;
        if (r9 == 0) goto L_0x0091;
    L_0x0090:
        goto L_0x0093;
    L_0x0091:
        r9 = defpackage.axak.a;
    L_0x0093:
        r0 = com.google.protos.youtube.api.innertube.DropdownRendererOuterClass.dropdownRenderer;
        r0 = defpackage.anxl.checkIsLite(r0);
        r9.a(r0);
        r9 = r9.h;
        r1 = r0.d;
        r9 = r9.b(r1);
        if (r9 != 0) goto L_0x00a9;
    L_0x00a6:
        r9 = r0.b;
        goto L_0x00ad;
    L_0x00a9:
        r9 = r0.a(r9);
    L_0x00ad:
        r9 = (defpackage.aqyh) r9;
    L_0x00af:
        r0 = r7.f;
        if (r9 != 0) goto L_0x00b5;
    L_0x00b3:
        goto L_0x0128;
    L_0x00b5:
        r1 = r9.b;
        r1 = r1.size();
        if (r1 == 0) goto L_0x0128;
    L_0x00bd:
        defpackage.xpr.a(r0, r3);
        r0.b(r4);
        r1 = r0.b;
        r2 = r9.a;
        r2 = r2 & r3;
        if (r2 == 0) goto L_0x00cd;
    L_0x00ca:
        r2 = r9.c;
        goto L_0x00ce;
    L_0x00cd:
        r2 = r8;
    L_0x00ce:
        r1.setText(r2);
        r9 = r9.b;
        r1 = r0.h;
        r1 = r1.c;
        r1.clear();
        r1 = 0;
    L_0x00db:
        r2 = r9.size();
        if (r1 >= r2) goto L_0x0114;
    L_0x00e1:
        r2 = r9.get(r1);
        r2 = (defpackage.aqyb) r2;
        r2 = r2.g;
        if (r2 != 0) goto L_0x00ed;
    L_0x00eb:
        r2 = defpackage.aqyj.f;
    L_0x00ed:
        r5 = r2.e;
        if (r5 != 0) goto L_0x00f2;
    L_0x00f1:
        goto L_0x010a;
    L_0x00f2:
        r0.e = r2;
        r5 = r0.a;
        r6 = r2.a;
        r6 = r6 & r3;
        if (r6 == 0) goto L_0x0102;
    L_0x00fb:
        r6 = r2.d;
        if (r6 != 0) goto L_0x0103;
    L_0x00ff:
        r6 = defpackage.arml.f;
        goto L_0x0103;
    L_0x0102:
        r6 = r8;
    L_0x0103:
        r6 = defpackage.ajqy.a(r6);
        r5.setText(r6);
    L_0x010a:
        r5 = r0.h;
        r5 = r5.c;
        r5.add(r2);
        r1 = r1 + 1;
        goto L_0x00db;
    L_0x0114:
        r8 = r0.h;
        r8.aa_();
        r8 = r0.h;
        r8 = r8.a();
        if (r8 <= r3) goto L_0x0122;
    L_0x0121:
        r4 = 1;
    L_0x0122:
        r0.j = r4;
        r0.c();
        goto L_0x012b;
    L_0x0128:
        defpackage.xpr.a(r0, r4);
    L_0x012b:
        r8 = r7.f;
        r9 = r8.i;
        if (r9 != 0) goto L_0x0134;
    L_0x0131:
        r8.a(r3);
    L_0x0134:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ioi.a_(akor, java.lang.Object):void");
    }
}
