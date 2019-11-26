package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.format.DateFormat;
import com.google.android.youtube.R;
import java.util.Locale;

/* renamed from: joc */
public final class joc {
    public static CharSequence a(Context context, xsc xsc, ayri ayri) {
        String str = "";
        if (ayri == null) {
            return str;
        }
        arml arml = ayri.c;
        if (arml == null) {
            arml = arml.f;
        }
        Spanned a = ajqy.a(arml);
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        if (ayri.b * 1000 < xsc.a()) {
            return str;
        }
        return context.getString(R.string.live_upcoming_scheduled_datetime, new Object[]{DateFormat.format(DateFormat.getBestDateTimePattern(Locale.getDefault(), "M d yy h mm a"), ayri.b * 1000)});
    }
}
