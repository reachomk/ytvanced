package defpackage;

import android.text.TextUtils;

/* renamed from: akcs */
public final class akcs {
    public static CharSequence a(aqhy aqhy, aaas aaas) {
        CharSequence[] charSequenceArr;
        int i;
        if (aqhy.e.size() != 0) {
            charSequenceArr = new CharSequence[aqhy.e.size()];
            for (i = 0; i < aqhy.e.size(); i++) {
                charSequenceArr[i] = aabb.a((arml) aqhy.e.get(i), aaas, false);
            }
        } else {
            charSequenceArr = null;
        }
        if (charSequenceArr == null) {
            return null;
        }
        r9 = new CharSequence[2];
        String str = "line.separator";
        r9[0] = System.getProperty(str);
        r9[1] = System.getProperty(str);
        CharSequence concat = TextUtils.concat(r9);
        CharSequence charSequence = null;
        for (CharSequence charSequence2 : charSequenceArr) {
            if (charSequence != null) {
                charSequence = TextUtils.concat(new CharSequence[]{charSequence, concat, charSequence2});
            } else {
                charSequence = charSequence2;
            }
        }
        return charSequence;
    }

    public static aphg a(aqhy aqhy) {
        if ((aqhy.a & 32) == 0) {
            return null;
        }
        aphj aphj = aqhy.f;
        if (aphj == null) {
            aphj = aphj.d;
        }
        aphg aphg = aphj.b;
        if (aphg == null) {
            aphg = aphg.s;
        }
        return aphg;
    }

    public static aphg b(aqhy aqhy) {
        if ((aqhy.a & 64) == 0) {
            return null;
        }
        aphj aphj = aqhy.g;
        if (aphj == null) {
            aphj = aphj.d;
        }
        aphg aphg = aphj.b;
        if (aphg == null) {
            aphg = aphg.s;
        }
        return aphg;
    }

    public static CharSequence c(aqhy aqhy) {
        aphg a = akcs.a(aqhy);
        arml arml;
        if (a != null) {
            arml = a.g;
            if (arml == null) {
                arml = arml.f;
            }
            return ajqy.a(arml);
        }
        if ((aqhy.a & 16384) != 0) {
            arml = aqhy.k;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        return ajqy.a(arml);
    }

    public static CharSequence d(aqhy aqhy) {
        aphg b = akcs.b(aqhy);
        arml arml;
        if (b != null) {
            arml = b.g;
            if (arml == null) {
                arml = arml.f;
            }
            return ajqy.a(arml);
        }
        if ((aqhy.a & 32768) != 0) {
            arml = aqhy.l;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        return ajqy.a(arml);
    }
}
