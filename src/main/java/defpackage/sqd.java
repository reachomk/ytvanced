package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: sqd */
final class sqd {
    private static final Map a = Collections.synchronizedMap(new HashMap());

    static void a(cmg cmg, bdhu bdhu, swf swf, syl syl, sxd sxd, cri cri, cri cri2, cri cri3, cri cri4) {
        cri.a = new AtomicReference(bdhu.b);
        cri2.a = new AtomicReference(bdhu.d);
        cri3.a = new AtomicReference(sqd.a(cmg, bdhu.b, swf, syl, sxd));
        cri4.a = new AtomicReference(sqd.a(cmg, bdhu.d, swf, syl, sxd));
    }

    static cma a(cmg cmg, bdhu bdhu, swf swf, syl syl, sxd sxd, AtomicReference atomicReference, AtomicReference atomicReference2, AtomicReference atomicReference3, AtomicReference atomicReference4) {
        CharSequence charSequence;
        CharSequence charSequence2;
        if (Objects.equals(atomicReference.get(), bdhu.b)) {
            charSequence = (CharSequence) atomicReference3.get();
        } else {
            atomicReference.set(bdhu.b);
            charSequence = sqd.a(cmg, bdhu.b, swf, syl, sxd);
            atomicReference3.set(charSequence);
        }
        if (Objects.equals(atomicReference2.get(), bdhu.d)) {
            charSequence2 = (CharSequence) atomicReference4.get();
        } else {
            atomicReference2.set(bdhu.d);
            charSequence2 = sqd.a(cmg, bdhu.d, swf, syl, sxd);
            atomicReference4.set(charSequence2);
        }
        dcn a = dco.a(cmg);
        a.c(charSequence);
        a.b();
        int i = bdhu.c;
        if (i > 0) {
            a.c(i);
        }
        bdgf bdgf = bdhu.b;
        if (bdgf != null) {
            i = bdgf.c;
            if (i == 1) {
                a.d(5);
            } else if (i == 2) {
                a.d(6);
            } else if (i != 3) {
                a.d(3);
            } else {
                a.d(7);
            }
            float f = bdgf.b;
            if (f != 0.0f) {
                a.u(f);
            }
            a.b(bdgf.g);
            if (bdgf.d == 1) {
                a.a();
            }
            i = bdgf.d;
            if (i == 3) {
                a.a(TruncateAt.START);
            } else if (i != 5) {
                a.a(TruncateAt.END);
            } else {
                a.a(TruncateAt.MIDDLE);
            }
            bdge[] bdgeArr = bdgf.e;
            if (!(bdgeArr == null || bdgeArr.length == 0)) {
                a.a.a = true;
            }
        }
        if (!TextUtils.isEmpty(charSequence2)) {
            a.b(charSequence2);
        }
        return (dco) a.c();
    }

    static CharSequence a(cmg cmg, bdgf bdgf, swf swf, syl syl, sxd sxd) {
        if (bdgf == null) {
            return "";
        }
        Context context = cmg.b;
        if (bdgf.f.length == 0 && bdgf.e.length == 0) {
            return !TextUtils.isEmpty(bdgf.a) ? bdgf.a : "";
        }
        int i;
        SpannableString valueOf = SpannableString.valueOf(bdgf.a);
        for (bdge bdge : bdgf.e) {
            if (bdge.d != null || bdge.e != null) {
                sqd.a(valueOf, new sqf(bdge, swf), bdge.b, bdge.c);
            }
        }
        int i2 = 0;
        while (true) {
            bdgh[] bdghArr = bdgf.f;
            if (i2 >= bdghArr.length) {
                return valueOf;
            }
            bdgh bdgh = bdghArr[i2];
            i = bdgh.f;
            if (i != 0) {
                sqd.a(valueOf, new ForegroundColorSpan(i), bdgh.b, bdgh.c);
            }
            float f = bdgh.e;
            if (f != 0.0f) {
                sqd.a(valueOf, new AbsoluteSizeSpan(Math.round(f * context.getResources().getDisplayMetrics().scaledDensity), false), bdgh.b, bdgh.c);
            }
            String str = bdgh.d;
            if (str != null) {
                FutureTask futureTask;
                Typeface typeface;
                synchronized (a) {
                    futureTask = (FutureTask) a.get(str);
                    if (futureTask == null) {
                        futureTask = new FutureTask(new sqg(syl, context, str));
                        a.put(str, futureTask);
                    }
                }
                futureTask.run();
                try {
                    typeface = (Typeface) futureTask.get();
                } catch (InterruptedException | ExecutionException e) {
                    String str2 = " Font fetching future task failed";
                    if (str.length() == 0) {
                        str = new String(str2);
                    } else {
                        str = str2.concat(str);
                    }
                    sxd.a(3, str, e);
                    typeface = null;
                }
                if (typeface != null) {
                    sqd.a(valueOf, new sqi(bdgh.d, typeface), bdgh.b, bdgh.c);
                }
            }
            i = bdgh.g;
            if (i == 2 || i == 3) {
                sqd.a(valueOf, new UnderlineSpan(), bdgh.b, bdgh.c);
            }
            i2++;
        }
        while (true) {
        }
    }

    private static void a(SpannableString spannableString, Object obj, int i, int i2) {
        i = i >= 0 ? Math.min(i, spannableString.length()) : 0;
        if (i2 > 0) {
            i2 = Math.min(i2 + i, spannableString.length());
        } else {
            i2 = spannableString.length();
        }
        if (i != i2) {
            spannableString.setSpan(obj, i, i2, 18);
        }
    }
}
