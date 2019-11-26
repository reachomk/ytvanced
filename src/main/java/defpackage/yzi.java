package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: yzi */
public final class yzi extends yzq implements zag {
    private final TextView a;

    public yzi(View view) {
        super(view, R.attr.ytStaticBlue);
        this.a = (TextView) view.findViewById(R.id.text);
    }

    public final void a(zaf zaf) {
        this.a.setOnClickListener(new yzl(zaf));
    }

    public final void a(CharSequence charSequence) {
        this.a.setText(charSequence);
    }
}
