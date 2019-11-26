package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: agjo */
public final class agjo implements akot {
    private final ViewGroup a;

    public agjo(Context context) {
        this.a = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.debug_offline_ad_entry, null);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.a;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        agjl agjl = (agjl) obj;
        atco atco = (atco) agjl.a.a.get(0);
        int a = atcq.a(atco.b);
        if (a == 0) {
            a = 1;
        }
        a--;
        CharSequence charSequence = a != 1 ? a != 2 ? a != 3 ? a != 4 ? "None" : "Complete" : "Incomplete Asset" : "Forecasting" : "Incomplete VAST";
        ((TextView) this.a.findViewById(R.id.ad_state)).setText(charSequence);
        if (!atco.c.isEmpty()) {
            ((TextView) this.a.findViewById(R.id.ad_video_id)).setText(atco.c);
        }
        TextView textView = (TextView) this.a.findViewById(R.id.ad_expires);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(new SimpleDateFormat("MM/dd/yyyy HH:mm:ss", Locale.US).format(new Date(agjl.b + TimeUnit.SECONDS.toMillis((long) atco.e))));
        spannableStringBuilder.setSpan(Integer.valueOf(1), 0, 14, 33);
        textView.setText(spannableStringBuilder);
        ((TextView) this.a.findViewById(R.id.ad_remaining_playbacks)).setText(String.valueOf(atco.d));
    }
}
