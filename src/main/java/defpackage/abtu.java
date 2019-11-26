package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: abtu */
public abstract class abtu implements abxw, akot, OnClickListener {
    public final Context a;
    public final View b;
    public final ImageView c;
    public final TextView d;
    public final ClipDrawable e;
    public boolean f;
    public long g;
    public long h;
    private final GradientDrawable i;
    private final GradientDrawable j;
    private final acvx k;
    private final aaas l;
    private apxu m;
    private apxu n;
    private final Runnable o = new abtx(this);

    public abtu(Context context, acwa acwa, aaas aaas) {
        this.a = context;
        this.l = aaas;
        this.k = acwa.t();
        this.b = LayoutInflater.from(context).inflate(R.layout.live_chat_ticker_item, null);
        this.c = (ImageView) this.b.findViewById(R.id.avatar);
        this.d = (TextView) this.b.findViewById(R.id.associated_text);
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.live_chat_ticker_item_margin);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.live_chat_ticker_item_bottom_margin);
        MarginLayoutParams marginLayoutParams = new MarginLayoutParams(-2, -2);
        marginLayoutParams.setMarginStart(dimensionPixelOffset);
        marginLayoutParams.setMarginEnd(dimensionPixelOffset);
        marginLayoutParams.topMargin = dimensionPixelOffset;
        marginLayoutParams.bottomMargin = dimensionPixelOffset2;
        this.b.setLayoutParams(marginLayoutParams);
        this.i = (GradientDrawable) ra.a(context, (int) R.drawable.live_chat_ticker_item);
        this.j = (GradientDrawable) ra.a(context, (int) R.drawable.live_chat_ticker_item);
        this.e = new ClipDrawable(this.j, 8388611, 1);
        this.b.setBackground(new LayerDrawable(new Drawable[]{this.i, this.e}));
        this.b.setOnClickListener(this);
    }

    public abstract long a(Object obj);

    public abstract void a(aygk aygk);

    public abstract long b(Object obj);

    public abstract int c(Object obj);

    public abstract int d(Object obj);

    public abstract acvs e();

    public abstract apxu e(Object obj);

    public abstract Spanned f(Object obj);

    /* Access modifiers changed, original: protected */
    public boolean f() {
        return false;
    }

    public abstract int g(Object obj);

    public abstract aygk h(Object obj);

    public View K_() {
        return this.b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x00a5  */
    /* JADX WARNING: Missing block: B:5:0x0048, code skipped:
            if (r0.h.a(r2.d) == false) goto L_0x0053;
     */
    public void a_(defpackage.akor r7, java.lang.Object r8) {
        /*
        r6 = this;
        r0 = "ticker_applied_action";
        r0 = r7.a(r0);
        r0 = (defpackage.apxu) r0;
        r6.n = r0;
        r0 = r6.d;
        r1 = r6.f(r8);
        r0.setText(r1);
        r0 = r6.d;
        r1 = r6.g(r8);
        r0.setTextColor(r1);
        r0 = r6.n;
        r1 = 0;
        if (r0 == 0) goto L_0x0053;
    L_0x0021:
        r2 = com.google.protos.youtube.api.innertube.LiveChatAction.MarkChatItemAsDeletedAction.markChatItemAsDeletedAction;
        r2 = defpackage.anxl.checkIsLite(r2);
        r0.a(r2);
        r0 = r0.h;
        r2 = r2.d;
        r0 = r0.a(r2);
        if (r0 == 0) goto L_0x0035;
    L_0x0034:
        goto L_0x004b;
    L_0x0035:
        r0 = r6.n;
        r2 = com.google.protos.youtube.api.innertube.LiveChatAction.MarkChatItemsByAuthorAsDeletedAction.markChatItemsByAuthorAsDeletedAction;
        r2 = defpackage.anxl.checkIsLite(r2);
        r0.a(r2);
        r0 = r0.h;
        r2 = r2.d;
        r0 = r0.a(r2);
        if (r0 != 0) goto L_0x004b;
    L_0x004a:
        goto L_0x0053;
    L_0x004b:
        r0 = r6.c;
        r2 = 8;
        r0.setVisibility(r2);
        goto L_0x005f;
    L_0x0053:
        r0 = r6.c;
        r0.setVisibility(r1);
        r0 = r6.h(r8);
        r6.a(r0);
    L_0x005f:
        r2 = r6.a(r8);
        r6.g = r2;
        r0 = "ticker_start_timestamp_ms";
        r7 = r7.a(r0);
        r7 = (java.lang.Long) r7;
        r2 = r7.longValue();
        r4 = r6.b(r8);
        r2 = r2 + r4;
        r6.h = r2;
        r7 = r6.i;
        r0 = r6.d(r8);
        r7.setColor(r0);
        r7 = r6.j;
        r0 = r6.c(r8);
        r7.setColor(r0);
        r7 = r6.e(r8);
        r6.m = r7;
        r7 = r6.b;
        r8 = r6.l;
        if (r8 == 0) goto L_0x009c;
    L_0x0096:
        r8 = r6.m;
        if (r8 != 0) goto L_0x009b;
    L_0x009a:
        goto L_0x009c;
    L_0x009b:
        r1 = 1;
    L_0x009c:
        r7.setClickable(r1);
        r7 = r6.e();
        if (r7 == 0) goto L_0x00aa;
    L_0x00a5:
        r8 = r6.k;
        r8.a(r7);
    L_0x00aa:
        r6.ah_();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abtu.a_(akor, java.lang.Object):void");
    }

    public void a(akpb akpb) {
        ak_();
        this.d.setText("");
        this.e.setLevel(10000);
        this.g = 0;
        this.h = 0;
        this.m = null;
        this.n = null;
    }

    public final void ah_() {
        this.f = true;
        this.b.post(this.o);
    }

    public final void ai_() {
        this.f = true;
        this.b.post(this.o);
    }

    public final void aj_() {
        this.f = false;
        this.b.removeCallbacks(this.o);
    }

    public final void ak_() {
        this.f = false;
        this.b.removeCallbacks(this.o);
    }

    public final void onClick(View view) {
        if (this.m != null) {
            Map hashMap = new HashMap();
            hashMap.put("ticker_applied_action", this.n);
            hashMap.put("live_chat_ticker_view", this.b);
            if (f()) {
                hashMap.put("is_fullscreen", Boolean.valueOf(true));
            }
            acxf e = e();
            if (e != null) {
                this.k.a(3, e, null);
            }
            this.l.a(this.m, hashMap);
        }
    }
}
