package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: hsv */
public final class hsv {
    public static void a(TextView textView, List list, agwh agwh) {
        int i = -1;
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                agqy a = agwh.a(((agqp) list.get(i2)).a());
                if (a != null && a.j != null) {
                    i = (int) TimeUnit.SECONDS.toDays(a.j.g());
                    break;
                }
            }
        }
        if (i > 0) {
            textView.setText(textView.getResources().getQuantityString(R.plurals.offline_go_online_to_renew_dialog_message, i, new Object[]{Integer.valueOf(i)}));
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
    }

    public static String a(Context context, agqi agqi) {
        agpy agpy = agqi.c;
        Object obj = (agpy == null || agpy.e) ? null : 1;
        int i = agqi.e;
        if (obj != null) {
            if (i <= 0) {
                return agpy.b;
            }
            Object[] objArr = new Object[2];
            objArr[0] = agpy.b;
            objArr[1] = context.getResources().getQuantityString(R.plurals.video_count, agqi.e, new Object[]{Integer.valueOf(agqi.e)});
            return String.format("%s • %s", objArr);
        } else if (i <= 0) {
            return "";
        } else {
            return context.getResources().getQuantityString(R.plurals.video_count, agqi.e, new Object[]{Integer.valueOf(agqi.e)});
        }
    }

    public static String a(Resources resources, xsc xsc, long j) {
        long a = xsc.a() - j;
        int toMinutes = (int) TimeUnit.MILLISECONDS.toMinutes(a);
        if (toMinutes >= 60) {
            toMinutes = (int) TimeUnit.MILLISECONDS.toHours(a);
            if (toMinutes < 24) {
                return resources.getQuantityString(R.plurals.last_update_in_hours_message, toMinutes, new Object[]{Integer.valueOf(toMinutes)});
            }
            toMinutes = (int) TimeUnit.MILLISECONDS.toDays(a);
            if (toMinutes < 7) {
                return resources.getQuantityString(R.plurals.last_update_in_days_message, toMinutes, new Object[]{Integer.valueOf(toMinutes)});
            }
            return resources.getQuantityString(R.plurals.last_update_in_weeks_message, toMinutes / 7, new Object[]{Integer.valueOf(toMinutes / 7)});
        }
        String quantityString;
        if (toMinutes > 0) {
            quantityString = resources.getQuantityString(R.plurals.last_update_in_minutes_message, toMinutes, new Object[]{Integer.valueOf(toMinutes)});
        } else {
            quantityString = resources.getString(R.string.last_update_recently);
        }
        return quantityString;
    }
}
