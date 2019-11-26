package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.quantum.snackbar.Snackbar;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AddContactsEndpointOuterClass$AddContactsEndpoint;
import java.util.concurrent.TimeUnit;

/* renamed from: alje */
public final class alje extends nd implements OnClickListener, xcp {
    private static final long ag = TimeUnit.SECONDS.toMillis(10);
    public acvx Z;
    public akvz aa;
    public akpe ab;
    public xci ac;
    public aaas ad;
    public xsc ae;
    public xwb af;
    private nn ah;
    private apxu ai;
    private View aj;
    private RecyclerView ak;
    private akpk al;
    private Toolbar am;
    private Snackbar an;

    public static alje a(apxu apxu) {
        anxr access$000 = anxl.checkIsLite(AddContactsEndpointOuterClass$AddContactsEndpoint.addContactsEndpoint);
        apxu.a(access$000);
        amqw.a(apxu.h.a(access$000.d));
        alje alje = new alje();
        Bundle bundle = new Bundle();
        aobp.a(bundle, "add_contacts_endpoint", (anze) apxu);
        alje.f(bundle);
        return alje;
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        this.ah = p();
        ((aljh) xse.a(this.ah)).a(this);
        a(2, this.af.a);
        this.ac.a((Object) this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00eb  */
    public final android.view.View a(android.view.LayoutInflater r4, android.view.ViewGroup r5, android.os.Bundle r6) {
        /*
        r3 = this;
        r6 = 0;
        r0 = 2131034178; // 0x7f050042 float:1.7678866E38 double:1.0528707775E-314;
        r4 = r4.inflate(r0, r5, r6);
        r3.aj = r4;
        r4 = r3.aj;
        r5 = 2131755565; // 0x7f10022d float:1.9142013E38 double:1.05322719E-314;
        r4 = r4.findViewById(r5);
        r4 = (android.support.v7.widget.RecyclerView) r4;
        r3.ak = r4;
        r4 = r3.aj;
        r5 = 2131755541; // 0x7f100215 float:1.9141964E38 double:1.053227178E-314;
        r4 = r4.findViewById(r5);
        r4 = (android.support.v7.widget.Toolbar) r4;
        r3.am = r4;
        r4 = r3.aj;
        r5 = 2131755566; // 0x7f10022e float:1.9142015E38 double:1.0532271905E-314;
        r4 = r4.findViewById(r5);
        r4 = (com.google.android.libraries.quantum.snackbar.Snackbar) r4;
        r3.an = r4;
        r4 = r3.aa;
        r5 = defpackage.aoms.class;
        r4.a(r5);
        r4 = r3.ak;
        r5 = new ans;
        r5.<init>();
        r4.a(r5);
        r4 = new akpk;
        r4.<init>();
        r3.al = r4;
        r4 = r3.ab;
        r5 = r3.aa;
        r5 = r5.get();
        r5 = (defpackage.akpb) r5;
        r4 = r4.a(r5);
        r5 = r3.al;
        r4.a(r5);
        r5 = new akod;
        r0 = r3.Z;
        r5.<init>(r0);
        r4.a(r5);
        r5 = r3.ak;
        r5.a(r4);
        r4 = r3.am;
        r4.a(r3);
        r4 = r3.am;
        r5 = 2131951653; // 0x7f130025 float:1.9539727E38 double:1.0533240703E-314;
        r4.c(r5);
        r4 = r3.j;
        if (r4 == 0) goto L_0x0098;
    L_0x007c:
        r5 = "add_contacts_endpoint";
        r0 = r4.containsKey(r5);
        if (r0 == 0) goto L_0x0098;
    L_0x0084:
        r0 = defpackage.apxu.d;	 Catch:{ anyg -> 0x0093 }
        r1 = defpackage.anxa.c();	 Catch:{ anyg -> 0x0093 }
        r4 = defpackage.aobp.a(r4, r5, r0, r1);	 Catch:{ anyg -> 0x0093 }
        r4 = (defpackage.apxu) r4;	 Catch:{ anyg -> 0x0093 }
        r3.ai = r4;	 Catch:{ anyg -> 0x0093 }
        goto L_0x009c;
    L_0x0093:
        r4 = defpackage.apxu.d;
        r3.ai = r4;
        goto L_0x009c;
    L_0x0098:
        r4 = defpackage.apxu.d;
        r3.ai = r4;
    L_0x009c:
        r4 = r3.ai;
        r5 = com.google.protos.youtube.api.innertube.AddContactsEndpointOuterClass$AddContactsEndpoint.addContactsEndpoint;
        r5 = defpackage.anxl.checkIsLite(r5);
        r4.a(r5);
        r4 = r4.h;
        r5 = r5.d;
        r4 = r4.a(r5);
        r5 = 0;
        if (r4 != 0) goto L_0x00b4;
    L_0x00b2:
        r4 = r5;
        goto L_0x00d4;
    L_0x00b4:
        r4 = r3.ai;
        r0 = com.google.protos.youtube.api.innertube.AddContactsEndpointOuterClass$AddContactsEndpoint.addContactsEndpoint;
        r0 = defpackage.anxl.checkIsLite(r0);
        r4.a(r0);
        r4 = r4.h;
        r1 = r0.d;
        r4 = r4.b(r1);
        if (r4 != 0) goto L_0x00cc;
    L_0x00c9:
        r4 = r0.b;
        goto L_0x00d0;
    L_0x00cc:
        r4 = r0.a(r4);
    L_0x00d0:
        r4 = (com.google.protos.youtube.api.innertube.AddContactsEndpointOuterClass$AddContactsEndpoint) r4;
        r4 = r4.b;
    L_0x00d4:
        r0 = android.text.TextUtils.isEmpty(r4);
        if (r0 != 0) goto L_0x00e6;
    L_0x00da:
        r0 = new ajut;
        r0.<init>();
        r4 = defpackage.abmi.a(r4, r0);
        r4 = (defpackage.ajut) r4;
        goto L_0x00e7;
    L_0x00e6:
        r4 = r5;
    L_0x00e7:
        if (r4 != 0) goto L_0x00eb;
    L_0x00e9:
        goto L_0x018a;
    L_0x00eb:
        r0 = r3.Z;
        r1 = r4.b;
        r0.a(r1);
        r0 = r3.Z;
        r1 = defpackage.acwl.b;
        r2 = r3.ai;
        r0.a(r1, r2, r5);
        r0 = r3.Z;
        r1 = r4.b;
        r0.a(r1, r5);
        r4 = r4.a;
        r4 = r4.a;
        if (r4 == 0) goto L_0x018a;
    L_0x0108:
        r5 = r4.b;
        if (r5 == 0) goto L_0x016c;
    L_0x010c:
        r0 = r5.length;
        if (r0 <= 0) goto L_0x016c;
    L_0x010f:
        r5 = r5[r6];
        r5 = r5.p;
        if (r5 != 0) goto L_0x0116;
    L_0x0115:
        goto L_0x016c;
    L_0x0116:
        r6 = r5.b;
        r6 = r6.size();
        if (r6 == 0) goto L_0x016c;
    L_0x011e:
        r5 = r5.b;
        r5 = r5.iterator();
    L_0x0124:
        r6 = r5.hasNext();
        if (r6 == 0) goto L_0x016c;
    L_0x012a:
        r6 = r5.next();
        r6 = (defpackage.aomu) r6;
        r0 = r6.a;
        r1 = 105876287; // 0x64f8b3f float:3.9034675E-35 double:5.2309836E-316;
        if (r0 != r1) goto L_0x0142;
    L_0x0137:
        r6 = r6.b;
        r6 = (defpackage.aomo) r6;
        r0 = r6.d;
        r0 = r0.d();
        goto L_0x0161;
    L_0x0142:
        r1 = 79129962; // 0x4b76d6a float:4.3123574E-36 double:3.9095396E-316;
        if (r0 == r1) goto L_0x0157;
    L_0x0147:
        r1 = 154581033; // 0x936b829 float:2.1994045E-33 double:7.6373178E-316;
        if (r0 != r1) goto L_0x0124;
    L_0x014c:
        r6 = r6.b;
        r6 = (defpackage.aomm) r6;
        r0 = r6.f;
        r0 = r0.d();
        goto L_0x0161;
    L_0x0157:
        r6 = r6.b;
        r6 = (defpackage.aqeq) r6;
        r0 = r6.j;
        r0 = r0.d();
    L_0x0161:
        r1 = r3.al;
        r1.add(r6);
        r6 = r3.Z;
        r6.a(r0);
        goto L_0x0124;
    L_0x016c:
        r4 = r4.f;
        if (r4 == 0) goto L_0x018a;
    L_0x0170:
        r5 = r4.a;
        r6 = 128619045; // 0x7aa9225 float:2.5664653E-34 double:6.35462515E-316;
        if (r5 != r6) goto L_0x018a;
    L_0x0177:
        r5 = r3.am;
        r4 = r4.b;
        r4 = (defpackage.aomx) r4;
        r4 = r4.b;
        if (r4 != 0) goto L_0x0183;
    L_0x0181:
        r4 = defpackage.arml.f;
    L_0x0183:
        r4 = defpackage.ajqy.a(r4);
        r5.a(r4);
    L_0x018a:
        r4 = r3.aj;
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alje.a(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void X_() {
        super.X_();
        this.ac.b(this);
    }

    public final void onClick(View view) {
        dismiss();
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{zye.class};
        } else if (i == 0) {
            alpu.a(this.ae, this.an, (zye) obj, ag, this.ad, Integer.valueOf(xwe.a(M_(), R.attr.ytStaticBlue, 0)));
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
