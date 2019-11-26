package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.text.style.ScaleXSpan;
import com.google.android.youtube.R;
import java.util.List;

/* renamed from: akth */
public final class akth extends aktm {
    private final akvp e;

    public akth(Context context, akvp akvp, akte akte, boolean z, akto akto, boolean z2) {
        super(context, akte, z, akto, z2);
        this.e = (akvp) amqw.a((Object) akvp);
    }

    public final boolean a(SpannableStringBuilder spannableStringBuilder, StringBuilder stringBuilder, List list, float f, Object obj, int i, boolean z) {
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        StringBuilder stringBuilder2 = stringBuilder;
        float f2 = f;
        a(obj, i, spannableStringBuilder2);
        if (list == null || list.size() <= 0) {
            return false;
        }
        float dimension = this.a.getResources().getDimension(R.dimen.badge_height);
        boolean z2 = false;
        for (aktg aktg : list) {
            if (z) {
                if (aktg.b != arwh.VERIFIED) {
                    if (aktg.b == arwh.OWNER) {
                    }
                }
            }
            String str = " ";
            if (f2 != 0.0f) {
                spannableStringBuilder2.append(str);
                if (f2 != 1.0f) {
                    spannableStringBuilder2.setSpan(new ScaleXSpan(f2), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                }
            }
            aygk aygk = aktg.a;
            if (aygk != null) {
                a(" ", aygk, dimension, obj, i, spannableStringBuilder, stringBuilder);
            } else if (aktg.b != arwh.UNKNOWN) {
                int a = this.e.a(aktg.b);
                if (a != 0) {
                    Object aktp;
                    Drawable mutate = ra.a(this.a, a).mutate();
                    mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
                    if (aktg.b == arwh.VERIFIED) {
                        st.a(mutate, xwe.a(this.a, R.attr.ytIconActiveOther));
                    }
                    if (this.c) {
                        aktp = new aktp(mutate);
                    } else {
                        aktp = new ImageSpan(mutate);
                    }
                    spannableStringBuilder2.append(str);
                    spannableStringBuilder2.setSpan(aktp, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                }
                if (!TextUtils.isEmpty(aktg.c)) {
                    a(aktg.c, stringBuilder2);
                    a(str, stringBuilder2);
                }
            }
            z2 = true;
        }
        return z2;
    }

    public final void a(String str, aygk aygk, float f, Object obj, int i, SpannableStringBuilder spannableStringBuilder, StringBuilder stringBuilder) {
        a(obj, i, spannableStringBuilder);
        aktc aktc = new aktc();
        aktc.a = obj;
        aktc.b = i;
        int length = spannableStringBuilder.length();
        aktc.c = length;
        aktc.d = length + str.length();
        aktc.e = f;
        spannableStringBuilder.append(str);
        a(aktm.a(aygk), stringBuilder);
        a(" ", stringBuilder);
        this.b.a(aktc, aygk, Math.round(f), this);
    }

    private final void a(String str, StringBuilder stringBuilder) {
        if (this.d && stringBuilder != null) {
            stringBuilder.append(str);
        }
    }

    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }
}
