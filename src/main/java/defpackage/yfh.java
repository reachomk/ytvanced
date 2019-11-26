package defpackage;

import android.net.Uri;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: yfh */
public final class yfh implements yaj, yfd, yhh, zco {
    public final amro a;
    public final View b;
    public final View c;
    public final EditText d;
    public final ImageView e;
    public final Map f = new HashMap();
    public final Pattern g;
    public final int h;
    public final int i;
    public aqnz j;
    public aqpp k;
    public final yhp l;
    private final amro m;
    private final String n;
    private final akmx o;
    private final zda p;
    private final aloz q;
    private final View r;
    private final akle s;
    private final TextView t;
    private final View u;
    private final View v;
    private final amro w;

    public yfh(akmx akmx, akkq akkq, amro amro, amro amro2, View view, String str, amro amro3, yhp yhp, zda zda) {
        amqw.a((Object) akkq);
        this.m = (amro) amqw.a((Object) amro);
        this.a = (amro) amqw.a((Object) amro2);
        this.n = xvd.a(str);
        this.o = (akmx) amqw.a((Object) akmx);
        this.p = (zda) amqw.a((Object) zda);
        amqw.a((Object) view);
        this.c = view.findViewById(R.id.conversation_reply_container);
        this.b = view.findViewById(R.id.conversation_reply_wrapper);
        this.q = new aloz(akkq, (ImageView) this.b.findViewById(R.id.reply_user_thumbnail));
        EditText editText = (EditText) this.b.findViewById(R.id.edit_text);
        editText.addTextChangedListener(new yfl(this, editText));
        editText.addOnLayoutChangeListener(new yfo(this));
        editText.setOnEditorActionListener(new yfn(this));
        this.d = editText;
        ImageView imageView = (ImageView) this.b.findViewById(R.id.send_button);
        imageView.setOnClickListener(new yfp(this));
        this.e = imageView;
        this.r = view.findViewById(R.id.search_button);
        imageView = (ImageView) view.findViewById(R.id.attachment_thumbnail);
        this.t = (TextView) view.findViewById(R.id.attachment_video_title);
        this.s = new akle(akkq, imageView);
        this.u = view.findViewById(R.id.attachment_container);
        this.v = view.findViewById(R.id.edit_container);
        this.w = (amro) amqw.a((Object) amro3);
        this.l = (yhp) amqw.a((Object) yhp);
        this.g = Pattern.compile("^\\s*$");
        view.findViewById(R.id.remove_attachment).setOnClickListener(new yfq(this));
        this.h = view.getContext().getResources().getDimensionPixelOffset(R.dimen.conversation_reply_text_padding);
        this.i = view.getContext().getResources().getDimensionPixelOffset(R.dimen.conversation_reply_text_no_padding);
    }

    public final void a(aqnz aqnz) {
        this.j = aqnz;
        if (aqnz != null) {
            aygk aygk;
            EditText editText = this.d;
            arml arml = aqnz.c;
            if (arml == null) {
                arml = arml.f;
            }
            editText.setHint(ajqy.a(arml));
            this.d.setEnabled(true);
            this.d.setFilters(new InputFilter[]{new LengthFilter((int) Math.min(2147483647L, aqnz.g))});
            aloz aloz = this.q;
            if ((1 & aqnz.a) != 0) {
                aygk = aqnz.b;
                if (aygk == null) {
                    aygk = aygk.f;
                }
            } else {
                aygk = null;
            }
            aloz.a(aygk);
        } else {
            this.q.a();
        }
        this.r.setVisibility(0);
        if (e().isEmpty()) {
            yco yco = (yco) this.o.a(ycq.a(this.n));
            if (yco != null && !TextUtils.isEmpty(yco.a) && !TextUtils.equals(yco.a, e())) {
                this.d.setText(yco.a);
            }
        }
    }

    public final void a(yfe yfe) {
        this.f.remove(yfe);
    }

    private final String e() {
        return this.d.getText().toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0077  */
    public final boolean a() {
        /*
        r6 = this;
        r0 = r6.n;
        r0 = defpackage.ycq.a(r0);
        r1 = r6.o;
        r0 = r1.a(r0);
        r0 = (defpackage.yco) r0;
        r1 = 0;
        if (r0 == 0) goto L_0x0014;
    L_0x0011:
        r0 = r0.b;
        goto L_0x0015;
    L_0x0014:
        r0 = r1;
    L_0x0015:
        r6.k = r0;
        r0 = r6.k;
        r2 = 1;
        if (r0 == 0) goto L_0x0037;
    L_0x001c:
        r0 = r0.c;
        if (r0 != 0) goto L_0x0022;
    L_0x0020:
        r0 = defpackage.aqpn.c;
    L_0x0022:
        r0 = r0.a;
        r0 = r0 & r2;
        if (r0 != 0) goto L_0x0028;
    L_0x0027:
        goto L_0x0037;
    L_0x0028:
        r0 = r6.k;
        r0 = r0.c;
        if (r0 != 0) goto L_0x0030;
    L_0x002e:
        r0 = defpackage.aqpn.c;
    L_0x0030:
        r0 = r0.b;
        if (r0 != 0) goto L_0x0038;
    L_0x0034:
        r0 = defpackage.aryi.o;
        goto L_0x0038;
    L_0x0037:
        r0 = r1;
    L_0x0038:
        if (r0 != 0) goto L_0x003c;
    L_0x003a:
        r3 = r1;
        goto L_0x0047;
    L_0x003c:
        r3 = r0.a;
        r3 = r3 & r2;
        if (r3 == 0) goto L_0x003a;
    L_0x0041:
        r3 = r0.b;
        if (r3 != 0) goto L_0x0047;
    L_0x0045:
        r3 = defpackage.aygk.f;
    L_0x0047:
        if (r0 == 0) goto L_0x0071;
    L_0x0049:
        r4 = r0.f;
        if (r4 != 0) goto L_0x004f;
    L_0x004d:
        r4 = defpackage.aryg.c;
    L_0x004f:
        r4 = r4.b;
        if (r4 != 0) goto L_0x0055;
    L_0x0053:
        r4 = defpackage.arye.u;
    L_0x0055:
        r4 = r4.a;
        r4 = r4 & r2;
        if (r4 == 0) goto L_0x0071;
    L_0x005a:
        r0 = r0.f;
        if (r0 != 0) goto L_0x0060;
    L_0x005e:
        r0 = defpackage.aryg.c;
    L_0x0060:
        r0 = r0.b;
        if (r0 != 0) goto L_0x0066;
    L_0x0064:
        r0 = defpackage.arye.u;
    L_0x0066:
        r0 = r0.b;
        if (r0 != 0) goto L_0x006c;
    L_0x006a:
        r0 = defpackage.arml.f;
    L_0x006c:
        r0 = defpackage.ajqy.a(r0);
        goto L_0x0072;
    L_0x0071:
        r0 = r1;
    L_0x0072:
        r4 = 8;
        r5 = 0;
        if (r3 != 0) goto L_0x00a2;
    L_0x0077:
        r0 = r6.u;
        r0.setVisibility(r4);
        r0 = r6.t;
        r0.setText(r1);
        r0 = r6.e;
        r1 = r6.g;
        r2 = r6.d;
        r2 = r2.getText();
        r1 = r1.matcher(r2);
        r1 = r1.matches();
        if (r1 != 0) goto L_0x0096;
    L_0x0095:
        r4 = 0;
    L_0x0096:
        r0.setVisibility(r4);
        r0 = r6.r;
        r0.setVisibility(r5);
        r6.c();
        return r5;
    L_0x00a2:
        r1 = r6.u;
        r1.setVisibility(r5);
        r1 = r6.s;
        r1.a(r3);
        r1 = r6.t;
        r1.setText(r0);
        r0 = r6.e;
        r0.setVisibility(r5);
        r0 = r6.r;
        r0.setVisibility(r4);
        r6.c();
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yfh.a():boolean");
    }

    public final void a(boolean z) {
        Uri a = ycq.a(this.n);
        ycn ycn = new ycn((yco) this.o.a(a));
        ycn.a = this.d.getText().toString();
        ycn.b = z ? this.k : null;
        this.o.a(a, ycn.a());
    }

    public final void b() {
        xpr.a(this.d);
    }

    public final void c() {
        int i = 0;
        this.v.measure(MeasureSpec.makeMeasureSpec(this.v.getWidth(), aocf.UNSET_ENUM_VALUE), 0);
        int measuredHeight = this.v.getMeasuredHeight();
        if (this.u.getVisibility() == 0) {
            LayoutParams layoutParams = (LayoutParams) this.u.getLayoutParams();
            i = (layoutParams.topMargin + layoutParams.bottomMargin) + this.u.getHeight();
        }
        measuredHeight += i;
        if (this.b.getHeight() != measuredHeight) {
            this.b.post(new yfk(this, measuredHeight));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01ad  */
    public final void d() {
        /*
        r15 = this;
        r0 = r15.d;
        r0 = r0.getText();
        r2 = r0.toString();
        r0 = android.text.TextUtils.isEmpty(r2);
        r1 = "CLIENT-";
        r7 = 0;
        if (r0 != 0) goto L_0x002f;
    L_0x0013:
        r0 = r15.p;
        r0 = r0.a();
        r0 = java.lang.String.valueOf(r0);
        r3 = r0.length();
        if (r3 != 0) goto L_0x0029;
    L_0x0023:
        r0 = new java.lang.String;
        r0.<init>(r1);
        goto L_0x002d;
    L_0x0029:
        r0 = r1.concat(r0);
    L_0x002d:
        r3 = r0;
        goto L_0x0030;
    L_0x002f:
        r3 = r7;
    L_0x0030:
        r0 = r15.k;
        if (r0 == 0) goto L_0x0050;
    L_0x0034:
        r0 = r15.p;
        r0 = r0.a();
        r0 = java.lang.String.valueOf(r0);
        r4 = r0.length();
        if (r4 != 0) goto L_0x004a;
    L_0x0044:
        r0 = new java.lang.String;
        r0.<init>(r1);
        goto L_0x004e;
    L_0x004a:
        r0 = r1.concat(r0);
    L_0x004e:
        r6 = r0;
        goto L_0x0051;
    L_0x0050:
        r6 = r7;
    L_0x0051:
        r0 = android.text.TextUtils.isEmpty(r3);
        r8 = 8;
        r9 = 0;
        if (r0 != 0) goto L_0x005b;
    L_0x005a:
        goto L_0x0061;
    L_0x005b:
        r0 = android.text.TextUtils.isEmpty(r6);
        if (r0 != 0) goto L_0x01f4;
    L_0x0061:
        r0 = r15.m;
        r0 = r0.get();
        r0 = (defpackage.yhi) r0;
        r0 = r0.f();
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 != 0) goto L_0x01f4;
    L_0x0073:
        r0 = r15.j;
        if (r0 == 0) goto L_0x01f4;
    L_0x0077:
        r0 = r15.u;
        r0.setVisibility(r8);
        r0 = r15.j;
        r0 = r0.toBuilder();
        r0 = (defpackage.anxo) r0;
        r0 = (defpackage.aqny) r0;
        r1 = r15.k;
        if (r1 == 0) goto L_0x0093;
    L_0x008a:
        r1 = r1.toBuilder();
        r1 = (defpackage.anxo) r1;
        r1 = (defpackage.aqpo) r1;
        goto L_0x0094;
    L_0x0093:
        r1 = r7;
    L_0x0094:
        r4 = 1;
        if (r1 == 0) goto L_0x00bc;
    L_0x0097:
        r5 = r1.a();
        r10 = com.google.protos.youtube.api.innertube.SendShareEndpoint$SendShareToConversationEndpoint.sendShareToConversationEndpoint;
        r10 = defpackage.anxl.checkIsLite(r10);
        r5.a(r10);
        r5 = r5.h;
        r10 = r10.d;
        r5 = r5.a(r10);
        if (r5 == 0) goto L_0x00bc;
    L_0x00ae:
        r5 = r1.a();
        r5 = r5.toBuilder();
        r5 = (defpackage.anxo) r5;
        r5 = (defpackage.apxx) r5;
        r10 = 1;
        goto L_0x00e4;
    L_0x00bc:
        if (r0 == 0) goto L_0x00e2;
    L_0x00be:
        r5 = r0.a();
        r10 = com.google.protos.youtube.api.innertube.SendShareEndpoint$SendShareToConversationEndpoint.sendShareToConversationEndpoint;
        r10 = defpackage.anxl.checkIsLite(r10);
        r5.a(r10);
        r5 = r5.h;
        r10 = r10.d;
        r5 = r5.a(r10);
        if (r5 == 0) goto L_0x00e2;
    L_0x00d5:
        r5 = r0.a();
        r5 = r5.toBuilder();
        r5 = (defpackage.anxo) r5;
        r5 = (defpackage.apxx) r5;
        goto L_0x00e3;
    L_0x00e2:
        r5 = r7;
    L_0x00e3:
        r10 = 0;
    L_0x00e4:
        if (r5 == 0) goto L_0x0194;
    L_0x00e6:
        r11 = com.google.protos.youtube.api.innertube.SendShareEndpoint$SendShareToConversationEndpoint.sendShareToConversationEndpoint;
        r11 = r5.b(r11);
        r11 = (com.google.protos.youtube.api.innertube.SendShareEndpoint$SendShareToConversationEndpoint) r11;
        r11 = r11.toBuilder();
        r11 = (defpackage.anxo) r11;
        r11 = (defpackage.axfm) r11;
        r12 = r11.instance;
        r12 = (com.google.protos.youtube.api.innertube.SendShareEndpoint$SendShareToConversationEndpoint) r12;
        r12 = r12.a;
        r12 = r12 & r4;
        if (r12 == 0) goto L_0x010c;
    L_0x00ff:
        r12 = r11.a();
        r12 = r12.toBuilder();
        r12 = (defpackage.anxo) r12;
        r12 = (defpackage.asfd) r12;
        goto L_0x0114;
    L_0x010c:
        r12 = defpackage.asfa.f;
        r12 = r12.createBuilder();
        r12 = (defpackage.asfd) r12;
    L_0x0114:
        if (r1 != 0) goto L_0x0117;
    L_0x0116:
        goto L_0x0130;
    L_0x0117:
        r13 = defpackage.asdk.d;
        r13 = r13.createBuilder();
        r13 = (defpackage.asdn) r13;
        r14 = r12.instance;
        r14 = (defpackage.asfa) r14;
        r14 = r14.b;
        r13.a(r14);
        if (r6 == 0) goto L_0x012d;
    L_0x012a:
        r13.b(r6);
    L_0x012d:
        r12.a(r13);
    L_0x0130:
        r13 = android.text.TextUtils.isEmpty(r2);
        if (r13 == 0) goto L_0x0137;
    L_0x0136:
        goto L_0x014a;
    L_0x0137:
        r13 = defpackage.asdi.d;
        r13 = r13.createBuilder();
        r13 = (defpackage.asdl) r13;
        r13.a(r2);
        if (r3 == 0) goto L_0x0147;
    L_0x0144:
        r13.b(r3);
    L_0x0147:
        r12.a(r13);
    L_0x014a:
        r11.a(r12);
        r12 = com.google.protos.youtube.api.innertube.SendShareEndpoint$SendShareToConversationEndpoint.sendShareToConversationEndpoint;
        r11 = r11.build();
        r11 = (defpackage.anxl) r11;
        r11 = (com.google.protos.youtube.api.innertube.SendShareEndpoint$SendShareToConversationEndpoint) r11;
        r5.a(r12, r11);
        if (r10 == 0) goto L_0x0173;
    L_0x015c:
        r1.copyOnWrite();
        r10 = r1.instance;
        r10 = (defpackage.aqpp) r10;
        r11 = r5.build();
        r11 = (defpackage.anxl) r11;
        r11 = (defpackage.apxu) r11;
        r10.b = r11;
        r11 = r10.a;
        r4 = r4 | r11;
        r10.a = r4;
        goto L_0x018a;
    L_0x0173:
        r0.copyOnWrite();
        r4 = r0.instance;
        r4 = (defpackage.aqnz) r4;
        r10 = r5.build();
        r10 = (defpackage.anxl) r10;
        r10 = (defpackage.apxu) r10;
        r4.d = r10;
        r10 = r4.a;
        r10 = r10 | 4;
        r4.a = r10;
    L_0x018a:
        r4 = r5.build();
        r4 = (defpackage.anxl) r4;
        r4 = (defpackage.apxu) r4;
        r10 = r4;
        goto L_0x0195;
    L_0x0194:
        r10 = r7;
    L_0x0195:
        r0 = r0.build();
        r0 = (defpackage.anxl) r0;
        r0 = (defpackage.aqnz) r0;
        r15.j = r0;
        if (r1 == 0) goto L_0x01ab;
    L_0x01a1:
        r0 = r1.build();
        r0 = (defpackage.anxl) r0;
        r0 = (defpackage.aqpp) r0;
        r15.k = r0;
    L_0x01ab:
        if (r10 == 0) goto L_0x01c8;
    L_0x01ad:
        r0 = r15.a;
        r0 = r0.get();
        r1 = r0;
        r1 = (defpackage.yfi) r1;
        r4 = r15.j;
        r5 = r15.k;
        r1.a(r2, r3, r4, r5, r6);
        r0 = r15.w;
        r0 = r0.get();
        r0 = (defpackage.yfe) r0;
        r0.a(r10);
    L_0x01c8:
        r0 = r15.d;
        r1 = "";
        r0.setText(r1);
        r15.k = r7;
        r0 = r15.n;
        r0 = defpackage.ycq.a(r0);
        r1 = new ycn;
        r2 = r15.o;
        r2 = r2.a(r0);
        r2 = (defpackage.yco) r2;
        r1.<init>(r2);
        r1.a = r7;
        r1.b = r7;
        r1 = r1.a();
        r2 = r15.o;
        r2.a(r0, r1);
        r15.a();
    L_0x01f4:
        r0 = r15.r;
        r0.setVisibility(r9);
        r0 = r15.e;
        r0.setVisibility(r8);
        r0 = r15.d;
        r0.requestFocus();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yfh.d():void");
    }

    public final void a(String str, aqpp aqpp) {
        Uri a = ycq.a(this.n);
        ycn ycn = new ycn((yco) this.o.a(a));
        ycn.b = aqpp;
        this.o.a(a, ycn.a());
        a();
    }
}
