package defpackage;

import android.os.Bundle;
import android.support.design.textfield.TextInputEditText;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.youtube.share.ui.ActivityIndicatorFrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint;

/* renamed from: fqu */
public final class fqu extends fja implements xyo, xzh {
    public jpa ae;
    public xci af;
    public xoi ag;
    public aarh ah;
    public acvx ai;
    public aaas aj;
    public yfg ak;
    public akpe al;
    public xzi am;
    private View an;
    private View ao;
    private ActivityIndicatorFrameLayout ap;
    private akpk aq;
    private fqw ar;
    private TextView as;
    private View at;
    private apxu au;
    private TextInputEditText av;
    private aqml aw;

    public final void b(Bundle bundle) {
        super.b(bundle);
        ((fqz) xse.a(p())).a(this);
        this.ar = new fqw();
    }

    public final void X_() {
        super.X_();
        xzi xzi = this.am;
        xzi.c.b(xzi);
        xzi.f = true;
        xzi.a.a();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.ao = layoutInflater.inflate(R.layout.participant_list, viewGroup, false);
        this.ap = (ActivityIndicatorFrameLayout) this.ao.findViewById(R.id.activity_indicator);
        RecyclerView recyclerView = (RecyclerView) this.ao.findViewById(R.id.list);
        this.ak.a(aqml.class);
        recyclerView.a(new ans());
        this.aq = new akpk();
        apa a = this.al.a((akpb) this.ak.get());
        a.a(this.aq);
        recyclerView.a(a);
        this.am = new xzi(this.af, this, this.ah, this.ai, aa(), new xyl(this.aj, (xyo) this));
        this.an = layoutInflater.inflate(R.layout.participant_list_title, viewGroup, false);
        this.as = (TextView) this.an.findViewById(R.id.title);
        this.as.setTextColor(this.ab.b.d().a(this.a));
        this.at = layoutInflater.inflate(R.layout.edit_chat_name_participant_page, viewGroup, false);
        xzi xzi = this.am;
        xzi.a.a(acwl.i, xzi.b, null);
        return this.ao;
    }

    public final void W_() {
        super.W_();
        xzi xzi = this.am;
        xzi.e = true;
        xzi.a();
    }

    public final void N_() {
        super.N_();
        this.am.e = false;
    }

    public final ezz W() {
        faf i = this.ae.a().i();
        i.b = this.an;
        i.a(amwp.a);
        return i.a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01b0  */
    public final void a(defpackage.ajuz r8, int r9) {
        /*
        r7 = this;
        r0 = r7.aq;
        r0.clear();
        r0 = 0;
        r1 = 0;
        if (r8 == 0) goto L_0x0019;
    L_0x0009:
        r8 = r8.a;
        if (r8 == 0) goto L_0x0019;
    L_0x000d:
        r8 = r8.b;
        r2 = r8.length;
        if (r2 <= 0) goto L_0x0019;
    L_0x0012:
        r8 = r8[r0];
        if (r8 == 0) goto L_0x0019;
    L_0x0016:
        r8 = r8.m;
        goto L_0x001a;
    L_0x0019:
        r8 = r1;
    L_0x001a:
        r7.aw = r8;
        r8 = r7.aw;
        r2 = 2;
        r3 = 1;
        if (r8 != 0) goto L_0x002e;
    L_0x0022:
        r8 = r7.as;
        r8.setCompoundDrawablesWithIntrinsicBounds(r1, r1, r1, r1);
        r8 = r7.as;
        r8.setText(r1);
        goto L_0x01a8;
    L_0x002e:
        r4 = r8.b;
        r4 = r4.size();
        if (r4 == 0) goto L_0x006a;
    L_0x0036:
        r8 = r8.b;
        r8 = r8.iterator();
    L_0x003c:
        r4 = r8.hasNext();
        if (r4 == 0) goto L_0x006a;
    L_0x0042:
        r4 = r8.next();
        r4 = (defpackage.aqmn) r4;
        r5 = r4.a;
        r6 = r5 & 1;
        if (r6 == 0) goto L_0x005a;
    L_0x004e:
        r5 = r7.aq;
        r4 = r4.b;
        if (r4 != 0) goto L_0x0056;
    L_0x0054:
        r4 = defpackage.aqmj.j;
    L_0x0056:
        r5.add(r4);
        goto L_0x003c;
    L_0x005a:
        r5 = r5 & 2;
        if (r5 == 0) goto L_0x003c;
    L_0x005e:
        r5 = r7.aq;
        r4 = r4.c;
        if (r4 != 0) goto L_0x0066;
    L_0x0064:
        r4 = defpackage.aqmp.d;
    L_0x0066:
        r5.add(r4);
        goto L_0x003c;
    L_0x006a:
        r8 = r7.as;
        r4 = r7.aw;
        r5 = r4.a;
        r5 = r5 & 4;
        if (r5 == 0) goto L_0x007b;
    L_0x0074:
        r4 = r4.e;
        if (r4 != 0) goto L_0x007c;
    L_0x0078:
        r4 = defpackage.arwf.c;
        goto L_0x007c;
    L_0x007b:
        r4 = r1;
    L_0x007c:
        if (r4 != 0) goto L_0x0080;
    L_0x007e:
        r4 = r1;
        goto L_0x00a5;
    L_0x0080:
        r5 = r7.ar;
        r4 = r4.b;
        r4 = defpackage.arwh.a(r4);
        if (r4 != 0) goto L_0x008c;
    L_0x008a:
        r4 = defpackage.arwh.UNKNOWN;
    L_0x008c:
        r4 = r5.a(r4);
        if (r4 == 0) goto L_0x007e;
    L_0x0092:
        r5 = r7.p();
        if (r5 != 0) goto L_0x0099;
    L_0x0098:
        goto L_0x007e;
    L_0x0099:
        r6 = r7.q();
        r5 = r5.getTheme();
        r4 = defpackage.rz.a(r6, r4, r5);
    L_0x00a5:
        r8.setCompoundDrawablesWithIntrinsicBounds(r4, r1, r1, r1);
        r8 = r7.as;
        r4 = r7.aw;
        r5 = r4.a;
        r5 = r5 & 8;
        if (r5 == 0) goto L_0x00b9;
    L_0x00b2:
        r4 = r4.f;
        if (r4 != 0) goto L_0x00ba;
    L_0x00b6:
        r4 = defpackage.arml.f;
        goto L_0x00ba;
    L_0x00b9:
        r4 = r1;
    L_0x00ba:
        r4 = defpackage.ajqy.a(r4);
        r8.setText(r4);
        r8 = r7.aw;
        r8 = r8.g;
        if (r8 != 0) goto L_0x00c9;
    L_0x00c7:
        r8 = defpackage.apxu.d;
    L_0x00c9:
        r4 = com.google.protos.youtube.api.innertube.EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint.editConversationNameEntryEndpoint;
        r4 = defpackage.anxl.checkIsLite(r4);
        r8.a(r4);
        r8 = r8.h;
        r4 = r4.d;
        r8 = r8.a(r4);
        if (r8 == 0) goto L_0x01a8;
    L_0x00dc:
        r8 = r7.aw;
        r8 = r8.g;
        if (r8 != 0) goto L_0x00e4;
    L_0x00e2:
        r8 = defpackage.apxu.d;
    L_0x00e4:
        r7.au = r8;
        r8 = r7.am;
        r8 = r8.d;
        r4 = r7.aw;
        r4 = r4.g;
        if (r4 != 0) goto L_0x00f2;
    L_0x00f0:
        r4 = defpackage.apxu.d;
    L_0x00f2:
        r8.a(r4);
        r8 = r7.au;
        if (r8 == 0) goto L_0x01a8;
    L_0x00f9:
        r4 = com.google.protos.youtube.api.innertube.EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint.editConversationNameEntryEndpoint;
        r4 = defpackage.anxl.checkIsLite(r4);
        r8.a(r4);
        r8 = r8.h;
        r4 = r4.d;
        r8 = r8.a(r4);
        if (r8 == 0) goto L_0x01a8;
    L_0x010c:
        r8 = r7.au;
        r4 = com.google.protos.youtube.api.innertube.EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint.editConversationNameEntryEndpoint;
        r4 = defpackage.anxl.checkIsLite(r4);
        r8.a(r4);
        r8 = r8.h;
        r5 = r4.d;
        r8 = r8.b(r5);
        if (r8 != 0) goto L_0x0124;
    L_0x0121:
        r8 = r4.b;
        goto L_0x0128;
    L_0x0124:
        r8 = r4.a(r8);
    L_0x0128:
        r8 = (com.google.protos.youtube.api.innertube.EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint) r8;
        r4 = r8.b;
        if (r4 != 0) goto L_0x0130;
    L_0x012e:
        r4 = defpackage.araq.c;
    L_0x0130:
        r4 = r4.a;
        r4 = r4 & r3;
        if (r4 == 0) goto L_0x01a8;
    L_0x0135:
        r8 = r8.b;
        if (r8 != 0) goto L_0x013b;
    L_0x0139:
        r8 = defpackage.araq.c;
    L_0x013b:
        r8 = r8.b;
        if (r8 != 0) goto L_0x0141;
    L_0x013f:
        r8 = defpackage.arao.g;
    L_0x0141:
        r4 = r7.ao;
        r4 = (android.widget.LinearLayout) r4;
        r5 = r7.at;
        r4.removeView(r5);
        r5 = r7.at;
        r4.addView(r5, r0);
        r4 = r7.at;
        r5 = 2131756647; // 0x7f100667 float:1.9144207E38 double:1.0532277246E-314;
        r4 = r4.findViewById(r5);
        r4 = (android.support.design.textfield.TextInputLayout) r4;
        r5 = r7.at;
        r6 = 2131756648; // 0x7f100668 float:1.914421E38 double:1.053227725E-314;
        r5 = r5.findViewById(r6);
        r5 = (android.support.design.textfield.TextInputEditText) r5;
        r7.av = r5;
        r5 = r7.av;
        r5.setFocusable(r0);
        r0 = r8.a;
        r0 = r0 & r2;
        if (r0 != 0) goto L_0x0172;
    L_0x0171:
        goto L_0x018a;
    L_0x0172:
        r0 = r4.b();
        if (r0 != 0) goto L_0x018a;
    L_0x0178:
        r0 = r8.a;
        r0 = r0 & r2;
        if (r0 == 0) goto L_0x0183;
    L_0x017d:
        r1 = r8.c;
        if (r1 != 0) goto L_0x0183;
    L_0x0181:
        r1 = defpackage.arml.f;
    L_0x0183:
        r0 = defpackage.ajqy.a(r1);
        r4.a(r0);
    L_0x018a:
        r0 = r8.a;
        r0 = r0 & r3;
        if (r0 == 0) goto L_0x019e;
    L_0x018f:
        r0 = r7.av;
        r8 = r8.b;
        if (r8 != 0) goto L_0x0197;
    L_0x0195:
        r8 = defpackage.arml.f;
    L_0x0197:
        r8 = defpackage.ajqy.a(r8);
        r0.setText(r8);
    L_0x019e:
        r8 = r7.av;
        r0 = new fqx;
        r0.<init>(r7);
        r8.setOnClickListener(r0);
    L_0x01a8:
        r8 = r7.p();
        r8 = (defpackage.ezt) r8;
        if (r8 == 0) goto L_0x01d4;
    L_0x01b0:
        r8 = r8.c();
        r8.b();
        if (r9 == r3) goto L_0x01cf;
    L_0x01b9:
        if (r9 == r2) goto L_0x01c9;
    L_0x01bb:
        r8 = r7.ap;
        r8.b();
        r8 = r7.ag;
        r9 = 2131952119; // 0x7f1301f7 float:1.9540672E38 double:1.0533243006E-314;
        r8.a(r9);
        return;
    L_0x01c9:
        r8 = r7.ap;
        r8.b();
        return;
    L_0x01cf:
        r8 = r7.ap;
        r8.a();
    L_0x01d4:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fqu.a(ajuz, int):void");
    }

    public final void b(String str) {
        aqml aqml = this.aw;
        if (aqml != null) {
            anxp anxp = aqml.g;
            if (anxp == null) {
                anxp = apxu.d;
            }
            anxr access$000 = anxl.checkIsLite(EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint.editConversationNameEntryEndpoint);
            anxp.a(access$000);
            if (anxp.h.a(access$000.d)) {
                anxp = this.aw.g;
                if (anxp == null) {
                    anxp = apxu.d;
                }
                access$000 = anxl.checkIsLite(EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint.editConversationNameEntryEndpoint);
                anxp.a(access$000);
                Object b = anxp.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint editConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint = (EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint) b;
                araq araq = editConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint.b;
                if (araq == null) {
                    araq = araq.c;
                }
                if ((araq.a & 1) != 0) {
                    araq = editConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint.b;
                    if (araq == null) {
                        araq = araq.c;
                    }
                    anxl anxl = araq.b;
                    if (anxl == null) {
                        anxl = arao.g;
                    }
                    aran aran = (aran) ((anxo) anxl.toBuilder());
                    arml a = ajqy.a(str);
                    aran.copyOnWrite();
                    arao arao = (arao) aran.instance;
                    if (a != null) {
                        arao.b = a;
                        arao.a |= 1;
                        arao arao2 = (arao) ((anxl) aran.build());
                        arav arav = (arav) ((anxo) editConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint.toBuilder());
                        arap arap = (arap) araq.c.createBuilder();
                        arap.copyOnWrite();
                        araq araq2 = (araq) arap.instance;
                        if (arao2 != null) {
                            araq2.b = arao2;
                            araq2.a |= 1;
                            arav.copyOnWrite();
                            EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint editConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint2 = (EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint) arav.instance;
                            editConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint2.b = (araq) ((anxl) arap.build());
                            editConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint2.a |= 1;
                            editConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint = (EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint) ((anxl) arav.build());
                            xyl xyl = this.am.d;
                            apxx apxx = (apxx) apxu.d.createBuilder();
                            apxx.a(EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint.editConversationNameEntryEndpoint, editConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint);
                            xyl.a((apxu) ((anxl) apxx.build()));
                            this.av.setText(str);
                            return;
                        }
                        throw new NullPointerException();
                    }
                    throw new NullPointerException();
                }
            }
        }
    }

    public final void a(araq araq) {
        if ((araq.a & 1) != 0) {
            arao arao = araq.b;
            if (arao == null) {
                arao = arao.g;
            }
            ybv a = ybv.a(arao);
            a.aa = this.am.d;
            a.a(this.v, "conversation_name_dialog");
        }
    }
}
