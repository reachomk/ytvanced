package defpackage;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: jdi */
public final class jdi implements akot {
    private final ViewGroup a;
    private final TextView b = ((TextView) this.a.findViewById(R.id.insertion_time));
    private final TextView c = ((TextView) this.a.findViewById(R.id.url_text));

    public jdi(Context context) {
        this.a = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.debug_show_offline_queue_entry, null);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.a;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        CharSequence str;
        nkg nkg = (nkg) obj;
        TextView textView = this.b;
        String valueOf = String.valueOf(new SimpleDateFormat("MM-dd HH:mm:ss", Locale.US).format(new Date(nkg.h)));
        String str2 = "Insertion time: ";
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf));
        Integer valueOf2 = Integer.valueOf(1);
        spannableStringBuilder.setSpan(valueOf2, 0, 14, 33);
        textView.setText(spannableStringBuilder);
        textView = this.c;
        Uri parse = Uri.parse(nkg.d);
        Builder builder = new Builder();
        builder.scheme(parse.getScheme());
        builder.authority(parse.getAuthority());
        builder.encodedPath(parse.getEncodedPath());
        String valueOf3 = String.valueOf(builder.build().toString());
        String str3 = "Url: ";
        if (valueOf3.length() == 0) {
            str = new String(str3);
        } else {
            str = str3.concat(valueOf3);
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
        spannableStringBuilder2.setSpan(valueOf2, 0, 4, 33);
        textView.setText(spannableStringBuilder2);
    }
}
