package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: yff */
public final class yff implements akot {
    private final TextView a;

    public yff(Context context) {
        this.a = (TextView) View.inflate(context, R.layout.conversation_read_receipt, null);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.a;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        this.a.setText(((ycr) obj).a);
    }
}
