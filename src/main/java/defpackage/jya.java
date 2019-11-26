package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: jya */
public final class jya extends akpl {
    public final Activity a;
    public final aaas b;
    public final Resources c;
    public final View d;
    public final TextView e;
    public final ImageView f;
    public final View g;
    public final ewb h;
    public final jgd i;
    public final est j;
    public final eur k;
    public final jnz l;
    public jgc m;
    public boolean n = false;
    private final akkq o;
    private final View p;
    private final ImageView q;
    private final View r;
    private final View s;
    private final vut t;
    private final akko u;
    private final akko v;
    private final LinearLayout w;
    private jye x;
    private jye y;
    private jye z;

    public jya(Activity activity, akkq akkq, aaas aaas, vut vut, ewb ewb, est est, jnz jnz, eur eur, jgd jgd) {
        this.a = (Activity) amqw.a((Object) activity);
        this.c = activity.getResources();
        this.o = (akkq) amqw.a((Object) akkq);
        this.b = aaas;
        this.t = (vut) amqw.a((Object) vut);
        this.h = (ewb) amqw.a((Object) ewb);
        this.i = (jgd) amqw.a((Object) jgd);
        this.j = (est) amqw.a((Object) est);
        this.k = eur;
        this.l = jnz;
        this.d = LayoutInflater.from(activity).inflate(R.layout.channel_header, null);
        this.q = (ImageView) this.d.findViewById(R.id.channel_avatar);
        this.r = this.d.findViewById(R.id.skinny_channel_banner);
        this.s = this.d.findViewById(R.id.channel_banner_container);
        this.f = (ImageView) this.d.findViewById(R.id.channel_banner);
        this.e = (TextView) this.d.findViewById(R.id.channel_description);
        this.e.setOnClickListener(new jyc(this));
        this.p = this.d.findViewById(R.id.description_separator);
        this.g = this.d.findViewById(R.id.separator);
        this.u = akkq.a().g().a(new jyj(this)).a();
        this.v = akkq.a().g().a((int) R.drawable.missing_avatar).a();
        this.w = (LinearLayout) this.d.findViewById(R.id.links);
    }

    public final View K_() {
        return this.d;
    }

    public final void a(akpb akpb) {
        jye jye = this.z;
        if (jye != null) {
            jye.b.a();
        }
    }

    public final eus b() {
        jye jye = this.z;
        return jye != null ? jye.c : null;
    }

    public final void c() {
        this.f.setBackgroundResource(R.drawable.ic_default_channel_placeholder);
        this.f.setImageDrawable(null);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x016e  */
    public final /* synthetic */ void a(defpackage.akor r8, java.lang.Object r9) {
        /*
        r7 = this;
        r9 = (defpackage.ajrw) r9;
        r0 = r9.i;
        r1 = 0;
        r2 = 8;
        if (r0 == 0) goto L_0x0018;
    L_0x0009:
        r3 = r7.e;
        r0 = defpackage.ajqy.a(r0);
        defpackage.xpr.a(r3, r0);
        r0 = r7.p;
        r0.setVisibility(r1);
        goto L_0x0022;
    L_0x0018:
        r0 = r7.e;
        r0.setVisibility(r2);
        r0 = r7.p;
        r0.setVisibility(r2);
    L_0x0022:
        r0 = r9.e;
        if (r0 != 0) goto L_0x0027;
    L_0x0026:
        goto L_0x005b;
    L_0x0027:
        r3 = r0.a;
        r3 = r3 & 1;
        if (r3 == 0) goto L_0x005b;
    L_0x002d:
        r3 = r7.t;
        r0 = r0.b;
        r3.a(r0);
        r0 = r9.e;
        r0 = r0.toBuilder();
        r0 = (defpackage.anxo) r0;
        r0 = (defpackage.apio) r0;
        r0.copyOnWrite();
        r3 = r0.instance;
        r3 = (defpackage.apil) r3;
        r4 = r3.a;
        r4 = r4 & -2;
        r3.a = r4;
        r4 = defpackage.apil.c;
        r4 = r4.b;
        r3.b = r4;
        r0 = r0.build();
        r0 = (defpackage.anxl) r0;
        r0 = (defpackage.apil) r0;
        r9.e = r0;
    L_0x005b:
        r0 = r7.o;
        r3 = r7.q;
        r4 = r9.b;
        r5 = r7.v;
        r0.a(r3, r4, r5);
        r0 = r9.g;
        r3 = defpackage.aklb.a(r0);
        r4 = 0;
        if (r3 != 0) goto L_0x0082;
    L_0x006f:
        r0 = r9.j;
        if (r0 == 0) goto L_0x007e;
    L_0x0073:
        r0 = r7.r;
        r0.setVisibility(r1);
        r0 = r7.s;
        r0.setVisibility(r2);
        goto L_0x00cd;
    L_0x007e:
        r7.c();
        goto L_0x00c3;
    L_0x0082:
        r3 = r7.f;
        r3.setBackground(r4);
        r3 = r7.o;
        r5 = r7.f;
        r6 = r7.u;
        r3.a(r5, r0, r6);
        r3 = r9.n;
        if (r3 == 0) goto L_0x00c3;
    L_0x0094:
        r5 = r7.f;
        r6 = new jyd;
        r6.<init>(r7, r3);
        r5.setOnClickListener(r6);
        r3 = r0.d;
        if (r3 != 0) goto L_0x00a4;
    L_0x00a2:
        r3 = defpackage.aodx.c;
    L_0x00a4:
        r3 = r3.a;
        r3 = r3 & 1;
        if (r3 == 0) goto L_0x00c3;
    L_0x00aa:
        r0 = r0.d;
        if (r0 != 0) goto L_0x00b0;
    L_0x00ae:
        r0 = defpackage.aodx.c;
    L_0x00b0:
        r0 = r0.b;
        if (r0 != 0) goto L_0x00b6;
    L_0x00b4:
        r0 = defpackage.aodv.c;
    L_0x00b6:
        r0 = r0.b;
        r3 = android.text.TextUtils.isEmpty(r0);
        if (r3 != 0) goto L_0x00c3;
    L_0x00be:
        r3 = r7.f;
        r3.setContentDescription(r0);
    L_0x00c3:
        r0 = r7.r;
        r0.setVisibility(r2);
        r0 = r7.s;
        r0.setVisibility(r1);
    L_0x00cd:
        r0 = r7.z;
        if (r0 != 0) goto L_0x00d2;
    L_0x00d1:
        goto L_0x00d7;
    L_0x00d2:
        r0 = r0.a;
        r0.setVisibility(r2);
    L_0x00d7:
        r0 = r9.o;
        if (r0 != 0) goto L_0x0110;
    L_0x00db:
        r0 = r7.x;
        if (r0 != 0) goto L_0x010b;
    L_0x00df:
        r0 = r7.d;
        r3 = 2131755855; // 0x7f10034f float:1.9142601E38 double:1.0532273333E-314;
        r0 = r0.findViewById(r3);
        r0 = (android.view.ViewStub) r0;
        if (r0 != 0) goto L_0x00fa;
    L_0x00ec:
        r0 = new jye;
        r3 = r7.d;
        r0.<init>(r7, r3);
        r7.x = r0;
        r0 = r7.x;
        r7.y = r0;
        goto L_0x010b;
    L_0x00fa:
        r3 = 2131034287; // 0x7f0500af float:1.7679087E38 double:1.0528708313E-314;
        r0.setLayoutResource(r3);
        r3 = new jye;
        r0 = r0.inflate();
        r3.<init>(r7, r0);
        r7.x = r3;
    L_0x010b:
        r0 = r7.x;
        r7.z = r0;
        goto L_0x0144;
    L_0x0110:
        r0 = r7.y;
        if (r0 != 0) goto L_0x0140;
    L_0x0114:
        r0 = r7.d;
        r3 = 2131755856; // 0x7f100350 float:1.9142603E38 double:1.053227334E-314;
        r0 = r0.findViewById(r3);
        r0 = (android.view.ViewStub) r0;
        if (r0 != 0) goto L_0x012f;
    L_0x0121:
        r0 = new jye;
        r3 = r7.d;
        r0.<init>(r7, r3);
        r7.y = r0;
        r0 = r7.y;
        r7.x = r0;
        goto L_0x0140;
    L_0x012f:
        r3 = 2131034288; // 0x7f0500b0 float:1.767909E38 double:1.052870832E-314;
        r0.setLayoutResource(r3);
        r3 = new jye;
        r0 = r0.inflate();
        r3.<init>(r7, r0);
        r7.y = r3;
    L_0x0140:
        r0 = r7.y;
        r7.z = r0;
    L_0x0144:
        r0 = r7.z;
        r0.a(r8, r9);
        r8 = r7.z;
        r8 = r8.a;
        r8.setVisibility(r1);
        r8 = r9.c;
        if (r8 != 0) goto L_0x0155;
    L_0x0154:
        goto L_0x01b7;
    L_0x0155:
        r9 = r8.a;
        r9 = r9 & 1;
        if (r9 == 0) goto L_0x01b7;
    L_0x015b:
        r8 = r8.b;
        if (r8 != 0) goto L_0x0161;
    L_0x015f:
        r8 = defpackage.aply.b;
    L_0x0161:
        r8 = r8.a;
        r9 = r7.w;
        r9.removeAllViews();
        r9 = r8.isEmpty();
        if (r9 == 0) goto L_0x0174;
    L_0x016e:
        r8 = r7.w;
        r8.setVisibility(r2);
        goto L_0x01b7;
    L_0x0174:
        r9 = r7.w;
        r9.setVisibility(r1);
        r8 = r8.iterator();
    L_0x017d:
        r9 = r8.hasNext();
        if (r9 == 0) goto L_0x01b7;
    L_0x0183:
        r9 = r8.next();
        r9 = (defpackage.apma) r9;
        r0 = r7.a;
        r1 = 2131034289; // 0x7f0500b1 float:1.7679091E38 double:1.0528708323E-314;
        r0 = android.view.View.inflate(r0, r1, r4);
        r0 = (android.widget.TextView) r0;
        r1 = new jyf;
        r1.<init>(r7, r9);
        r0.setOnClickListener(r1);
        r1 = r9.a;
        r1 = r1 & 4;
        if (r1 == 0) goto L_0x01a9;
    L_0x01a2:
        r9 = r9.c;
        if (r9 != 0) goto L_0x01aa;
    L_0x01a6:
        r9 = defpackage.arml.f;
        goto L_0x01aa;
    L_0x01a9:
        r9 = r4;
    L_0x01aa:
        r9 = defpackage.ajqy.a(r9);
        defpackage.xpr.a(r0, r9);
        r9 = r7.w;
        r9.addView(r0);
        goto L_0x017d;
    L_0x01b7:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jya.a(akor, java.lang.Object):void");
    }
}
