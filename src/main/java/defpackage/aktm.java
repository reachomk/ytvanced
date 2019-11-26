package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import com.google.android.youtube.R;

/* renamed from: aktm */
class aktm implements aktf {
    public final Context a;
    public final akte b;
    public final boolean c;
    public final boolean d;
    private SpannableStringBuilder e;
    private final boolean f;
    private final akto g;
    private Object h = null;
    private int i;

    aktm(Context context, akte akte, boolean z, akto akto, boolean z2) {
        this.a = (Context) amqw.a((Object) context);
        this.b = (akte) amqw.a((Object) akte);
        this.c = z;
        this.g = (akto) amqw.a((Object) akto);
        this.f = z2;
        this.d = xrn.c(context);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(Object obj, int i, SpannableStringBuilder spannableStringBuilder) {
        this.h = obj;
        this.i = i;
        this.e = spannableStringBuilder;
    }

    public void a() {
        a(null, 0, null);
    }

    public static String a(aygk aygk) {
        if (!(aygk == null || (aygk.a & 4) == 0)) {
            aodx aodx = aygk.d;
            if (aodx == null) {
                aodx = aodx.c;
            }
            if ((aodx.a & 1) != 0) {
                aodx = aygk.d;
                if (aodx == null) {
                    aodx = aodx.c;
                }
                aodv aodv = aodx.b;
                if (aodv == null) {
                    aodv = aodv.c;
                }
                if ((aodv.a & 2) != 0) {
                    aodx aodx2 = aygk.d;
                    if (aodx2 == null) {
                        aodx2 = aodx.c;
                    }
                    aodv aodv2 = aodx2.b;
                    if (aodv2 == null) {
                        aodv2 = aodv.c;
                    }
                    return aodv2.b;
                }
            }
        }
        return "";
    }

    public void a(aktc aktc, Bitmap bitmap) {
        xak.a();
        if (aktc != null && bitmap != null) {
            Object obj = aktc.a;
            if (obj == null || obj.equals(this.h)) {
                int i = aktc.b;
                if (i != 0 && i == this.i) {
                    ImageSpan aktp;
                    if (this.c) {
                        aktp = new aktp(this.a, bitmap);
                        if (this.f) {
                            aktp.a = this.a.getResources().getDimensionPixelOffset(R.dimen.emoji_padding);
                        }
                    } else {
                        aktp = new ImageSpan(this.a, bitmap);
                    }
                    float f = aktc.e;
                    Rect bounds = aktp.getDrawable().getBounds();
                    bounds.right = bounds.left + ((int) ((((float) (bounds.right - bounds.left)) * f) / ((float) (bounds.bottom - bounds.top))));
                    bounds.bottom = bounds.top + ((int) f);
                    aktp.getDrawable().setBounds(bounds);
                    SpannableStringBuilder spannableStringBuilder = this.e;
                    if (spannableStringBuilder != null) {
                        spannableStringBuilder.setSpan(aktp, aktc.c, aktc.d, 33);
                    }
                    this.g.a(this.e, aktc.b);
                }
            }
        }
    }
}
