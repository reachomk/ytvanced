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

/* renamed from: spz */
final class spz {
    private static final Map a = Collections.synchronizedMap(new HashMap());

    static void a(cmg cmg, bapq bapq, swf swf, syl syl, sxd sxd, cri cri, cri cri2, cri cri3, cri cri4) {
        cri.a = new AtomicReference(bapq.a());
        cri2.a = new AtomicReference(bapq.c());
        cri3.a = new AtomicReference(spz.a(cmg, bapq.a(), swf, syl, sxd));
        cri4.a = new AtomicReference(spz.a(cmg, bapq.c(), swf, syl, sxd));
    }

    static cma a(cmg cmg, bapq bapq, swf swf, syl syl, sxd sxd, AtomicReference atomicReference, AtomicReference atomicReference2, AtomicReference atomicReference3, AtomicReference atomicReference4) {
        CharSequence charSequence;
        CharSequence charSequence2;
        if (Objects.equals(atomicReference.get(), bapq.a())) {
            charSequence = (CharSequence) atomicReference3.get();
        } else {
            atomicReference.set(bapq.a());
            charSequence = spz.a(cmg, bapq.a(), swf, syl, sxd);
            atomicReference3.set(charSequence);
        }
        if (Objects.equals(atomicReference2.get(), bapq.c())) {
            charSequence2 = (CharSequence) atomicReference4.get();
        } else {
            atomicReference2.set(bapq.c());
            charSequence2 = spz.a(cmg, bapq.c(), swf, syl, sxd);
            atomicReference4.set(charSequence2);
        }
        dcn a = dco.a(cmg);
        a.c(charSequence);
        a.b();
        if (bapq.b() > 0) {
            a.c((int) bapq.b());
        }
        if (bapq.a() != null) {
            baoh a2 = bapq.a();
            int c = a2.c();
            if (c == 1) {
                a.d(5);
            } else if (c == 2) {
                a.d(6);
            } else if (c != 3) {
                a.d(3);
            } else {
                a.d(7);
            }
            if (a2.b() != 0.0f) {
                a.u(a2.b());
            }
            a.b(a2.g());
            if (a2.d() == 1) {
                a.a();
            }
            int d = a2.d();
            if (d == 3) {
                a.a(TruncateAt.START);
            } else if (d != 5) {
                a.a(TruncateAt.END);
            } else {
                a.a(TruncateAt.MIDDLE);
            }
        }
        if (!TextUtils.isEmpty(charSequence2)) {
            a.b(charSequence2);
        }
        return (dco) a.c();
    }

    static CharSequence a(cmg cmg, baoh baoh, swf swf, syl syl, sxd sxd) {
        if (baoh == null || TextUtils.isEmpty(baoh.a())) {
            return "";
        }
        Context context = cmg.b;
        if (baoh.f() == 0 && baoh.e() == 0) {
            return baoh.a();
        }
        SpannableString valueOf = SpannableString.valueOf(baoh.a());
        for (int i = 0; i < baoh.e(); i++) {
            baop g = baoh.g(i);
            if (g.c() != null || g.d() != null) {
                spz.a(valueOf, new sqb(g, swf), (int) g.a(), (int) g.b());
            }
        }
        for (int i2 = 0; i2 < baoh.f(); i2++) {
            bapn h = baoh.h(i2);
            if (h.e() != 0) {
                spz.a(valueOf, new ForegroundColorSpan((int) h.e()), (int) h.a(), (int) h.b());
            }
            if (h.d() != 0.0f) {
                spz.a(valueOf, new AbsoluteSizeSpan(Math.round(h.d() * context.getResources().getDisplayMetrics().scaledDensity), false), (int) h.a(), (int) h.b());
            }
            if (h.c() != null) {
                FutureTask futureTask;
                Typeface typeface;
                String c = h.c();
                synchronized (a) {
                    futureTask = (FutureTask) a.get(c);
                    if (futureTask == null) {
                        futureTask = new FutureTask(new sqc(syl, context, c));
                        a.put(c, futureTask);
                    }
                }
                futureTask.run();
                try {
                    typeface = (Typeface) futureTask.get();
                } catch (InterruptedException | ExecutionException e) {
                    c = String.valueOf(c);
                    String str = " Font fetching future task failed";
                    if (c.length() == 0) {
                        c = new String(str);
                    } else {
                        c = str.concat(c);
                    }
                    sxd.a(3, c, e);
                    typeface = null;
                }
                if (typeface != null) {
                    spz.a(valueOf, new sqe(h.c(), typeface), (int) h.a(), (int) h.b());
                }
            }
            int f = h.f();
            if (f == 2 || f == 3) {
                spz.a(valueOf, new UnderlineSpan(), (int) h.a(), (int) h.b());
            }
        }
        return valueOf;
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
