package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: jxz */
public final class jxz implements akot {
    private final LinearLayout a;
    private final TextView b = ((TextView) this.a.findViewById(R.id.error_message_text));
    private final Button c = ((Button) this.a.findViewById(R.id.error_retry_button));

    public jxz(Context context) {
        this.a = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.loading_frame_status_error_view, null);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.a;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        jyb jyb = (jyb) obj;
        if (jyb != null) {
            boolean z = true;
            xpr.a(this.a, true);
            xpr.a(this.b, jyb.a);
            View view = this.c;
            if (jyb.b == null) {
                z = false;
            }
            xpr.a(view, z);
            if (jyb.b != null) {
                this.c.setOnClickListener(new jxy(jyb));
            }
        }
    }
}
