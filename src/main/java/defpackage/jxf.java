package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: jxf */
public abstract class jxf implements OnClickListener, kkg {
    public final aaas a;
    public final View b;
    public aphv c;
    public Object d;
    private final ColorStateList e;
    private final ColorStateList f;
    private final ColorStateList g;
    private final ColorStateList h;
    private final ColorStateList i = this.l.getTextColors();
    private final akvp j;
    private final ImageView k = ((ImageView) this.b.findViewById(R.id.button_icon));
    private final TextView l = ((TextView) this.b.findViewById(R.id.button_text));

    jxf(aaas aaas, akvp akvp, Context context, ViewGroup viewGroup, int i, kld kld) {
        this.a = (aaas) amqw.a((Object) aaas);
        this.j = (akvp) amqw.a((Object) akvp);
        this.b = LayoutInflater.from(context).inflate(i, viewGroup, false);
        if (kld != null) {
            this.e = xwe.b(context, kld.a());
            this.f = xwe.b(context, kld.b());
            this.g = xwe.b(context, kld.c());
            this.h = xwe.b(context, kld.d());
            return;
        }
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
    }

    public abstract aphv b(Object obj);

    public abstract boolean c();

    /* Access modifiers changed, original: 0000 */
    public int e() {
        return R.color.slim_metadata_toggle_button_selected;
    }

    /* Access modifiers changed, original: 0000 */
    public int f() {
        return R.color.slim_metadata_toggle_button;
    }

    public final View b() {
        return this.b;
    }

    public void a() {
        this.d = null;
        this.c = null;
        this.b.setOnClickListener(null);
    }

    public void a(Object obj) {
        this.d = obj;
        this.c = (aphv) amqw.a(b(obj));
        this.b.setOnClickListener(this);
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00e1  */
    /* JADX WARNING: Missing block: B:29:0x005b, code skipped:
            if (r4 != null) goto L_0x0079;
     */
    /* JADX WARNING: Missing block: B:32:0x0062, code skipped:
            if (r4 == null) goto L_0x0064;
     */
    /* JADX WARNING: Missing block: B:58:0x00c3, code skipped:
            if (r2 != null) goto L_0x00c5;
     */
    /* JADX WARNING: Missing block: B:61:0x00c9, code skipped:
            if (r2 != null) goto L_0x00c5;
     */
    public final void d() {
        /*
        r5 = this;
        r0 = r5.c();
        r1 = 0;
        if (r0 == 0) goto L_0x0016;
    L_0x0007:
        r2 = r5.c;
        r3 = r2.a;
        r3 = r3 & 2048;
        if (r3 == 0) goto L_0x0016;
    L_0x000f:
        r2 = r2.j;
        if (r2 != 0) goto L_0x0017;
    L_0x0013:
        r2 = defpackage.arwf.c;
        goto L_0x0017;
    L_0x0016:
        r2 = r1;
    L_0x0017:
        if (r0 == 0) goto L_0x001a;
    L_0x0019:
        goto L_0x0028;
    L_0x001a:
        r0 = r5.c;
        r3 = r0.a;
        r3 = r3 & 32;
        if (r3 == 0) goto L_0x0028;
    L_0x0022:
        r2 = r0.d;
        if (r2 != 0) goto L_0x0028;
    L_0x0026:
        r2 = defpackage.arwf.c;
    L_0x0028:
        r0 = 0;
        if (r2 == 0) goto L_0x003c;
    L_0x002b:
        r3 = r5.j;
        r2 = r2.b;
        r2 = defpackage.arwh.a(r2);
        if (r2 != 0) goto L_0x0037;
    L_0x0035:
        r2 = defpackage.arwh.UNKNOWN;
    L_0x0037:
        r2 = r3.a(r2);
        goto L_0x003d;
    L_0x003c:
        r2 = 0;
    L_0x003d:
        if (r2 != 0) goto L_0x0041;
    L_0x003f:
        r2 = r1;
        goto L_0x004b;
    L_0x0041:
        r3 = r5.b;
        r3 = r3.getContext();
        r2 = defpackage.ra.a(r3, r2);
    L_0x004b:
        if (r2 != 0) goto L_0x0053;
    L_0x004d:
        r2 = r5.k;
        r2.setImageResource(r0);
        goto L_0x0085;
    L_0x0053:
        r3 = r5.c();
        if (r3 == 0) goto L_0x005e;
    L_0x0059:
        r4 = r5.f;
        if (r4 == 0) goto L_0x005e;
    L_0x005d:
        goto L_0x0079;
    L_0x005e:
        if (r3 != 0) goto L_0x0064;
    L_0x0060:
        r4 = r5.e;
        if (r4 != 0) goto L_0x0079;
    L_0x0064:
        if (r3 != 0) goto L_0x006b;
    L_0x0066:
        r3 = r5.f();
        goto L_0x006f;
    L_0x006b:
        r3 = r5.e();
    L_0x006f:
        r4 = r5.b;
        r4 = r4.getContext();
        r4 = defpackage.ra.b(r4, r3);
    L_0x0079:
        r2 = defpackage.st.d(r2);
        defpackage.st.a(r2, r4);
        r3 = r5.k;
        r3.setImageDrawable(r2);
    L_0x0085:
        r2 = r5.c();
        if (r2 == 0) goto L_0x00a0;
    L_0x008b:
        r2 = r5.c;
        r3 = r2.a;
        r3 = r3 & 4096;
        if (r3 == 0) goto L_0x009a;
    L_0x0093:
        r2 = r2.k;
        if (r2 != 0) goto L_0x009b;
    L_0x0097:
        r2 = defpackage.arml.f;
        goto L_0x009b;
    L_0x009a:
        r2 = r1;
    L_0x009b:
        r2 = defpackage.ajqy.a(r2);
        goto L_0x00b4;
    L_0x00a0:
        r2 = r5.c;
        r3 = r2.a;
        r3 = r3 & 64;
        if (r3 == 0) goto L_0x00af;
    L_0x00a8:
        r2 = r2.e;
        if (r2 != 0) goto L_0x00b0;
    L_0x00ac:
        r2 = defpackage.arml.f;
        goto L_0x00b0;
    L_0x00af:
        r2 = r1;
    L_0x00b0:
        r2 = defpackage.ajqy.a(r2);
    L_0x00b4:
        if (r2 == 0) goto L_0x00db;
    L_0x00b6:
        r3 = r5.l;
        r3.setText(r2);
        r2 = r5.c();
        if (r2 == 0) goto L_0x00c7;
    L_0x00c1:
        r2 = r5.h;
        if (r2 == 0) goto L_0x00cc;
    L_0x00c5:
        r1 = r2;
        goto L_0x00cc;
    L_0x00c7:
        r2 = r5.g;
        if (r2 == 0) goto L_0x00cc;
    L_0x00cb:
        goto L_0x00c5;
    L_0x00cc:
        if (r1 == 0) goto L_0x00d4;
    L_0x00ce:
        r2 = r5.l;
        r2.setTextColor(r1);
        goto L_0x00db;
    L_0x00d4:
        r1 = r5.l;
        r2 = r5.i;
        r1.setTextColor(r2);
    L_0x00db:
        r1 = r5.c();
        if (r1 == 0) goto L_0x00ea;
    L_0x00e1:
        r1 = r5.c;
        r1 = r1.o;
        if (r1 != 0) goto L_0x00f2;
    L_0x00e7:
        r1 = defpackage.aodx.c;
        goto L_0x00f2;
    L_0x00ea:
        r1 = r5.c;
        r1 = r1.n;
        if (r1 != 0) goto L_0x00f2;
    L_0x00f0:
        r1 = defpackage.aodx.c;
    L_0x00f2:
        if (r1 == 0) goto L_0x010f;
    L_0x00f4:
        r2 = r1.a;
        r2 = r2 & 1;
        if (r2 != 0) goto L_0x00fb;
    L_0x00fa:
        goto L_0x010f;
    L_0x00fb:
        r0 = r5.k;
        r1 = r1.b;
        if (r1 != 0) goto L_0x0103;
    L_0x0101:
        r1 = defpackage.aodv.c;
    L_0x0103:
        r1 = r1.b;
        r0.setContentDescription(r1);
        r0 = r5.l;
        r1 = 2;
        r0.setImportantForAccessibility(r1);
        return;
    L_0x010f:
        r1 = r5.l;
        r1.setImportantForAccessibility(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jxf.d():void");
    }
}
