package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ScaleXSpan;
import android.text.style.TextAppearanceSpan;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: abtn */
public abstract class abtn implements akot {
    private static Locale b;
    private static DateFormat c;
    public final View a;
    private final Context d;
    private final aaas e;
    private final SpannableStringBuilder f = new SpannableStringBuilder();
    private final StringBuilder g = new StringBuilder();
    private final float h;
    private final TextView i = c();

    public abtn(Context context, aaas aaas) {
        this.d = context;
        this.e = aaas;
        this.a = View.inflate(context, b(), null);
        this.h = ((float) context.getResources().getDimensionPixelSize(R.dimen.live_chat_message_spacing)) / this.i.getPaint().measureText(" ");
    }

    public abstract int b();

    public abstract TextView c();

    public final View K_() {
        return this.a;
    }

    public final void a(akpb akpb) {
        this.f.clear();
        this.g.setLength(0);
    }

    private final String a(long j) {
        Locale locale = Locale.getDefault();
        if (!locale.equals(b)) {
            c = android.text.format.DateFormat.getTimeFormat(this.d);
            b = locale;
        }
        return c.format(new Date(j));
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, int i, Object obj) {
        int length = spannableStringBuilder.length();
        spannableStringBuilder.setSpan(obj, length - i, length, 33);
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        arml arml;
        audx audx = (audx) obj;
        boolean c = xrn.c(this.d);
        long toMillis = TimeUnit.MICROSECONDS.toMillis(audx.d);
        if (toMillis != 0) {
            SpannableStringBuilder spannableStringBuilder = this.f;
            String a = a(toMillis);
            spannableStringBuilder.append(a);
            abtn.a(spannableStringBuilder, a.length(), new TextAppearanceSpan(this.d, R.style.live_chat_message_time));
            spannableStringBuilder = this.f;
            a = " ";
            spannableStringBuilder.append(a);
            abtn.a(spannableStringBuilder, 1, new ScaleXSpan(this.h));
            if (c) {
                this.g.append(a(toMillis));
                this.g.append(a);
            }
        }
        if ((audx.a & 1) != 0) {
            arml = audx.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        Spanned a2 = aabb.a(arml, this.e, false);
        this.f.append(a2);
        if (c) {
            this.g.append(a2);
        }
        xpr.a(this.i, this.f);
    }
}
