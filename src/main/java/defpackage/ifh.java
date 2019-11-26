package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.concurrent.TimeUnit;

/* renamed from: ifh */
public final class ifh extends aito implements exw, xcp {
    private static final long e = TimeUnit.SECONDS.toMillis(4);
    public final bcaa a;
    public final Runnable b = new ifk(this);
    public FrameLayout c;
    private boolean d = false;
    private TextView f;
    private View g;
    private View h;
    private View i;
    private ahkm j;
    private ahkn k;

    public ifh(Context context, bcaa bcaa, exu exu) {
        super(context);
        this.a = (bcaa) amqw.a((Object) bcaa);
        exu.a((exw) this);
    }

    public final LayoutParams b() {
        return new LayoutParams(-1, -1);
    }

    public final View a(Context context) {
        this.c = (FrameLayout) View.inflate(context, R.layout.watch_in_vr_overlay, null);
        this.f = (TextView) this.c.findViewById(R.id.message_view);
        this.g = this.c.findViewById(R.id.watch_in_vr_chip);
        ifj ifj = new ifj(this);
        this.f.setOnClickListener(ifj);
        this.h = this.c.findViewById(R.id.close_button);
        this.h.setOnClickListener(new ifm(this));
        this.i = this.c.findViewById(R.id.cardboard_button);
        this.i.setOnClickListener(ifj);
        return this.c;
    }

    public final void a(Context context, View view) {
        if (c(1)) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.g.getLayoutParams();
            marginLayoutParams.bottomMargin = context.getResources().getDimensionPixelOffset(R.dimen.watch_in_vr_overlay_margin_bottom);
            this.g.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0047  */
    public final boolean c() {
        /*
        r6 = this;
        r0 = r6.k;
        r1 = 0;
        if (r0 == 0) goto L_0x006b;
    L_0x0005:
        r0 = r6.e();
        if (r0 == 0) goto L_0x006b;
    L_0x000b:
        r0 = r6.k;
        r0 = r0.b;
        r2 = 1;
        if (r0 == 0) goto L_0x0035;
    L_0x0012:
        r3 = r0.n();
        r3 = r3.aA();
        if (r3 == 0) goto L_0x0035;
    L_0x001c:
        r3 = r0.n();
        r3 = r3.c;
        r4 = r3.b;
        r4 = r4 & 4;
        if (r4 == 0) goto L_0x0035;
    L_0x0028:
        r3 = r3.v;
        if (r3 != 0) goto L_0x002e;
    L_0x002c:
        r3 = defpackage.azfe.k;
    L_0x002e:
        r3 = r3.h;
        if (r3 != 0) goto L_0x0033;
    L_0x0032:
        goto L_0x0035;
    L_0x0033:
        r3 = 1;
        goto L_0x0036;
    L_0x0035:
        r3 = 0;
    L_0x0036:
        r4 = r6.k;
        r4 = r4.a;
        r4 = r4.b();
        r5 = r6.d;
        if (r5 == 0) goto L_0x006b;
    L_0x0042:
        if (r4 != 0) goto L_0x006b;
    L_0x0044:
        r4 = 0;
        if (r0 == 0) goto L_0x004c;
    L_0x0047:
        r0 = r0.c;
        if (r0 == 0) goto L_0x004c;
    L_0x004b:
        r4 = r0;
    L_0x004c:
        if (r4 == 0) goto L_0x0057;
    L_0x004e:
        r0 = r4.p();
        if (r0 != 0) goto L_0x0055;
    L_0x0054:
        goto L_0x0057;
    L_0x0055:
        r0 = 1;
        goto L_0x0058;
    L_0x0057:
        r0 = 0;
    L_0x0058:
        if (r4 == 0) goto L_0x0063;
    L_0x005a:
        r4 = r4.q();
        if (r4 != 0) goto L_0x0061;
    L_0x0060:
        goto L_0x0063;
    L_0x0061:
        r4 = 1;
        goto L_0x0064;
    L_0x0063:
        r4 = 0;
    L_0x0064:
        if (r3 == 0) goto L_0x006b;
    L_0x0066:
        if (r0 != 0) goto L_0x006a;
    L_0x0068:
        if (r4 == 0) goto L_0x006b;
    L_0x006a:
        return r2;
    L_0x006b:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ifh.c():boolean");
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(int i) {
        if (i == 2) {
            this.c.postOnAnimationDelayed(this.b, e);
        }
    }

    private final boolean e() {
        ahkm ahkm = this.j;
        return ahkm != null && ahkm.a <= 3000;
    }

    public final void a(Configuration configuration) {
        b(1);
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{ahkn.class, ahkm.class};
        } else if (i == 0) {
            ahkn ahkn = (ahkn) obj;
            if (ahkn != null) {
                airi airi = ahkn.a;
                if (airi != null && airi == airi.VIDEO_PLAYING && e()) {
                    this.k = ahkn;
                    this.d = ((ahxc) this.a.get()).b();
                    af_();
                    m();
                    return null;
                }
            }
        } else if (i == 1) {
            this.j = (ahkm) obj;
            m();
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }
}
