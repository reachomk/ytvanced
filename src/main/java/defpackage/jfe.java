package defpackage;

import android.content.Context;
import android.text.format.DateFormat;
import android.util.DisplayMetrics;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SettingRenderer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* renamed from: jfe */
public final class jfe {
    public static TextView a(Context context, axha axha) {
        arml arml;
        YouTubeTextView youTubeTextView = new YouTubeTextView(context);
        if ((axha.a & 2) != 0) {
            arml = axha.c;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        youTubeTextView.setText(ajqy.a(arml));
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        youTubeTextView.setPadding(xss.a(displayMetrics, 20), xss.a(displayMetrics, 18), xss.a(displayMetrics, 20), xss.a(displayMetrics, 8));
        youTubeTextView.setTextSize(0, context.getResources().getDimension(R.dimen.extra_large_font_size));
        youTubeTextView.setTypeface(ajrc.ROBOTO_MEDIUM.a(context));
        youTubeTextView.setTextColor(xwe.b(context, 16842806));
        return youTubeTextView;
    }

    public static int a(List list) {
        for (int i = 0; i < list.size(); i++) {
            if (((axgs) list.get(i)).c) {
                return i;
            }
        }
        return 0;
    }

    public static List a(axha axha) {
        ArrayList arrayList = new ArrayList();
        for (axgw axgw : axha.e) {
            if (axgw.a == 190692730) {
                arrayList.add((axgs) axgw.b);
            }
        }
        return arrayList;
    }

    public static List a(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        for (axgs axgs : list) {
            aqtg aqtg = axgs.b;
            if (aqtg == null) {
                aqtg = aqtg.d;
            }
            arrayList.add(jfe.a(context, jfe.a(aqtg)));
        }
        return arrayList;
    }

    public static String a(Context context, List list, int i) {
        aqtg aqtg = ((axgs) list.get(i)).b;
        if (aqtg == null) {
            aqtg = aqtg.d;
        }
        return jfe.a(context, jfe.a(aqtg));
    }

    public static List a(axgq axgq) {
        ArrayList arrayList = new ArrayList();
        for (axak axak : axgq.c) {
            anxr access$000 = anxl.checkIsLite(SettingRenderer.settingSingleOptionMenuRenderer);
            axak.a(access$000);
            if (axak.h.a(access$000.d)) {
                access$000 = anxl.checkIsLite(SettingRenderer.settingSingleOptionMenuRenderer);
                axak.a(access$000);
                Object b = axak.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                arrayList.add((axha) b);
            }
        }
        return arrayList;
    }

    public static Date a(aqtg aqtg) {
        if (aqtg != null) {
            return new Date(0, 0, 0, aqtg.b, aqtg.c);
        }
        return new Date(0, 0, 0, 0, 0);
    }

    public static String a(Context context, Date date) {
        return new SimpleDateFormat(!DateFormat.is24HourFormat(context) ? "hh:mm a" : "HH:mm", Locale.getDefault()).format(date);
    }
}
