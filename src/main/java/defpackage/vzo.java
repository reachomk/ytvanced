package defpackage;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.Locale;

/* renamed from: vzo */
public final class vzo extends vzq {
    public final aac a = new aac();
    public CharSequence b;
    public aokm c = null;
    private final float g;
    private int h;

    public vzo(TextView textView, CharSequence charSequence, int i, float f, Drawable drawable, float f2) {
        super(textView, drawable, f2);
        this.b = charSequence;
        this.h = i;
        this.g = f;
    }

    public final void a(int i) {
        this.h = i;
        a(null);
    }

    public final void a(aokm aokm) {
        this.c = aokm;
        aohb aohb = null;
        if (!(aokm == null || (aokm.a & 2) == 0)) {
            aokq aokq = aokm.c;
            if (aokq == null) {
                aokq = aokq.d;
            }
            aohb = aokq.c;
            if (aohb == null) {
                aohb = aohb.e;
            }
        }
        this.e = aohb;
    }

    public final void b() {
        int i;
        aokq aokq;
        aoko aoko;
        aogz aogz;
        super.b();
        aokm aokm = this.c;
        CharSequence charSequence = aokm != null ? aokm.b : null;
        int i2 = 1;
        Object obj = (aokm == null || aokm.d) ? 1 : null;
        if (charSequence == null || TextUtils.isEmpty(charSequence)) {
            a(this.b);
        } else {
            if (obj != null) {
                i = this.a.b;
                Object[] objArr = new Object[(i + i)];
                int i3 = 0;
                while (true) {
                    aac aac = this.a;
                    if (i3 >= aac.b) {
                        break;
                    }
                    int i4 = i3 + i3;
                    objArr[i4] = aac.b(i3);
                    objArr[i4 + 1] = this.a.c(i3);
                    i3++;
                }
                charSequence = bn.a(Locale.getDefault(), (String) charSequence, objArr);
            }
            a(charSequence);
        }
        aokm = this.c;
        if (aokm == null || (aokm.a & 2) == 0) {
            aokq = null;
        } else {
            aokq = aokm.c;
            if (aokq == null) {
                aokq = aokq.d;
            }
        }
        if (aokq != null) {
            aoko = aokq.b;
            if (aoko == null) {
                aoko = aoko.d;
            }
        } else {
            aoko = null;
        }
        if (aoko != null) {
            aogz = aoko.c;
            if (aogz == null) {
                aogz = aogz.c;
            }
        } else {
            aogz = null;
        }
        a(aogz);
        if (aoko != null) {
            i = aokp.a(aoko.b);
            if (i != 0) {
                i2 = i;
            }
        }
        i = i2 - 1;
        if (i2 != 0) {
            switch (i) {
                case 1:
                    i = R.dimen.condor_ad_font_size_extra_extra_small;
                    break;
                case 2:
                    return;
                case 3:
                    i = R.dimen.condor_ad_font_size_small;
                    break;
                case 4:
                    i = R.dimen.condor_ad_font_size_medium;
                    break;
                case 5:
                    i = R.dimen.condor_ad_font_size_large;
                    break;
                case 6:
                    i = R.dimen.condor_ad_font_size_extra_large;
                    break;
                case 7:
                    i = R.dimen.condor_ad_font_size_extra_extra_large;
                    break;
                default:
                    ((TextView) this.d).setTextSize(0, this.g);
                    return;
            }
            TextView textView = (TextView) this.d;
            textView.setTextSize(0, (float) textView.getContext().getResources().getDimensionPixelSize(i));
            return;
        }
        throw null;
    }

    private final void a(CharSequence charSequence) {
        amqw.a((Object) charSequence);
        if (!amqq.a(charSequence, ((TextView) this.d).getText())) {
            ((TextView) this.d).setText(charSequence);
        }
    }

    private final void a(aogz aogz) {
        int i;
        if (aogz != null) {
            i = aogz.b;
        } else {
            i = this.h;
        }
        if (i != ((TextView) this.d).getCurrentTextColor()) {
            ((TextView) this.d).setTextColor(i);
        }
    }
}
