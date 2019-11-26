package defpackage;

import android.text.TextUtils;
import com.google.android.youtube.R;
import java.util.List;

/* renamed from: aduh */
final /* synthetic */ class aduh implements Runnable {
    private final adui a;
    private final adiy b;
    private final wxg c;

    aduh(adui adui, adiy adiy, wxg wxg) {
        this.a = adui;
        this.b = adiy;
        this.c = wxg;
    }

    public final void run() {
        adui adui = this.a;
        Object obj = this.b;
        wxg wxg = this.c;
        adio a = adui.f.a((adiy) obj);
        if (a == null) {
            wxg.a(obj, new Exception("Screen is null."));
            return;
        }
        String string;
        List a2 = adui.e.a();
        adin g = a.g();
        adio a3 = adlw.a(a2, a.br_());
        if (a3 == null) {
            if (TextUtils.isEmpty(a.bq_())) {
                int i = 1;
                while (true) {
                    string = adui.h.getString(R.string.screen_name, new Object[]{Integer.valueOf(i)});
                    if (adlw.a(a2, string) == null) {
                        break;
                    }
                    i++;
                }
            } else {
                String bq_ = a.bq_();
                string = bq_;
                int i2 = 2;
                while (adlw.a(a2, string) != null) {
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(bq_).length() + 12);
                    stringBuilder.append(bq_);
                    stringBuilder.append(" ");
                    stringBuilder.append(i2);
                    string = stringBuilder.toString();
                    i2++;
                }
            }
        } else {
            string = a3.bq_();
        }
        Object b = g.a(string).b();
        admh admh = adui.e;
        admh.b();
        admh.a.add(0, b);
        if (admh.a.size() > 5) {
            admh.a(((adio) admh.a.get(5)).br_());
        }
        admh.a(admh.a);
        wxg.a(obj, b);
    }
}
