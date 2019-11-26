package defpackage;

import android.os.Handler;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import com.google.android.libraries.quantum.snackbar.Snackbar;

/* renamed from: alpu */
public final class alpu {
    public static void a(xsc xsc, Snackbar snackbar, zye zye, long j, aaas aaas, Integer num) {
        CharSequence charSequence;
        avls avls = zye.a;
        arml arml = null;
        if (avls == null) {
            charSequence = null;
        } else {
            arml arml2 = avls.b;
            if (arml2 == null) {
                arml2 = arml.f;
            }
            charSequence = ajqy.a(arml2);
        }
        String obj;
        if (TextUtils.isEmpty(charSequence)) {
            arml arml3;
            avkh avkh = zye.b;
            if ((avkh.a & 1) != 0) {
                arml3 = avkh.b;
                if (arml3 == null) {
                    arml3 = arml.f;
                }
            } else {
                arml3 = null;
            }
            CharSequence a = ajqy.a(arml3);
            if (zye.b != null && !TextUtils.isEmpty(a)) {
                aphg aphg;
                aphj aphj = zye.b.c;
                if (aphj == null) {
                    aphj = aphj.d;
                }
                if ((aphj.a & 1) == 0) {
                    aphg = null;
                } else {
                    aphj = zye.b.c;
                    if (aphj == null) {
                        aphj = aphj.d;
                    }
                    aphg = aphj.b;
                    if (aphg == null) {
                        aphg = aphg.s;
                    }
                }
                if (aphg != null) {
                    if ((aphg.a & 128) != 0) {
                        arml = aphg.g;
                        if (arml == null) {
                            arml = arml.f;
                        }
                    }
                    obj = ajqy.a(arml).toString();
                    apxu apxu = aphg.n;
                    if (apxu == null) {
                        apxu = apxu.d;
                    }
                    snackbar.a(a, obj, alpu.a(zye, snackbar, aaas, apxu));
                } else {
                    snackbar.a(a);
                }
            } else {
                return;
            }
        }
        avls avls2 = zye.a;
        int i = avls2.a;
        if ((i & 4) != 0) {
            if ((i & 2) != 0) {
                arml = avls2.c;
                if (arml == null) {
                    arml = arml.f;
                }
            }
            obj = ajqy.a(arml).toString();
            apxu apxu2 = zye.a.d;
            if (apxu2 == null) {
                apxu2 = apxu.d;
            }
            snackbar.a(charSequence, obj, alpu.a(zye, snackbar, aaas, apxu2));
            if (num != null) {
                snackbar.a.setTextColor(num.intValue());
            }
        } else {
            snackbar.a(charSequence);
        }
        Handler handler = snackbar.getHandler();
        if (handler != null) {
            handler.removeCallbacksAndMessages(snackbar);
            snackbar.c();
            handler.postAtTime(new alpx(snackbar), snackbar, xsc.c() + j);
        }
    }

    private static OnClickListener a(zye zye, Snackbar snackbar, aaas aaas, apxu apxu) {
        return new alpw(zye, aaas, apxu, snackbar);
    }
}
