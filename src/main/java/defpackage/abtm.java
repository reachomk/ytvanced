package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: abtm */
public abstract class abtm implements akot {
    public final aaas a;
    public final acvx b;
    public final Context c;
    public final ImageView d = ((ImageView) this.p.findViewById(R.id.avatar));
    public final TextView e = ((TextView) this.p.findViewById(R.id.author));
    public final TextView f = ((TextView) this.p.findViewById(R.id.amount));
    public final TextView g = ((TextView) this.q.findViewById(R.id.message));
    public final Map h = new HashMap();
    private final aktj i;
    private final aktr j;
    private final SpannableStringBuilder k;
    private final StringBuilder l;
    private final akvp m;
    private final akle n;
    private final View o;
    private final View p = this.o.findViewById(R.id.top_bar);
    private final View q = this.o.findViewById(R.id.bottom_bar);
    private final TextView r = ((TextView) this.p.findViewById(R.id.time));
    private final View s = this.o.findViewById(R.id.underline);
    private final LinearLayout t = ((LinearLayout) this.q.findViewById(R.id.footer_body));
    private final TextView u = ((TextView) this.q.findViewById(R.id.footer_text));
    private boolean v;
    private CharSequence w;

    public abtm(Context context, akkl akkl, acwa acwa, aaas aaas, akte akte, akvp akvp) {
        this.c = context;
        this.b = acwa.t();
        this.a = aaas;
        this.m = akvp;
        this.o = LayoutInflater.from(context).inflate(b(), null);
        Resources resources = context.getResources();
        MarginLayoutParams c = c();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.live_chat_paid_message_margin);
        c.setMarginStart(dimensionPixelOffset);
        c.setMarginEnd(dimensionPixelOffset);
        this.o.setLayoutParams(c);
        this.k = new SpannableStringBuilder();
        this.l = new StringBuilder();
        this.j = new aktr(this.o);
        this.i = new aktj(context, akte, true, this.j);
        this.n = new akle(akkl, this.d);
    }

    /* Access modifiers changed, original: protected */
    public int b() {
        return R.layout.live_chat_paid_message;
    }

    /* Access modifiers changed, original: protected */
    public int d() {
        return R.drawable.live_chat_paid_message_top_background;
    }

    /* Access modifiers changed, original: protected */
    public int e() {
        return R.drawable.live_chat_paid_message_full_background;
    }

    public abstract boolean f();

    public final View K_() {
        return this.o;
    }

    /* Access modifiers changed, original: protected */
    public MarginLayoutParams c() {
        return new MarginLayoutParams(-1, -2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:148:0x031b  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0315  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x032d  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x036b  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0380  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x039c  */
    /* JADX WARNING: Removed duplicated region for block: B:174:? A:{SYNTHETIC, RETURN, SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x02d5  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x02e4  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0311  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0315  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x031b  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x032d  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x036b  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0380  */
    /* JADX WARNING: Removed duplicated region for block: B:174:? A:{SYNTHETIC, RETURN, SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x039c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x02d5  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x02e4  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0311  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x031b  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0315  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x032d  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x036b  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0380  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x039c  */
    /* JADX WARNING: Removed duplicated region for block: B:174:? A:{SYNTHETIC, RETURN, SKIP} */
    /* JADX WARNING: Missing block: B:6:0x004a, code skipped:
            if (r3.h.a(r4.d) != false) goto L_0x0037;
     */
    /* JADX WARNING: Missing block: B:142:0x030a, code skipped:
            if (r1.h.a(r2.d) != false) goto L_0x0313;
     */
    /* renamed from: a */
    public void a_(defpackage.akor r16, defpackage.aued r17) {
        /*
        r15 = this;
        r0 = r15;
        r1 = r16;
        r9 = r17;
        r2 = r0.i;
        r2.a();
        r2 = r0.k;
        r2.clear();
        r2 = r0.l;
        r10 = 0;
        r2.setLength(r10);
        r2 = r0.e;
        r11 = "live_chat_item_action";
        r3 = r1.a(r11);
        r4 = r3 instanceof defpackage.apxu;
        r12 = 0;
        if (r4 == 0) goto L_0x004d;
    L_0x0022:
        r3 = (defpackage.apxu) r3;
        r4 = com.google.protos.youtube.api.innertube.LiveChatAction.MarkChatItemAsDeletedAction.markChatItemAsDeletedAction;
        r4 = defpackage.anxl.checkIsLite(r4);
        r3.a(r4);
        r5 = r3.h;
        r4 = r4.d;
        r4 = r5.a(r4);
        if (r4 == 0) goto L_0x0039;
    L_0x0037:
        r3 = r12;
        goto L_0x005f;
    L_0x0039:
        r4 = com.google.protos.youtube.api.innertube.LiveChatAction.MarkChatItemsByAuthorAsDeletedAction.markChatItemsByAuthorAsDeletedAction;
        r4 = defpackage.anxl.checkIsLite(r4);
        r3.a(r4);
        r3 = r3.h;
        r4 = r4.d;
        r3 = r3.a(r4);
        if (r3 == 0) goto L_0x004d;
    L_0x004c:
        goto L_0x0037;
    L_0x004d:
        r3 = r9.a;
        r3 = r3 & 16;
        if (r3 == 0) goto L_0x005a;
    L_0x0053:
        r3 = r9.h;
        if (r3 != 0) goto L_0x005b;
    L_0x0057:
        r3 = defpackage.arml.f;
        goto L_0x005b;
    L_0x005a:
        r3 = r12;
    L_0x005b:
        r3 = defpackage.ajqy.a(r3);
    L_0x005f:
        defpackage.xpr.a(r2, r3);
        r2 = r0.e;
        r3 = r9.k;
        r2.setTextColor(r3);
        r2 = r0.f;
        r3 = r9.a;
        r3 = r3 & 64;
        if (r3 == 0) goto L_0x0078;
    L_0x0071:
        r3 = r9.j;
        if (r3 != 0) goto L_0x0079;
    L_0x0075:
        r3 = defpackage.arml.f;
        goto L_0x0079;
    L_0x0078:
        r3 = r12;
    L_0x0079:
        r3 = defpackage.ajqy.a(r3);
        defpackage.xpr.a(r2, r3);
        r2 = r0.f;
        r3 = r9.m;
        r2.setTextColor(r3);
        r2 = r1.a(r11);
        r3 = r2 instanceof defpackage.apxu;
        r13 = 1;
        r4 = 7;
        if (r3 == 0) goto L_0x012f;
    L_0x0091:
        r2 = (defpackage.apxu) r2;
        r3 = com.google.protos.youtube.api.innertube.LiveChatAction.MarkChatItemAsDeletedAction.markChatItemAsDeletedAction;
        r3 = defpackage.anxl.checkIsLite(r3);
        r2.a(r3);
        r5 = r2.h;
        r3 = r3.d;
        r3 = r5.a(r3);
        if (r3 != 0) goto L_0x0106;
    L_0x00a6:
        r3 = com.google.protos.youtube.api.innertube.LiveChatAction.MarkChatItemsByAuthorAsDeletedAction.markChatItemsByAuthorAsDeletedAction;
        r3 = defpackage.anxl.checkIsLite(r3);
        r2.a(r3);
        r5 = r2.h;
        r3 = r3.d;
        r3 = r5.a(r3);
        if (r3 == 0) goto L_0x012f;
    L_0x00b9:
        r0.v = r10;
        r3 = com.google.protos.youtube.api.innertube.LiveChatAction.MarkChatItemsByAuthorAsDeletedAction.markChatItemsByAuthorAsDeletedAction;
        r3 = defpackage.anxl.checkIsLite(r3);
        r2.a(r3);
        r5 = r2.h;
        r6 = r3.d;
        r5 = r5.b(r6);
        if (r5 != 0) goto L_0x00d1;
    L_0x00ce:
        r3 = r3.b;
        goto L_0x00d5;
    L_0x00d1:
        r3 = r3.a(r5);
    L_0x00d5:
        r3 = (com.google.protos.youtube.api.innertube.LiveChatAction.MarkChatItemsByAuthorAsDeletedAction) r3;
        r3 = r3.a;
        r3 = r3 & r13;
        if (r3 != 0) goto L_0x00de;
    L_0x00dc:
        r2 = r12;
        goto L_0x0100;
    L_0x00de:
        r3 = com.google.protos.youtube.api.innertube.LiveChatAction.MarkChatItemsByAuthorAsDeletedAction.markChatItemsByAuthorAsDeletedAction;
        r3 = defpackage.anxl.checkIsLite(r3);
        r2.a(r3);
        r2 = r2.h;
        r5 = r3.d;
        r2 = r2.b(r5);
        if (r2 != 0) goto L_0x00f4;
    L_0x00f1:
        r2 = r3.b;
        goto L_0x00f8;
    L_0x00f4:
        r2 = r3.a(r2);
    L_0x00f8:
        r2 = (com.google.protos.youtube.api.innertube.LiveChatAction.MarkChatItemsByAuthorAsDeletedAction) r2;
        r2 = r2.b;
        if (r2 != 0) goto L_0x0100;
    L_0x00fe:
        r2 = defpackage.arml.f;
    L_0x0100:
        r2 = defpackage.ajqy.a(r2);
        goto L_0x017c;
    L_0x0106:
        r0.v = r10;
        r3 = com.google.protos.youtube.api.innertube.LiveChatAction.MarkChatItemAsDeletedAction.markChatItemAsDeletedAction;
        r3 = defpackage.anxl.checkIsLite(r3);
        r2.a(r3);
        r2 = r2.h;
        r5 = r3.d;
        r2 = r2.b(r5);
        if (r2 != 0) goto L_0x011e;
    L_0x011b:
        r2 = r3.b;
        goto L_0x0122;
    L_0x011e:
        r2 = r3.a(r2);
    L_0x0122:
        r2 = (com.google.protos.youtube.api.innertube.LiveChatAction.MarkChatItemAsDeletedAction) r2;
        r2 = r2.b;
        if (r2 != 0) goto L_0x012a;
    L_0x0128:
        r2 = defpackage.arml.f;
    L_0x012a:
        r2 = defpackage.ajqy.a(r2);
        goto L_0x017c;
    L_0x012f:
        r2 = r9.b;
        if (r2 != r4) goto L_0x0138;
    L_0x0133:
        r2 = r9.c;
        r2 = (defpackage.arml) r2;
        goto L_0x013a;
    L_0x0138:
        r2 = defpackage.arml.f;
    L_0x013a:
        if (r2 != 0) goto L_0x013e;
    L_0x013c:
        r2 = 0;
        goto L_0x016c;
    L_0x013e:
        r3 = r2.b;
        r3 = r3.size();
        if (r3 <= 0) goto L_0x013c;
    L_0x0146:
        r2 = r2.b;
        r2 = r2.iterator();
    L_0x014c:
        r3 = r2.hasNext();
        if (r3 == 0) goto L_0x013c;
    L_0x0152:
        r3 = r2.next();
        r3 = (defpackage.armp) r3;
        r5 = defpackage.ardw.g;
        r5 = defpackage.anxl.checkIsLite(r5);
        r3.a(r5);
        r3 = r3.h;
        r5 = r5.d;
        r3 = r3.a(r5);
        if (r3 == 0) goto L_0x014c;
    L_0x016b:
        r2 = 1;
    L_0x016c:
        r0.v = r2;
        r2 = r9.b;
        if (r2 != r4) goto L_0x0177;
    L_0x0172:
        r2 = r9.c;
        r2 = (defpackage.arml) r2;
        goto L_0x0178;
    L_0x0177:
        r2 = r12;
    L_0x0178:
        r2 = defpackage.ajqy.a(r2);
    L_0x017c:
        r0.w = r2;
        r2 = r0.w;
        r2 = android.text.TextUtils.isEmpty(r2);
        r14 = 8;
        if (r2 == 0) goto L_0x0193;
    L_0x0188:
        r2 = r0.v;
        if (r2 == 0) goto L_0x018d;
    L_0x018c:
        goto L_0x0193;
    L_0x018d:
        r2 = r0.g;
        r2.setVisibility(r14);
        goto L_0x01de;
    L_0x0193:
        r2 = r0.w;
        r2 = android.text.TextUtils.isEmpty(r2);
        if (r2 != 0) goto L_0x01a9;
    L_0x019b:
        r2 = r0.k;
        r3 = r0.w;
        r2.append(r3);
        r2 = r0.l;
        r3 = r0.w;
        r2.append(r3);
    L_0x01a9:
        r2 = r0.v;
        if (r2 == 0) goto L_0x01cb;
    L_0x01ad:
        r2 = r0.i;
        r3 = r9.b;
        if (r3 != r4) goto L_0x01b8;
    L_0x01b3:
        r3 = r9.c;
        r3 = (defpackage.arml) r3;
        goto L_0x01ba;
    L_0x01b8:
        r3 = defpackage.arml.f;
    L_0x01ba:
        r4 = r0.w;
        r5 = r0.k;
        r6 = r0.l;
        r7 = r0.g;
        r8 = r7.getId();
        r7 = r17;
        r2.a(r3, r4, r5, r6, r7, r8);
    L_0x01cb:
        r2 = r0.g;
        r3 = r0.k;
        r2.setText(r3);
        r2 = r0.g;
        r3 = r9.o;
        r2.setTextColor(r3);
        r2 = r0.g;
        r2.setVisibility(r10);
    L_0x01de:
        r2 = r0.r;
        if (r2 != 0) goto L_0x01e3;
    L_0x01e2:
        goto L_0x01f2;
    L_0x01e3:
        r3 = r9.e;
        r5 = 0;
        r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r7 == 0) goto L_0x01ef;
    L_0x01eb:
        r2.setVisibility(r14);
        goto L_0x01f2;
    L_0x01ef:
        r2.setVisibility(r14);
    L_0x01f2:
        r2 = r9.a;
        r3 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;
        r2 = r2 & r3;
        if (r2 == 0) goto L_0x02d5;
    L_0x01f9:
        r2 = r9.s;
        if (r2 == 0) goto L_0x01fe;
    L_0x01fd:
        goto L_0x0200;
    L_0x01fe:
        r2 = defpackage.axak.a;
    L_0x0200:
        r3 = com.google.protos.youtube.api.innertube.LiveChatItemRenderer.liveChatPaidMessageFooterRenderer;
        r3 = defpackage.anxl.checkIsLite(r3);
        r2.a(r3);
        r2 = r2.h;
        r3 = r3.d;
        r2 = r2.a(r3);
        if (r2 == 0) goto L_0x02dc;
    L_0x0213:
        r2 = r9.s;
        if (r2 == 0) goto L_0x0218;
    L_0x0217:
        goto L_0x021a;
    L_0x0218:
        r2 = defpackage.axak.a;
    L_0x021a:
        r3 = com.google.protos.youtube.api.innertube.LiveChatItemRenderer.liveChatPaidMessageFooterRenderer;
        r3 = defpackage.anxl.checkIsLite(r3);
        r2.a(r3);
        r2 = r2.h;
        r4 = r3.d;
        r2 = r2.b(r4);
        if (r2 != 0) goto L_0x0230;
    L_0x022d:
        r2 = r3.b;
        goto L_0x0234;
    L_0x0230:
        r2 = r3.a(r2);
    L_0x0234:
        r2 = (defpackage.audz) r2;
        r3 = r0.t;
        if (r3 == 0) goto L_0x02dc;
    L_0x023a:
        r3 = r0.u;
        if (r3 == 0) goto L_0x02dc;
    L_0x023e:
        r4 = r0.s;
        if (r4 == 0) goto L_0x02dc;
    L_0x0242:
        r4 = r2.a;
        r4 = r4 & 2;
        if (r4 == 0) goto L_0x024f;
    L_0x0248:
        r4 = r2.c;
        if (r4 != 0) goto L_0x0250;
    L_0x024c:
        r4 = defpackage.arml.f;
        goto L_0x0250;
    L_0x024f:
        r4 = r12;
    L_0x0250:
        r4 = defpackage.ajqy.a(r4);
        r3.setText(r4);
        r3 = r0.u;
        r4 = r9.o;
        r3.setTextColor(r4);
        r3 = r2.a;
        r3 = r3 & r13;
        if (r3 != 0) goto L_0x0264;
    L_0x0263:
        goto L_0x02a1;
    L_0x0264:
        r3 = r0.m;
        r2 = r2.b;
        if (r2 != 0) goto L_0x026c;
    L_0x026a:
        r2 = defpackage.arwf.c;
    L_0x026c:
        r2 = r2.b;
        r2 = defpackage.arwh.a(r2);
        if (r2 != 0) goto L_0x0276;
    L_0x0274:
        r2 = defpackage.arwh.UNKNOWN;
    L_0x0276:
        r2 = r3.a(r2);
        if (r2 == 0) goto L_0x02a1;
    L_0x027c:
        r3 = r0.c;
        r2 = defpackage.ra.a(r3, r2);
        r2 = r2.getConstantState();
        r2 = r2.newDrawable();
        r2 = r2.mutate();
        r3 = r0.u;
        r4 = r9.o;
        r3.setTextColor(r4);
        r3 = r9.o;
        r4 = android.graphics.PorterDuff.Mode.SRC_IN;
        r2.setColorFilter(r3, r4);
        r3 = r0.u;
        r3.setCompoundDrawablesWithIntrinsicBounds(r2, r12, r12, r12);
    L_0x02a1:
        r2 = r9.o;
        r3 = r0.s;
        r4 = -536870912; // 0xffffffffe0000000 float:-3.6893488E19 double:NaN;
        r2 = r2 | r4;
        r3.setBackgroundColor(r2);
        r2 = r0.s;
        r3 = r0.g;
        r3 = r3.getVisibility();
        if (r3 != 0) goto L_0x02b7;
    L_0x02b5:
        r3 = 0;
        goto L_0x02b9;
    L_0x02b7:
        r3 = 8;
    L_0x02b9:
        r2.setVisibility(r3);
        r2 = r0.t;
        r2.setVisibility(r10);
        r2 = r0.g;
        r2 = r2.getVisibility();
        if (r2 != r14) goto L_0x02dc;
    L_0x02c9:
        r2 = r0.t;
        r2 = r2.getLayoutParams();
        r2 = (android.widget.LinearLayout.LayoutParams) r2;
        r2.setMargins(r10, r10, r10, r10);
        goto L_0x02dc;
    L_0x02d5:
        r2 = r0.t;
        if (r2 == 0) goto L_0x02dc;
    L_0x02d9:
        r2.setVisibility(r14);
    L_0x02dc:
        r1 = r1.a(r11);
        r2 = r1 instanceof defpackage.apxu;
        if (r2 == 0) goto L_0x030d;
    L_0x02e4:
        r1 = (defpackage.apxu) r1;
        r2 = com.google.protos.youtube.api.innertube.LiveChatAction.MarkChatItemAsDeletedAction.markChatItemAsDeletedAction;
        r2 = defpackage.anxl.checkIsLite(r2);
        r1.a(r2);
        r3 = r1.h;
        r2 = r2.d;
        r2 = r3.a(r2);
        if (r2 != 0) goto L_0x0313;
    L_0x02f9:
        r2 = com.google.protos.youtube.api.innertube.LiveChatAction.MarkChatItemsByAuthorAsDeletedAction.markChatItemsByAuthorAsDeletedAction;
        r2 = defpackage.anxl.checkIsLite(r2);
        r1.a(r2);
        r1 = r1.h;
        r2 = r2.d;
        r1 = r1.a(r2);
        if (r1 == 0) goto L_0x030d;
    L_0x030c:
        goto L_0x0313;
    L_0x030d:
        r12 = r9.i;
        if (r12 != 0) goto L_0x0313;
    L_0x0311:
        r12 = defpackage.aygk.f;
    L_0x0313:
        if (r12 != 0) goto L_0x031b;
    L_0x0315:
        r1 = r0.d;
        r1.setVisibility(r14);
        goto L_0x0325;
    L_0x031b:
        r1 = r0.d;
        r1.setVisibility(r10);
        r1 = r0.n;
        r1.a(r12);
    L_0x0325:
        r1 = r0.g;
        r1 = r1.getVisibility();
        if (r1 == 0) goto L_0x0357;
    L_0x032d:
        r1 = r0.t;
        if (r1 == 0) goto L_0x0338;
    L_0x0331:
        r1 = r1.getVisibility();
        if (r1 != 0) goto L_0x0338;
    L_0x0337:
        goto L_0x0357;
    L_0x0338:
        r1 = r0.p;
        r2 = r15.e();
        r1.setBackgroundResource(r2);
        r1 = r0.p;
        r1 = r1.getBackground();
        r1 = (android.graphics.drawable.GradientDrawable) r1;
        if (r1 != 0) goto L_0x034c;
    L_0x034b:
        goto L_0x0351;
    L_0x034c:
        r2 = r9.n;
        r1.setColor(r2);
    L_0x0351:
        r1 = r0.q;
        r1.setVisibility(r14);
        goto L_0x0385;
    L_0x0357:
        r1 = r0.p;
        r2 = r15.d();
        r1.setBackgroundResource(r2);
        r1 = r0.p;
        r1 = r1.getBackground();
        r1 = (android.graphics.drawable.GradientDrawable) r1;
        if (r1 != 0) goto L_0x036b;
    L_0x036a:
        goto L_0x0370;
    L_0x036b:
        r2 = r9.l;
        r1.setColor(r2);
    L_0x0370:
        r1 = r0.q;
        r1.setVisibility(r10);
        r1 = r0.q;
        r1 = r1.getBackground();
        r1 = (android.graphics.drawable.GradientDrawable) r1;
        if (r1 != 0) goto L_0x0380;
    L_0x037f:
        goto L_0x0385;
    L_0x0380:
        r2 = r9.n;
        r1.setColor(r2);
    L_0x0385:
        r1 = new acvs;
        r2 = defpackage.acwc.PDG_LIVE_CHAT_PAID_MESSAGE;
        r1.<init>(r2);
        r2 = r0.b;
        r2.a(r1);
        r15.f();
        r2 = r9.a;
        r3 = 262144; // 0x40000 float:3.67342E-40 double:1.295163E-318;
        r2 = r2 & r3;
        if (r2 != 0) goto L_0x039c;
    L_0x039b:
        goto L_0x03aa;
    L_0x039c:
        r2 = r0.a;
        if (r2 == 0) goto L_0x03aa;
    L_0x03a0:
        r2 = r0.o;
        r3 = new abtp;
        r3.<init>(r15, r9, r1);
        r2.setOnClickListener(r3);
    L_0x03aa:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abtm.a_(akor, aued):void");
    }

    public void a(akpb akpb) {
        this.i.a();
        this.n.b();
        this.v = false;
        LinearLayout linearLayout = this.t;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        this.o.setOnClickListener(null);
    }
}
