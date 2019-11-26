package defpackage;

import android.content.Context;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.google.android.youtube.R;

/* renamed from: evj */
public final class evj {
    public static avur a(axwa axwa) {
        axwq axwq = axwa.v;
        if (axwq == null) {
            axwq = axwq.d;
        }
        if ((axwq.a & 1) == 0) {
            return null;
        }
        axwq axwq2 = axwa.v;
        if (axwq2 == null) {
            axwq2 = axwq.d;
        }
        avur avur = axwq2.b;
        if (avur == null) {
            avur = avur.h;
        }
        return avur;
    }

    public static axwd a(Context context, axwd axwd, CharSequence charSequence) {
        if (axwd == null) {
            return null;
        }
        axwd.copyOnWrite();
        axwa axwa = (axwa) axwd.instance;
        axwa.v = null;
        axwa.a &= -131073;
        return evj.b(context, axwd, charSequence);
    }

    public static axwd b(Context context, axwd axwd, CharSequence charSequence) {
        if (axwd == null || evj.a((axwa) ((anxl) axwd.build())) != null || TextUtils.isEmpty(charSequence)) {
            return axwd;
        }
        Spanned fromHtml = Html.fromHtml(context.getString(R.string.unsubscribe_confirmation, new Object[]{charSequence}));
        String string = context.getString(17039370);
        String string2 = context.getString(17039360);
        avuu avuu = (avuu) avur.h.createBuilder();
        arml a = ajqy.a(fromHtml.toString());
        avuu.copyOnWrite();
        avur avur = (avur) avuu.instance;
        if (a != null) {
            avur.c = a;
            avur.a |= 2;
            a = ajqy.a(string.toString());
            avuu.copyOnWrite();
            avur avur2 = (avur) avuu.instance;
            if (a != null) {
                avur2.f = a;
                avur2.a |= 16;
                arml a2 = ajqy.a(string2.toString());
                avuu.copyOnWrite();
                avur avur3 = (avur) avuu.instance;
                if (a2 != null) {
                    avur3.d = a2;
                    avur3.a |= 4;
                    avuu.copyOnWrite();
                    avur avur4 = (avur) avuu.instance;
                    avur4.a |= 8;
                    avur4.e = true;
                    avur4 = (avur) ((anxl) avuu.build());
                    axws axws = (axws) axwq.d.createBuilder();
                    axws.copyOnWrite();
                    axwq axwq = (axwq) axws.instance;
                    if (avur4 != null) {
                        axwq.b = avur4;
                        axwq.a |= 1;
                        axwd.copyOnWrite();
                        axwa axwa = (axwa) axwd.instance;
                        axwa.v = (axwq) ((anxl) axws.build());
                        axwa.a |= 131072;
                        return axwd;
                    }
                    throw new NullPointerException();
                }
                throw new NullPointerException();
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }
}
