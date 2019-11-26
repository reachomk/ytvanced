package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.concurrent.TimeUnit;

/* renamed from: idx */
public final class idx extends aito implements ajan, xcp {
    private static final long c = TimeUnit.SECONDS.toMillis(1);
    public final Context a;
    public final bdfu b = new bdfu();
    private final zyw d;
    private AnimatorSet e;
    private Spanned f;
    private TextView g;

    private static ObjectAnimator a(TextView textView, float f) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, "alpha", new float[]{f});
        ofFloat.setInterpolator(new eyv());
        ofFloat.setDuration(300);
        return ofFloat;
    }

    public final long e() {
        return 1;
    }

    private static boolean a(Spanned spanned) {
        return TextUtils.isEmpty(spanned) ^ 1;
    }

    public idx(Context context, zyw zyw) {
        super(context);
        this.a = context;
        this.d = zyw;
    }

    /* Access modifiers changed, original: protected|final */
    public final aitx b(Context context) {
        aitx b = super.b(context);
        b.a = 0;
        b.b = 0;
        return b;
    }

    private final void b(Spanned spanned) {
        if (!TextUtils.equals(this.f, spanned)) {
            this.f = spanned;
            m();
        }
        if (idx.a(this.f)) {
            af_();
        } else {
            ag_();
        }
    }

    public final boolean f() {
        AnimatorSet animatorSet = this.e;
        if (animatorSet == null || animatorSet.isRunning() || !c()) {
            return false;
        }
        this.e.start();
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x004a  */
    public final void a(defpackage.ahkn r3) {
        /*
        r2 = this;
        r0 = 0;
        if (r3 != 0) goto L_0x0004;
    L_0x0003:
        goto L_0x005e;
    L_0x0004:
        r1 = r3.a;
        if (r1 == 0) goto L_0x005e;
    L_0x0008:
        r1 = r1.a();
        if (r1 != 0) goto L_0x005e;
    L_0x000e:
        r3 = r3.b;
        if (r3 == 0) goto L_0x0015;
    L_0x0012:
        r3 = r3.a;
        goto L_0x0016;
    L_0x0015:
        r3 = r0;
    L_0x0016:
        if (r3 == 0) goto L_0x002a;
    L_0x0018:
        r3 = r3.x;
        if (r3 != 0) goto L_0x001d;
    L_0x001c:
        goto L_0x002a;
    L_0x001d:
        r1 = r3.a;
        r1 = r1 & 1;
        if (r1 == 0) goto L_0x002a;
    L_0x0023:
        r3 = r3.b;
        if (r3 != 0) goto L_0x002b;
    L_0x0027:
        r3 = defpackage.awdk.h;
        goto L_0x002b;
    L_0x002a:
        r3 = r0;
    L_0x002b:
        if (r3 == 0) goto L_0x0047;
    L_0x002d:
        r1 = r3.e;
        if (r1 != 0) goto L_0x0033;
    L_0x0031:
        r1 = defpackage.awdo.c;
    L_0x0033:
        r1 = r1.a;
        r1 = r1 & 1;
        if (r1 != 0) goto L_0x003a;
    L_0x0039:
        goto L_0x0047;
    L_0x003a:
        r3 = r3.e;
        if (r3 != 0) goto L_0x0040;
    L_0x003e:
        r3 = defpackage.awdo.c;
    L_0x0040:
        r3 = r3.b;
        if (r3 != 0) goto L_0x0048;
    L_0x0044:
        r3 = defpackage.awdm.c;
        goto L_0x0048;
    L_0x0047:
        r3 = r0;
    L_0x0048:
        if (r3 == 0) goto L_0x005a;
    L_0x004a:
        r1 = r3.a;
        r1 = r1 & 1;
        if (r1 == 0) goto L_0x0056;
    L_0x0050:
        r0 = r3.b;
        if (r0 != 0) goto L_0x0056;
    L_0x0054:
        r0 = defpackage.arml.f;
    L_0x0056:
        r0 = defpackage.ajqy.a(r0);
    L_0x005a:
        r2.b(r0);
        return;
    L_0x005e:
        r2.b(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.idx.a(ahkn):void");
    }

    public final View a(Context context) {
        FrameLayout frameLayout = (FrameLayout) View.inflate(context, R.layout.no_sound_overlay, null);
        this.g = (TextView) frameLayout.findViewById(R.id.message_view);
        TextView textView = this.g;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(idx.a(textView, 0.0f)).after(c).after(idx.a(textView, 1.0f));
        this.e = animatorSet;
        return frameLayout;
    }

    public final void a(Context context, View view) {
        this.g.setText(this.f);
        f();
    }

    public final boolean c() {
        return idx.a(this.f);
    }

    public final LayoutParams b() {
        return new LayoutParams(-1, -1);
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.Q().a.f().a(emg.a(this.d, 4096, 1)).a(new iea(this), idz.a)};
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahkn.class};
        } else if (i == 0) {
            a((ahkn) obj);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
