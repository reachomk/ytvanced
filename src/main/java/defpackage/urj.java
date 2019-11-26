package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint;

/* renamed from: urj */
public final class urj extends nd implements DialogInterface, urb, urr {
    public aaqk Z;
    public usf aa;
    public urs ab;
    public aaas ac;
    public xoi ad;
    public akkl ae;
    public aaqf af;
    public usk ag;
    public aamj ah;
    private View ai;
    private View aj;
    private View ak;
    private View al;
    private TextView am;
    private TextView an;
    private TextView ao;
    private TextView ap;
    private TextView aq;

    public final void b(Bundle bundle) {
        super.b(bundle);
        bundle = this.j;
        int i = 0;
        if (bundle != null) {
            i = bundle.getInt("style", 0);
        }
        a(1, i);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ((urp) xse.a(p())).a(this);
        int i = 0;
        View inflate = layoutInflater.inflate(R.layout.channel_creation_container, viewGroup, false);
        this.ai = inflate.findViewById(R.id.progress_bar);
        this.aj = inflate.findViewById(R.id.channel_creation_form);
        this.ak = this.aj.findViewById(R.id.channel_creation_with_google_plus);
        this.al = this.aj.findViewById(R.id.channel_creation_no_identity);
        Bundle bundle2 = this.j;
        if (bundle2 != null) {
            i = bundle2.getInt("account_icon", 0);
        }
        if (i != 0) {
            ((ImageView) this.al.findViewById(R.id.account_icon)).setImageResource(i);
        }
        this.am = (TextView) this.aj.findViewById(R.id.title);
        this.an = (TextView) this.aj.findViewById(R.id.info);
        this.ao = (TextView) this.aj.findViewById(R.id.error_message);
        this.ap = (TextView) this.aj.findViewById(R.id.ok_button);
        this.aq = (TextView) this.aj.findViewById(R.id.cancel_button);
        this.aq.setOnClickListener(new urm(this));
        return inflate;
    }

    public final void d(Bundle bundle) {
        super.d(bundle);
        if (bundle != null) {
            byte[] byteArray = bundle.getByteArray("channel_creation_form_response");
            if (byteArray != null) {
                this.Z = new aaqk((ajuv) this.ah.a(byteArray, ajuv.class));
            }
        }
        aaqk aaqk = this.Z;
        if (aaqk != null) {
            a(aaqk, bundle);
            return;
        }
        int a = apli.a(this.j.getInt("source"));
        if (a == 0) {
            a = 1;
        }
        byte[] byteArray2 = this.j.getByteArray("token");
        aaqf aaqf = this.af;
        urn urn = new urn(this, bundle);
        aaql aaql = new aaql(aaqf.c, aaqf.d.c());
        aaql.a = byteArray2;
        aaql.b = a;
        new aaqg(aaqf).b(aaql, urn);
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        aaqk aaqk = this.Z;
        if (aaqk != null) {
            bundle.putByteArray("channel_creation_form_response", aocf.toByteArray(aaqk.a));
        }
        usf usf = this.aa;
        if (usf != null && !TextUtils.isEmpty(usf.g.getText())) {
            bundle.putLong("birthday", usf.b.getTimeInMillis());
        }
    }

    public final void cancel() {
        onCancel(null);
        dismiss();
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.ab.v_();
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.ab.g();
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01f7 A:{LOOP_START, PHI: r0 , LOOP:0: B:90:0x01f7->B:97:0x020d} */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a1  */
    public final void a(defpackage.aaqk r13, android.os.Bundle r14) {
        /*
        r12 = this;
        r0 = r12.F_();
        if (r0 == 0) goto L_0x02cb;
    L_0x0006:
        r0 = 0;
        r12.f(r0);
        r1 = r13.a();
        r2 = 1;
        r3 = 0;
        if (r1 == 0) goto L_0x0234;
    L_0x0012:
        r13 = r13.a();
        r1 = r13.a;
        r1 = r1.c;
        r1 = r1[r0];
        if (r1 != 0) goto L_0x0020;
    L_0x001e:
        r1 = r3;
        goto L_0x002b;
    L_0x0020:
        r4 = r1.a;
        r4 = r4 & r2;
        if (r4 == 0) goto L_0x001e;
    L_0x0025:
        r1 = r1.b;
        if (r1 != 0) goto L_0x002b;
    L_0x0029:
        r1 = defpackage.aphg.s;
    L_0x002b:
        r1 = defpackage.amqw.a(r1);
        r1 = (defpackage.aphg) r1;
        r4 = r12.am;
        r5 = r13.a;
        r5 = r5.a;
        r5 = defpackage.ajqy.a(r5);
        r4.setText(r5);
        r4 = r12.ap;
        r5 = r1.a;
        r5 = r5 & 128;
        if (r5 == 0) goto L_0x004d;
    L_0x0046:
        r5 = r1.g;
        if (r5 != 0) goto L_0x004e;
    L_0x004a:
        r5 = defpackage.arml.f;
        goto L_0x004e;
    L_0x004d:
        r5 = r3;
    L_0x004e:
        r5 = defpackage.ajqy.a(r5);
        r4.setText(r5);
        r4 = r12.ap;
        r5 = new url;
        r5.<init>(r12, r1);
        r4.setOnClickListener(r5);
        r1 = r13.a;
        r1 = r1.c;
        r4 = r1.length;
        if (r4 <= r2) goto L_0x0077;
    L_0x0066:
        r1 = r1[r2];
        if (r1 != 0) goto L_0x006b;
    L_0x006a:
        goto L_0x0077;
    L_0x006b:
        r4 = r1.a;
        r4 = r4 & r2;
        if (r4 == 0) goto L_0x0077;
    L_0x0070:
        r1 = r1.b;
        if (r1 != 0) goto L_0x0078;
    L_0x0074:
        r1 = defpackage.aphg.s;
        goto L_0x0078;
    L_0x0077:
        r1 = r3;
    L_0x0078:
        r4 = r12.aq;
        if (r1 != 0) goto L_0x007f;
    L_0x007c:
        r5 = "";
        goto L_0x0091;
    L_0x007f:
        r5 = r1.a;
        r5 = r5 & 128;
        if (r5 == 0) goto L_0x008c;
    L_0x0085:
        r5 = r1.g;
        if (r5 != 0) goto L_0x008d;
    L_0x0089:
        r5 = defpackage.arml.f;
        goto L_0x008d;
    L_0x008c:
        r5 = r3;
    L_0x008d:
        r5 = defpackage.ajqy.a(r5);
    L_0x0091:
        r4.setText(r5);
        if (r1 == 0) goto L_0x009b;
    L_0x0096:
        r1 = r12.aq;
        r1.setVisibility(r0);
    L_0x009b:
        r1 = r13.b();
        if (r1 == 0) goto L_0x010e;
    L_0x00a1:
        r13 = r13.b();
        r14 = r12.ak;
        r14.setVisibility(r0);
        r14 = r12.ak;
        r1 = 2131755677; // 0x7f10029d float:1.914224E38 double:1.0532272453E-314;
        r14 = r14.findViewById(r1);
        r14 = (android.widget.ImageView) r14;
        r1 = new akle;
        r2 = r12.ae;
        r1.<init>(r2, r14);
        r14 = r13.b;
        if (r14 != 0) goto L_0x00c2;
    L_0x00c0:
        r14 = defpackage.aygk.f;
    L_0x00c2:
        r1.a(r14);
        r14 = r12.ak;
        r1 = 2131755849; // 0x7f100349 float:1.9142589E38 double:1.0532273303E-314;
        r14 = r14.findViewById(r1);
        r14 = (android.widget.TextView) r14;
        r1 = r13.d;
        if (r1 != 0) goto L_0x00d6;
    L_0x00d4:
        r1 = defpackage.arml.f;
    L_0x00d6:
        r1 = defpackage.ajqy.a(r1);
        r14.setText(r1);
        r14 = r12.ak;
        r1 = 2131755848; // 0x7f100348 float:1.9142587E38 double:1.05322733E-314;
        r14 = r14.findViewById(r1);
        r14 = (android.widget.TextView) r14;
        r1 = r13.c;
        if (r1 != 0) goto L_0x00ee;
    L_0x00ec:
        r1 = defpackage.arml.f;
    L_0x00ee:
        r1 = defpackage.ajqy.a(r1);
        r14.setText(r1);
        r14 = r12.an;
        r1 = r13.a;
        r1 = r1 & 8;
        if (r1 == 0) goto L_0x0103;
    L_0x00fd:
        r3 = r13.e;
        if (r3 != 0) goto L_0x0103;
    L_0x0101:
        r3 = defpackage.arml.f;
    L_0x0103:
        r13 = r12.ac;
        r13 = defpackage.aabb.a(r3, r13, r0);
        r14.setText(r13);
        goto L_0x02cb;
    L_0x010e:
        r1 = r12.al;
        r1.setVisibility(r0);
        r1 = r12.ag;
        r8 = r12.al;
        r9 = r12.an;
        r10 = r12.ao;
        r11 = new usf;
        r5 = r1.a;
        r6 = r1.b;
        r7 = r1.c;
        r4 = r11;
        r4.<init>(r5, r6, r7, r8, r9, r10);
        r12.aa = r11;
        r1 = r13.a();
        if (r1 == 0) goto L_0x0217;
    L_0x012f:
        r1 = r12.aa;
        r13 = r13.a();
        r1.a(r13, r14);
        r1.k = r0;
        r4 = r1.c;
        r4.setVisibility(r0);
        r4 = r13.i();
        r1.j = r4;
        r4 = r1.g;
        r5 = r13.g();
        r4.setHint(r5);
        r4 = r1.g;
        r5 = new ush;
        r5.<init>(r1, r13);
        r4.setOnClickListener(r5);
        r4 = r13.i();
        if (r4 == 0) goto L_0x016a;
    L_0x015e:
        r4 = new java.text.SimpleDateFormat;
        r5 = java.util.Locale.getDefault();
        r6 = "MMM d";
        r4.<init>(r6, r5);
        goto L_0x016e;
    L_0x016a:
        r4 = java.text.DateFormat.getDateInstance();
    L_0x016e:
        r1.h = r4;
        if (r14 == 0) goto L_0x0188;
    L_0x0172:
        r4 = "birthday";
        r5 = r14.getLong(r4);
        r7 = 0;
        r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r9 == 0) goto L_0x0188;
    L_0x017e:
        r5 = r1.b;
        r6 = r14.getLong(r4);
        r5.setTimeInMillis(r6);
        goto L_0x01c2;
    L_0x0188:
        r4 = r1.b;
        r5 = r13.i();
        r6 = 1940; // 0x794 float:2.719E-42 double:9.585E-321;
        if (r5 != 0) goto L_0x019c;
    L_0x0192:
        r5 = r13.h();
        if (r5 == 0) goto L_0x019c;
    L_0x0198:
        r5 = r13.a;
        r6 = r5.j;
    L_0x019c:
        r5 = r13.h();
        if (r5 == 0) goto L_0x01a7;
    L_0x01a2:
        r5 = r13.a;
        r5 = r5.i;
        goto L_0x01a8;
    L_0x01a7:
        r5 = 1;
    L_0x01a8:
        r5 = r5 + -1;
        r7 = r13.h();
        if (r7 == 0) goto L_0x01b5;
    L_0x01b0:
        r7 = r13.a;
        r7 = r7.h;
        goto L_0x01b6;
    L_0x01b5:
        r7 = 1;
    L_0x01b6:
        r4.set(r6, r5, r7);
        r4 = r13.h();
        if (r4 == 0) goto L_0x01c2;
    L_0x01bf:
        r1.c();
    L_0x01c2:
        r1 = r1.i;
        defpackage.amqw.a(r13);
        r4 = r13.j();
        r4 = defpackage.amqw.a(r4);
        r4 = (defpackage.aqyh) r4;
        r4 = r4.b;
        r5 = r4.isEmpty();
        r5 = r5 ^ r2;
        defpackage.amqw.a(r5);
        r5 = r1.b;
        r6 = r13.j();
        r6 = r6.a;
        r6 = r6 & r2;
        if (r6 != 0) goto L_0x01e7;
    L_0x01e6:
        goto L_0x01ed;
    L_0x01e7:
        r13 = r13.j();
        r3 = r13.c;
    L_0x01ed:
        r5.setHint(r3);
        r13 = r1.a;
        r13.addAll(r4);
        if (r14 != 0) goto L_0x02cb;
    L_0x01f7:
        r13 = r4.size();
        if (r0 >= r13) goto L_0x02cb;
    L_0x01fd:
        r13 = r4.get(r0);
        r13 = (defpackage.aqyb) r13;
        r13 = r13.e;
        if (r13 != 0) goto L_0x0209;
    L_0x0207:
        r13 = defpackage.aqyf.k;
    L_0x0209:
        r13 = r13.g;
        if (r13 != 0) goto L_0x0210;
    L_0x020d:
        r0 = r0 + 1;
        goto L_0x01f7;
    L_0x0210:
        r13 = r1.c;
        r0 = r0 + r2;
        r13.setSelection(r0);
        return;
    L_0x0217:
        r0 = r12.aa;
        r1 = r13.b;
        if (r1 != 0) goto L_0x022e;
    L_0x021d:
        r1 = r13.a;
        r1 = r1.b;
        if (r1 == 0) goto L_0x022e;
    L_0x0223:
        r1 = r1.c;
        if (r1 == 0) goto L_0x022e;
    L_0x0227:
        r2 = new aaqb;
        r2.<init>(r1);
        r13.b = r2;
    L_0x022e:
        r13 = r13.b;
        r0.a(r13, r14);
        return;
    L_0x0234:
        r14 = r13.b();
        if (r14 == 0) goto L_0x02b4;
    L_0x023a:
        r13 = r13.b();
        r14 = r12.am;
        r1 = r13.a;
        r1 = r1 & r2;
        if (r1 == 0) goto L_0x024c;
    L_0x0245:
        r1 = r13.b;
        if (r1 != 0) goto L_0x024d;
    L_0x0249:
        r1 = defpackage.arml.f;
        goto L_0x024d;
    L_0x024c:
        r1 = r3;
    L_0x024d:
        r1 = defpackage.ajqy.a(r1);
        r14.setText(r1);
        r14 = r12.ap;
        r1 = r13.a;
        r1 = r1 & 16384;
        if (r1 == 0) goto L_0x0263;
    L_0x025c:
        r1 = r13.k;
        if (r1 != 0) goto L_0x0264;
    L_0x0260:
        r1 = defpackage.arml.f;
        goto L_0x0264;
    L_0x0263:
        r1 = r3;
    L_0x0264:
        r1 = defpackage.ajqy.a(r1);
        r14.setText(r1);
        r14 = r12.ap;
        r1 = new uro;
        r1.<init>(r12, r13);
        r14.setOnClickListener(r1);
        r14 = r13.a;
        r1 = 32768; // 0x8000 float:4.5918E-41 double:1.61895E-319;
        r14 = r14 & r1;
        if (r14 == 0) goto L_0x0284;
    L_0x027d:
        r14 = r13.l;
        if (r14 != 0) goto L_0x0285;
    L_0x0281:
        r14 = defpackage.arml.f;
        goto L_0x0285;
    L_0x0284:
        r14 = r3;
    L_0x0285:
        r14 = defpackage.ajqy.a(r14);
        r14 = android.text.TextUtils.isEmpty(r14);
        if (r14 != 0) goto L_0x02a8;
    L_0x028f:
        r14 = r12.aq;
        r14.setVisibility(r0);
        r14 = r12.aq;
        r0 = r13.a;
        r0 = r0 & r1;
        if (r0 == 0) goto L_0x02a1;
    L_0x029b:
        r3 = r13.l;
        if (r3 != 0) goto L_0x02a1;
    L_0x029f:
        r3 = defpackage.arml.f;
    L_0x02a1:
        r0 = defpackage.ajqy.a(r3);
        r14.setText(r0);
    L_0x02a8:
        r14 = r12.an;
        r0 = r12.ac;
        r13 = defpackage.akcs.a(r13, r0);
        r14.setText(r13);
        return;
    L_0x02b4:
        r12.dismiss();
        r14 = r12.ab;
        r14.c();
        r14 = r13.c();
        if (r14 == 0) goto L_0x02cb;
    L_0x02c2:
        r14 = r12.ac;
        r13 = r13.c();
        r14.a(r13, r3);
    L_0x02cb:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.urj.a(aaqk, android.os.Bundle):void");
    }

    public final void a(apxu apxu) {
        aaqi a = this.af.a();
        anxr access$000 = anxl.checkIsLite(ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint.channelCreationServiceEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        a.a = ((ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint) b).b;
        usf usf = this.aa;
        if (usf != null) {
            a.b = usf.e.getText().toString();
            a.c = usf.f.getText().toString();
            if (!usf.k) {
                if (!TextUtils.isEmpty(usf.i.d)) {
                    a.q = usf.i.d;
                }
                a.d = usf.b.get(5);
                a.e = usf.b.get(2) + 1;
                if (!usf.j) {
                    a.p = usf.b.get(1);
                }
            }
        }
        this.af.a(a, new urq(this));
    }

    public final void a(int i, int i2, int i3) {
        usf usf = this.aa;
        if (usf != null) {
            usf.a(i, i2, i3);
        }
    }

    public final void f(boolean z) {
        if (z) {
            this.ai.setVisibility(0);
            this.aj.setVisibility(8);
            return;
        }
        this.ai.setVisibility(8);
        this.aj.setVisibility(0);
    }
}
