package defpackage;

import android.text.TextUtils;

/* renamed from: lur */
abstract class lur implements luu {
    public final aygk a() {
        lqz b = b().b();
        return b != null ? b.c() : null;
    }

    public final void a(aygk aygk) {
        lqz b = b().b();
        if (b != null && aygk != null) {
            amqw.a((Object) aygk);
            if (!amqq.a(b.e, aygk)) {
                b.e = aygk;
                b.a(4);
            }
        }
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2) {
        lqz b = b().b();
        if (b == null) {
            return;
        }
        if (!TextUtils.equals(b.c, charSequence) || !TextUtils.equals(b.d, charSequence2)) {
            b.c = charSequence;
            b.d = charSequence2;
            b.a(2);
        }
    }

    public final void a(ahjc ahjc) {
        lqz b = b().b();
        if (b != null) {
            int i;
            if (!(ahjc == null || lqz.a(ahjc))) {
                i = ahjc.h;
                if (!(i == 1 || i == 4 || i == 2)) {
                    ahjc = null;
                }
            }
            int i2 = 0;
            if (b.f != ahjc) {
                b.f = ahjc;
                i = 32;
            } else {
                i = 0;
            }
            if (ahjc != null) {
                i2 = b.b(null);
            }
            b.a(i | i2);
        }
    }

    public void a(aafv aafv) {
        lqz b = b().b();
        if (b != null) {
            b.a(aafv);
        }
    }

    /* synthetic */ lur() {
    }
}
