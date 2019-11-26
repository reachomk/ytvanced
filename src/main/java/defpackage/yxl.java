package defpackage;

import android.view.View;
import com.google.android.libraries.youtube.conversation.ui.HeartView;
import com.google.android.youtube.R;

/* renamed from: yxl */
public final class yxl {
    public yxn a;
    private final HeartView b;

    public yxl(View view) {
        this.b = (HeartView) amqw.a((HeartView) view.findViewById(R.id.heart_button));
        this.b.setOnClickListener(new yxk(this));
    }

    public final void a(boolean z, boolean z2) {
        this.b.a(z, z2);
    }

    public final void a(boolean z) {
        xpr.a(this.b, z);
    }
}
