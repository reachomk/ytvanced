package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: itk */
public final class itk implements akot {
    private final View a;
    private final TextView b = ((TextView) this.a.findViewById(R.id.title));

    public itk(Context context) {
        amqw.a((Object) context);
        this.a = View.inflate(context, R.layout.emergency_onebox, null);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.a;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        ardo ardo = (ardo) obj;
        arml arml = null;
        akor.a.a(ardo.e.d(), null);
        TextView textView = this.b;
        if ((ardo.a & 1) != 0) {
            arml = ardo.b;
            if (arml == null) {
                arml = arml.f;
            }
        }
        textView.setText(ajqy.a(arml));
    }
}
